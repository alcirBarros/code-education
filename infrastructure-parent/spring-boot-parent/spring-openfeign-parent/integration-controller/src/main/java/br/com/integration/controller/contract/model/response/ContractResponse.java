package br.com.integration.controller.contract.model.response;

import java.util.List;

public class ContractResponse {

  private Boolean hasNext;
  private Long lastContractFound;
  private List<ClientOperationResponse> contracts;

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

  public List<ClientOperationResponse> getContracts() {
    return contracts;
  }

  public void setContracts(List<ClientOperationResponse> contracts) {
    this.contracts = contracts;
  }
}
