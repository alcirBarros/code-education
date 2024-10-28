package br.com.integration.integration.client.consultaparcela.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ActiveInstallmentFeignResponse {
    @JsonAlias("identificadorUnico")
    private Long uniqueIdentifier;

    @JsonAlias("contrato")
    private Long contract;

    @JsonAlias("dataContratacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate hiringDate;

    @JsonAlias("instituicaoFinanceira")
    private Long financialInstitution;

    @JsonAlias("agencia")
    private Long agency;

    @JsonAlias("digitoVerificadorAgencia")
    private String agencyCheckDigit;

    @JsonAlias("conta")
    private Long account;

    @JsonAlias("digitoVerificadorConta")
    private String accountCheckDigit;

    @JsonAlias("valorContratado")
    private BigDecimal hiredValue;

    @JsonAlias("valorParcela")
    private BigDecimal installmentValue;

    @JsonAlias("dataVencimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate installmentDueDate;

    @JsonAlias("indicadorOperacaoLiquidada")
    private String settledTransactionIndicator;

    public Long getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(Long uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public Long getContract() {
        return contract;
    }

    public void setContract(Long contract) {
        this.contract = contract;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Long getFinancialInstitution() {
        return financialInstitution;
    }

    public void setFinancialInstitution(Long financialInstitution) {
        this.financialInstitution = financialInstitution;
    }

    public Long getAgency() {
        return agency;
    }

    public void setAgency(Long agency) {
        this.agency = agency;
    }

    public String getAgencyCheckDigit() {
        return agencyCheckDigit;
    }

    public void setAgencyCheckDigit(String agencyCheckDigit) {
        this.agencyCheckDigit = agencyCheckDigit;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public String getAccountCheckDigit() {
        return accountCheckDigit;
    }

    public void setAccountCheckDigit(String accountCheckDigit) {
        this.accountCheckDigit = accountCheckDigit;
    }

    public BigDecimal getHiredValue() {
        return hiredValue;
    }

    public void setHiredValue(BigDecimal hiredValue) {
        this.hiredValue = hiredValue;
    }

    public BigDecimal getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(BigDecimal installmentValue) {
        this.installmentValue = installmentValue;
    }

    public LocalDate getInstallmentDueDate() {
        return installmentDueDate;
    }

    public void setInstallmentDueDate(LocalDate installmentDueDate) {
        this.installmentDueDate = installmentDueDate;
    }

    public String getSettledTransactionIndicator() {
        return settledTransactionIndicator;
    }

    public void setSettledTransactionIndicator(String settledTransactionIndicator) {
        this.settledTransactionIndicator = settledTransactionIndicator;
    }
}
