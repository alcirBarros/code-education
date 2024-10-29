package br.com.integration.integration.client.activeoffer.service;

import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignRequest;
import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignResponse;

import java.util.Map;

public interface ActiveOfferFeignService {

    ActiveOfferFeignResponse activeOffer(Map<String, String> paramMap, ActiveOfferFeignRequest ofertaAtivaRequest);

}
