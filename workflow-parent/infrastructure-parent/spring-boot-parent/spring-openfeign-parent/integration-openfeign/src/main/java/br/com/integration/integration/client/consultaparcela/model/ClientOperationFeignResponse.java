package br.com.integration.integration.client.consultaparcela.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ClientOperationFeignResponse {

    @JsonAlias("identificadorUnico")
    private Long uniqueIdentifier;

    @JsonAlias("contrato")
    private Long contractNumber;

    @JsonAlias("numeroProposta")
    private Long proposalNumber;

    @JsonAlias("dataContratacao")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate hiringDate;

    @JsonAlias("dataVencimento")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate dueDate;

    @JsonAlias("dataLimiteSolucaoPendencia")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private LocalDate pendingSolutionDeadline;

    @JsonAlias("valorContratado")
    private BigDecimal valueHired;

    @JsonAlias("estado")
    private Integer status;

    @JsonAlias("indicadorExistenciaPendencia")
    private String pendencyExistenceString;

    private Boolean pendencyExistence;

    @JsonAlias("descricaoPendencia")
    private String pendencyDescription;

    @JsonAlias("listaAcoesExecutar")
    private List<ExecutionActionFeignResponse> executionActionList;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPendencyExistenceString() {
        return pendencyExistenceString;
    }

    public void setPendencyExistenceString(String pendencyExistenceString) {
        this.pendencyExistenceString = pendencyExistenceString;
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

    public List<ExecutionActionFeignResponse> getExecutionActionList() {
        return executionActionList;
    }

    public void setExecutionActionList(List<ExecutionActionFeignResponse> executionActionList) {
        this.executionActionList = executionActionList;
    }
}
