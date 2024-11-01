//package br.com.integration.integration.mock;
//
//import br.com.integration.integration.client.accesstoken.model.AccessTokenFeignResponse;
//import br.com.integration.integration.client.accesstoken.service.AccessTokenFeignService;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
//import org.mockserver.integration.ClientAndServer;
//import org.mockserver.model.Header;
//import org.mockserver.model.HttpRequest;
//import org.mockserver.model.HttpResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.util.LinkedMultiValueMap;
//import org.springframework.util.MultiValueMap;
//
//import java.util.concurrent.TimeUnit;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockserver.integration.ClientAndServer.startClientAndServer;
//import static org.mockserver.matchers.Times.exactly;
//import static org.mockserver.model.HttpRequest.request;
//import static org.mockserver.model.HttpResponse.response;
//import static org.mockserver.model.JsonBody.json;
//
//@SpringBootTest()
//public class AccessTokenServiceMockTest {
//
//    private static ClientAndServer mockServer;
//
//    @BeforeAll
//    public static void startServer() {
//        mockServer = startClientAndServer(1080);
//    }
//
//    @AfterAll
//    public static void stopServer() {
//        mockServer.stop();
//    }
//
//    @Autowired
//    private AccessTokenFeignService accessTokenService;
//
//    @DynamicPropertySource
//    static void setDynamicProperties(DynamicPropertyRegistry registry) {
//        registry.add("bb-base-token", () -> "localhost:1080");
//    }
//
//    @Test
//    void testMockCalculatorService2() {
//
//        AccessTokenFeignResponse accessTokenResponse = new AccessTokenFeignResponse();
//        accessTokenResponse.setAccessToken("QdzDWpGcvYg5eS7DfwykOGSpX5XHs4keXkA3FkYPIOLZDe-L9O227ou__x1gHK-wTbdsWytJGPmrcJlXKsJeHg.Zxe9ZTMYg2AaXz_5SWJ0QiVPi2m5dDfuZLAKtqrS6obLbLZXjm8r8Npl1UiJ_w8IovMBvnSnPLFGHze1etCIXJBQ-f5HNSMYB2UFWoeUUikkfYSxxoq0Df_fcUUAMVA6syAmYpXTXNQTHpnccaGPZjdJKmE7pcz62tjPH8qfBCsBnlWVOzOq0mLz7C5fcc789gZtvictN_mskM2Zj57k8nl53Jr67xeZpGusbeHhihEINI2kmTQtxt2oAnGAMO5UE5NND4kehnxsym761E4EBpz8upBgWJBkAFpnPsN_MrDEMtnJ-_MG2kDQLv3liQD8Fhhno5noDZr8NTw1BZg3r4oe05kQ0v8Vmyb10dT2WHU4jCWKIIvlbDWH6eTJXLbEPX_Qn5WegkXzMjh0MejbN1dEmfu02EAIpDEZ58sZOZ8GGkF5cwbe0Jj4SUS7BxqpEO7Kwlz7X0poJylTtlsHc47DCJXzbfSfFZUCiIZuweDuAUiDKdeHj2ipbWRDM-RAc3rzSkIoorARfsDdS5XESIp_E7RFUhnr_l5ZB4awwPr3i1GpwarGkp03010sfdFmZ-18rcxrT3ViUwNQ08AKUNoneezAdfLpnsfVTo2r63GFgQdiBkRer1ahLu59QKOxX5VXTf_csmgigouFxRtCtjMomxojgi6U6KOpttTdc4HxKqQbaI3GFBCyKgj1z2FAM52yW8msPJFSQ4CUe9vCEnwXRTS9l1dqq28z4V08UjCZNsuDiHO-Y5KxM95yBf3ejRw_0owiYCMeL-jsLXyh5hShpF7TEIa2YE4kYWISvh0kyTVQQadJ3b8EP8Ez_s-gbY9XuoUINPpNRmgP0log0yeSN-J0eusPKII72rHDa_ss4QC6QhVQCFRicP_tl1gdYkKvef_VLHi0Yep8lExM1IKofCC2RDgb1HLT5TSmf46-ZPYOsW0ppdQYF2LbEUDozSHdqvcWzsx3aAMaz5_HZU3uyxdQWJyr8co1R-fzwhYUAOR_FQHzlcyHrbPVlWYNiDGMfpdy-1yKBh7pzCyjzw.VDL994K3KtX7JKL8wliEx1h-SPGm5Z2B4si1eB7OEiAX0ZVTJp3i4op18ZFd0m8gR-BhU7bEB53g8RkRVMzS3Q");
//        accessTokenResponse.setTokenType("Bearer");
//        accessTokenResponse.setExpiresIn("600");
//
//        HttpRequest httpRequest = request()
//                .withMethod("POST")
//                .withPath("/oauth/token")
//                .withHeaders(new Header(HttpHeaders.AUTHORIZATION, "Basic ZXlKcFpDSTZJbUk1WldRM01tSXROamxpWlMwME5EUXpMU0lzSW1OdlpHbG5iMUIxWW14cFkyRmtiM0lpT2pBc0ltTnZaR2xuYjFOdlpuUjNZWEpsSWpveE1ETTROaXdpYzJWeGRXVnVZMmxoYkVsdWMzUmhiR0ZqWVc4aU9qRjk6ZXlKcFpDSTZJakl5WVdWbE1tWXRORFpoWXkwMFl6azBMVGxoTVRJdE9XWmlOelkyT0RVell6SmlOV0l4TlRCbU5XSXRZV1lpTENKamIyUnBaMjlRZFdKc2FXTmhaRzl5SWpvd0xDSmpiMlJwWjI5VGIyWjBkMkZ5WlNJNk1UQXpPRFlzSW5ObGNYVmxibU5wWVd4SmJuTjBZV3hoWTJGdklqb3hMQ0p6WlhGMVpXNWphV0ZzUTNKbFpHVnVZMmxoYkNJNk1Td2lZVzFpYVdWdWRHVWlPaUpvYjIxdmJHOW5ZV05oYnlJc0ltbGhkQ0k2TVRVM01ERXpOekkyTmpFeE5uMA=="));
//
//        HttpResponse httpResponse = response()
//                .withStatusCode(200)
//                .withHeaders(new Header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE))
//                .withBody(json(accessTokenResponse))
//                .withDelay(TimeUnit.SECONDS, 1);
//
//        mockServer.when(httpRequest, exactly(1)).respond(httpResponse);
//
//        MultiValueMap<String, String> multiValueMap = new LinkedMultiValueMap<>();
//        multiValueMap.add("grant_type", "client_credentials");
//        multiValueMap.add("scope", "capital-giro.info");
//        AccessTokenFeignResponse responseEntity = accessTokenService.generateNoParamToken(multiValueMap);
//
//        assertNotNull(responseEntity);
//    }
//}
