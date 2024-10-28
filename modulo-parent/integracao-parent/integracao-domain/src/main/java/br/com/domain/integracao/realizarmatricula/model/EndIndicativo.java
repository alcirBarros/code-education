//package br.com.domain.integracao.realizarmatricula.model;
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
//@Table(name = "enc_endereco_indicativo")
//public class EndIndicativo implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "enc_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "enc_logradouro", columnDefinition = "TEXT")
//    private String inLogradouro;
//    
//    @Column(name = "enc_numero", columnDefinition = "TEXT")
//    private String inNumero;
//    
//    @Column(name = "enc_bairro", columnDefinition = "TEXT")
//    private String inBairro;
//    
//    @Column(name = "enc_cep", columnDefinition = "TEXT")
//    private String inCep;
//    
//    @Column(name = "enc_cidade", columnDefinition = "TEXT")
//    private String inCidade;
//    
//    @Column(name = "enc_uf", columnDefinition = "TEXT")
//    private String inUF;
//    
//    @Column(name = "enc_latitude", columnDefinition = "TEXT")
//    private String inLatitude;
//    
//    @Column(name = "enc_longitude", columnDefinition = "TEXT")
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
//    public String getInLogradouro() {
//        return inLogradouro;
//    }
//
//    public void setInLogradouro(String inLogradouro) {
//        this.inLogradouro = inLogradouro;
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
//    public String getInUF() {
//        return inUF;
//    }
//
//    public void setInUF(String inUF) {
//        this.inUF = inUF;
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
//        hash = 97 * hash + Objects.hashCode(this.id);
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
//        final EndIndicativo other = (EndIndicativo) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//}
