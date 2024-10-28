package br.com.integration.integration.client.openfeign.service;

import br.com.integration.integration.client.openfeign.model.OpenfeignResponse;
import org.springframework.util.MultiValueMap;

public interface OpenfeignService {

    OpenfeignResponse generateNoParamToken(MultiValueMap<String, String> body);

}
