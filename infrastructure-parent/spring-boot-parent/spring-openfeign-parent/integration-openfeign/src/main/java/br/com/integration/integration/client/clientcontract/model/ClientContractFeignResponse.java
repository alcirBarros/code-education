package br.com.integration.integration.client.clientcontract.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class ClientContractFeignResponse {

    @JsonAlias("indicadorContinuacaoPesquisa")
    private String searchIndicator;

    @JsonAlias("listaOperacoesCliente")
    private List<ClientOperationFeignResponse> contracts;

    public String getSearchIndicator() {
        return searchIndicator;
    }

    public void setSearchIndicator(String searchIndicator) {
        this.searchIndicator = searchIndicator;
    }

    public List<ClientOperationFeignResponse> getContracts() {
        return contracts;
    }

    public void setContracts(List<ClientOperationFeignResponse> contracts) {
        this.contracts = contracts;
    }
}
