package br.com.integration.integration.client.contrato.service;

import br.com.integration.integration.client.contrato.client.ContratoFeignClient;
import br.com.integration.integration.client.contrato.model.ContratoFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class ContratoFeignServiceImpl implements ContratoFeignService {

    @Autowired
    private ContratoFeignClient ofertaAtivoClient;
    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public ContratoFeignResponse contratos(Map<String, String> paramMap) {
        Map<String, String> paramMapApplicationKey = authorizationService.paramMapApplicationKey(paramMap);
        return ofertaAtivoClient.activeOffer(paramMapApplicationKey);
    }

}
