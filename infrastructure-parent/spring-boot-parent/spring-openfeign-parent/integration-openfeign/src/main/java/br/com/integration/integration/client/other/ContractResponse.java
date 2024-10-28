package br.com.integration.integration.client.other;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ContractResponse {

    private String uniqueIdentifier;
    private Long contractNumber;
    private LocalDate hiringDate;
    private Long proposalNumber;
    private LocalDate dueDate;
    private LocalDate pendingSolutionDeadline;
    private BigDecimal valueHired;
    private Integer status;
    private Boolean pendencyExistence;
    private String pendencyDescription;
    private List<ExecutionActionResponse> executionActionList;

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    public void setUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public Long getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(Long contractNumber) {
        this.contractNumber = contractNumber;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Long getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(Long proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getPendingSolutionDeadline() {
        return pendingSolutionDeadline;
    }

    public void setPendingSolutionDeadline(LocalDate pendingSolutionDeadline) {
        this.pendingSolutionDeadline = pendingSolutionDeadline;
    }

    public BigDecimal getValueHired() {
        return valueHired;
    }

    public void setValueHired(BigDecimal valueHired) {
        this.valueHired = valueHired;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getPendencyExistence() {
        return pendencyExistence;
    }

    public void setPendencyExistence(Boolean pendencyExistence) {
        this.pendencyExistence = pendencyExistence;
    }

    public String getPendencyDescription() {
        return pendencyDescription;
    }

    public void setPendencyDescription(String pendencyDescription) {
        this.pendencyDescription = pendencyDescription;
    }

    public List<ExecutionActionResponse> getExecutionActionList() {
        return executionActionList;
    }

    public void setExecutionActionList(List<ExecutionActionResponse> executionActionList) {
        this.executionActionList = executionActionList;
    }
}
