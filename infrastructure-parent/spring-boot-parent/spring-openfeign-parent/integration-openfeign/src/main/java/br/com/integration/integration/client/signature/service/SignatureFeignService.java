package br.com.integration.integration.client.signature.service;

import br.com.integration.integration.client.signature.model.SignatureFeignResponse;

public interface SignatureFeignService {

    SignatureFeignResponse signature(String accessToken, Integer proposalNumber);
}
