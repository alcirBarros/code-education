package br.com.integration.integration.client.clientcontract.client;

import br.com.integration.integration.client.clientcontract.config.ClientContractFeignClientConfig;
import br.com.integration.integration.client.clientcontract.model.ClientContractFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "contratos-15654", configuration = ClientContractFeignClientConfig.class)
public interface ClientContractFeignClient {

    @GetMapping(value = "/capital-giro/v2/contratos")
    ClientContractFeignResponse contractProposal(@RequestParam Map<String, String> paramMap);

}
