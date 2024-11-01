package br.com.restfull.logradouro;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_cep_202002_n_log")
public class Logradouro implements Serializable {

    @Id
    @Column(name = "cep", length = 11)
    private String cep;

    @Column(name = "tipo", scale = 100)
    private String tipo;

    @Column(name = "nome_logradouro", scale = 100)
    private String nome_logradouro;

    @Column(name = "logradouro", scale = 100)
    private String logradouro;

    @ManyToOne
    @JoinColumn(name = "bairro_id", referencedColumnName = "id_bairro")
    private Bairro bairro_id;

    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "id_cidade")
    private Cidade cidade_id;

    @Column(name = "estado", scale = 2)
    private String estado;

    @Column(name = "tipo_sem_acento", scale = 100)
    private String tipo_sem_acento;

    @Column(name = "nome_logradouro_sem_acento", scale = 100)
    private String nome_logradouro_sem_acento;

    @Column(name = "logradouro_sem_acento", scale = 100)
    private String logradouro_sem_acento;

    @Column(name = "latitude", scale = 100)
    private String latitude;

    @Column(name = "longitude", scale = 100)
    private String longitude;

    @Column(name = "cep_ativo", scale = 100)
    private String cep_ativo;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome_logradouro() {
        return nome_logradouro;
    }

    public void setNome_logradouro(String nome_logradouro) {
        this.nome_logradouro = nome_logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Bairro getBairro_id() {
        return bairro_id;
    }

    public void setBairro_id(Bairro bairro_id) {
        this.bairro_id = bairro_id;
    }

    public Cidade getCidade_id() {
        return cidade_id;
    }

    public void setCidade_id(Cidade cidade_id) {
        this.cidade_id = cidade_id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_sem_acento() {
        return tipo_sem_acento;
    }

    public void setTipo_sem_acento(String tipo_sem_acento) {
        this.tipo_sem_acento = tipo_sem_acento;
    }

    public String getNome_logradouro_sem_acento() {
        return nome_logradouro_sem_acento;
    }

    public void setNome_logradouro_sem_acento(String nome_logradouro_sem_acento) {
        this.nome_logradouro_sem_acento = nome_logradouro_sem_acento;
    }

    public String getLogradouro_sem_acento() {
        return logradouro_sem_acento;
    }

    public void setLogradouro_sem_acento(String logradouro_sem_acento) {
        this.logradouro_sem_acento = logradouro_sem_acento;
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

    public String getCep_ativo() {
        return cep_ativo;
    }

    public void setCep_ativo(String cep_ativo) {
        this.cep_ativo = cep_ativo;
    }

}
