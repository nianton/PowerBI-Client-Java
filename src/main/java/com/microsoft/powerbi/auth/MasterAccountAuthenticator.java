package com.microsoft.powerbi.auth;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.microsoft.aad.adal4j.*;

/**
 * Authenticator for AAD using a Master Account.
 */
public class MasterAccountAuthenticator extends Authenticator {
    private static final String DEFAULT_AUTHORITY = "https://login.windows.net/common/oauth2/authorize";

    private String username;
    private String password;
    private ExecutorService executor;

    /**
     * Constructor for PowerBI Master Account authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param username The username of the AAD account
     * @param password The password of the AAD account
     */
    public MasterAccountAuthenticator(String clientId, String username, String password) {
        this(clientId, username, password, Executors.newSingleThreadExecutor());
    }

    /**
     * Constructor for PowerBI Master Account authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param username The username of the AAD account
     * @param password The password of the AAD account
     * @param executor An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchronous tasks.
     */
    public MasterAccountAuthenticator(String clientId, String username, String password, ExecutorService executor) {
        super();
        this.executor = executor;
        this.authority = DEFAULT_AUTHORITY;
        this.clientId = clientId;
        this.username = username;
        this.password = password;
    }

    protected String doAuthenticate() throws AuthenticationFailureException {        
        try {
            AuthenticationContext authenticationContext = new AuthenticationContext(
                authority,
                validateAuthority,
                executor
            );

            String result = getAccessToken(authenticationContext, powerBiResourceId, clientId, username, password);
          
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
}
