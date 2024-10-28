package br.com.soap.configuracao.soap;

import br.com.domain.auxiliar.statusresponse.StatusResponseEnum;

public abstract class Envelope {

    public abstract String getMensagem();

    public abstract StatusResponseEnum getStatusResponseEnum();

}
