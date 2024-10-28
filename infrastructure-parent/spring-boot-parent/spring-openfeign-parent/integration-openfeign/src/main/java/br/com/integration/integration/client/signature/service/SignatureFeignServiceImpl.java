package br.com.integration.integration.client.signature.service;

import br.com.integration.integration.client.signature.client.SignatureFeignClient;
import br.com.integration.integration.client.signature.model.SignatureFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class SignatureFeignServiceImpl implements SignatureFeignService {

    @Autowired
    private SignatureFeignClient signatureClient;
    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public SignatureFeignResponse signature(String accessToken, Integer proposalNumber) {
        Map<String, String> paramMap = authorizationService.paramMapApplicationKey(null);
        return signatureClient.signature(accessToken, paramMap, proposalNumber);
    }

}
