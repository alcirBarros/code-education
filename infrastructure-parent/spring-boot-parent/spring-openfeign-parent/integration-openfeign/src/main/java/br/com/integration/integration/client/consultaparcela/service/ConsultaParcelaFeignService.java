package br.com.integration.integration.client.consultaparcela.service;

import br.com.integration.integration.client.consultaparcela.model.ConsultaParcelaFeignResponse;

import java.util.Map;

public interface ConsultaParcelaFeignService {

    ConsultaParcelaFeignResponse contratos(Map<String, String> paramMap);

}
