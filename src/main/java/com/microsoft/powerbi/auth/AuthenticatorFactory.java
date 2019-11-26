package com.microsoft.powerbi.auth;

/**
 * Factory for Authenticator instance.
 */
public class AuthenticatorFactory {
    public AuthenticatorFactory() {    
    }

    /**
     * Builds an Authenticator instance to use for a Power BI master account authentication.
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param username The username of the AAD account
     * @param password The password of the AAD account
     * @return An AAD Authenticator instance for Master Account.
     */
    public Authenticator buildForMasterAccount(String clientId, String username, String password) {
        return new MasterAccountAuthenticator(clientId, username, password);
    }

    /**
     * Creates an Authenticator instance to use for Service Principal authentication.
     * @param tenantId The tenantId of the Azure Active Directory (Guid string or [tenant].onmicrosoft.com) 
     * @param clientId The clientId/appId of the App Registration on Azure Active Directory 
     * @param clientSecret The client secret/key for the respective service principal
     * @return An AAD Authenticator instance for Service Principal.
     */
    public Authenticator buildForServicePrincipal(String tenantId, String clientId, String clientSecret) {
        return new ServicePrincipalAuthenticator(tenantId, clientId, clientSecret);
    }
}