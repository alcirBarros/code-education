//package br.com.integration.integration.client;
//
//import br.com.integration.integration.client.clientcontract.model.ClientContractFeignResponse;
//import br.com.integration.integration.client.clientcontract.service.ClientContractFeignService;
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
//public class ClientContractServiceTest {
//
//    @Autowired
//    private ClientContractFeignService clientContractService;
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken1() {
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("cnpj", "98563428000147");
//        ClientContractFeignResponse clientContractResponse = clientContractService.contractProposal(paramMap);
//        assertNotNull(clientContractResponse);
//    }
//
//    @Test
//    @DisplayName("Teste OK")
//    public void whenTheTokenIsRequestedReturnBearerToken2() {
//        Map<String, String> paramMap = new HashMap<>();
//        paramMap.put("cnpj", "98563428000147");
//        paramMap.put("ultimoContratoPesquisado", "22191537");
//        ClientContractFeignResponse clientContractResponse = clientContractService.contractProposal(paramMap);
//        assertNotNull(clientContractResponse);
//    }
//}
