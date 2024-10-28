package br.com.integration.integration.client.other;

import java.util.List;

public class GetContractsResponse {

    private Boolean hasNext;
    private Long lastContractFound;
    private List<ContractResponse> contracts;

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Long getLastContractFound() {
        return lastContractFound;
    }

    public void setLastContractFound(Long lastContractFound) {
        this.lastContractFound = lastContractFound;
    }

    public List<ContractResponse> getContracts() {
        return contracts;
    }

    public void setContracts(List<ContractResponse> contracts) {
        this.contracts = contracts;
    }
}
