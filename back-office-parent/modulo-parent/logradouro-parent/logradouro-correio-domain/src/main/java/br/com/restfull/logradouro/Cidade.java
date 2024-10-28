package br.com.restfull.logradouro;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cep_202002_n_cidade")
class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cidade")
    private Integer idCidade;
    
    @Column(name = "cidade")
    private String cidade;
    
    @Column(name = "cidade_sem_acento")
    private String cidadeSemAcento;
    
    @Column(name = "estado")
    private String estado;
    
    @Column(name = "cidade_ibge")
    private String cidadeIbge;
    
    @Column(name = "ddd")
    private String ddd;
    
    @Column(name = "cidade_area")
    private String cidadeArea;
    
    @Column(name = "latitude")
    private String latitude;
    
    @Column(name = "longitude")
    private String longitude;

    public Integer getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Integer idCidade) {
        this.idCidade = idCidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidadeSemAcento() {
        return cidadeSemAcento;
    }

    public void setCidadeSemAcento(String cidadeSemAcento) {
        this.cidadeSemAcento = cidadeSemAcento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidadeIbge() {
        return cidadeIbge;
    }

    public void setCidadeIbge(String cidadeIbge) {
        this.cidadeIbge = cidadeIbge;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getCidadeArea() {
        return cidadeArea;
    }

    public void setCidadeArea(String cidadeArea) {
        this.cidadeArea = cidadeArea;
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
