package br.com.integration.integration.client.activeoffer.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

public class ActiveOfferFeignResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonAlias(value = "quantidadeMinimaParcelasSimulacao")
    private Integer minimumNumberOfInstallments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonAlias(value = "valorMinimoSimulacao")
    private BigDecimal minimalValue;

//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonAlias(value = "ofertaAtivaCurtoPrazo")
//    private Simulation shortTermActiveOffer;
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonAlias("ofertaAtivaLongoPrazo")
//    private Simulation longTermActiveOffer;


    public Integer getMinimumNumberOfInstallments() {
        return minimumNumberOfInstallments;
    }

    public void setMinimumNumberOfInstallments(Integer minimumNumberOfInstallments) {
        this.minimumNumberOfInstallments = minimumNumberOfInstallments;
    }

    public BigDecimal getMinimalValue() {
        return minimalValue;
    }

    public void setMinimalValue(BigDecimal minimalValue) {
        this.minimalValue = minimalValue;
    }
}
