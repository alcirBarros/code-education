package br.com.ireport.comunicacaoinicioobra.model;

import br.com.ireport.model.ArquivoAnexado;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

public class AutorizacaoInicioObra {

    private Long id;
    
    private ByteArrayInputStream imagem;

    private String protocolo;
    private String avisoNumero;
    private String tipoObra;
    private String numeroAlvara;
    private String permissionaria;
    private String responsabilidadeTecnica;
    private String cnpj;
    private String termoPermissaoOcupacaoVia;
    private String dataPrevistainicioObra;
    private String dataPrevistaTerminoObra;
    private String naturezaOperacao;

    private ByteArrayInputStream imagemMapa;
    
    private String assinaturaDigital;
    private List<LocalizacaoObra> localizacaoObraLit = new ArrayList<>();
    private List<SubPrefeitura> subPrefeituraList = new ArrayList<>();
    private List<ArquivoAnexado> arquivoAnexadoList = new ArrayList<>();

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

    public String getAvisoNumero() {
        return avisoNumero;
    }

    public void setAvisoNumero(String avisoNumero) {
        this.avisoNumero = avisoNumero;
    }

    public String getTipoObra() {
        return tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public String getNumeroAlvara() {
        return numeroAlvara;
    }

    public void setNumeroAlvara(String numeroAlvara) {
        this.numeroAlvara = numeroAlvara;
    }

    public String getPermissionaria() {
        return permissionaria;
    }

    public void setPermissionaria(String permissionaria) {
        this.permissionaria = permissionaria;
    }

    public String getResponsabilidadeTecnica() {
        return responsabilidadeTecnica;
    }

    public void setResponsabilidadeTecnica(String responsabilidadeTecnica) {
        this.responsabilidadeTecnica = responsabilidadeTecnica;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTermoPermissaoOcupacaoVia() {
        return termoPermissaoOcupacaoVia;
    }

    public void setTermoPermissaoOcupacaoVia(String termoPermissaoOcupacaoVia) {
        this.termoPermissaoOcupacaoVia = termoPermissaoOcupacaoVia;
    }

    public String getDataPrevistainicioObra() {
        return dataPrevistainicioObra;
    }

    public void setDataPrevistainicioObra(String dataPrevistainicioObra) {
        this.dataPrevistainicioObra = dataPrevistainicioObra;
    }

    public String getDataPrevistaTerminoObra() {
        return dataPrevistaTerminoObra;
    }

    public void setDataPrevistaTerminoObra(String dataPrevistaTerminoObra) {
        this.dataPrevistaTerminoObra = dataPrevistaTerminoObra;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public ByteArrayInputStream getImagemMapa() {
        return imagemMapa;
    }

    public void setImagemMapa(ByteArrayInputStream imagemMapa) {
        this.imagemMapa = imagemMapa;
    }

    public String getAssinaturaDigital() {
        return assinaturaDigital;
    }

    public void setAssinaturaDigital(String assinaturaDigital) {
        this.assinaturaDigital = assinaturaDigital;
    }
    
    public List<LocalizacaoObra> getLocalizacaoObraLit() {
        return localizacaoObraLit;
    }

    public void setLocalizacaoObraLit(List<LocalizacaoObra> localizacaoObraLit) {
        this.localizacaoObraLit = localizacaoObraLit;
    }

    public List<SubPrefeitura> getSubPrefeituraList() {
        return subPrefeituraList;
    }

    public void setSubPrefeituraList(List<SubPrefeitura> subPrefeituraList) {
        this.subPrefeituraList = subPrefeituraList;
    }

    public List<ArquivoAnexado> getArquivoAnexadoList() {
        return arquivoAnexadoList;
    }

    public void setArquivoAnexadoList(List<ArquivoAnexado> arquivoAnexadoList) {
        this.arquivoAnexadoList = arquivoAnexadoList;
    }  
}
