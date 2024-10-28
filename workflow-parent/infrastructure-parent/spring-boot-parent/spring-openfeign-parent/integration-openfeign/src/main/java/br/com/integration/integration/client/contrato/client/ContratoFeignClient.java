package br.com.integration.integration.client.contrato.client;

import br.com.integration.integration.client.contrato.config.ContratoFeignClientConfig;
import br.com.integration.integration.client.contrato.model.ContratoFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "contratos-24564561", configuration = ContratoFeignClientConfig.class)
public interface ContratoFeignClient {

    @GetMapping(value = "/capital-giro/v1/contratos")
    ContratoFeignResponse activeOffer(@RequestParam Map<String, String> paramMap);
}
