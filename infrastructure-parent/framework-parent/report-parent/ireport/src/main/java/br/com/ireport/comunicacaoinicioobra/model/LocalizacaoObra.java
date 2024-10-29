package br.com.ireport.comunicacaoinicioobra.model;

public class LocalizacaoObra {
    
    private Long id;
    
    private String principal;
    private String via;
    private String codigoLogradouro;
    private String alturaNumero;
    private String tipoIntervensao;
    private String ocupacaoVia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCodigoLogradouro() {
        return codigoLogradouro;
    }

    public void setCodigoLogradouro(String codigoLogradouro) {
        this.codigoLogradouro = codigoLogradouro;
    }

    public String getAlturaNumero() {
        return alturaNumero;
    }

    public void setAlturaNumero(String alturaNumero) {
        this.alturaNumero = alturaNumero;
    }

    public String getTipoIntervensao() {
        return tipoIntervensao;
    }

    public void setTipoIntervensao(String tipoIntervensao) {
        this.tipoIntervensao = tipoIntervensao;
    }

    public String getOcupacaoVia() {
        return ocupacaoVia;
    }

    public void setOcupacaoVia(String ocupacaoVia) {
        this.ocupacaoVia = ocupacaoVia;
    }
    
    
}
