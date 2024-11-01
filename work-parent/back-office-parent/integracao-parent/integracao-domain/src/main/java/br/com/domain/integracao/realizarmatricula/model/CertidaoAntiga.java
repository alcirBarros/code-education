//package br.com.domain.integracao.realizarmatricula.model;
//
//import java.io.Serializable;
//import java.util.Date;
//import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name = "cta_certidao_antiga")
//public class CertidaoAntiga implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cta_id", nullable = false)
//    private Integer id;
//
//    /*
//    Data da emissão da certidão de nascimento
//    
//    Substistuiu os atributos.
//    -inDiaEmisCertidao
//    -inMesEmisCertidao
//    -inAnoEmisCertMatr
//     */
//    
//    @Transient
////    @Column(name = "cnv_data_emissao_certidao")
////    @Temporal(javax.persistence.TemporalType.DATE)
//    private Date dataEmissaoCertidao;
//
//    @Column(name = "cta_folha", length = 4)
//    private String inFolha;
//
//    @Column(name = "cta_municipio_comarca", length = 22)
//    private String inMunicipioComarca;
//
//    @Column(name = "cta_uf_comarca", length = 2)
//    private String inUFComarca;
//
//    @Column(name = "cta_livro", length = 4)
//    private String inLivro;
//
//    @Column(name = "cta_distrito_certidao", length = 22)
//    private String inDistritoCertidao;
//
//    @Column(name = "cta_numero_certidao", length = 6)
//    private String inNumCertidao;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Date getDataEmissaoCertidao() {
//        return dataEmissaoCertidao;
//    }
//
//    public void setDataEmissaoCertidao(Date dataEmissaoCertidao) {
//        this.dataEmissaoCertidao = dataEmissaoCertidao;
//    }
//
//    public String getInFolha() {
//        return inFolha;
//    }
//
//    public void setInFolha(String inFolha) {
//        this.inFolha = inFolha;
//    }
//
//    public String getInMunicipioComarca() {
//        return inMunicipioComarca;
//    }
//
//    public void setInMunicipioComarca(String inMunicipioComarca) {
//        this.inMunicipioComarca = inMunicipioComarca;
//    }
//
//    public String getInUFComarca() {
//        return inUFComarca;
//    }
//
//    public void setInUFComarca(String inUFComarca) {
//        this.inUFComarca = inUFComarca;
//    }
//
//    public String getInLivro() {
//        return inLivro;
//    }
//
//    public void setInLivro(String inLivro) {
//        this.inLivro = inLivro;
//    }
//
//    public String getInDistritoCertidao() {
//        return inDistritoCertidao;
//    }
//
//    public void setInDistritoCertidao(String inDistritoCertidao) {
//        this.inDistritoCertidao = inDistritoCertidao;
//    }
//
//    public String getInNumCertidao() {
//        return inNumCertidao;
//    }
//
//    public void setInNumCertidao(String inNumCertidao) {
//        this.inNumCertidao = inNumCertidao;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 79 * hash + Objects.hashCode(this.id);
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
//        final CertidaoAntiga other = (CertidaoAntiga) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//}
