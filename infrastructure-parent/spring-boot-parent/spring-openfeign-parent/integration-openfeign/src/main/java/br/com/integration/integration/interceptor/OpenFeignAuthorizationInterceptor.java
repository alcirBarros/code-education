package br.com.integration.integration.interceptor;

import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class OpenFeignAuthorizationInterceptor implements RequestInterceptor {

    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        AccessTokenFeignResponse accessTokenResponse = authorizationService.accessToken();
        String accessToken = accessTokenResponse.getAccessToken();
        requestTemplate.header("Authorization", String.format("%s %s", "Bearer", accessToken));
    }
}


