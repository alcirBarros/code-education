package br.com.integration.api.token.model;

public class AccessTokenResponse {

  private String accessToken;
  private String tokenType;
  private String expiresIn;
  private String refreshTtoken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public String getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }

  public String getRefreshTtoken() {
    return refreshTtoken;
  }

  public void setRefreshTtoken(String refreshTtoken) {
    this.refreshTtoken = refreshTtoken;
  }
}
