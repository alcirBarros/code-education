//package br.com.domain.integracao.alterarcoletaclasse.model;
//
//import br.com.domain.prodesp.ProdespHeader;
//import br.com.domain.integracao.incluircoletaclasse.model.DiasSemana;
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
//@Table(name = "acc_alterar_coleta_classe")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_acc_pdh_id"))})
//public class AlterarColetaClasse extends ProdespHeader implements Serializable {
//
//    @Column(name = "acc_numero_classe", length = 9)
//    protected String inNumClasse;
//
//    @Column(name = "acc_capacidade_fisica", length = 2)
//    protected String inCapacidadeFisica;
//
//    @Column(name = "acc_curso_semestral_1", length = 1)
//    protected String inCursoSemestral1;
//
//    @Column(name = "acc_curso_semestral_2", length = 1)
//    protected String inCursoSemestral2;
//
//    @Column(name = "acc_dia_inicio_aula", length = 2)
//    protected String inDiaInicioAula;
//
//    @Column(name = "acc_dia_termino_aula", length = 2)
//    protected String inDiaTerminoAula;
//
//    @Column(name = "acc_codigo_inep", length = 7)
//    protected String inCodigoINEP;
//
//    @Column(name = "acc_hora_final", length = 4)
//    protected String inHoraFinal;
//
//    @Column(name = "acc_hora_inicial", length = 4)
//    protected String inHoraInicial;
//
//    @Column(name = "acc_mes_inicio_aula", length = 2)
//    protected String inMesInicioAula;
//
//    @Column(name = "acc_mes_termino_aula", length = 2)
//    protected String inMesTerminoAula;
//
//    @Column(name = "acc_numero_sala", length = 3)
//    protected String inNumeroSala;
//
//    @Column(name = "acc_serie_ano", length = 2)
//    protected String inSerieAno;
//
//    @Column(name = "acc_tipo_classe", length = 2)
//    protected String inTipoClasse;
//
//    @Column(name = "acc_tipo_ensino", length = 2)
//    protected String inTipoEnsino;
//
//    @Column(name = "acc_turma", length = 2)
//    protected String inTurma;
//
//    @Column(name = "acc_turno", length = 1)
//    protected String inTurno;
//
//    @Column(name = "acc_ano", length = 4)
//    protected String inAno;
//
//    @JoinColumn(name = "dsm_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private DiasSemana inDiasSemana;
//
//    @Column(name = "acc_programa_mais_educacao", length = 1)
//    protected String inProgMaisEducacao;
//
//    @Column(name = "acc_atendimento_educacional_especializado", length = 0)
//    protected String inAEE;
//
//    @Column(name = "acc_atc", length = 0)
//    protected String inATC;
//
//    @Column(name = "acc_flag_convenio_estado", length = 1)
//    protected String inFlagConvenioEst;
//
//    @JoinColumn(name = "lcr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private AlterarColetaClasseResponse alterarColetaClasseResponse;
//
//    public static AlterarColetaClasse criarInstancia() {
//        AlterarColetaClasse alterarColetaClasse = new AlterarColetaClasse();
//        return alterarColetaClasse;
//    }
//
//    public static AlterarColetaClasse setNull(AlterarColetaClasse alterarColetaClasse) {
//        return alterarColetaClasse;
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
//    public String getInCapacidadeFisica() {
//        return inCapacidadeFisica;
//    }
//
//    public void setInCapacidadeFisica(String inCapacidadeFisica) {
//        this.inCapacidadeFisica = inCapacidadeFisica;
//    }
//
//    public String getInCursoSemestral1() {
//        return inCursoSemestral1;
//    }
//
//    public void setInCursoSemestral1(String inCursoSemestral1) {
//        this.inCursoSemestral1 = inCursoSemestral1;
//    }
//
//    public String getInCursoSemestral2() {
//        return inCursoSemestral2;
//    }
//
//    public void setInCursoSemestral2(String inCursoSemestral2) {
//        this.inCursoSemestral2 = inCursoSemestral2;
//    }
//
//    public String getInDiaInicioAula() {
//        return inDiaInicioAula;
//    }
//
//    public void setInDiaInicioAula(String inDiaInicioAula) {
//        this.inDiaInicioAula = inDiaInicioAula;
//    }
//
//    public String getInDiaTerminoAula() {
//        return inDiaTerminoAula;
//    }
//
//    public void setInDiaTerminoAula(String inDiaTerminoAula) {
//        this.inDiaTerminoAula = inDiaTerminoAula;
//    }
//
//    public String getInCodigoINEP() {
//        return inCodigoINEP;
//    }
//
//    public void setInCodigoINEP(String inCodigoINEP) {
//        this.inCodigoINEP = inCodigoINEP;
//    }
//
//    public String getInHoraFinal() {
//        return inHoraFinal;
//    }
//
//    public void setInHoraFinal(String inHoraFinal) {
//        this.inHoraFinal = inHoraFinal;
//    }
//
//    public String getInHoraInicial() {
//        return inHoraInicial;
//    }
//
//    public void setInHoraInicial(String inHoraInicial) {
//        this.inHoraInicial = inHoraInicial;
//    }
//
//    public String getInMesInicioAula() {
//        return inMesInicioAula;
//    }
//
//    public void setInMesInicioAula(String inMesInicioAula) {
//        this.inMesInicioAula = inMesInicioAula;
//    }
//
//    public String getInMesTerminoAula() {
//        return inMesTerminoAula;
//    }
//
//    public void setInMesTerminoAula(String inMesTerminoAula) {
//        this.inMesTerminoAula = inMesTerminoAula;
//    }
//
//    public String getInNumeroSala() {
//        return inNumeroSala;
//    }
//
//    public void setInNumeroSala(String inNumeroSala) {
//        this.inNumeroSala = inNumeroSala;
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
//    public String getInTipoClasse() {
//        return inTipoClasse;
//    }
//
//    public void setInTipoClasse(String inTipoClasse) {
//        this.inTipoClasse = inTipoClasse;
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
//    public String getInTurno() {
//        return inTurno;
//    }
//
//    public void setInTurno(String inTurno) {
//        this.inTurno = inTurno;
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
//    public DiasSemana getInDiasSemana() {
//        return inDiasSemana;
//    }
//
//    public void setInDiasSemana(DiasSemana inDiasSemana) {
//        this.inDiasSemana = inDiasSemana;
//    }
//
//    public String getInProgMaisEducacao() {
//        return inProgMaisEducacao;
//    }
//
//    public void setInProgMaisEducacao(String inProgMaisEducacao) {
//        this.inProgMaisEducacao = inProgMaisEducacao;
//    }
//
//    public String getInAEE() {
//        return inAEE;
//    }
//
//    public void setInAEE(String inAEE) {
//        this.inAEE = inAEE;
//    }
//
//    public String getInATC() {
//        return inATC;
//    }
//
//    public void setInATC(String inATC) {
//        this.inATC = inATC;
//    }
//
//    public String getInFlagConvenioEst() {
//        return inFlagConvenioEst;
//    }
//
//    public void setInFlagConvenioEst(String inFlagConvenioEst) {
//        this.inFlagConvenioEst = inFlagConvenioEst;
//    }
//
//    public AlterarColetaClasseResponse getAlterarColetaClasseResponse() {
//        return alterarColetaClasseResponse;
//    }
//
//    public void setAlterarColetaClasseResponse(AlterarColetaClasseResponse alterarColetaClasseResponse) {
//        this.alterarColetaClasseResponse = alterarColetaClasseResponse;
//    }    
//}
