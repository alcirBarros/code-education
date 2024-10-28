package br.com.integration.integration.client.signature.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class SignatureFeignResponse {

    @JsonAlias("listaIntervenientes")
    private List<IntervenerFeignResponse> intervenerList;

    @JsonAlias("listaSignatarios")
    private List<SignatoriesFeignResponse> signatoriesList;

    public List<IntervenerFeignResponse> getIntervenerList() {
        return intervenerList;
    }

    public void setIntervenerList(List<IntervenerFeignResponse> intervenerList) {
        this.intervenerList = intervenerList;
    }

    public List<SignatoriesFeignResponse> getSignatoriesList() {
        return signatoriesList;
    }

    public void setSignatoriesList(List<SignatoriesFeignResponse> signatoriesList) {
        this.signatoriesList = signatoriesList;
    }
}
