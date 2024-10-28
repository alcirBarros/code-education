package br.com.soap.configuracao.soap;

import br.com.domain.auxiliar.statusresponse.StatusResponseEnum;
import com.google.gson.JsonObject;

public class EnvelopeSoapResponse extends Envelope implements ProdespResponse, ProdespObjectResponse {

    private JsonObject jsonObject;

    private String outProcessoID;
    private String outSucesso;
    private String outErro;

    @Override
    public String getOutProcessoID() {
        return this.outProcessoID;
    }

    public void setOutProcessoID(String outProcessoID) {
        this.outProcessoID = outProcessoID;
    }

    @Override
    public String getOutSucesso() {
        return outSucesso;
    }

    public void setOutSucesso(String outSucesso) {
        this.outSucesso = outSucesso;
    }

    @Override
    public String getOutErro() {
        return outErro;
    }

    public void setOutErro(String outErro) {
        this.outErro = outErro;
    }

    @Override
    public JsonObject getJsonObject() {
        return jsonObject;
    }

    public void setJsonObject(JsonObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    @Override
    public String getMensagem() {
        String mensagem = (outSucesso != null && !outSucesso.trim().equals("")) ? outSucesso : outErro;
        return (mensagem != null) ? mensagem.toUpperCase() : null;
    }

    @Override
    public StatusResponseEnum getStatusResponseEnum() {
        if (outErro == null && outSucesso != null) {
            return StatusResponseEnum.OK;
        }
        return StatusResponseEnum.INTERNAL_SERVER_INTERRUPTER_METHOD;
    }
}
