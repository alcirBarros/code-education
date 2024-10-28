package br.com.integration.integration.client.contrato.service;

import br.com.integration.integration.client.contrato.model.ContratoFeignResponse;

import java.util.Map;

public interface ContratoFeignService {

    ContratoFeignResponse contratos(Map<String, String> paramMap);

}
