package br.com.integration.integration.client.consultaparcela.service;

import br.com.integration.integration.client.consultaparcela.client.ConsultaParcelaFeignClient;
import br.com.integration.integration.client.consultaparcela.model.ConsultaParcelaFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ConsultaParcelaFeignServiceImpl implements ConsultaParcelaFeignService {

    @Autowired
    private ConsultaParcelaFeignClient ofertaAtivoClient;
    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public ConsultaParcelaFeignResponse contratos(Map<String, String> paramMap) {
        Map<String, String> paramMapApplicationKey = authorizationService.paramMapApplicationKey(paramMap);
        return ofertaAtivoClient.activeOffer(paramMapApplicationKey);
    }
}
