package br.com.integration.integration.client.contratos.service;

import br.com.integration.integration.client.contratos.client.ContractProposalFeignClient;
import br.com.integration.integration.client.contratos.model.ContractProposalFeignResponse;
import br.com.integration.integration.client.contratos.model.ContractWithConditionFeignRequest;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ContractProposalFeignServiceImpl implements ContractProposalFeignService {

    @Autowired
    private ContractProposalFeignClient contractProposalClient;
    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public ContractProposalFeignResponse contractProposal(String accessToken, ContractWithConditionFeignRequest contractWithConditionRequest) {
        Map<String, String> paramMapApplicationKey = authorizationService.paramMapApplicationKey(null);
        return contractProposalClient.contractProposal(paramMapApplicationKey, accessToken, contractWithConditionRequest);
    }
}
