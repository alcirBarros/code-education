//package br.com.domain.integracao.consultarquadroresumo;
//
//import br.com.projeto.model.EntidadeSerialVersion;
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "mcq_mensagem_consultar_quadro_resumo")
//public class MsgConsultarQuadroResumo extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "mcq_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "mcq_atividade_complementar_01", columnDefinition = "TEXT")
//    private String outAtividadeCompl1;
//
//    @Column(name = "mcq_atividade_complementar_02", columnDefinition = "TEXT")
//    private String outAtividadeCompl2;
//
//    @Column(name = "mcq_atividade_complementar_03", columnDefinition = "TEXT")
//    private String outAtividadeCompl3;
//
//    @Column(name = "mcq_atividade_complementar_04", columnDefinition = "TEXT")
//    private String outAtividadeCompl4;
//
//    @Column(name = "mcq_auditiva", columnDefinition = "TEXT")
//    private String outAuditiva;
//
//    @Column(name = "mcq_curso_normal_01", columnDefinition = "TEXT")
//    private String outCursoNormal1;
//
//    @Column(name = "mcq_curso_normal_02", columnDefinition = "TEXT")
//    private String outCursoNormal2;
//
//    @Column(name = "mcq_curso_normal_03", columnDefinition = "TEXT")
//    private String outCursoNormal3;
//
//    @Column(name = "mcq_curso_normal_04", columnDefinition = "TEXT")
//    private String outCursoNormal4;
//
//    @Column(name = "mcq_educacao_especializada", columnDefinition = "TEXT")
//    private String outEducEspecializado;
//
//    @Column(name = "mcq_educacao_especializada_exclusiva", columnDefinition = "TEXT")
//    private String outEducEspExclusiva;
//
//    @Column(name = "mcq_eja_ensino_medio", columnDefinition = "TEXT")
//    private String outEjaEnsMedio;
//
//    @Column(name = "mcq_ensino_linguas", columnDefinition = "TEXT")
//    private String outEnsinoLinguas;
//
//    @Column(name = "mcq_ensino_medio_01", columnDefinition = "TEXT")
//    private String outEnsMedio1;
//
//    @Column(name = "mcq_ensino_medio_02", columnDefinition = "TEXT")
//    private String outEnsMedio2;
//
//    @Column(name = "mcq_ensino_medio_03", columnDefinition = "TEXT")
//    private String outEnsMedio3;
//
//    @Column(name = "mcq_ensino_medio_04", columnDefinition = "TEXT")
//    private String outEnsMedio4;
//
//    @Column(name = "mcq_ensino_medio_profissnal", columnDefinition = "TEXT")
//    private String outEnsMedioIntEdProf;
//
//    @Column(name = "mcq_especializacao", columnDefinition = "TEXT")
//    private String outEspecializacao;
//
//    @Column(name = "mcq_fisica", columnDefinition = "TEXT")
//    private String outFisica;
//
////    @XmlElement(name = "outFund8anos5")
//    @Column(name = "mcq_fundamental_8_anos_5", columnDefinition = "TEXT")
//    private String outFund8Anos5;
////    
//////    @XmlElement(name = "outFund8anos6")
//    @Column(name = "mcq_fundamental_8_anos_6", columnDefinition = "TEXT")
//    private String outFund8Anos6;
////    
//////    @XmlElement(name = "outFund8anos7")
//    @Column(name = "mcq_fundamental_8_anos_7", columnDefinition = "TEXT")
//    private String outFund8Anos7;
////    
//////    @XmlElement(name = "outFund9anos1")
//    @Column(name = "mcq_fundamental_9_anos_1", columnDefinition = "TEXT")
//    private String outFund9Anos1;
////    
//////    @XmlElement(name = "outFund9anos2")
//    @Column(name = "mcq_fundamental_9_anos_2", columnDefinition = "TEXT")
//    private String outFund9Anos2;
////    
//////    @XmlElement(name = "outFund9anos3")
//    @Column(name = "mcq_fundamental_9_anos_3", columnDefinition = "TEXT")
//    private String outFund9Anos3;
////    
//////    @XmlElement(name = "outFund9anos4")
//    @Column(name = "mcq_fundamental_9_anos_4", columnDefinition = "TEXT")
//    private String outFund9Anos4;
////    
//////    @XmlElement(name = "outFund9anos5")
//    @Column(name = "mcq_fundamental_9_anos_5", columnDefinition = "TEXT")
//    private String outFund9Anos5;
////    
//////    @XmlElement(name = "outFund9anos6")
//    @Column(name = "mcq_fundamental_9_anos_6", columnDefinition = "TEXT")
//    private String outFund9Anos6;
////    
//////    @XmlElement(name = "outFund9anos7")
//    @Column(name = "mcq_fundamental_9_anos_7", columnDefinition = "TEXT")
//    private String outFund9Anos7;
////    
//////    @XmlElement(name = "outFund9anos8")
//    @Column(name = "mcq_fundamental_9_anos_8", columnDefinition = "TEXT")
//    private String outFund9Anos8;
////    
//////    @XmlElement(name = "outFund9anos9")
//    @Column(name = "mcq_fundamental_9_anos_9", columnDefinition = "TEXT")
//    private String outFund9Anos9;
//
////    
//    @Column(name = "mcq_infantil_01", columnDefinition = "TEXT")
//    private String outInfantil1;
//
//    @Column(name = "mcq_infantil_02", columnDefinition = "TEXT")
//    private String outInfantil2;
//
//    @Column(name = "mcq_infantil_04", columnDefinition = "TEXT")
//    private String outInfantil4;
//
//    @Column(name = "mcq_infantil_05", columnDefinition = "TEXT")
//    private String outInfantil5;
//
//    @Column(name = "mcq_infantil_06", columnDefinition = "TEXT")
//    private String outInfantil6;
//
//    @Column(name = "mcq_infantil_07", columnDefinition = "TEXT")
//    private String outInfantil7;
//
//    @Column(name = "mcq_infantil_multiseriada", columnDefinition = "TEXT")
//    private String outInfantilMultisseriadas;
//
//    @Column(name = "mcq_multipla", columnDefinition = "TEXT")
//    private String outMultipla;
//
//    @Column(name = "mcq_qualificacao_basica", columnDefinition = "TEXT")
//    private String outQualificacaoBasica;
//
////    private String outVisual;
//    @Column(name = "mcq_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "mcq_proeja_ensina_fundamental", columnDefinition = "TEXT")
//    private String outProejaEnsFundamental;
//
//    @Column(name = "mcq_proeja_ensina_medio", columnDefinition = "TEXT")
//    private String outProejaEnsMedio;
//
////    @XmlElement(name = "outFund8anos8")
//    @Column(name = "mcq_fundamental_8_anos_8", columnDefinition = "TEXT")
//    private String outFund8Anos8;
//
//    @Column(name = "mcq_concomitante_subsequente", columnDefinition = "TEXT")
//    private String outConcomSubs;
//
//    @Column(name = "mcq_eja_ensino_fundamental_af", columnDefinition = "TEXT")
//    private String outEjaEnsFundAF;
//
//    @Column(name = "mcq_eja_ensino_fundamental_if", columnDefinition = "TEXT")
//    private String outEjaEnsFundAI;
//
//    @Column(name = "mcq_intelectual", columnDefinition = "TEXT")
//    private String outIntelectual;
////    
//////    @XmlElement(name = "outFund9anosMultisseriadas")
//    @Column(name = "mcq_fundamental_9_anos_multisseriada", columnDefinition = "TEXT")
//    private String outFund9AnosMultisseriadas;
////    
//    @Column(name = "mcq_projovem_urb", columnDefinition = "TEXT")
//    private String outProJovemUrb;
//
//    @Column(name = "mcq_transtorno_especial_autismo", columnDefinition = "TEXT")
//    private String outTranstEspAutismo;
//
//    @Column(name = "mcq_nao_seriado", columnDefinition = "TEXT")
//    private String outNaoSeriado;
//
//////    @XmlElement(name = "outAtividadeCompl1cltd")
//    @Column(name = "mcq_atividade_complementar_01_cltd", columnDefinition = "TEXT")
//    private String outAtividadeCompl1Cltd;
////    
//////    @XmlElement(name = "outAtividadeCompl2cltd")
//    @Column(name = "mcq_atividade_complementar_02_cltd", columnDefinition = "TEXT")
//    private String outAtividadeCompl2Cltd;
////    
//////    @XmlElement(name = "outAtividadeCompl3cltd")
//    @Column(name = "mcq_atividade_complementar_03_cltd", columnDefinition = "TEXT")
//    private String outAtividadeCompl3Cltd;
////    
//////    @XmlElement(name = "outAtividadeCompl4cltd")
//    @Column(name = "mcq_atividade_complementar_04_cltd", columnDefinition = "TEXT")
//    private String outAtividadeCompl4Cltd;
////    
//    @Column(name = "mcq_auditiva_cltd", columnDefinition = "TEXT")
//    private String outAuditivacltd;
//
//    @Column(name = "mcq_concominante_subsequente_cltd", columnDefinition = "TEXT")
//    private String outConcomSubscltd;
//
////    @XmlElement(name = "outCursoNormal1cltd")
//    @Column(name = "mcq_curso_normal_01_cltd", columnDefinition = "TEXT")
//    private String outCursoNormal1Cltd;
//
////    @XmlElement(name = "outCursoNormal2cltd")
//    @Column(name = "mcq_curso_normal_02_cltd", columnDefinition = "TEXT")
//    private String outCursoNormal2Cltd;
//
////    @XmlElement(name = "outCursoNormal3cltd")
//    @Column(name = "mcq_curso_normal_03_cltd", columnDefinition = "TEXT")
//    private String outCursoNormal3Cltd;
//
////    @XmlElement(name = "outCursoNormal4cltd")
//    @Column(name = "mcq_curso_normal_04_cltd", columnDefinition = "TEXT")
//    private String outCursoNormal4Cltd;
//
//    @Column(name = "mcq_educacao_especializada_cltd", columnDefinition = "TEXT")
//    private String outEducEspecializadocltd;
//
//    @Column(name = "mcq_educacao_especializada_exclusiva_cltd", columnDefinition = "TEXT")
//    private String outEducEspExclusivacltd;
//
//    @Column(name = "mcq_eja_ensino_fundamental_a_cltd", columnDefinition = "TEXT")
//    private String outEjaEnsFundAFcltd;
//
//    @Column(name = "mcq_eja_ensino_fundamental_ai_cltd", columnDefinition = "TEXT")
//    private String outEjaEnsFundAIcltd;
//
//    @Column(name = "mcq_eja_ensino_medio_cltd", columnDefinition = "TEXT")
//    private String outEjaEnsMediocltd;
//
////    @XmlElement(name = "outEnsMedio1cltd")
//    @Column(name = "mcq_ensino_medio_01_cltd", columnDefinition = "TEXT")
//    private String outEnsMedio1Cltd;
//
////    @XmlElement(name = "outEnsMedio2cltd")
//    @Column(name = "mcq_ensino_medio_02_cltd", columnDefinition = "TEXT")
//    private String outEnsMedio2Cltd;
//    
////    @XmlElement(name = "outEnsMedio3cltd")
//    @Column(name = "mcq_ensino_medio_03_cltd", columnDefinition = "TEXT")
//    private String outEnsMedio3Cltd;
//    
////    @XmlElement(name = "outEnsMedio4cltd")
//    @Column(name = "mcq_ensino_medio_04_cltd", columnDefinition = "TEXT")
//    private String outEnsMedio4Cltd;
//
//    @Column(name = "mcq_ensino_profissinal_cltd", columnDefinition = "TEXT")
//    private String outEnsMedioIntEdProfcltd;
//
//    @Column(name = "mcq_especializacao_cltd", columnDefinition = "TEXT")
//    private String outEspecializacaocltd;
//
//    @Column(name = "mcq_fisica_cltd", columnDefinition = "TEXT")
//    private String outFisicacltd;
//
////    @XmlElement(name = "outFund8anos5cltd")
//    @Column(name = "mcq_fundamental_8_anos_5_cltd", columnDefinition = "TEXT")
//    private String outFund8Anos5Cltd;
//    
////    @XmlElement(name = "outFund8anos6cltd")
//    @Column(name = "mcq_fundamental_8_anos_6_cltd", columnDefinition = "TEXT")
//    private String outFund8Anos6Cltd;
//
////    @XmlElement(name = "outFund8anos7cltd")
//    @Column(name = "mcq_fundamental_8_anos_7_cltd", columnDefinition = "TEXT")
//    private String outFund8Anos7Cltd;
//
////    @XmlElement(name = "outFund8anos8cltd")
//    @Column(name = "mcq_fundamental_8_anos_8_cltd", columnDefinition = "TEXT")
//    private String outFund8Anos8Cltd;
//
////    @XmlElement(name = "outFund9anos1cltd")
//    @Column(name = "mcq_fundamental_9_anos_1_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos1Cltd;
//
////    @XmlElement(name = "outFund9anos2cltd")
//    @Column(name = "mcq_fundamental_9_anos_2_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos2Cltd;
//
////    @XmlElement(name = "outFund9anos3cltd")
//    @Column(name = "mcq_fundamental_9_anos_3_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos3Cltd;
//
////    @XmlElement(name = "outFund9anos4cltd")
//    @Column(name = "mcq_fundamental_9_anos_4_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos4Cltd;
//
////    @XmlElement(name = "outFund9anos5cltd")
//    @Column(name = "mcq_fundamental_9_anos_5_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos5Cltd;
//
////    @XmlElement(name = "outFund9anos6cltd")
//    @Column(name = "mcq_fundamental_9_anos_6_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos6Cltd;
//
////    @XmlElement(name = "outFund9anos7cltd")
//    @Column(name = "mcq_fundamental_9_anos_7_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos7Cltd;
//
////    @XmlElement(name = "outFund9anos8cltd")
//    @Column(name = "mcq_fundamental_9_anos_8_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos8Cltd;
//
////    @XmlElement(name = "outFund9anos9cltd")
//    @Column(name = "mcq_fundamental_9_anos_9_cltd", columnDefinition = "TEXT")
//    private String outFund9Anos9Cltd;
//
////    @XmlElement(name = "outFund9anosMultisseriadascltd")
//    @Column(name = "mcq_fundamental_9_anos_multisseriada_cltd", columnDefinition = "TEXT")
//    private String outFund9AnosMultisseriadascltd;
//
////    @XmlElement(name = "outInfantil1cltd")
//    @Column(name = "mcq_infantil_01_cltd", columnDefinition = "TEXT")
//    private String outInfantil1Cltd;
//
////    @XmlElement(name = "outInfantil2cltd")
//    @Column(name = "mcq_infantil_02_cltd", columnDefinition = "TEXT")
//    private String outInfantil2Cltd;
//
////    @XmlElement(name = "outInfantil5cltd")
//    @Column(name = "mcq_infantil_05_cltd", columnDefinition = "TEXT")
//    private String outInfantil5Cltd;
//
////    @XmlElement(name = "outInfantil6cltd")
//    @Column(name = "mcq_infantil_06_cltd", columnDefinition = "TEXT")
//    private String outInfantil6Cltd;
//
////    @XmlElement(name = "outInfantil7cltd")
//    @Column(name = "mcq_infantil_07_cltd", columnDefinition = "TEXT")
//    private String outInfantil7Cltd;
//
//    @Column(name = "mcq_infantil_multsseriada_cltd", columnDefinition = "TEXT")
//    private String outInfantilMultisseriadascltd;
//
//    @Column(name = "mcq_intelectual_cltd", columnDefinition = "TEXT")
//    private String outIntelectualcltd;
//
//    @Column(name = "mcq_multi_plac_cltd", columnDefinition = "TEXT")
//    private String outMultiplacltd;
//
//    @Column(name = "mcq_nao_seriada_cltd", columnDefinition = "TEXT")
//    private String outNaoSeriadocltd;
//
//    @Column(name = "mcq_proeja_ensino_fundamental_cltd", columnDefinition = "TEXT")
//    private String outProejaEnsFundamentalcltd;
//
//    @Column(name = "mcq_proeja_ensino_medio_cltd", columnDefinition = "TEXT")
//    private String outProejaEnsMediocltd;
//
//    @Column(name = "mcq_projovem_urb_cltd", columnDefinition = "TEXT")
//    private String outProJovemUrbcltd;
//
//    @Column(name = "mcq_qualificacao_basica_cltd", columnDefinition = "TEXT")
//    private String outQualificacaoBasicacltd;
//
//    @Column(name = "mcq_transt_esp_autismo_cltd", columnDefinition = "TEXT")
//    private String outTranstEspAutismocltd;
//
//    @Column(name = "mcq_visual_cltd", columnDefinition = "TEXT")
//    private String outVisualcltd;
//
//    @Column(name = "mcq_classe_coletada", columnDefinition = "TEXT")
//    private String outClassesColetadas;
//
//    @Column(name = "mcq_classe_digitada", columnDefinition = "TEXT")
//    private String outClassesDigitadas;
//
////    @XmlElement(name = "outInfantil4cltd")
//    @Column(name = "mcq_infantil_04_cltd", columnDefinition = "TEXT")
//    private String outInfantil4Cltd;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOutAtividadeCompl1() {
//        return outAtividadeCompl1;
//    }
//
//    public void setOutAtividadeCompl1(String outAtividadeCompl1) {
//        this.outAtividadeCompl1 = outAtividadeCompl1;
//    }
//
//    public String getOutAtividadeCompl2() {
//        return outAtividadeCompl2;
//    }
//
//    public void setOutAtividadeCompl2(String outAtividadeCompl2) {
//        this.outAtividadeCompl2 = outAtividadeCompl2;
//    }
//
//    public String getOutAtividadeCompl3() {
//        return outAtividadeCompl3;
//    }
//
//    public void setOutAtividadeCompl3(String outAtividadeCompl3) {
//        this.outAtividadeCompl3 = outAtividadeCompl3;
//    }
//
//    public String getOutAtividadeCompl4() {
//        return outAtividadeCompl4;
//    }
//
//    public void setOutAtividadeCompl4(String outAtividadeCompl4) {
//        this.outAtividadeCompl4 = outAtividadeCompl4;
//    }
//
//    public String getOutAuditiva() {
//        return outAuditiva;
//    }
//
//    public void setOutAuditiva(String outAuditiva) {
//        this.outAuditiva = outAuditiva;
//    }
//
//    public String getOutCursoNormal1() {
//        return outCursoNormal1;
//    }
//
//    public void setOutCursoNormal1(String outCursoNormal1) {
//        this.outCursoNormal1 = outCursoNormal1;
//    }
//
//    public String getOutCursoNormal2() {
//        return outCursoNormal2;
//    }
//
//    public void setOutCursoNormal2(String outCursoNormal2) {
//        this.outCursoNormal2 = outCursoNormal2;
//    }
//
//    public String getOutCursoNormal3() {
//        return outCursoNormal3;
//    }
//
//    public void setOutCursoNormal3(String outCursoNormal3) {
//        this.outCursoNormal3 = outCursoNormal3;
//    }
//
//    public String getOutCursoNormal4() {
//        return outCursoNormal4;
//    }
//
//    public void setOutCursoNormal4(String outCursoNormal4) {
//        this.outCursoNormal4 = outCursoNormal4;
//    }
//
//    public String getOutEducEspecializado() {
//        return outEducEspecializado;
//    }
//
//    public void setOutEducEspecializado(String outEducEspecializado) {
//        this.outEducEspecializado = outEducEspecializado;
//    }
//
//    public String getOutEducEspExclusiva() {
//        return outEducEspExclusiva;
//    }
//
//    public void setOutEducEspExclusiva(String outEducEspExclusiva) {
//        this.outEducEspExclusiva = outEducEspExclusiva;
//    }
//
//    public String getOutEjaEnsMedio() {
//        return outEjaEnsMedio;
//    }
//
//    public void setOutEjaEnsMedio(String outEjaEnsMedio) {
//        this.outEjaEnsMedio = outEjaEnsMedio;
//    }
//
//    public String getOutEnsinoLinguas() {
//        return outEnsinoLinguas;
//    }
//
//    public void setOutEnsinoLinguas(String outEnsinoLinguas) {
//        this.outEnsinoLinguas = outEnsinoLinguas;
//    }
//
//    public String getOutEnsMedio1() {
//        return outEnsMedio1;
//    }
//
//    public void setOutEnsMedio1(String outEnsMedio1) {
//        this.outEnsMedio1 = outEnsMedio1;
//    }
//
//    public String getOutEnsMedio2() {
//        return outEnsMedio2;
//    }
//
//    public void setOutEnsMedio2(String outEnsMedio2) {
//        this.outEnsMedio2 = outEnsMedio2;
//    }
//
//    public String getOutEnsMedio3() {
//        return outEnsMedio3;
//    }
//
//    public void setOutEnsMedio3(String outEnsMedio3) {
//        this.outEnsMedio3 = outEnsMedio3;
//    }
//
//    public String getOutEnsMedio4() {
//        return outEnsMedio4;
//    }
//
//    public void setOutEnsMedio4(String outEnsMedio4) {
//        this.outEnsMedio4 = outEnsMedio4;
//    }
//
//    public String getOutEnsMedioIntEdProf() {
//        return outEnsMedioIntEdProf;
//    }
//
//    public void setOutEnsMedioIntEdProf(String outEnsMedioIntEdProf) {
//        this.outEnsMedioIntEdProf = outEnsMedioIntEdProf;
//    }
//
//    public String getOutEspecializacao() {
//        return outEspecializacao;
//    }
//
//    public void setOutEspecializacao(String outEspecializacao) {
//        this.outEspecializacao = outEspecializacao;
//    }
//
//    public String getOutFisica() {
//        return outFisica;
//    }
//
//    public void setOutFisica(String outFisica) {
//        this.outFisica = outFisica;
//    }
//
//    public String getOutFund8Anos5() {
//        return outFund8Anos5;
//    }
//
//    public void setOutFund8Anos5(String outFund8Anos5) {
//        this.outFund8Anos5 = outFund8Anos5;
//    }
//
//    public String getOutFund8Anos6() {
//        return outFund8Anos6;
//    }
//
//    public void setOutFund8Anos6(String outFund8Anos6) {
//        this.outFund8Anos6 = outFund8Anos6;
//    }
//
//    public String getOutFund8Anos7() {
//        return outFund8Anos7;
//    }
//
//    public void setOutFund8Anos7(String outFund8Anos7) {
//        this.outFund8Anos7 = outFund8Anos7;
//    }
//
//    public String getOutFund9Anos1() {
//        return outFund9Anos1;
//    }
//
//    public void setOutFund9Anos1(String outFund9Anos1) {
//        this.outFund9Anos1 = outFund9Anos1;
//    }
//
//    public String getOutFund9Anos2() {
//        return outFund9Anos2;
//    }
//
//    public void setOutFund9Anos2(String outFund9Anos2) {
//        this.outFund9Anos2 = outFund9Anos2;
//    }
//
//    public String getOutFund9Anos3() {
//        return outFund9Anos3;
//    }
//
//    public void setOutFund9Anos3(String outFund9Anos3) {
//        this.outFund9Anos3 = outFund9Anos3;
//    }
//
//    public String getOutFund9Anos4() {
//        return outFund9Anos4;
//    }
//
//    public void setOutFund9Anos4(String outFund9Anos4) {
//        this.outFund9Anos4 = outFund9Anos4;
//    }
//
//    public String getOutFund9Anos5() {
//        return outFund9Anos5;
//    }
//
//    public void setOutFund9Anos5(String outFund9Anos5) {
//        this.outFund9Anos5 = outFund9Anos5;
//    }
//
//    public String getOutFund9Anos6() {
//        return outFund9Anos6;
//    }
//
//    public void setOutFund9Anos6(String outFund9Anos6) {
//        this.outFund9Anos6 = outFund9Anos6;
//    }
//
//    public String getOutFund9Anos7() {
//        return outFund9Anos7;
//    }
//
//    public void setOutFund9Anos7(String outFund9Anos7) {
//        this.outFund9Anos7 = outFund9Anos7;
//    }
//
//    public String getOutFund9Anos8() {
//        return outFund9Anos8;
//    }
//
//    public void setOutFund9Anos8(String outFund9Anos8) {
//        this.outFund9Anos8 = outFund9Anos8;
//    }
//
//    public String getOutFund9Anos9() {
//        return outFund9Anos9;
//    }
//
//    public void setOutFund9Anos9(String outFund9Anos9) {
//        this.outFund9Anos9 = outFund9Anos9;
//    }
//
//    public String getOutInfantil1() {
//        return outInfantil1;
//    }
//
//    public void setOutInfantil1(String outInfantil1) {
//        this.outInfantil1 = outInfantil1;
//    }
//
//    public String getOutInfantil2() {
//        return outInfantil2;
//    }
//
//    public void setOutInfantil2(String outInfantil2) {
//        this.outInfantil2 = outInfantil2;
//    }
//
//    public String getOutInfantil4() {
//        return outInfantil4;
//    }
//
//    public void setOutInfantil4(String outInfantil4) {
//        this.outInfantil4 = outInfantil4;
//    }
//
//    public String getOutInfantil5() {
//        return outInfantil5;
//    }
//
//    public void setOutInfantil5(String outInfantil5) {
//        this.outInfantil5 = outInfantil5;
//    }
//
//    public String getOutInfantil6() {
//        return outInfantil6;
//    }
//
//    public void setOutInfantil6(String outInfantil6) {
//        this.outInfantil6 = outInfantil6;
//    }
//
//    public String getOutInfantil7() {
//        return outInfantil7;
//    }
//
//    public void setOutInfantil7(String outInfantil7) {
//        this.outInfantil7 = outInfantil7;
//    }
//
//    public String getOutInfantilMultisseriadas() {
//        return outInfantilMultisseriadas;
//    }
//
//    public void setOutInfantilMultisseriadas(String outInfantilMultisseriadas) {
//        this.outInfantilMultisseriadas = outInfantilMultisseriadas;
//    }
//
//    public String getOutMultipla() {
//        return outMultipla;
//    }
//
//    public void setOutMultipla(String outMultipla) {
//        this.outMultipla = outMultipla;
//    }
//
//    public String getOutQualificacaoBasica() {
//        return outQualificacaoBasica;
//    }
//
//    public void setOutQualificacaoBasica(String outQualificacaoBasica) {
//        this.outQualificacaoBasica = outQualificacaoBasica;
//    }
//
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = outErro;
//    }
//
//    public String getOutProejaEnsFundamental() {
//        return outProejaEnsFundamental;
//    }
//
//    public void setOutProejaEnsFundamental(String outProejaEnsFundamental) {
//        this.outProejaEnsFundamental = outProejaEnsFundamental;
//    }
//
//    public String getOutProejaEnsMedio() {
//        return outProejaEnsMedio;
//    }
//
//    public void setOutProejaEnsMedio(String outProejaEnsMedio) {
//        this.outProejaEnsMedio = outProejaEnsMedio;
//    }
//
//    public String getOutFund8Anos8() {
//        return outFund8Anos8;
//    }
//
//    public void setOutFund8Anos8(String outFund8Anos8) {
//        this.outFund8Anos8 = outFund8Anos8;
//    }
//
//    public String getOutConcomSubs() {
//        return outConcomSubs;
//    }
//
//    public void setOutConcomSubs(String outConcomSubs) {
//        this.outConcomSubs = outConcomSubs;
//    }
//
//    public String getOutEjaEnsFundAF() {
//        return outEjaEnsFundAF;
//    }
//
//    public void setOutEjaEnsFundAF(String outEjaEnsFundAF) {
//        this.outEjaEnsFundAF = outEjaEnsFundAF;
//    }
//
//    public String getOutEjaEnsFundAI() {
//        return outEjaEnsFundAI;
//    }
//
//    public void setOutEjaEnsFundAI(String outEjaEnsFundAI) {
//        this.outEjaEnsFundAI = outEjaEnsFundAI;
//    }
//
//    public String getOutIntelectual() {
//        return outIntelectual;
//    }
//
//    public void setOutIntelectual(String outIntelectual) {
//        this.outIntelectual = outIntelectual;
//    }
//
//    public String getOutFund9AnosMultisseriadas() {
//        return outFund9AnosMultisseriadas;
//    }
//
//    public void setOutFund9AnosMultisseriadas(String outFund9AnosMultisseriadas) {
//        this.outFund9AnosMultisseriadas = outFund9AnosMultisseriadas;
//    }
//
//    public String getOutProJovemUrb() {
//        return outProJovemUrb;
//    }
//
//    public void setOutProJovemUrb(String outProJovemUrb) {
//        this.outProJovemUrb = outProJovemUrb;
//    }
//
//    public String getOutTranstEspAutismo() {
//        return outTranstEspAutismo;
//    }
//
//    public void setOutTranstEspAutismo(String outTranstEspAutismo) {
//        this.outTranstEspAutismo = outTranstEspAutismo;
//    }
//
//    public String getOutNaoSeriado() {
//        return outNaoSeriado;
//    }
//
//    public void setOutNaoSeriado(String outNaoSeriado) {
//        this.outNaoSeriado = outNaoSeriado;
//    }
//
//    public String getOutAtividadeCompl1Cltd() {
//        return outAtividadeCompl1Cltd;
//    }
//
//    public void setOutAtividadeCompl1Cltd(String outAtividadeCompl1Cltd) {
//        this.outAtividadeCompl1Cltd = outAtividadeCompl1Cltd;
//    }
//
//    public String getOutAtividadeCompl2Cltd() {
//        return outAtividadeCompl2Cltd;
//    }
//
//    public void setOutAtividadeCompl2Cltd(String outAtividadeCompl2Cltd) {
//        this.outAtividadeCompl2Cltd = outAtividadeCompl2Cltd;
//    }
//
//    public String getOutAtividadeCompl3Cltd() {
//        return outAtividadeCompl3Cltd;
//    }
//
//    public void setOutAtividadeCompl3Cltd(String outAtividadeCompl3Cltd) {
//        this.outAtividadeCompl3Cltd = outAtividadeCompl3Cltd;
//    }
//
//    public String getOutAtividadeCompl4Cltd() {
//        return outAtividadeCompl4Cltd;
//    }
//
//    public void setOutAtividadeCompl4Cltd(String outAtividadeCompl4Cltd) {
//        this.outAtividadeCompl4Cltd = outAtividadeCompl4Cltd;
//    }
//
//    public String getOutAuditivacltd() {
//        return outAuditivacltd;
//    }
//
//    public void setOutAuditivacltd(String outAuditivacltd) {
//        this.outAuditivacltd = outAuditivacltd;
//    }
//
//    public String getOutConcomSubscltd() {
//        return outConcomSubscltd;
//    }
//
//    public void setOutConcomSubscltd(String outConcomSubscltd) {
//        this.outConcomSubscltd = outConcomSubscltd;
//    }
//
//    public String getOutCursoNormal1Cltd() {
//        return outCursoNormal1Cltd;
//    }
//
//    public void setOutCursoNormal1Cltd(String outCursoNormal1Cltd) {
//        this.outCursoNormal1Cltd = outCursoNormal1Cltd;
//    }
//
//    public String getOutCursoNormal2Cltd() {
//        return outCursoNormal2Cltd;
//    }
//
//    public void setOutCursoNormal2Cltd(String outCursoNormal2Cltd) {
//        this.outCursoNormal2Cltd = outCursoNormal2Cltd;
//    }
//
//    public String getOutCursoNormal3Cltd() {
//        return outCursoNormal3Cltd;
//    }
//
//    public void setOutCursoNormal3Cltd(String outCursoNormal3Cltd) {
//        this.outCursoNormal3Cltd = outCursoNormal3Cltd;
//    }
//
//    public String getOutCursoNormal4Cltd() {
//        return outCursoNormal4Cltd;
//    }
//
//    public void setOutCursoNormal4Cltd(String outCursoNormal4Cltd) {
//        this.outCursoNormal4Cltd = outCursoNormal4Cltd;
//    }
//
//    public String getOutEducEspecializadocltd() {
//        return outEducEspecializadocltd;
//    }
//
//    public void setOutEducEspecializadocltd(String outEducEspecializadocltd) {
//        this.outEducEspecializadocltd = outEducEspecializadocltd;
//    }
//
//    public String getOutEducEspExclusivacltd() {
//        return outEducEspExclusivacltd;
//    }
//
//    public void setOutEducEspExclusivacltd(String outEducEspExclusivacltd) {
//        this.outEducEspExclusivacltd = outEducEspExclusivacltd;
//    }
//
//    public String getOutEjaEnsFundAFcltd() {
//        return outEjaEnsFundAFcltd;
//    }
//
//    public void setOutEjaEnsFundAFcltd(String outEjaEnsFundAFcltd) {
//        this.outEjaEnsFundAFcltd = outEjaEnsFundAFcltd;
//    }
//
//    public String getOutEjaEnsFundAIcltd() {
//        return outEjaEnsFundAIcltd;
//    }
//
//    public void setOutEjaEnsFundAIcltd(String outEjaEnsFundAIcltd) {
//        this.outEjaEnsFundAIcltd = outEjaEnsFundAIcltd;
//    }
//
//    public String getOutEjaEnsMediocltd() {
//        return outEjaEnsMediocltd;
//    }
//
//    public void setOutEjaEnsMediocltd(String outEjaEnsMediocltd) {
//        this.outEjaEnsMediocltd = outEjaEnsMediocltd;
//    }
//
//    public String getOutEnsMedio1Cltd() {
//        return outEnsMedio1Cltd;
//    }
//
//    public void setOutEnsMedio1Cltd(String outEnsMedio1Cltd) {
//        this.outEnsMedio1Cltd = outEnsMedio1Cltd;
//    }
//
//    public String getOutEnsMedio2Cltd() {
//        return outEnsMedio2Cltd;
//    }
//
//    public void setOutEnsMedio2Cltd(String outEnsMedio2Cltd) {
//        this.outEnsMedio2Cltd = outEnsMedio2Cltd;
//    }
//
//    public String getOutEnsMedio3Cltd() {
//        return outEnsMedio3Cltd;
//    }
//
//    public void setOutEnsMedio3Cltd(String outEnsMedio3Cltd) {
//        this.outEnsMedio3Cltd = outEnsMedio3Cltd;
//    }
//
//    public String getOutEnsMedio4Cltd() {
//        return outEnsMedio4Cltd;
//    }
//
//    public void setOutEnsMedio4Cltd(String outEnsMedio4Cltd) {
//        this.outEnsMedio4Cltd = outEnsMedio4Cltd;
//    }
//
//    public String getOutEnsMedioIntEdProfcltd() {
//        return outEnsMedioIntEdProfcltd;
//    }
//
//    public void setOutEnsMedioIntEdProfcltd(String outEnsMedioIntEdProfcltd) {
//        this.outEnsMedioIntEdProfcltd = outEnsMedioIntEdProfcltd;
//    }
//
//    public String getOutEspecializacaocltd() {
//        return outEspecializacaocltd;
//    }
//
//    public void setOutEspecializacaocltd(String outEspecializacaocltd) {
//        this.outEspecializacaocltd = outEspecializacaocltd;
//    }
//
//    public String getOutFisicacltd() {
//        return outFisicacltd;
//    }
//
//    public void setOutFisicacltd(String outFisicacltd) {
//        this.outFisicacltd = outFisicacltd;
//    }
//
//    public String getOutFund8Anos5Cltd() {
//        return outFund8Anos5Cltd;
//    }
//
//    public void setOutFund8Anos5Cltd(String outFund8Anos5Cltd) {
//        this.outFund8Anos5Cltd = outFund8Anos5Cltd;
//    }
//
//    public String getOutFund8Anos6Cltd() {
//        return outFund8Anos6Cltd;
//    }
//
//    public void setOutFund8Anos6Cltd(String outFund8Anos6Cltd) {
//        this.outFund8Anos6Cltd = outFund8Anos6Cltd;
//    }
//
//    public String getOutFund8Anos7Cltd() {
//        return outFund8Anos7Cltd;
//    }
//
//    public void setOutFund8Anos7Cltd(String outFund8Anos7Cltd) {
//        this.outFund8Anos7Cltd = outFund8Anos7Cltd;
//    }
//
//    public String getOutFund8Anos8Cltd() {
//        return outFund8Anos8Cltd;
//    }
//
//    public void setOutFund8Anos8Cltd(String outFund8Anos8Cltd) {
//        this.outFund8Anos8Cltd = outFund8Anos8Cltd;
//    }
//
//    public String getOutFund9Anos1Cltd() {
//        return outFund9Anos1Cltd;
//    }
//
//    public void setOutFund9Anos1Cltd(String outFund9Anos1Cltd) {
//        this.outFund9Anos1Cltd = outFund9Anos1Cltd;
//    }
//
//    public String getOutFund9Anos2Cltd() {
//        return outFund9Anos2Cltd;
//    }
//
//    public void setOutFund9Anos2Cltd(String outFund9Anos2Cltd) {
//        this.outFund9Anos2Cltd = outFund9Anos2Cltd;
//    }
//
//    public String getOutFund9Anos3Cltd() {
//        return outFund9Anos3Cltd;
//    }
//
//    public void setOutFund9Anos3Cltd(String outFund9Anos3Cltd) {
//        this.outFund9Anos3Cltd = outFund9Anos3Cltd;
//    }
//
//    public String getOutFund9Anos4Cltd() {
//        return outFund9Anos4Cltd;
//    }
//
//    public void setOutFund9Anos4Cltd(String outFund9Anos4Cltd) {
//        this.outFund9Anos4Cltd = outFund9Anos4Cltd;
//    }
//
//    public String getOutFund9Anos5Cltd() {
//        return outFund9Anos5Cltd;
//    }
//
//    public void setOutFund9Anos5Cltd(String outFund9Anos5Cltd) {
//        this.outFund9Anos5Cltd = outFund9Anos5Cltd;
//    }
//
//    public String getOutFund9Anos6Cltd() {
//        return outFund9Anos6Cltd;
//    }
//
//    public void setOutFund9Anos6Cltd(String outFund9Anos6Cltd) {
//        this.outFund9Anos6Cltd = outFund9Anos6Cltd;
//    }
//
//    public String getOutFund9Anos7Cltd() {
//        return outFund9Anos7Cltd;
//    }
//
//    public void setOutFund9Anos7Cltd(String outFund9Anos7Cltd) {
//        this.outFund9Anos7Cltd = outFund9Anos7Cltd;
//    }
//
//    public String getOutFund9Anos8Cltd() {
//        return outFund9Anos8Cltd;
//    }
//
//    public void setOutFund9Anos8Cltd(String outFund9Anos8Cltd) {
//        this.outFund9Anos8Cltd = outFund9Anos8Cltd;
//    }
//
//    public String getOutFund9Anos9Cltd() {
//        return outFund9Anos9Cltd;
//    }
//
//    public void setOutFund9Anos9Cltd(String outFund9Anos9Cltd) {
//        this.outFund9Anos9Cltd = outFund9Anos9Cltd;
//    }
//
//    public String getOutFund9AnosMultisseriadascltd() {
//        return outFund9AnosMultisseriadascltd;
//    }
//
//    public void setOutFund9AnosMultisseriadascltd(String outFund9AnosMultisseriadascltd) {
//        this.outFund9AnosMultisseriadascltd = outFund9AnosMultisseriadascltd;
//    }
//
//    public String getOutInfantil1Cltd() {
//        return outInfantil1Cltd;
//    }
//
//    public void setOutInfantil1Cltd(String outInfantil1Cltd) {
//        this.outInfantil1Cltd = outInfantil1Cltd;
//    }
//
//    public String getOutInfantil2Cltd() {
//        return outInfantil2Cltd;
//    }
//
//    public void setOutInfantil2Cltd(String outInfantil2Cltd) {
//        this.outInfantil2Cltd = outInfantil2Cltd;
//    }
//
//    public String getOutInfantil5Cltd() {
//        return outInfantil5Cltd;
//    }
//
//    public void setOutInfantil5Cltd(String outInfantil5Cltd) {
//        this.outInfantil5Cltd = outInfantil5Cltd;
//    }
//
//    public String getOutInfantil6Cltd() {
//        return outInfantil6Cltd;
//    }
//
//    public void setOutInfantil6Cltd(String outInfantil6Cltd) {
//        this.outInfantil6Cltd = outInfantil6Cltd;
//    }
//
//    public String getOutInfantil7Cltd() {
//        return outInfantil7Cltd;
//    }
//
//    public void setOutInfantil7Cltd(String outInfantil7Cltd) {
//        this.outInfantil7Cltd = outInfantil7Cltd;
//    }
//
//    public String getOutInfantilMultisseriadascltd() {
//        return outInfantilMultisseriadascltd;
//    }
//
//    public void setOutInfantilMultisseriadascltd(String outInfantilMultisseriadascltd) {
//        this.outInfantilMultisseriadascltd = outInfantilMultisseriadascltd;
//    }
//
//    public String getOutIntelectualcltd() {
//        return outIntelectualcltd;
//    }
//
//    public void setOutIntelectualcltd(String outIntelectualcltd) {
//        this.outIntelectualcltd = outIntelectualcltd;
//    }
//
//    public String getOutMultiplacltd() {
//        return outMultiplacltd;
//    }
//
//    public void setOutMultiplacltd(String outMultiplacltd) {
//        this.outMultiplacltd = outMultiplacltd;
//    }
//
//    public String getOutNaoSeriadocltd() {
//        return outNaoSeriadocltd;
//    }
//
//    public void setOutNaoSeriadocltd(String outNaoSeriadocltd) {
//        this.outNaoSeriadocltd = outNaoSeriadocltd;
//    }
//
//    public String getOutProejaEnsFundamentalcltd() {
//        return outProejaEnsFundamentalcltd;
//    }
//
//    public void setOutProejaEnsFundamentalcltd(String outProejaEnsFundamentalcltd) {
//        this.outProejaEnsFundamentalcltd = outProejaEnsFundamentalcltd;
//    }
//
//    public String getOutProejaEnsMediocltd() {
//        return outProejaEnsMediocltd;
//    }
//
//    public void setOutProejaEnsMediocltd(String outProejaEnsMediocltd) {
//        this.outProejaEnsMediocltd = outProejaEnsMediocltd;
//    }
//
//    public String getOutProJovemUrbcltd() {
//        return outProJovemUrbcltd;
//    }
//
//    public void setOutProJovemUrbcltd(String outProJovemUrbcltd) {
//        this.outProJovemUrbcltd = outProJovemUrbcltd;
//    }
//
//    public String getOutQualificacaoBasicacltd() {
//        return outQualificacaoBasicacltd;
//    }
//
//    public void setOutQualificacaoBasicacltd(String outQualificacaoBasicacltd) {
//        this.outQualificacaoBasicacltd = outQualificacaoBasicacltd;
//    }
//
//    public String getOutTranstEspAutismocltd() {
//        return outTranstEspAutismocltd;
//    }
//
//    public void setOutTranstEspAutismocltd(String outTranstEspAutismocltd) {
//        this.outTranstEspAutismocltd = outTranstEspAutismocltd;
//    }
//
//    public String getOutVisualcltd() {
//        return outVisualcltd;
//    }
//
//    public void setOutVisualcltd(String outVisualcltd) {
//        this.outVisualcltd = outVisualcltd;
//    }
//
//    public String getOutClassesColetadas() {
//        return outClassesColetadas;
//    }
//
//    public void setOutClassesColetadas(String outClassesColetadas) {
//        this.outClassesColetadas = outClassesColetadas;
//    }
//
//    public String getOutClassesDigitadas() {
//        return outClassesDigitadas;
//    }
//
//    public void setOutClassesDigitadas(String outClassesDigitadas) {
//        this.outClassesDigitadas = outClassesDigitadas;
//    }
//
//    public String getOutInfantil4Cltd() {
//        return outInfantil4Cltd;
//    }
//
//    public void setOutInfantil4Cltd(String outInfantil4Cltd) {
//        this.outInfantil4Cltd = outInfantil4Cltd;
//    }
//}