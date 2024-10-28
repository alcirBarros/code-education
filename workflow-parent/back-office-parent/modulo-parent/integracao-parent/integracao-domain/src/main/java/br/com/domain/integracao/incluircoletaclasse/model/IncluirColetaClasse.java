package br.com.domain.integracao.incluircoletaclasse.model;

import br.com.domain.auxiliar.tipoclasse.model.TipoClasse;
import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
import br.com.domain.auxiliar.tipoperidoletivo.model.TipoPeriodoLetivo;
import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
import br.com.domain.prodesp.ProdespHeader;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "icc_incluir_coleta_classe")
@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id")
public class IncluirColetaClasse extends ProdespHeader implements Serializable {

    @Column(name = "icc_codigo_escola", length = 7)
    private String inCodEscola;

    @Column(name = "icc_codigo_unidade", length = 7)
    private String inCodUnidade;

    @Column(name = "icc_capacidade_fisica", length = 7)
    private String inCapacidadeFisica;

//    @Column(name = "icc_curso_semestral_1", length = 7)
//    private String inCursoSemestral1;
//
//    @Column(name = "icc_curso_semestral_2", length = 7)
//    private String inCursoSemestral2;
    @ManyToOne
    @JoinColumn(name = "plv_id", referencedColumnName = "plv_id")
    private TipoPeriodoLetivo tipoPeriodoLetivo;

    @Temporal(TemporalType.DATE)
    @Column(name = "icc_inicio_aula")
    private Date dataInicioAula;

    @Temporal(TemporalType.DATE)
    @Column(name = "icc_termino_aula")
    private Date dataTerminoAula;
    
    
    

//    @Column(name = "icc_dia_inicio_aula", length = 7)
//    private String inDiaInicioAula;
//
//    @Column(name = "icc_dia_termino_aula", length = 7)
//    private String inDiaTerminoAula;

    @Column(name = "icc_codigo_inep", length = 7)
    private String inCodigoINEP;

    @Temporal(TemporalType.DATE)
    @Column(name = "icc_Hora_inicio_aula")
    private Date horaInicioAula;

    @Temporal(TemporalType.DATE)
    @Column(name = "icc_hora_termino_aula")
    private Date horaTerminoAula;

//    @Column(name = "icc_hora_final", length = 4)
//    private String inHoraFinal;
//
//    @Column(name = "icc_hora_inicial", length = 4)
//    private String inHoraInicial;
//    
//    @Column(name = "icc_mes_inicio_aula", length = 7)
//    private String inMesInicioAula;
//
//    @Column(name = "icc_mes_termino_aula", length = 7)
//    private String inMesTerminoAula;

    @Column(name = "icc_numero_sala", length = 7)
    private String inNumeroSala;

    @Column(name = "icc_serie_ano", length = 7)
    private String inSerieAno;

//    @Column(name = "icc_tipo_classe", length = 2)
//    private String inTipoClasse;
    @ManyToOne
    @JoinColumn(name = "cls_id", referencedColumnName = "cls_id")
    private TipoClasse tipoClasse;

//    @Column(name = "icc_tipo_ensino", length = 2)
//    private String inTipoEnsino;
    @ManyToOne
    @JoinColumn(name = "esn_id", referencedColumnName = "esn_id")
    private TipoEnsino tipoEnsino;

    @Column(name = "icc_turma", length = 7)
    private String inTurma;

//    @Column(name = "icc_turno", length = 7)
//    private String inTurno;
    @ManyToOne
    @JoinColumn(name = "trn_id", referencedColumnName = "trn_id")
    private TipoTurno tipoTurno;

    @Column(name = "icc_ano", length = 4)
    private String inAno;

    @JoinColumn(name = "dsm_id")
    @ManyToOne(cascade = CascadeType.ALL)
    private DiasSemana inDiasSemana;

    @Column(name = "icc_programa_mais_educacao", length = 1)
    private String inProgMaisEducacao;

    @Column(name = "icc_atendimento_educacional_especializado", length = 7)
    private String inAEE;

    @Column(name = "icc_atc", length = 7)
    private String inATC;

