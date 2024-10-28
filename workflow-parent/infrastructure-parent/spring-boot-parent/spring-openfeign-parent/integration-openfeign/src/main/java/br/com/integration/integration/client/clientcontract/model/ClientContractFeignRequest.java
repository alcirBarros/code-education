package br.com.integration.integration.client.clientcontract.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ClientContractFeignRequest {

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("numeroSimulacao")
    private Long simulationNumber;

    @JsonProperty("listaCondicao")
    private List<DebitConditionFeignRequest> debitConditionRequestList = new ArrayList<>();

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getSimulationNumber() {
        return simulationNumber;
    }

    public void setSimulationNumber(Long simulationNumber) {
        this.simulationNumber = simulationNumber;
    }

    public List<DebitConditionFeignRequest> getDebitConditionRequestList() {
        return debitConditionRequestList;
    }

    public void setDebitConditionRequestList(List<DebitConditionFeignRequest> debitConditionRequestList) {
        this.debitConditionRequestList = debitConditionRequestList;
    }
}
