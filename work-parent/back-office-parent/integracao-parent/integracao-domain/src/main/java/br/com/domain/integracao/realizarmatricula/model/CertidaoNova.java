//package br.com.domain.integracao.realizarmatricula.model;
//
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name = "cnv_certidao_nova")
//public class CertidaoNova implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cnv_id", nullable = false)
//    private Integer id;
//
//    /*
//    Data da emissão da certidão de nascimento
//    
//    Substistuindo atributos.
//    -inDiaEmisCertMatr
//    -inMesEmisCertMatr
//    -inAnoEmisCertMatr
//     */
//    
//    @Transient
////    @Column(name = "cnv_data_emissao_certidao")
////    @Temporal(javax.persistence.TemporalType.DATE)
//    private Date dataEmissaoCertidao;
//
//    @Column(name = "cnv_matricula_01", length = 6)
//    private String inCertMatr01;
//
//    @Column(name = "cnv_matricula_02", length = 2)
//    private String inCertMatr02;
//
//    @Column(name = "cnv_matricula_03", length = 2)
//    private String inCertMatr03;
//
//    @Column(name = "cnv_matricula_04", length = 4)
//    private String inCertMatr04;
//
//    @Column(name = "cnv_matricula_05", length = 1)
//    private String inCertMatr05;
//
//    @Column(name = "cnv_matricula_06", length = 5)
//    private String inCertMatr06;
//
//    @Column(name = "cnv_matricula_07", length = 3)
//    private String inCertMatr07;
//
//    @Column(name = "cnv_matricula_08", length = 7)
//    private String inCertMatr08;
//
//    @Column(name = "cnv_matricula_09", length = 2)
//    private String inCertMatr09;
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
//    public String getInCertMatr01() {
//        return inCertMatr01;
//    }
//
//    public void setInCertMatr01(String inCertMatr01) {
//        this.inCertMatr01 = inCertMatr01;
//    }
//
//    public String getInCertMatr02() {
//        return inCertMatr02;
//    }
//
//    public void setInCertMatr02(String inCertMatr02) {
//        this.inCertMatr02 = inCertMatr02;
//    }
//
//    public String getInCertMatr03() {
//        return inCertMatr03;
//    }
//
//    public void setInCertMatr03(String inCertMatr03) {
//        this.inCertMatr03 = inCertMatr03;
//    }
//
//    public String getInCertMatr04() {
//        return inCertMatr04;
//    }
//
//    public void setInCertMatr04(String inCertMatr04) {
//        this.inCertMatr04 = inCertMatr04;
//    }
//
//    public String getInCertMatr05() {
//        return inCertMatr05;
//    }
//
//    public void setInCertMatr05(String inCertMatr05) {
//        this.inCertMatr05 = inCertMatr05;
//    }
//
//    public String getInCertMatr06() {
//        return inCertMatr06;
//    }
//
//    public void setInCertMatr06(String inCertMatr06) {
//        this.inCertMatr06 = inCertMatr06;
//    }
//
//    public String getInCertMatr07() {
//        return inCertMatr07;
//    }
//
//    public void setInCertMatr07(String inCertMatr07) {
//        this.inCertMatr07 = inCertMatr07;
//    }
//
//    public String getInCertMatr08() {
//        return inCertMatr08;
//    }
//
//    public void setInCertMatr08(String inCertMatr08) {
//        this.inCertMatr08 = inCertMatr08;
//    }
//
//    public String getInCertMatr09() {
//        return inCertMatr09;
//    }
//
//    public void setInCertMatr09(String inCertMatr09) {
//        this.inCertMatr09 = inCertMatr09;
//    }
//}
