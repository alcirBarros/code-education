package br.com.integration.integration.client.accesstoken.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class AccessTokenFeignResponse {

    @JsonAlias("access_token")
    private String accessToken;

    @JsonAlias("token_type")
    private String tokenType;

    @JsonAlias("expires_in")
    private String expiresIn;

    @JsonAlias("refresh_token")
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
