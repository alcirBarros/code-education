package br.com.integration.integration.service;


import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
import br.com.integration.integration.client.accesstoken.service.AccessTokenFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class AuthorizationService {

    @Autowired
    private AccessTokenFeignService accessTokenService;

    @Value("${key-param:}")
    private String keyParam;

    @Value("${key-param-value:}")
    private String keyParamValue;

    public AccessTokenFeignResponse accessToken() {
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("grant_type", "client_credentials");
        body.add("scope", "capital-giro.info");
        return accessTokenService.generateNoParamToken(body);
    }

    public Map<String, String> paramMapApplicationKey(Map<String, String> paramMap) {
        Map<String, String> paramMapNotNull = Optional.ofNullable(paramMap).orElse(new HashMap<>());
        paramMapNotNull.put(keyParam, keyParamValue);
        return paramMapNotNull;
    }
}
