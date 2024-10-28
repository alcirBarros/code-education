package br.com.ireport.avisoterminoobra.model;

import java.io.ByteArrayInputStream;
import java.util.logging.SimpleFormatter;

public class AvisoTerminoObra {

    private Long id;
    private ByteArrayInputStream imagem;

    private String protocolo;
    private String anotacaoResponsabilidadeTecnica;
    private String dataInforme;
    private String situacao;
    private String dataTermino;

    private String declaracao;

    private String dataHoraImpressao;
    private String assinaturaDigital;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ByteArrayInputStream getImagem() {
        return imagem;
    }

    public void setImagem(ByteArrayInputStream imagem) {
        this.imagem = imagem;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getAnotacaoResponsabilidadeTecnica() {
        return anotacaoResponsabilidadeTecnica;
    }

    public void setAnotacaoResponsabilidadeTecnica(String anotacaoResponsabilidadeTecnica) {
        this.anotacaoResponsabilidadeTecnica = anotacaoResponsabilidadeTecnica;
    }

    public String getDataInforme() {
        return dataInforme;
    }

    public void setDataInforme(String dataInforme) {
        this.dataInforme = dataInforme;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getDeclaracao() {
        return declaracao;
    }

    public void setDeclaracao(String declaracao) {
        this.declaracao = declaracao;
    }

    public String getDataHoraImpressao() {
        return dataHoraImpressao;
    }

    public void setDataHoraImpressao(String dataHoraImpressao) {
        this.dataHoraImpressao = dataHoraImpressao;
    }

    public String getAssinaturaDigital() {
        return assinaturaDigital;
    }

    public void setAssinaturaDigital(String assinaturaDigital) {
        this.assinaturaDigital = assinaturaDigital;
    }
}
