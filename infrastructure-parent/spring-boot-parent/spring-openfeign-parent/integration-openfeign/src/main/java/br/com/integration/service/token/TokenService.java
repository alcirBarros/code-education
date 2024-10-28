package br.com.integration.service.token;

import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
import br.com.integration.integration.client.accesstoken.service.AccessTokenFeignService;
import br.com.integration.model.token.AccessToken;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Service
public class TokenService {

    @Autowired
    private AccessTokenFeignService accessTokenService;

    @Autowired
    private ModelMapper modelMapper;

    public AccessToken generateTokenWithCode(String authorizationCode) {
        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
        multiValueMap.add("grant_type", "authorization_code");
        multiValueMap.add("code", authorizationCode);
        multiValueMap.add("redirect_uri", "https://portal-ec-frontend.hml.alelo-cloud.com/fi/loan/token");
        AccessTokenFeignResponse accessTokenFeignResponse = accessTokenService.generateNoParamToken(multiValueMap);
        return modelMapper.map(accessTokenFeignResponse, AccessToken.class);
    }
}
