package com.microsoft.powerbi.auth;

import com.microsoft.powerbi.Pair;

import java.util.Map;
import java.util.List;

public class AadAuthentication implements Authentication {
  private Authenticator authenticator;

  public AadAuthentication(Authenticator authenticator) {
    this.authenticator = authenticator;
  }
  
  public Authenticator getAuthenticator() {
    return authenticator;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
    String accessToken = null;
    try {
      accessToken = this.authenticator.authenticate();
    }
    catch (AuthenticationFailureException ex) {
      ex.printStackTrace();
    }    
    
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
