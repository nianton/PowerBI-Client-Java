package com.microsoft.powerbi.auth;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.microsoft.aad.adal4j.AuthenticationContext;

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

    private String nativeClientId;
    private String username;
    private String password;

    private ExecutorService executor;
    
    public Authenticator(String nativeClientId, String username, String password) {
        this(nativeClientId, username, password, Executors.newSingleThreadExecutor());
    }

    public Authenticator(String nativeClientId, String username, String password, ExecutorService executor) {
        this.nativeClientId = nativeClientId;
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
     * @throws AuthenticationFailureException
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

            String result = getAccessToken(
                    authenticationContext,
                    powerBiResourceId,
                    nativeClientId,
                    username,
                    password
            );

            if (result == null) {
                throw new AuthenticationFailureException("Returned access token is null.");
            }

            return result;
        } catch (ExecutionException | InterruptedException | IOException e) {
            throw new AuthenticationFailureException(e);
        }
    }

    private String getAccessToken(AuthenticationContext authenticationContext, String resourceId, String clientId,
                                  String username, String password) throws ExecutionException, InterruptedException {
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
