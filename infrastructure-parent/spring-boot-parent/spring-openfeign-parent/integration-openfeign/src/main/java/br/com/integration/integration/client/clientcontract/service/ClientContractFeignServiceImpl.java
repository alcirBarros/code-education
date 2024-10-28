package br.com.integration.integration.client.clientcontract.service;

import br.com.integration.integration.client.clientcontract.client.ClientContractFeignClient;
import br.com.integration.integration.client.clientcontract.model.ClientContractFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ClientContractFeignServiceImpl implements ClientContractFeignService {

    @Autowired
    private ClientContractFeignClient contractProposalClient;
    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public ClientContractFeignResponse contractProposal(Map<String, String> paramMap) {
        Map<String, String> paramMapApplicationKey = authorizationService.paramMapApplicationKey(paramMap);
        return contractProposalClient.contractProposal(paramMapApplicationKey);
    }

}
