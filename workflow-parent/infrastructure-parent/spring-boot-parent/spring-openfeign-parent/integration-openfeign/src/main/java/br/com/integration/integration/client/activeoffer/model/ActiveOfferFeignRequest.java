package br.com.integration.integration.client.activeoffer.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ActiveOfferFeignRequest {

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("valorCreditoProposta")
    private BigDecimal value;

    @JsonProperty("quantidadeParcelaReposicao")
    private Integer numberOfInstallments;

    @JsonProperty("dataPrimeiraParcelaReposicao")
    private String firstInstallmentDate;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public Integer getNumberOfInstallments() {
        return numberOfInstallments;
    }

    public void setNumberOfInstallments(Integer numberOfInstallments) {
        this.numberOfInstallments = numberOfInstallments;
    }

    public String getFirstInstallmentDate() {
        return firstInstallmentDate;
    }

    public void setFirstInstallmentDate(String firstInstallmentDate) {
        this.firstInstallmentDate = firstInstallmentDate;
    }
}
