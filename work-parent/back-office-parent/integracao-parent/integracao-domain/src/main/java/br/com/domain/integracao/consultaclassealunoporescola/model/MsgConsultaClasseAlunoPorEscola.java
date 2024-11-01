//package br.com.domain.integracao.consultaclassealunoporescola.model;
//
//import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
//import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
//import br.com.projeto.model.EntidadeSerialVersion;
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "mcc_mensagem_consultar_classe_aluno_por_escola")
//public class MsgConsultaClasseAlunoPorEscola extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "mcc_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "mcc_codigo_escola", columnDefinition = "TEXT")
//    private String outCodEscola;
//
//    @Column(name = "mcc_codigo_habilitacao", columnDefinition = "TEXT")
//    private String outCodHabilit;
//
//    @Column(name = "mcc_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "mcc_nome_escola", columnDefinition = "TEXT")
//    private String outNomeEscola;
//
//    @Column(name = "mcc_numero_classe", columnDefinition = "TEXT")
//    private String outNrClasse;
//
//    @Column(name = "mcc_quantidade_abandono", columnDefinition = "TEXT")
//    private String outQtdeAban;
//
//    @Column(name = "mcc_quantidade_atual", columnDefinition = "TEXT")
//    private String outQtdeAtual;
//
//    @Column(name = "mcc_quantidade_cadastrada", columnDefinition = "TEXT")
//    private String outQtdeCad;
//
//    @Column(name = "mcc_quantidade_cessados", columnDefinition = "TEXT")
//    private String outQtdeCes;
//
//    @Column(name = "mcc_quantidade_outros", columnDefinition = "TEXT")
//    private String outQtdeOutros;
//
//    @Column(name = "mcc_quantidade_reclassificados", columnDefinition = "TEXT")
//    private String outQtdeRecla;
//
//    @Column(name = "mcc_quantidade_remanejados", columnDefinition = "TEXT")
//    private String outQtdeReman;
//
//    @Column(name = "mcc_quantidade_transferidos", columnDefinition = "TEXT")
//    private String outQtdeTransf;
//
//    @Column(name = "mcc_quantidade_semestre", columnDefinition = "TEXT")
//    private String outSemestre;
//
//    @Column(name = "mcc_serie_ano", columnDefinition = "TEXT")
//    private String outSerieAno;
//
//    @Column(name = "mcc_tipo_classe", columnDefinition = "TEXT")
//    private String outTipoClasse;
//
//    @ManyToOne
//    @JoinColumn(name = "esn_id")
//    private TipoEnsino tipoEnsino;
//
//    @Column(name = "mcc_turma", columnDefinition = "TEXT")
//    private String outTurma;
//
////    @Column(name = "mcc_turno", columnDefinition = "TEXT")
////    private String outTurno;
//
//    @ManyToOne
//    @JoinColumn(name = "trn_id")
//    private TipoTurno tipoTurno;
//
//    @Override
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOutCodEscola() {
//        return outCodEscola;
//    }
//
//    public void setOutCodEscola(String outCodEscola) {
//        this.outCodEscola = outCodEscola;
//    }
//
//    public String getOutCodHabilit() {
//        return outCodHabilit;
//    }
//
//    public void setOutCodHabilit(String outCodHabilit) {
//        this.outCodHabilit = outCodHabilit;
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
//    public String getOutNomeEscola() {
//        return outNomeEscola;
//    }
//
//    public void setOutNomeEscola(String outNomeEscola) {
//        this.outNomeEscola = outNomeEscola;
//    }
//
//    public String getOutNrClasse() {
//        return outNrClasse;
//    }
//
//    public void setOutNrClasse(String outNrClasse) {
//        this.outNrClasse = outNrClasse;
//    }
//
//    public String getOutQtdeAban() {
//        return outQtdeAban;
//    }
//
//    public void setOutQtdeAban(String outQtdeAban) {
//        this.outQtdeAban = outQtdeAban;
//    }
//
//    public String getOutQtdeAtual() {
//        return outQtdeAtual;
//    }
//
//    public void setOutQtdeAtual(String outQtdeAtual) {
//        this.outQtdeAtual = outQtdeAtual;
//    }
//
//    public String getOutQtdeCad() {
//        return outQtdeCad;
//    }
//
//    public void setOutQtdeCad(String outQtdeCad) {
//        this.outQtdeCad = outQtdeCad;
//    }
//
//    public String getOutQtdeCes() {
//        return outQtdeCes;
//    }
//
//    public void setOutQtdeCes(String outQtdeCes) {
//        this.outQtdeCes = outQtdeCes;
//    }
//
//    public String getOutQtdeOutros() {
//        return outQtdeOutros;
//    }
//
//    public void setOutQtdeOutros(String outQtdeOutros) {
//        this.outQtdeOutros = outQtdeOutros;
//    }
//
//    public String getOutQtdeRecla() {
//        return outQtdeRecla;
//    }
//
//    public void setOutQtdeRecla(String outQtdeRecla) {
//        this.outQtdeRecla = outQtdeRecla;
//    }
//
//    public String getOutQtdeReman() {
//        return outQtdeReman;
//    }
//
//    public void setOutQtdeReman(String outQtdeReman) {
//        this.outQtdeReman = outQtdeReman;
//    }
//
//    public String getOutQtdeTransf() {
//        return outQtdeTransf;
//    }
//
//    public void setOutQtdeTransf(String outQtdeTransf) {
//        this.outQtdeTransf = outQtdeTransf;
//    }
//
//    public String getOutSemestre() {
//        return outSemestre;
//    }
//
//    public void setOutSemestre(String outSemestre) {
//        this.outSemestre = outSemestre;
//    }
//
//    public String getOutSerieAno() {
//        return outSerieAno;
//    }
//
//    public void setOutSerieAno(String outSerieAno) {
//        this.outSerieAno = outSerieAno;
//    }
//
//    public String getOutTipoClasse() {
//        return outTipoClasse;
//    }
//
//    public void setOutTipoClasse(String outTipoClasse) {
//        this.outTipoClasse = outTipoClasse;
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
//    public String getOutTurma() {
//        return outTurma;
//    }
//
//    public void setOutTurma(String outTurma) {
//        this.outTurma = outTurma;
//    }
//
////    public String getOutTurno() {
////        return outTurno;
////    }
////
////    public void setOutTurno(String outTurno) {
////        this.outTurno = outTurno;
////    }
//
//    public TipoTurno getTipoTurno() {
//        return tipoTurno;
//    }
//
//    public void setTipoTurno(TipoTurno tipoTurno) {
//        this.tipoTurno = tipoTurno;
//    }
//}
