//package br.com.domain.integracao.consultafichaaluno.model;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cdc_consulta_documentos")
//public class ConsultaDocumentos implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cdc_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "cdc_numero_registro_geral", length = 16)
//    private String inNumRG;
//
//    @Column(name = "cdc_digito_registro_geral", length = 2)
//    private String inDigitoRG;
//
//    @Column(name = "cdc_unidade_federativa_registro_geral", length = 2)
//    private String inUFRG;
//
//    @Column(name = "cdc_cadastro_pessoa_fisica", length = 14)
//    private String inCPF;
//
//    @Column(name = "cdc_numero_inep", length = 13)
//    private String inNumINEP;
//
//    @Column(name = "cdc_numero_nis", length = 13)
//    private String inNumNIS;
//
//    @Column(name = "cdc_numero_certidao_nova", length = 33)
//    private String inNumCertidaoNova;
//
//    @Column(name = "cdc_numero_certidao_nascimento", length = 8)
//    private String inNumCertidaoNasc;
//
//    @Column(name = "cdc_livro_certidao_nascimento", length = 6)
//    private String inLivroCertidaoNasc;
//
//    @Column(name = "cdc_folha_certidao_nascimento", length = 6)
//    private String inFolhaCertidaoNasc;
//
//    public static ConsultaDocumentos setNull(ConsultaDocumentos consultaDocumentos) {
//        return consultaDocumentos;
//    }
//
//    public static boolean isEmpty(ConsultaDocumentos consultaDocumentos) {
//
//        if (consultaDocumentos == null) {
//            return true;
//        }
//
//        if (consultaDocumentos.getId() != null) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInNumRG() != null && !consultaDocumentos.getInNumRG().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInDigitoRG() != null && !consultaDocumentos.getInDigitoRG().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInUFRG() != null && !consultaDocumentos.getInUFRG().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInCPF() != null && !consultaDocumentos.getInCPF().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInNumINEP() != null && !consultaDocumentos.getInNumINEP().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInNumNIS() != null && !consultaDocumentos.getInNumNIS().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInNumCertidaoNova() != null && !consultaDocumentos.getInNumCertidaoNova().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInNumCertidaoNasc() != null && !consultaDocumentos.getInNumCertidaoNasc().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInLivroCertidaoNasc() != null && !consultaDocumentos.getInLivroCertidaoNasc().trim().isEmpty()) {
//            return false;
//        }
//
//        if (consultaDocumentos.getInFolhaCertidaoNasc() != null && !consultaDocumentos.getInFolhaCertidaoNasc().trim().isEmpty()) {
//            return false;
//        }
//
//        return true;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getInNumRG() {
//        return inNumRG;
//    }
//
//    public void setInNumRG(String inNumRG) {
//        this.inNumRG = inNumRG;
//    }
//
//    public String getInDigitoRG() {
//        return inDigitoRG;
//    }
//
//    public void setInDigitoRG(String inDigitoRG) {
//        this.inDigitoRG = inDigitoRG;
//    }
//
//    public String getInUFRG() {
//        return inUFRG;
//    }
//
//    public void setInUFRG(String inUFRG) {
//        this.inUFRG = inUFRG;
//    }
//
//    public String getInCPF() {
//        return inCPF;
//    }
//
//    public void setInCPF(String inCPF) {
//        this.inCPF = inCPF;
//    }
//
//    public String getInNumINEP() {
//        return inNumINEP;
//    }
//
//    public void setInNumINEP(String inNumINEP) {
//        this.inNumINEP = inNumINEP;
//    }
//
//    public String getInNumNIS() {
//        return inNumNIS;
//    }
//
//    public void setInNumNIS(String inNumNIS) {
//        this.inNumNIS = inNumNIS;
//    }
//
//    public String getInNumCertidaoNova() {
//        return inNumCertidaoNova;
//    }
//
//    public void setInNumCertidaoNova(String inNumCertidaoNova) {
//        this.inNumCertidaoNova = inNumCertidaoNova;
//    }
//
//    public String getInNumCertidaoNasc() {
//        return inNumCertidaoNasc;
//    }
//
//    public void setInNumCertidaoNasc(String inNumCertidaoNasc) {
//        this.inNumCertidaoNasc = inNumCertidaoNasc;
//    }
//
//    public String getInLivroCertidaoNasc() {
//        return inLivroCertidaoNasc;
//    }
//
//    public void setInLivroCertidaoNasc(String inLivroCertidaoNasc) {
//        this.inLivroCertidaoNasc = inLivroCertidaoNasc;
//    }
//
//    public String getInFolhaCertidaoNasc() {
//        return inFolhaCertidaoNasc;
//    }
//
//    public void setInFolhaCertidaoNasc(String inFolhaCertidaoNasc) {
//        this.inFolhaCertidaoNasc = inFolhaCertidaoNasc;
//    }
//}
