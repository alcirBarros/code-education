package br.com.integration.integration.client.contratos.client;

import br.com.integration.integration.client.contratos.model.ContractProposalFeignResponse;
import br.com.integration.integration.client.contratos.model.ContractWithConditionFeignRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "contratos-2225649")
public interface ContractProposalFeignClient {

    @PostMapping(value = "/capital-giro/v2/contratos")
    ContractProposalFeignResponse contractProposal(@RequestParam Map<String, String> paramMap, @RequestHeader(HttpHeaders.AUTHORIZATION) String accessToken, ContractWithConditionFeignRequest contractWithConditionRequest);
}
