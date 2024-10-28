package br.com.integration.integration.client.accesstoken.service;

import br.com.integration.integration.client.accesstoken.client.AccessTokenFeignClient;
import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

@Service
public class AccessTokenFeignServiceImpl implements AccessTokenFeignService {

    @Autowired
    private AccessTokenFeignClient accessTokenClient;

    @Override
    public AccessTokenFeignResponse generateNoParamToken(MultiValueMap<String, String> body) {
        return accessTokenClient.generateNoParamToken(body);
    }
}
