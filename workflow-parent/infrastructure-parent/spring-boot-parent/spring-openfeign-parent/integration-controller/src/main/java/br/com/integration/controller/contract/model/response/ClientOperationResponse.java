package br.com.integration.controller.contract.model.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ClientOperationResponse {

  private Long uniqueIdentifier;
  private Long contractNumber;
  private Long proposalNumber;
  private LocalDate hiringDate;
  private LocalDate dueDate;
  private LocalDate pendingSolutionDeadline;
  private BigDecimal valueHired;
  private BigDecimal status;
  private Boolean pendencyExistence;
  private String pendencyDescription;
  private List<ExecutionActionResponse> executionActionList;

  public Long getUniqueIdentifier() {
    return uniqueIdentifier;
  }

  public void setUniqueIdentifier(Long uniqueIdentifier) {
    this.uniqueIdentifier = uniqueIdentifier;
  }

  public Long getContractNumber() {
    return contractNumber;
  }

  public void setContractNumber(Long contractNumber) {
    this.contractNumber = contractNumber;
  }

  public Long getProposalNumber() {
    return proposalNumber;
  }

  public void setProposalNumber(Long proposalNumber) {
    this.proposalNumber = proposalNumber;
  }

  public LocalDate getHiringDate() {
    return hiringDate;
  }

  public void setHiringDate(LocalDate hiringDate) {
    this.hiringDate = hiringDate;
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

  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
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
