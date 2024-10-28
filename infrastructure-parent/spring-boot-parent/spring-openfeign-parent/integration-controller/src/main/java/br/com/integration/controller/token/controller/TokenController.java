//package br.com.integration.controller.token.controller;
//
//import br.com.integration.controller.token.model.AccessTokenResponse;
//import br.com.integration.service.token.model.response.AccessTokenModelResponseService;
//import br.com.integration.service.token.service.TokenService;
//import org.jetbrains.annotations.NotNull;
//import org.modelmapper.ModelMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping
//public class TokenController {
//
//    @Autowired
//    private TokenService tokenService;
//
//    @Autowired
//    private ModelMapper modelMapper;
//
//    @GetMapping("/tokens")
//    public ResponseEntity<AccessTokenResponse> accessToken(@NotNull @RequestHeader(value = "auth-code") String authorizationCode) {
//        AccessTokenModelResponseService accessToken = tokenService.generateTokenWithCode(authorizationCode);
//        AccessTokenResponse accessTokenResponse = modelMapper.map(accessToken, AccessTokenResponse.class);
//        return ResponseEntity.ok(accessTokenResponse);
//    }
//
//}