    @Column(name = "icc_flag_convenio_estado", length = 7)
    private String inFlagConvenioEst;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "icr_id", referencedColumnName = "icr_id")
    private IncluirColetaClasseResponse incluirColetaClasseResponse;

    public static IncluirColetaClasse criarInstancia() {
        IncluirColetaClasse incluirColetaClasse = new IncluirColetaClasse();
        incluirColetaClasse.setInDiasSemana(new DiasSemana());
        return incluirColetaClasse;
    }

    public static IncluirColetaClasse setNull(IncluirColetaClasse realizarMatriculaInfoSemRA) {
        if (realizarMatriculaInfoSemRA != null) {
            if (realizarMatriculaInfoSemRA.getInDiasSemana() != null) {
                realizarMatriculaInfoSemRA.setInDiasSemana(DiasSemana.setNull(realizarMatriculaInfoSemRA.getInDiasSemana()));
            }
        }
        return realizarMatriculaInfoSemRA;
    }

    public String getInCodEscola() {
        return inCodEscola;
    }

    public void setInCodEscola(String inCodEscola) {
        this.inCodEscola = inCodEscola;
    }

    public String getInCodUnidade() {
        return inCodUnidade;
    }

    public void setInCodUnidade(String inCodUnidade) {
        this.inCodUnidade = inCodUnidade;
    }

    public String getInCapacidadeFisica() {
        return inCapacidadeFisica;
    }

    public void setInCapacidadeFisica(String inCapacidadeFisica) {
        this.inCapacidadeFisica = inCapacidadeFisica;
    }

    public TipoPeriodoLetivo getTipoPeriodoLetivo() {
        return tipoPeriodoLetivo;
    }

    public void setTipoPeriodoLetivo(TipoPeriodoLetivo tipoPeriodoLetivo) {
        this.tipoPeriodoLetivo = tipoPeriodoLetivo;
    }

    public Date getDataInicioAula() {
        return dataInicioAula;
    }

    public void setDataInicioAula(Date dataInicioAula) {
        this.dataInicioAula = dataInicioAula;
    }

    public Date getDataTerminoAula() {
        return dataTerminoAula;
    }

    public void setDataTerminoAula(Date dataTerminoAula) {
        this.dataTerminoAula = dataTerminoAula;
    }

    public String getInCodigoINEP() {
        return inCodigoINEP;
    }

    public void setInCodigoINEP(String inCodigoINEP) {
        this.inCodigoINEP = inCodigoINEP;
    }

    public Date getHoraInicioAula() {
        return horaInicioAula;
    }

    public void setHoraInicioAula(Date horaInicioAula) {
        this.horaInicioAula = horaInicioAula;
    }

    public Date getHoraTerminoAula() {
        return horaTerminoAula;
    }

    public void setHoraTerminoAula(Date horaTerminoAula) {
        this.horaTerminoAula = horaTerminoAula;
    }

    public String getInNumeroSala() {
        return inNumeroSala;
    }

    public void setInNumeroSala(String inNumeroSala) {
        this.inNumeroSala = inNumeroSala;
    }

    public String getInSerieAno() {
        return inSerieAno;
    }

    public void setInSerieAno(String inSerieAno) {
        this.inSerieAno = inSerieAno;
    }

    public TipoClasse getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(TipoClasse tipoClasse) {
        this.tipoClasse = tipoClasse;
    }

    public TipoEnsino getTipoEnsino() {
        return tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        this.tipoEnsino = tipoEnsino;
    }

    public String getInTurma() {
        return inTurma;
    }

    public void setInTurma(String inTurma) {
        this.inTurma = inTurma;
    }

    public TipoTurno getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(TipoTurno tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public String getInAno() {
        return inAno;
    }

    public void setInAno(String inAno) {
        this.inAno = inAno;
    }

    public DiasSemana getInDiasSemana() {
        return inDiasSemana;
    }

    public void setInDiasSemana(DiasSemana inDiasSemana) {
        this.inDiasSemana = inDiasSemana;
    }

    public String getInProgMaisEducacao() {
        return inProgMaisEducacao;
    }

    public void setInProgMaisEducacao(String inProgMaisEducacao) {
        this.inProgMaisEducacao = inProgMaisEducacao;
    }

    public String getInAEE() {
        return inAEE;
    }

    public void setInAEE(String inAEE) {
        this.inAEE = inAEE;
    }

    public String getInATC() {
        return inATC;
    }

    public void setInATC(String inATC) {
        this.inATC = inATC;
    }

    public String getInFlagConvenioEst() {
        return inFlagConvenioEst;
    }

    public void setInFlagConvenioEst(String inFlagConvenioEst) {
        this.inFlagConvenioEst = inFlagConvenioEst;
    }

    public IncluirColetaClasseResponse getIncluirColetaClasseResponse() {
        return incluirColetaClasseResponse;
    }

    public void setIncluirColetaClasseResponse(IncluirColetaClasseResponse incluirColetaClasseResponse) {
        this.incluirColetaClasseResponse = incluirColetaClasseResponse;
    }
    
    

  
}
