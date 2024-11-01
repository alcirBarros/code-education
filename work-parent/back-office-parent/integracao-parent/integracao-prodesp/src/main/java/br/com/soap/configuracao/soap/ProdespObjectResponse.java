package br.com.soap.configuracao.soap;

import br.com.domain.auxiliar.statusresponse.StatusResponseEnum;
import com.google.gson.JsonObject;

public interface ProdespObjectResponse {

    public JsonObject getJsonObject();

    public String getMensagem();

    public StatusResponseEnum getStatusResponseEnum();

}
