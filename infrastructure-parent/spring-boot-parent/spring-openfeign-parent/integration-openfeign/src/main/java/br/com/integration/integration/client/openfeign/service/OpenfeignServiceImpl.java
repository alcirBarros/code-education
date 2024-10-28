package br.com.integration.integration.client.openfeign.service;

import br.com.integration.integration.client.openfeign.model.OpenfeignResponse;
import br.com.integration.integration.client.openfeign.client.OpenfeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

@Service
public class OpenfeignServiceImpl implements OpenfeignService {

    @Autowired
    private OpenfeignClient openfeignClient;

    @Override
    public OpenfeignResponse generateNoParamToken(MultiValueMap<String, String> body) {
        return openfeignClient.generateNoParamToken(body);
    }


}
