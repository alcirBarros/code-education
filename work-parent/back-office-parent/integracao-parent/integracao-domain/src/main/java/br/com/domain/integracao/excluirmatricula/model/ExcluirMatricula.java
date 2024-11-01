//package br.com.domain.integracao.excluirmatricula.model;
//
//import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
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
//@Table(name = "xmt_excluir_matricula")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_xmt_pdh_id"))})
//public class ExcluirMatricula extends ProdespHeader implements Serializable {
//
//    @Column(name = "xmt_registro_aluno", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "xmt_digito_registro_aluno", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//    @Column(name = "xmt_uf", columnDefinition = "TEXT")
//    private String inUF;
//
//    @Column(name = "xmt_numero_classe", columnDefinition = "TEXT")
//    private String inNumClasse;
//
//    @Column(name = "xmt_ano", columnDefinition = "TEXT")
//    private String inAno;
//
//    @Column(name = "xmt_serie_ano", columnDefinition = "TEXT")
//    private String inSerieAno;
//
////    @Column(name = "xmt_tipo_ensino", columnDefinition = "TEXT")
////    private String inTipoEnsino;
//
//    @ManyToOne
//    @JoinColumn(name = "esn_id", referencedColumnName = "esn_id")
//    private TipoEnsino tipoEnsino;
//
//    @JoinColumn(name = "xmr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ExcluirMatriculaResponse excluirMatriculaResponse;
//
//    public static ExcluirMatricula criarInstancia() {
//        return new ExcluirMatricula();
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
//    public String getInUF() {
//        return inUF;
//    }
//
//    public void setInUF(String inUF) {
//        this.inUF = inUF;
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
//    public String getInAno() {
//        return inAno;
//    }
//
//    public void setInAno(String inAno) {
//        this.inAno = inAno;
//    }
//
//    public String getInSerieAno() {
//        return inSerieAno;
//    }
//
//    public void setInSerieAno(String inSerieAno) {
//        this.inSerieAno = inSerieAno;
//    }
//
//    public TipoEnsino getTipoEnsino() {
//        return tipoEnsino;
//    }
//
//    public void setTipoEnsino(TipoEnsino tipoEnsino) {
//        this.tipoEnsino = tipoEnsino;
//    }
//
//    public ExcluirMatriculaResponse getExcluirMatriculaResponse() {
//        return excluirMatriculaResponse;
//    }
//
//    public void setExcluirMatriculaResponse(ExcluirMatriculaResponse excluirMatriculaResponse) {
//        this.excluirMatriculaResponse = excluirMatriculaResponse;
//    }
//}
