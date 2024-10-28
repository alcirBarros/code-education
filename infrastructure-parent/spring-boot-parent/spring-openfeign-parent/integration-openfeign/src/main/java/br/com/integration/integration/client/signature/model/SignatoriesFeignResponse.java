package br.com.integration.integration.client.signature.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class SignatoriesFeignResponse {

  @JsonAlias("nome")
  private String name;

  @JsonAlias("timestampAssinatura")
  private String signatureTimestamp;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSignatureTimestamp() {
    return signatureTimestamp;
  }

  public void setSignatureTimestamp(String signatureTimestamp) {
    this.signatureTimestamp = signatureTimestamp;
  }
}
