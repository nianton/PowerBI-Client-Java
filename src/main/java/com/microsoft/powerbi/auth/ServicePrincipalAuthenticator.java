package com.microsoft.powerbi.auth;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.microsoft.aad.adal4j.*;

/**
 * Authenticator for AAD using a Service Principal.
 */
public class ServicePrincipalAuthenticator extends Authenticator {
    private static final String DEFAULT_AUTHORITY_FORMAT = "https://login.microsoftonline.com/%s/oauth2/token";

    private String tenantId;
    private String clientSecret;    
    private ExecutorService executor;
    
    /**
     * Constructor for Service Principal authentication.
     * @param tenantId The tenantId of the Azure Active Directory (Guid string or [tenant].onmicrosoft.com) 
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param clientSecret The client secret/key for the respective service principal
     */
    public ServicePrincipalAuthenticator(String tenantId, String clientId, String clientSecret) {
        this(tenantId, clientId, clientSecret, Executors.newSingleThreadExecutor());
    }

    /**
     * Constructor for Service Principal authentication.
     * @param tenantId The tenantId of the Azure Active Directory (Guid string or [tenant].onmicrosoft.com) 
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param clientSecret The client secret/key for the respective service principal
     * @param executor An Executor that provides methods to manage termination and methods that can produce a Future for tracking progress of one or more asynchronous tasks.
     */
    public ServicePrincipalAuthenticator(String tenantId, String clientId, String clientSecret, ExecutorService executor) {
        super();
        this.executor = executor;
        this.tenantId = tenantId;
        this.authority = String.format(DEFAULT_AUTHORITY_FORMAT, this.tenantId);
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    protected String doAuthenticate() throws AuthenticationFailureException {

        try {
            AuthenticationContext authenticationContext = new AuthenticationContext(
                authority,
                validateAuthority,
                executor
            );

            String result = getAccessToken(authenticationContext, powerBiResourceId, clientId, clientSecret);    
            if (result == null) {
                throw new AuthenticationFailureException("Returned access token is null.");
            }

            return result;
        } catch (ExecutionException | InterruptedException | IOException e) {
            throw new AuthenticationFailureException(e);
        }
    }

    private String getAccessToken(AuthenticationContext authenticationContext, String resourceId, String clientId,
                                  String clientSecret) throws ExecutionException, InterruptedException {        
        
        ClientCredential credential = new ClientCredential(clientId, clientSecret);
        return authenticationContext.acquireToken(
                resourceId, 
                credential, 
                null).get().getAccessToken();
    }
}
