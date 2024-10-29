package br.com.integration.integration.client.contratos.service;

import br.com.integration.integration.client.contratos.model.ContractProposalFeignResponse;
import br.com.integration.integration.client.contratos.model.ContractWithConditionFeignRequest;

public interface ContractProposalFeignService {

    ContractProposalFeignResponse contractProposal(String accessToken, ContractWithConditionFeignRequest contractWithConditionRequest);

}
