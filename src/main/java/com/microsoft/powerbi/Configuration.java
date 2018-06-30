package com.microsoft.powerbi;

import com.microsoft.powerbi.auth.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-30T09:55:17.731Z")
public class Configuration {
    private static Authentication defaultAuthentication;    
    private static ApiClient defaultApiClient;

    /**
     * Set the default Authentication for the ApiClient which would ensure
     * that all request are containing the bearer access token.
     * @param authentication The authentication
     */
    public static void setDefaultAuthentication(Authentication authentication) {        
        defaultAuthentication = authentication;
        defaultApiClient = new ApiClient(authentication);
    }

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiClient getDefaultApiClient() {
        if (defaultApiClient == null) {
            defaultApiClient = new ApiClient(defaultAuthentication);
        }
        
        return defaultApiClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiClient API client
     */
    public static void setDefaultApiClient(ApiClient apiClient) {
        defaultApiClient = apiClient;
    }
}
