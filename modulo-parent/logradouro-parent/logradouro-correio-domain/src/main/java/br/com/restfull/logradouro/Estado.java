package br.com.restfull.logradouro;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cep_202002_n_estado")
class Estado implements Serializable {

    @Id
    @Column(name = "sigla", scale = 100)
    private String sigla;

    @Column(name = "faixa_ini", scale = 100)
    private String faixa_ini;

    @Column(name = "faixa_fim", scale = 100)
    private String faixa_fim;

    @Column(name = "estado", scale = 100)
    private String estado;

    @Column(name = "capital", scale = 100)
    private String capital;

    @Column(name = "regiao", scale = 100)
    private String regiao;

    @Column(name = "estado_sem_acento", scale = 100)
    private String estado_sem_acento;

    @Column(name = "capital_sem_acento", scale = 100)
    private String capital_sem_acento;

    @Column(name = "regiao_sem_acento", scale = 100)
    private String regiao_sem_acento;

    @Column(name = "latitude", scale = 100)
    private String latitude;

    @Column(name = "longitude", scale = 100)
    private String longitude;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getFaixa_ini() {
        return faixa_ini;
    }

    public void setFaixa_ini(String faixa_ini) {
        this.faixa_ini = faixa_ini;
    }

    public String getFaixa_fim() {
        return faixa_fim;
    }

    public void setFaixa_fim(String faixa_fim) {
        this.faixa_fim = faixa_fim;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEstado_sem_acento() {
        return estado_sem_acento;
    }

    public void setEstado_sem_acento(String estado_sem_acento) {
        this.estado_sem_acento = estado_sem_acento;
    }

    public String getCapital_sem_acento() {
        return capital_sem_acento;
    }

    public void setCapital_sem_acento(String capital_sem_acento) {
        this.capital_sem_acento = capital_sem_acento;
    }

    public String getRegiao_sem_acento() {
        return regiao_sem_acento;
    }

    public void setRegiao_sem_acento(String regiao_sem_acento) {
        this.regiao_sem_acento = regiao_sem_acento;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

}
