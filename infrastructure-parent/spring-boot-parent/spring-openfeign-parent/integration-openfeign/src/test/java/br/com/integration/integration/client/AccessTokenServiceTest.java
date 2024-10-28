//package br.com.integration.integration.client;
//
//import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
//import br.com.integration.integration.client.accesstoken.service.AccessTokenFeignService;
//import br.com.integration.integration.exception.Unauthorized;
//import feign.FeignException;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class AccessTokenServiceTest {
//
//    @Autowired
//    private AccessTokenFeignService accessTokenService;
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken() {
//        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
//        multiValueMap.add("grant_type", "client_credentials");
//        multiValueMap.add("scope", "capital-giro.info");
//        AccessTokenFeignResponse accessTokenResponse = accessTokenService.generateNoParamToken(multiValueMap);
//        assertNotNull(accessTokenResponse);
//    }
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken2() {
//        StringBuilder stringBuilderException = new StringBuilder();
//        stringBuilderException.append("Unauthorized");
//        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
//        multiValueMap.add("grant_type", "authorization_code");
//        multiValueMap.add("code", "eyJpZCI6IjYxZjkxZGE2MGU1YWJkNTA3ODE1OGYyNSIsImV4cCI6MTY0MzcxNjYwNjMwOCwidmVyc2FvIjoyfQ");
//        multiValueMap.add("redirect_uri", "https://portal-ec-frontend.hml.alelo-cloud.com/fi/loan/token");
//        FeignException exception = assertThrows(Unauthorized.class, () -> {
//            accessTokenService.generateNoParamToken(multiValueMap);
//        });
//        assertEquals(stringBuilderException.toString(), exception.getMessage());
//    }
//}
