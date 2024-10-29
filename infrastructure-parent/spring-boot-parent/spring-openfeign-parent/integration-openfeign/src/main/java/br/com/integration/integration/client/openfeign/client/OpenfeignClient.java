package br.com.integration.integration.client.openfeign.client;

import br.com.integration.integration.client.openfeign.config.OpenfeignClientConfig;
import br.com.integration.integration.client.openfeign.model.OpenfeignResponse;
import br.com.integration.integration.client.other.GetContractsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "https://dsv-bb-facade.dev.alelo-cloud.com/v1/facade-bb", name = "base-token-bb", configuration = OpenfeignClientConfig.class)
public interface OpenfeignClient {

    @PostMapping(value = "/oauth/token")
    OpenfeignResponse generateNoParamToken(MultiValueMap<String, String> body);

    @GetMapping(value = "/contracts")
    GetContractsResponse findContractByCNPJ(
            @RequestParam(value = "cnpj")
                    String cnpj,
            @RequestParam(value = "lastContractFound")
                    Long lastContractFound);
}
