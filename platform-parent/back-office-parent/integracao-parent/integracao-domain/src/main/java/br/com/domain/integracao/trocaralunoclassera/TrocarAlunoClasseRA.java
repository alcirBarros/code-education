//package br.com.domain.integracao.trocaralunoclassera;
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
//@Table(name = "tlc_trocar_aluno_classe_registro_aluno")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_tlc_pdh_id"))})
//public class TrocarAlunoClasseRA extends ProdespHeader implements Serializable {
//
//    @Column(name = "tlc_ano", columnDefinition = "TEXT")
//    private String inAno;
//
//    @Column(name = "tlc_registro_aluno", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "tlc_digito_registro_aluno", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//    @Column(name = "tlc_uf", columnDefinition = "TEXT")
//    private String inUF;
//
//    @Column(name = "tlc_dia_troca", columnDefinition = "TEXT")
//    private String inDiaTroca;
//
//    @Column(name = "tlc_mes_troca", columnDefinition = "TEXT")
//    private String inMesTroca;
//
//    @Column(name = "tlc_ano_troca", columnDefinition = "TEXT")
//    private String inAnoTroca;
//
//    @Column(name = "tlc_numero_aluno", columnDefinition = "TEXT")
//    private String inNumAluno;
//
//    @Column(name = "tlc_numero_classe_origem", columnDefinition = "TEXT")
//    private String inNumClasseOrigem;
//
//    @Column(name = "tlc_numero_classe_destino", columnDefinition = "TEXT")
//    private String inNumClasseDestino;
//
//    @Column(name = "tlc_tipo_ensino", columnDefinition = "TEXT")
//    private String inTipoEnsino;
//
//    @Column(name = "tlc_serie_ano", columnDefinition = "TEXT")
//    private String inSerieAno;
//
//    @JoinColumn(name = "tar_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private TrocarAlunoClasseRAResponse trocarAlunoClasseRAResponse;
//
//    public String getInAno() {
//        return inAno;
//    }
//
//    public void setInAno(String inAno) {
//        this.inAno = inAno;
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
//    public String getInDiaTroca() {
//        return inDiaTroca;
//    }
//
//    public void setInDiaTroca(String inDiaTroca) {
//        this.inDiaTroca = inDiaTroca;
//    }
//
//    public String getInMesTroca() {
//        return inMesTroca;
//    }
//
//    public void setInMesTroca(String inMesTroca) {
//        this.inMesTroca = inMesTroca;
//    }
//
//    public String getInAnoTroca() {
//        return inAnoTroca;
//    }
//
//    public void setInAnoTroca(String inAnoTroca) {
//        this.inAnoTroca = inAnoTroca;
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
//    public String getInNumClasseOrigem() {
//        return inNumClasseOrigem;
//    }
//
//    public void setInNumClasseOrigem(String inNumClasseOrigem) {
//        this.inNumClasseOrigem = inNumClasseOrigem;
//    }
//
//    public String getInNumClasseDestino() {
//        return inNumClasseDestino;
//    }
//
//    public void setInNumClasseDestino(String inNumClasseDestino) {
//        this.inNumClasseDestino = inNumClasseDestino;
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
//    public String getInSerieAno() {
//        return inSerieAno;
//    }
//
//    public void setInSerieAno(String inSerieAno) {
//        this.inSerieAno = inSerieAno;
//    }
//
//    public TrocarAlunoClasseRAResponse getTrocarAlunoClasseRAResponse() {
//        return trocarAlunoClasseRAResponse;
//    }
//
//    public void setTrocarAlunoClasseRAResponse(TrocarAlunoClasseRAResponse trocarAlunoClasseRAResponse) {
//        this.trocarAlunoClasseRAResponse = trocarAlunoClasseRAResponse;
//    }
//}