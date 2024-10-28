package br.com.integration.integration.client.accesstoken.client;

import br.com.integration.integration.client.accesstoken.config.AccessTokenClientFeignConfig;
//import br.com.integration.integration.client.accesstoken.config.AccessTokenClientFeignExceptionHandler;
import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
//import br.com.integration.integration.annotation.HandleFeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(url = "${bb-base-token}", name = "baseTokenBB", configuration = AccessTokenClientFeignConfig.class)
public interface AccessTokenFeignClient {

    @PostMapping(value = "/oauth/token")
//    @HandleFeignError(AccessTokenClientFeignExceptionHandler.class)
    AccessTokenFeignResponse generateNoParamToken(MultiValueMap<String, String> body);
}
