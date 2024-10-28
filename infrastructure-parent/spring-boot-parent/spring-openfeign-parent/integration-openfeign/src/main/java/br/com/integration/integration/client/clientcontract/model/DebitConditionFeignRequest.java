package br.com.integration.integration.client.clientcontract.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DebitConditionFeignRequest {

    @JsonProperty("codigoCondicao")
    private String condition;

    @JsonProperty("indicador")
    private String status;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
