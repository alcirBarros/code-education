package br.com.integration.api.token.controller;

import br.com.integration.api.token.model.AccessTokenResponse;
import br.com.integration.model.token.AccessToken;
import br.com.integration.service.token.TokenService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TokenController {

    @Autowired
    private TokenService tokenService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<AccessTokenResponse> accessToken(@RequestHeader(value = "auth-code") String authorizationCode) {
        AccessToken accessToken = tokenService.generateTokenWithCode(authorizationCode);
        AccessTokenResponse accessTokenResponse = modelMapper.map(accessToken, AccessTokenResponse.class);
        return ResponseEntity.ok(accessTokenResponse);
    }

}
