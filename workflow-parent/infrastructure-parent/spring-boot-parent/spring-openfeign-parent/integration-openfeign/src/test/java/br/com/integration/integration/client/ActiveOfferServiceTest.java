//package br.com.integration.integration.client;
//
//import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignRequest;
//import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignResponse;
//import br.com.integration.integration.client.activeoffer.service.ActiveOfferFeignService;
//import feign.FeignException;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.math.BigDecimal;
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class ActiveOfferServiceTest {
//
//    @Autowired
//    private ActiveOfferFeignService ofertaAtivaService;
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken() {
//        StringBuilder stringBuilderException = new StringBuilder();
//        stringBuilderException.append("[400 Bad Request] during [POST] to [https://api.hm.bb.com.br/capital-giro/v1/simulacoes-oferta-ativa?gw-app-key=d3f69ca08898013868e0005056b91a5b] [ActiveOfferClient#activeOffer(Map,ActiveOfferRequest)]: [{\n");
//        stringBuilderException.append("\t\n");
//        stringBuilderException.append("\t\t\"erro\": [{\n");
//        stringBuilderException.append("\t\t\t\"codigo\": \"4028565.1\",\n");
//        stringBuilderException.append("\t\t\t\"menssagem\": \"CNPJ não informado.\"}\n");
//        stringBuilderException.append("\t\t]\n");
//        stringBuilderException.append("\t\n");
//        stringBuilderException.append("}]");
//
//        Map<String, String> paramMap = new HashMap<>();
//        ActiveOfferFeignRequest activeOfferResponse = new ActiveOfferFeignRequest();
//        Throwable exception = assertThrows(FeignException.class, () -> {
//            ofertaAtivaService.activeOffer(paramMap, activeOfferResponse);
//        });
//
//        assertEquals(stringBuilderException.toString(), exception.getMessage());
//    }
//
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerTokenq() {
//        Map<String, String> paramMap = new HashMap<>();
//        ActiveOfferFeignRequest activeOfferRequest = new ActiveOfferFeignRequest();
//        activeOfferRequest.setCnpj("98563428000147");
//        activeOfferRequest.setNumberOfInstallments(1);
//        activeOfferRequest.setValue(BigDecimal.valueOf(100000));
//        ActiveOfferFeignResponse activeOfferResponse = ofertaAtivaService.activeOffer(paramMap, activeOfferRequest);
//        assertNotNull(activeOfferResponse);
//    }
//}
