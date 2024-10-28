package br.com.domain.implement;

import br.com.context.model.statusresponse.StatusResponseEnum;

public interface ProdespInterFaceResponse {

    public String getJsonObject();

    public String getOutProcessoID();

    public String getOutSucesso();

    public String getOutErro();

    public String getMensagem();

    public StatusResponseEnum getStatusResponseEnum();

}
