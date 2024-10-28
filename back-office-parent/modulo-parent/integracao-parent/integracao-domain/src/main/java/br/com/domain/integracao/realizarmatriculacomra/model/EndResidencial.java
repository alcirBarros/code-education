//package br.com.domain.integracao.realizarmatriculacomra.model;
//
//import java.io.Serializable;
//import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "ers_endereco_residencial")
//public class EndResidencial implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "ers_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "ers_bairro", columnDefinition = "TEXT")
//    private String inBairro;
//
//    @Column(name = "ers_cep", columnDefinition = "TEXT")
//    private String inCep;
//
//    @Column(name = "ers_cidade", columnDefinition = "TEXT")
//    private String inCidade;
//
//    @Column(name = "ers_complemento", columnDefinition = "TEXT")
//    private String inComplemento;
//
//    @Column(name = "ers_ddd", columnDefinition = "TEXT")
//    private String inDDD;
//
//    @Column(name = "ers_fone_recados", columnDefinition = "TEXT")
//    private String inFoneRecados;
//
//    @Column(name = "ers_tipo_ensino", columnDefinition = "TEXT")
//    private String inFoneResidencial;
//
//    @Column(name = "ers_logradouro", columnDefinition = "TEXT")
//    private String inLogradouro;
//
//    @Column(name = "ers_nome_fone_recado", columnDefinition = "TEXT")
//    private String inNomeFoneRecado;
//
//    @Column(name = "ers_numero", columnDefinition = "TEXT")
//    private String inNumero;
//
//    @Column(name = "ers_uf", columnDefinition = "TEXT")
//    private String inUF;
//
//    @Column(name = "ers_tipo_logradouro", columnDefinition = "TEXT")
//    private String inTipoLogradouro;
//
//    @Column(name = "ers_latitude", columnDefinition = "TEXT")
//    private String inLatitude;
//
//    @Column(name = "ers_longitude", columnDefinition = "TEXT")
//    private String inLongitude;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getInBairro() {
//        return inBairro;
//    }
//
//    public void setInBairro(String inBairro) {
//        this.inBairro = inBairro;
//    }
//
//    public String getInCep() {
//        return inCep;
//    }
//
//    public void setInCep(String inCep) {
//        this.inCep = inCep;
//    }
//
//    public String getInCidade() {
//        return inCidade;
//    }
//
//    public void setInCidade(String inCidade) {
//        this.inCidade = inCidade;
//    }
//
//    public String getInComplemento() {
//        return inComplemento;
//    }
//
//    public void setInComplemento(String inComplemento) {
//        this.inComplemento = inComplemento;
//    }
//
//    public String getInDDD() {
//        return inDDD;
//    }
//
//    public void setInDDD(String inDDD) {
//        this.inDDD = inDDD;
//    }
//
//    public String getInFoneRecados() {
//        return inFoneRecados;
//    }
//
//    public void setInFoneRecados(String inFoneRecados) {
//        this.inFoneRecados = inFoneRecados;
//    }
//
//    public String getInFoneResidencial() {
//        return inFoneResidencial;
//    }
//
//    public void setInFoneResidencial(String inFoneResidencial) {
//        this.inFoneResidencial = inFoneResidencial;
//    }
//
//    public String getInLogradouro() {
//        return inLogradouro;
//    }
//
//    public void setInLogradouro(String inLogradouro) {
//        this.inLogradouro = inLogradouro;
//    }
//
//    public String getInNomeFoneRecado() {
//        return inNomeFoneRecado;
//    }
//
//    public void setInNomeFoneRecado(String inNomeFoneRecado) {
//        this.inNomeFoneRecado = inNomeFoneRecado;
//    }
//
//    public String getInNumero() {
//        return inNumero;
//    }
//
//    public void setInNumero(String inNumero) {
//        this.inNumero = inNumero;
//    }
//
//    public String getInUF() {
//        return inUF;
//    }
//
//    public void setInUF(String inUF) {
//        this.inUF = inUF;
//    }
//
//    public String getInTipoLogradouro() {
//        return inTipoLogradouro;
//    }
//
//    public void setInTipoLogradouro(String inTipoLogradouro) {
//        this.inTipoLogradouro = inTipoLogradouro;
//    }
//
//    public String getInLatitude() {
//        return inLatitude;
//    }
//
//    public void setInLatitude(String inLatitude) {
//        this.inLatitude = inLatitude;
//    }
//
//    public String getInLongitude() {
//        return inLongitude;
//    }
//
//    public void setInLongitude(String inLongitude) {
//        this.inLongitude = inLongitude;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 59 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final EndResidencial other = (EndResidencial) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//}