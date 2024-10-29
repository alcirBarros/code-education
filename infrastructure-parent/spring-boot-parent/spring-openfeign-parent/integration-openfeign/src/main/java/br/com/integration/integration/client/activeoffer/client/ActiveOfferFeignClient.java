package br.com.integration.integration.client.activeoffer.client;

import br.com.integration.integration.client.activeoffer.config.ActiveOfferFeignClientConfig;
import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignRequest;
import br.com.integration.integration.client.activeoffer.model.ActiveOfferFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "oferta-ativa", configuration = ActiveOfferFeignClientConfig.class)
public interface ActiveOfferFeignClient {

    @PostMapping(value = "/capital-giro/v1/simulacoes-oferta-ativa", name = "oferta-ativa")
    ActiveOfferFeignResponse activeOffer(@RequestParam Map<String, String> paramMap, ActiveOfferFeignRequest ofertaAtivaRequest);
}
