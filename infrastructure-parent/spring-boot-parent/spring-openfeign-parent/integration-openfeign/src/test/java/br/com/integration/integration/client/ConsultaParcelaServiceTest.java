//package br.com.integration.integration.client;
//
//import br.com.integration.integration.client.consultaparcela.model.ConsultaParcelaFeignResponse;
//import br.com.integration.integration.client.consultaparcela.service.ConsultaParcelaFeignService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
//public class ConsultaParcelaServiceTest {
//
//    @Autowired
//    private ConsultaParcelaFeignService consultaParcelaService;
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken() {
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("diaBase", "21");
//        paramMap.put("ultimoContratoPesquisado", "150516016");
//        ConsultaParcelaFeignResponse consultaParcelaResponse = consultaParcelaService.contratos(paramMap);
//        assertNotNull(consultaParcelaResponse);
//    }
//}
