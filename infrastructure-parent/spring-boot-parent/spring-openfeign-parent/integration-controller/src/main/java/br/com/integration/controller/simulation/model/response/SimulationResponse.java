package br.com.integration.controller.simulation.model.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class SimulationResponse {

    private String type;
    private Long simulationNumber;
    private Integer minimumNumberOfInstallments;
    private BigDecimal minimumCreditValue;
    private LocalDate firstInstallmentDate;
    private LocalDate lastInstallmentDate;
    private Integer installmentsListSize;
    private Integer expensesListSize;
    private BigDecimal creditValue;
    private BigDecimal firstInstallmentValue;
    private BigDecimal interestRate;
    private BigDecimal lastInstallmentValue;
    private List<InstallmentResponse> installmentsList;
    private List<ExpenseResponse> expensesList;

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

    public List<InstallmentResponse> getInstallmentsList() {
        return installmentsList;
    }

    public void setInstallmentsList(List<InstallmentResponse> installmentsList) {
        this.installmentsList = installmentsList;
    }

    public List<ExpenseResponse> getExpensesList() {
        return expensesList;
    }

    public void setExpensesList(List<ExpenseResponse> expensesList) {
        this.expensesList = expensesList;
    }
}
