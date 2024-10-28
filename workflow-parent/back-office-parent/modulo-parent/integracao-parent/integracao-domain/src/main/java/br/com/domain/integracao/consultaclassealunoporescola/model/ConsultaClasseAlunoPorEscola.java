//package br.com.domain.integracao.consultaclassealunoporescola.model;
//
//import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
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
//@Table(name = "cae_consultar_classe_aluno_por_escola")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_cae_pdh_id"))})
//public class ConsultaClasseAlunoPorEscola extends ProdespHeader implements Serializable {
//
//    @Column(name = "cae_ano_letivo", columnDefinition = "TEXT")
//    private String inAnoLetivo;
//
//    @Column(name = "cae_codigo_escola", columnDefinition = "TEXT")
//    private String inCodEscola;
//
//    @Column(name = "cae_semestre", columnDefinition = "TEXT")
//    private String inSemestre;
//
//    @Column(name = "cae_serie_ano", columnDefinition = "TEXT")
//    private String inSerieAno;
//
//    @Column(name = "cae_tipo_ensino", columnDefinition = "TEXT")
//    private String inTipoEnsino;
//
//    @Column(name = "cae_turma", columnDefinition = "TEXT")
//    private String inTurma;
//
//    /*
//    Turno
//        Substistuindo o atributo.
//            -inTurno
//        Por 
//            -tipoTurno  
//     */
//    @ManyToOne
//    @JoinColumn(name = "trn_id", referencedColumnName = "trn_id")
//    private TipoTurno tipoTurno;
//    
//    @JoinColumn(name = "cer_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultaClasseAlunoPorEscolaResponse consultaClasseAlunoPorEscolaResponse;
//
//    public static ConsultaClasseAlunoPorEscola criarInstancia() {
//        return new ConsultaClasseAlunoPorEscola();
//    }
//
//    public String getInAnoLetivo() {
//        return inAnoLetivo;
//    }
//
//    public void setInAnoLetivo(String inAnoLetivo) {
//        this.inAnoLetivo = inAnoLetivo;
//    }
//
//    public String getInCodEscola() {
//        return inCodEscola;
//    }
//
//    public void setInCodEscola(String inCodEscola) {
//        this.inCodEscola = inCodEscola;
//    }
//
//    public String getInSemestre() {
//        return inSemestre;
//    }
//
//    public void setInSemestre(String inSemestre) {
//        this.inSemestre = inSemestre;
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
//    public String getInTipoEnsino() {
//        return inTipoEnsino;
//    }
//
//    public void setInTipoEnsino(String inTipoEnsino) {
//        this.inTipoEnsino = inTipoEnsino;
//    }
//
//    public String getInTurma() {
//        return inTurma;
//    }
//
//    public void setInTurma(String inTurma) {
//        this.inTurma = inTurma;
//    }
//
//    public TipoTurno getTipoTurno() {
//        return tipoTurno;
//    }
//
//    public void setTipoTurno(TipoTurno tipoTurno) {
//        this.tipoTurno = tipoTurno;
//    }
//
//    public ConsultaClasseAlunoPorEscolaResponse getConsultaClasseAlunoPorEscolaResponse() {
//        return consultaClasseAlunoPorEscolaResponse;
//    }
//
//    public void setConsultaClasseAlunoPorEscolaResponse(ConsultaClasseAlunoPorEscolaResponse consultaClasseAlunoPorEscolaResponse) {
//        this.consultaClasseAlunoPorEscolaResponse = consultaClasseAlunoPorEscolaResponse;
//    }
//}