//package br.com.integration.integration.mock;
//
//import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignRequest;
//import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignResponse;
//import br.com.integration.integration.client.activeoffer.service.ActiveOfferFeignService;
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
//
//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
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
//public class ActiveOfferServiceMockTest {
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
//    private ActiveOfferFeignService activeOfferService;
//
//    @DynamicPropertySource
//    static void setDynamicProperties(DynamicPropertyRegistry registry) {
//        registry.add("bb-base-service", () -> "localhost:1080");
//    }
//
//    @Test
//    void testMockCalculatorService2() {
//
//        ActiveOfferFeignResponse accessTokenResponse = new ActiveOfferFeignResponse();
//
//        HttpRequest httpRequest = request()
//                .withMethod("POST")
//                .withPath("/capital-giro/v1/simulacoes-oferta-ativa");
//
//        HttpResponse httpResponse = response()
//                .withStatusCode(200)
//                .withHeaders(new Header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE))
//                .withBody(json(accessTokenResponse))
//                .withDelay(TimeUnit.SECONDS, 1);
//
//        mockServer.when(httpRequest, exactly(1)).respond(httpResponse);
//
//
//        Map<String, String> paramMap = new HashMap<>();
//
//        ActiveOfferFeignRequest activeOfferRequest = new ActiveOfferFeignRequest();
//        activeOfferRequest.setCnpj("98563428000147");
//        activeOfferRequest.setNumberOfInstallments(1);
//        activeOfferRequest.setValue(BigDecimal.valueOf(100000));
//        ActiveOfferFeignResponse activeOfferResponse = activeOfferService.activeOffer(paramMap, activeOfferRequest);
//
//        assertNotNull(activeOfferResponse);
//    }
//}
