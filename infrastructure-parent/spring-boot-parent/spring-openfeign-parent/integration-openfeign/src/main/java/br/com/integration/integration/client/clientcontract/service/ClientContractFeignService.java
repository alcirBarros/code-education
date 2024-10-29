package br.com.integration.integration.client.clientcontract.service;

import br.com.integration.integration.client.clientcontract.model.ClientContractFeignResponse;

import java.util.Map;

public interface ClientContractFeignService {

    ClientContractFeignResponse contractProposal(Map<String, String> paramMap);

}
