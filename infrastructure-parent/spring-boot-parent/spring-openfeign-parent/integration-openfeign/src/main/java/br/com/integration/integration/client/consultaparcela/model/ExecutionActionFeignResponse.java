package br.com.integration.integration.client.consultaparcela.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ExecutionActionFeignResponse {

    @JsonAlias("codigo")
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
