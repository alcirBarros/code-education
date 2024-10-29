package br.com.integration.integration.client.signature.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class IntervenerFeignResponse {

  @JsonAlias("nome")
  private String name;

  @JsonAlias("indicadorPendenciaAssinatura")
  private String signaturePendency;
}
