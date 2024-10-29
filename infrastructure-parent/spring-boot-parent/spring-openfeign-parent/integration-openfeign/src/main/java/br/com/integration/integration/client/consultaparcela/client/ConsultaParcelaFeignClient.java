package br.com.integration.integration.client.consultaparcela.client;

import br.com.integration.integration.client.consultaparcela.config.ConsultaParcelaFeignClientConfig;
import br.com.integration.integration.client.consultaparcela.model.ConsultaParcelaFeignResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(url = "${bb-base-service}", name = "contrato", configuration = ConsultaParcelaFeignClientConfig.class)
public interface ConsultaParcelaFeignClient {

    @GetMapping(value = "/capital-giro/v1/contratos/consultar-parcelas")
    ConsultaParcelaFeignResponse activeOffer(@RequestParam Map<String, String> paramMap);
}
