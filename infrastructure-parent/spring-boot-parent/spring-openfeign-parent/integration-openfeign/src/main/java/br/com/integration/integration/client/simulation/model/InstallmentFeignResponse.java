package br.com.integration.integration.client.simulation.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InstallmentFeignResponse {

    @JsonAlias("data")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate date;

    @JsonAlias("valorReposicaoCapital")
    private BigDecimal replacementValue;

    @JsonAlias("valorEncargoAdicional")
    private BigDecimal additionalChargeAmount;

    @JsonAlias("valorSaldoDevedor")
    private BigDecimal debitBalance;

    @JsonAlias("valorTotalParcela")
    private BigDecimal installmentValue;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getReplacementValue() {
        return replacementValue;
    }

    public void setReplacementValue(BigDecimal replacementValue) {
        this.replacementValue = replacementValue;
    }

    public BigDecimal getAdditionalChargeAmount() {
        return additionalChargeAmount;
    }

    public void setAdditionalChargeAmount(BigDecimal additionalChargeAmount) {
        this.additionalChargeAmount = additionalChargeAmount;
    }

    public BigDecimal getDebitBalance() {
        return debitBalance;
    }

    public void setDebitBalance(BigDecimal debitBalance) {
        this.debitBalance = debitBalance;
    }

    public BigDecimal getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(BigDecimal installmentValue) {
        this.installmentValue = installmentValue;
    }
}
