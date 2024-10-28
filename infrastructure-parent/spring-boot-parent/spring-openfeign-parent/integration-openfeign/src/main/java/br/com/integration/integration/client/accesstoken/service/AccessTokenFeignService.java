package br.com.integration.integration.client.accesstoken.service;

import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
import org.springframework.util.MultiValueMap;

public interface AccessTokenFeignService {

    AccessTokenFeignResponse generateNoParamToken(MultiValueMap<String, String> body);
}
