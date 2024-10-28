//package br.com.integration.integration.client.other;
//
//import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@FeignClient(url = "https://dsv-bb-facade.dev.alelo-cloud.com/v1/facade-bb", name = "baseServiceFacade54654")
//public interface FacadeIntegrationCaller {
//
//    @GetMapping(value = "/contracts")
//    GetContractsResponse findContractByCNPJ(
//            @RequestParam(value = "cnpj")
//                    String cnpj,
//            @RequestParam(value = "lastContractFound")
//                    Long lastContractFound);
//}
