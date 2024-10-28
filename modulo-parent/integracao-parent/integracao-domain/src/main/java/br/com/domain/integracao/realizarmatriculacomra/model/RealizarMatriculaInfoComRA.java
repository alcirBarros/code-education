//package br.com.domain.integracao.realizarmatriculacomra.model;
//
//import br.com.domain.prodesp.ProdespHeader;
//import java.io.Serializable;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "rmc_realizar_matricula_com_registro_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_rmc_pdh_id"))})
//public class RealizarMatriculaInfoComRA extends ProdespHeader implements Serializable {
//
//    @Column(name = "rmc_serie_ano", columnDefinition = "TEXT")
//    private String inSerieAno;
//
//    @Column(name = "rmc_tipo_ensino", columnDefinition = "TEXT")
//    private String inTipoEnsino;
//
//    @Column(name = "rmc_numero_classe", columnDefinition = "TEXT")
//    private String inNumClasse;
//
//    @Column(name = "rmc_data_matricula", columnDefinition = "TEXT")
//    private String inDataMatricula;
//
//    @Column(name = "rmc_registro_aluno", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "rmc_digito_registro_aluno", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//    @Column(name = "rmc_mes_matricula", columnDefinition = "TEXT")
//    private String inMesMatricula;
//
//    @Column(name = "rmc_numero_aluno", columnDefinition = "TEXT")
//    private String inNumAluno;
//
//    @Column(name = "rmc_uf_registro_aluno", columnDefinition = "TEXT")
//    private String inUFRA;
//
//    @Column(name = "rmc_ano", columnDefinition = "TEXT")
//    private String inAno;
//
//    @JoinColumn(name = "ers_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private EndResidencial endResidencial;
//
//    @Column(name = "rmc_ddd_celular", columnDefinition = "TEXT")
//    private String inDDDCel;
//
//    @Column(name = "rmc_fone_celular", columnDefinition = "TEXT")
//    private String inFoneCel;
//
//    @Column(name = "rmc_sms", columnDefinition = "TEXT")
//    private String inSMS;
//
//    @Column(name = "rmc_convenio", columnDefinition = "TEXT")
//    private String inConvenio;
//
//    @JoinColumn(name = "rma_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private RealizarMatriculaInfoComRAResponse realizarMatriculaInfoComRAResponse;
//
////    public Integer getId() {
////        return id;
////    }
////
////    public void setId(Integer id) {
////        this.id = id;
////    }
//
//    public String getInSerieAno() {
//        return inSerieAno;
//    }
//
//    public void setInSerieAno(String inSerieAno) {
//        this.inSerieAno = inSerieAno;
//    }
//
//    public String getInTipoEnsino() {
//        return inTipoEnsino;
//    }
//
//    public void setInTipoEnsino(String inTipoEnsino) {
//        this.inTipoEnsino = inTipoEnsino;
//    }
//
//    public String getInNumClasse() {
//        return inNumClasse;
//    }
//
//    public void setInNumClasse(String inNumClasse) {
//        this.inNumClasse = inNumClasse;
//    }
//
//    public String getInDataMatricula() {
//        return inDataMatricula;
//    }
//
//    public void setInDataMatricula(String inDataMatricula) {
//        this.inDataMatricula = inDataMatricula;
//    }
//
//    public String getInRA() {
//        return inRA;
//    }
//
//    public void setInRA(String inRA) {
//        this.inRA = inRA;
//    }
//
//    public String getInDigitoRA() {
//        return inDigitoRA;
//    }
//
//    public void setInDigitoRA(String inDigitoRA) {
//        this.inDigitoRA = inDigitoRA;
//    }
//
//    public String getInMesMatricula() {
//        return inMesMatricula;
//    }
//
//    public void setInMesMatricula(String inMesMatricula) {
//        this.inMesMatricula = inMesMatricula;
//    }
//
//    public String getInNumAluno() {
//        return inNumAluno;
//    }
//
//    public void setInNumAluno(String inNumAluno) {
//        this.inNumAluno = inNumAluno;
//    }
//
//    public String getInUFRA() {
//        return inUFRA;
//    }
//
//    public void setInUFRA(String inUFRA) {
//        this.inUFRA = inUFRA;
//    }
//
//    public String getInAno() {
//        return inAno;
//    }
//
//    public void setInAno(String inAno) {
//        this.inAno = inAno;
//    }
//
//    public EndResidencial getEndResidencial() {
//        return endResidencial;
//    }
//
//    public void setEndResidencial(EndResidencial endResidencial) {
//        this.endResidencial = endResidencial;
//    }
//
//    public String getInDDDCel() {
//        return inDDDCel;
//    }
//
//    public void setInDDDCel(String inDDDCel) {
//        this.inDDDCel = inDDDCel;
//    }
//
//    public String getInFoneCel() {
//        return inFoneCel;
//    }
//
//    public void setInFoneCel(String inFoneCel) {
//        this.inFoneCel = inFoneCel;
//    }
//
//    public String getInSMS() {
//        return inSMS;
//    }
//
//    public void setInSMS(String inSMS) {
//        this.inSMS = inSMS;
//    }
//
//    public String getInConvenio() {
//        return inConvenio;
//    }
//
//    public void setInConvenio(String inConvenio) {
//        this.inConvenio = inConvenio;
//    }
//
//    public RealizarMatriculaInfoComRAResponse getRealizarMatriculaInfoComRAResponse() {
//        return realizarMatriculaInfoComRAResponse;
//    }
//
//    public void setRealizarMatriculaInfoComRAResponse(RealizarMatriculaInfoComRAResponse realizarMatriculaInfoComRAResponse) {
//        this.realizarMatriculaInfoComRAResponse = realizarMatriculaInfoComRAResponse;
//    }
//
//}
