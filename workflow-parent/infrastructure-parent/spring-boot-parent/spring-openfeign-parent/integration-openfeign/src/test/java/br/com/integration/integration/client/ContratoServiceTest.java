//package br.com.integration.integration.client;
//
//import br.com.integration.integration.client.contrato.model.ContratoFeignResponse;
//import br.com.integration.integration.client.contrato.service.ContratoFeignService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//public class ContratoServiceTest {
//
//    @Autowired
//    private ContratoFeignService contratoService;
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerTokenn() {
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("cnpj", "95669678000178");
//        ContratoFeignResponse contratoResponse = contratoService.contratos(paramMap);
//        assertNotNull(contratoResponse);
//        assertFalse(contratoResponse.getContracts().isEmpty());
//        assertEquals(2, contratoResponse.getContracts().size());
//    }
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken() {
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("cnpj", "95669678000178");
//        paramMap.put("ultimoContratoPesquisado", "150516016");
//        ContratoFeignResponse contratoResponse = contratoService.contratos(paramMap);
//        assertNotNull(contratoResponse);
//        assertFalse(contratoResponse.getContracts().isEmpty());
//        assertEquals(1, contratoResponse.getContracts().size());
//    }
//}
