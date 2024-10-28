package br.com.integration.integration.client.consultaparcela.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.util.List;

public class ConsultaParcelaFeignResponse {
    @JsonAlias("dataDebitoParcela")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate installmentDebitDate;

    @JsonAlias("indicadorContinuacaoPesquisa")
    private String continuedSearchIndicator;

    @JsonAlias("quantidadeOperacoesCliente")
    private Long customerOperationsQuantity;

    @JsonAlias("listaParcelas")
    private List<ActiveInstallmentFeignResponse> installments;

    public LocalDate getInstallmentDebitDate() {
        return installmentDebitDate;
    }

    public void setInstallmentDebitDate(LocalDate installmentDebitDate) {
        this.installmentDebitDate = installmentDebitDate;
    }

    public String getContinuedSearchIndicator() {
        return continuedSearchIndicator;
    }

    public void setContinuedSearchIndicator(String continuedSearchIndicator) {
        this.continuedSearchIndicator = continuedSearchIndicator;
    }

    public Long getCustomerOperationsQuantity() {
        return customerOperationsQuantity;
    }

    public void setCustomerOperationsQuantity(Long customerOperationsQuantity) {
        this.customerOperationsQuantity = customerOperationsQuantity;
    }

    public List<ActiveInstallmentFeignResponse> getInstallments() {
        return installments;
    }

    public void setInstallments(List<ActiveInstallmentFeignResponse> installments) {
        this.installments = installments;
    }
}
