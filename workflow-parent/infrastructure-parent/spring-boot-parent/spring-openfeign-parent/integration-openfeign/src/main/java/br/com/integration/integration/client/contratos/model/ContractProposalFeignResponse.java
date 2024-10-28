package br.com.integration.integration.client.contratos.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class ContractProposalFeignResponse {

    @JsonAlias("numeroProposta")
    private Long proposalNumber;

    @JsonAlias("codigoProximoProcedimento")
    private Long codeNextStep;

    public Long getProposalNumber() {
        return proposalNumber;
    }

    public void setProposalNumber(Long proposalNumber) {
        this.proposalNumber = proposalNumber;
    }

    public Long getCodeNextStep() {
        return codeNextStep;
    }

    public void setCodeNextStep(Long codeNextStep) {
        this.codeNextStep = codeNextStep;
    }
}
