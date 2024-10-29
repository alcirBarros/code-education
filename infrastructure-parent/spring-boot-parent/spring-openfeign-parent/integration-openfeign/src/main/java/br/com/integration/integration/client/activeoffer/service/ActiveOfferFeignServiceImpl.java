package br.com.integration.integration.client.activeoffer.service;

import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignRequest;
import br.com.integration.integration.client.activeoffer.client.ActiveOfferFeignClient;
import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignResponse;
import br.com.integration.integration.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ActiveOfferFeignServiceImpl implements ActiveOfferFeignService {

    @Autowired
    private ActiveOfferFeignClient ofertaAtivoClient;
    @Autowired
    private AuthorizationService authorizationService;

    @Override
    public ActiveOfferFeignResponse activeOffer(Map<String, String> paramMap, ActiveOfferFeignRequest ofertaAtivaRequest) {
        Map<String, String> paramMapApplicationKey = authorizationService.paramMapApplicationKey(paramMap);
        return ofertaAtivoClient.activeOffer(paramMapApplicationKey, ofertaAtivaRequest);
    }
}
