package com.microsoft.powerbi.auth;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.microsoft.aad.adal4j.*;

/**
 * https://msdn.microsoft.com/en-US/library/dn877545.aspx
 *
 */
public class Authenticator {
    private static final String DEFAULT_AUTHORITY = "https://login.windows.net/common/oauth2/authorize";
    private static final String DEFAULT_POWER_BI_RESOURCE_ID = "https://analysis.windows.net/powerbi/api";
    private static final boolean DEFAULT_VALIDATE_AUTHORITY = false;

    private String authority = DEFAULT_AUTHORITY;
    private String powerBiResourceId = DEFAULT_POWER_BI_RESOURCE_ID;
    private boolean validateAuthority = DEFAULT_VALIDATE_AUTHORITY;

    private String clientId;
    private String username;
    private String password;
    private String clientSecret;
    private AuthenticationMode mode;

    private ExecutorService executor;
    
    /**
     * Constructor for Service Principal authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param clientSecret The client secret/key for the respective service principal
     */
    public Authenticator(String clientId, String clientSecret) {
        this(clientId, clientSecret, Executors.newSingleThreadExecutor());
    }

    /**
     * Constructor for Service Principal authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param clientSecret The client secret/key for the respective service principal
     * @param executor
     */
    public Authenticator(String clientId, String clientSecret, ExecutorService executor) {
        this.mode = AuthenticationMode.ServicePrincipal;
        this.executor = executor;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    /**
     * Constructor for PowerBI Master Account authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param username The username of the AAD account
     * @param password The password of the AAD account
     */
    public Authenticator(String clientId, String username, String password) {
        this(clientId, username, password, Executors.newSingleThreadExecutor());
    }

    /**
     * Constructor for PowerBI Master Account authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param username The username of the AAD account
     * @param password The password of the AAD account
     * @param executor 
     */
    public Authenticator(String clientId, String username, String password, ExecutorService executor) {
        this.mode = AuthenticationMode.MasterAccount;
        this.clientId = clientId;
        this.username = username;
        this.password = password;
        this.executor = executor;   
    }

    public Authenticator setAuthority(String authority) {
        this.authority = checkNotNull(authority);
        return this;
    }

    public Authenticator setPowerBiResourceId(String powerBiResourceId) {
        this.powerBiResourceId = checkNotNull(powerBiResourceId);
        return this;
    }

    public Authenticator setValidateAuthority(boolean validateAuthority) {
        this.validateAuthority = validateAuthority;
        return this;
    }

    private ReadWriteLock tokenLock = new ReentrantReadWriteLock();
    private String cachedToken;

    /**
     * Performs the authentication.
     *
     * Thread-safe implementation that will cache the bearer token for multiple calls to ensure that we don't make
     * repeated, unnecessary calls to the authentication service.
     *
     * @return the bearer token to use for authenticating service requests.
     * @throws AuthenticationFailureException if Azure Active Directory authentication fails
     */
    public String authenticate() throws AuthenticationFailureException {
        try {
            tokenLock.readLock().lock();

            if (cachedToken == null) {
                try {
                    // release the read lock and acquire the write lock to call the implementation
                    tokenLock.readLock().unlock();
                    tokenLock.writeLock().lock();

                    // check again, it may have been set in the time it took us to acquire the write lock
                    if (cachedToken == null) {
                        cachedToken = _authenticate();
                    }

                    // Downgrade by acquiring read lock before releasing write lock
                    tokenLock.readLock().lock();
                } finally {
                    tokenLock.writeLock().unlock();
                }
            }
        } finally {
            // TODO: in theory, if there has been an exception in the authenticate method then this unlock method
            // TODO: should fail as the downgrade of the lock was never performed. Haven't seen this issue in practice yet
            // TODO: however it looks theoretically possible.
            try {
                tokenLock.readLock().unlock();
            } catch (IllegalMonitorStateException ex) {
                // ignore - see TODO above for reasoning....
                ex.printStackTrace();
            }
        }


        return cachedToken;
    }
    
    public void reset() {
        try {
            tokenLock.writeLock().lock();
            cachedToken = null;
        }
        finally {
            tokenLock.writeLock().unlock();
        }
    }

    private String _authenticate() throws AuthenticationFailureException {

        
        try {
            AuthenticationContext authenticationContext = new AuthenticationContext(
                    authority,
                    validateAuthority,
                    executor
            );

            String result = null;
            switch (this.mode) {
                case MasterAccount: 
                    result = getMasterAccountAccessToken(authenticationContext, powerBiResourceId, clientId, username, password);
                    break;
                case ServicePrincipal:
                    result = getServicePrincipalAccessToken(authenticationContext, powerBiResourceId, clientId, clientSecret);
                    break;
            }
          
            if (result == null) {
                throw new AuthenticationFailureException("Returned access token is null.");
            }

            return result;
        } catch (ExecutionException | InterruptedException | IOException e) {
            throw new AuthenticationFailureException(e);
        }
    }

    private String getServicePrincipalAccessToken(AuthenticationContext authenticationContext, String resourceId, String clientId,
                                  String clientSecret) throws ExecutionException, InterruptedException {        
        
        ClientCredential credential = new ClientCredential(clientId, clientSecret);
        return authenticationContext.acquireToken(
                resourceId, 
                credential, 
                null).get().getAccessToken();
    }


    private String getMasterAccountAccessToken(AuthenticationContext authenticationContext, String resourceId, String clientId,
                                  String username, String password) throws ExecutionException, InterruptedException {        
        
        String clientSecret = "";
        ClientCredential credential = new ClientCredential(clientId, clientSecret);
        authenticationContext.acquireToken(resourceId, credential, null).get().getAccessToken();

        return authenticationContext.acquireToken(
                resourceId,
                clientId,
                username,
                password,
                null
        ).get().getAccessToken();
    }
    
    private static String checkNotNull(String input) {
        if (input == null){
            throw new NullPointerException();
        }

        return input;
    }
}
