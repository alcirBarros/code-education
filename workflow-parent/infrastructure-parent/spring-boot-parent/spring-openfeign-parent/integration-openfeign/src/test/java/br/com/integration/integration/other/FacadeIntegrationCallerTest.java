//package br.com.integration.integration.other;
//
////import br.com.integration.other.FacadeIntegrationCaller;
//
//import br.com.integration.integration.client.openfeign.client.OpenfeignClient;
//import br.com.integration.integration.client.openfeign.service.OpenfeignService;
////import br.com.integration.integration.client.other.FacadeIntegrationCaller;
//import br.com.integration.integration.client.other.GetContractsResponse;
//import br.com.integration.integration.client.simulation.service.SimulationFeignService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@SpringBootTest
//public class FacadeIntegrationCallerTest {
//
///*    @Autowired
//    private FacadeIntegrationCaller facadeIntegrationCaller;*/
//
//    @Autowired
//    private OpenfeignClient simulationService;
//
//    @Test
//    public void whenTheTokenIsRequestedReturnBearerToken() {
//        GetContractsResponse contractByCNPJ = simulationService.findContractByCNPJ("98563428000147", null);
//        assertNotNull(contractByCNPJ);
//        System.out.println("");
//    }
//}
