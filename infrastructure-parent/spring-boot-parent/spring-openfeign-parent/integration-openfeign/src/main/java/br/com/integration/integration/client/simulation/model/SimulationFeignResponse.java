package br.com.integration.integration.client.simulation.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class SimulationFeignResponse {

    @JsonAlias("tipo")
    private String type;

    @JsonAlias("numeroSimulacao")
    private Long simulationNumber;

    @JsonIgnore
    private Integer minimumNumberOfInstallments;

    @JsonIgnore
    private BigDecimal minimumCreditValue;

    @JsonAlias("dataPrimeiraParcelaReposicao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate firstInstallmentDate;

    @JsonAlias("dataUltimaParcelaReposicao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate lastInstallmentDate;

    @JsonAlias("quantidadeRegistroListaParcela")
    private Integer installmentsListSize;

    @JsonAlias("quantidadeRegistroListaDespesa")
    private Integer expensesListSize;

    @JsonAlias("valorCredito")
    private BigDecimal creditValue;

    @JsonAlias("valorPrimeiraParcelaReposicao")
    private BigDecimal firstInstallmentValue;

    @JsonAlias({ "valorJuros", "valorTaxaEncargoCalculo" })
    private BigDecimal interestRate;

    @JsonAlias("valorUltimaParcelaReposicao")
    private BigDecimal lastInstallmentValue;

    @JsonAlias("listaCronogramaPagamentos")
    private List<InstallmentFeignResponse> installmentsList;

    @JsonAlias("listaDespesas")
    private List<ExpenseFeignResponse> expensesList;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSimulationNumber() {
        return simulationNumber;
    }

    public void setSimulationNumber(Long simulationNumber) {
        this.simulationNumber = simulationNumber;
    }

    public Integer getMinimumNumberOfInstallments() {
        return minimumNumberOfInstallments;
    }

    public void setMinimumNumberOfInstallments(Integer minimumNumberOfInstallments) {
        this.minimumNumberOfInstallments = minimumNumberOfInstallments;
    }

    public BigDecimal getMinimumCreditValue() {
        return minimumCreditValue;
    }

    public void setMinimumCreditValue(BigDecimal minimumCreditValue) {
        this.minimumCreditValue = minimumCreditValue;
    }

    public LocalDate getFirstInstallmentDate() {
        return firstInstallmentDate;
    }

    public void setFirstInstallmentDate(LocalDate firstInstallmentDate) {
        this.firstInstallmentDate = firstInstallmentDate;
    }

    public LocalDate getLastInstallmentDate() {
        return lastInstallmentDate;
    }

    public void setLastInstallmentDate(LocalDate lastInstallmentDate) {
        this.lastInstallmentDate = lastInstallmentDate;
    }

    public Integer getInstallmentsListSize() {
        return installmentsListSize;
    }

    public void setInstallmentsListSize(Integer installmentsListSize) {
        this.installmentsListSize = installmentsListSize;
    }

    public Integer getExpensesListSize() {
        return expensesListSize;
    }

    public void setExpensesListSize(Integer expensesListSize) {
        this.expensesListSize = expensesListSize;
    }

    public BigDecimal getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(BigDecimal creditValue) {
        this.creditValue = creditValue;
    }

    public BigDecimal getFirstInstallmentValue() {
        return firstInstallmentValue;
    }

    public void setFirstInstallmentValue(BigDecimal firstInstallmentValue) {
        this.firstInstallmentValue = firstInstallmentValue;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getLastInstallmentValue() {
        return lastInstallmentValue;
    }

    public void setLastInstallmentValue(BigDecimal lastInstallmentValue) {
        this.lastInstallmentValue = lastInstallmentValue;
    }

    public List<InstallmentFeignResponse> getInstallmentsList() {
        return installmentsList;
    }

    public void setInstallmentsList(List<InstallmentFeignResponse> installmentsList) {
        this.installmentsList = installmentsList;
    }

    public List<ExpenseFeignResponse> getExpensesList() {
        return expensesList;
    }

    public void setExpensesList(List<ExpenseFeignResponse> expensesList) {
        this.expensesList = expensesList;
    }
}
