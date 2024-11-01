//package br.com.domain.integracao.consultarcoletaclasse.model;
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
//@Table(name = "mcc_mensagem_consulta_coleta_classe")
//public class MsgConsultaColetaClasse extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "mcc_id", nullable = false)
//    private Integer id;
//
//    private String outAEE01;
//    private String outAEE02;
//    private String outAEE03;
//    private String outAEE04;
//    private String outAEE05;
//    private String outAEE06;
//    private String outAEE07;
//    private String outAEE08;
//    private String outAEE09;
//    private String outAEE10;
//    private String outAEE11;
//    private String outCapacidadeFisica;
//    private String outDataInicio;
//    private String outDescrHabillit;
//    private String outDescrNivel;
//    private String outDescrPreench;
//    private String outDescrProgEstadual;
//    private String outDescrSala;
//    private String outDescrSerie;
//    private String outDescrSituacaoClasse;
//    private String outDescrTipoEnsino;
//    private String outDescrTurma;
//    private String outDescrTurno;
//    private String outDomingo;
//    private String outDurClasse;
//    private String outCodEscola;
//    private String outHabilitacao;
//    private String outHoraFinal;
//    private String outHoraInicial;
//    private String outInicioAula;
//    private String outNivel;
//    private String outNomeEscola;
//    private String outNomeUnidade;
//    private String outNumeroSala;
//    private String outProgMaisEduc;
//    private String outQtdAlunoClasse;
//    private String outQtdCargaHoraHabilitaca;
//    private String outQuartaFeira;
//    private String outQuintaFeira;
//    private String outSabado;
//    private String outSegundaFeira;
//    private String outSerieAno;
//    private String outSextaFeira;
//    private String outTercaFeira;
//    private String outTerminoAula;
//    private String outTipoClasse;
//    private String outTipoEnsino;
//    private String outTurma;
//    private String outTurno;
//    private String outErro;
//    private String outCodATC01;
//    private String outCodATC02;
//    private String outCodATC03;
//    private String outCodATC04;
//    private String outCodATC05;
//    private String outCodATC06;
//    private String outDescrATC01;
//    private String outDescrATC02;
//    private String outDescrATC03;
//    private String outDescrATC04;
//    private String outDescrATC05;
//    private String outDescrATC06;
//    private String outClasseConvenioEst;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOutAEE01() {
//        return outAEE01;
//    }
//
//    public void setOutAEE01(String outAEE01) {
//        this.outAEE01 = outAEE01;
//    }
//
//    public String getOutAEE02() {
//        return outAEE02;
//    }
//
//    public void setOutAEE02(String outAEE02) {
//        this.outAEE02 = outAEE02;
//    }
//
//    public String getOutAEE03() {
//        return outAEE03;
//    }
//
//    public void setOutAEE03(String outAEE03) {
//        this.outAEE03 = outAEE03;
//    }
//
//    public String getOutAEE04() {
//        return outAEE04;
//    }
//
//    public void setOutAEE04(String outAEE04) {
//        this.outAEE04 = outAEE04;
//    }
//
//    public String getOutAEE05() {
//        return outAEE05;
//    }
//
//    public void setOutAEE05(String outAEE05) {
//        this.outAEE05 = outAEE05;
//    }
//
//    public String getOutAEE06() {
//        return outAEE06;
//    }
//
//    public void setOutAEE06(String outAEE06) {
//        this.outAEE06 = outAEE06;
//    }
//
//    public String getOutAEE07() {
//        return outAEE07;
//    }
//
//    public void setOutAEE07(String outAEE07) {
//        this.outAEE07 = outAEE07;
//    }
//
//    public String getOutAEE08() {
//        return outAEE08;
//    }
//
//    public void setOutAEE08(String outAEE08) {
//        this.outAEE08 = outAEE08;
//    }
//
//    public String getOutAEE09() {
//        return outAEE09;
//    }
//
//    public void setOutAEE09(String outAEE09) {
//        this.outAEE09 = outAEE09;
//    }
//
//    public String getOutAEE10() {
//        return outAEE10;
//    }
//
//    public void setOutAEE10(String outAEE10) {
//        this.outAEE10 = outAEE10;
//    }
//
//    public String getOutAEE11() {
//        return outAEE11;
//    }
//
//    public void setOutAEE11(String outAEE11) {
//        this.outAEE11 = outAEE11;
//    }
//
//    public String getOutCapacidadeFisica() {
//        return outCapacidadeFisica;
//    }
//
//    public void setOutCapacidadeFisica(String outCapacidadeFisica) {
//        this.outCapacidadeFisica = outCapacidadeFisica;
//    }
//
//    public String getOutDataInicio() {
//        return outDataInicio;
//    }
//
//    public void setOutDataInicio(String outDataInicio) {
//        this.outDataInicio = outDataInicio;
//    }
//
//    public String getOutDescrHabillit() {
//        return outDescrHabillit;
//    }
//
//    public void setOutDescrHabillit(String outDescrHabillit) {
//        this.outDescrHabillit = outDescrHabillit;
//    }
//
//    public String getOutDescrNivel() {
//        return outDescrNivel;
//    }
//
//    public void setOutDescrNivel(String outDescrNivel) {
//        this.outDescrNivel = outDescrNivel;
//    }
//
//    public String getOutDescrPreench() {
//        return outDescrPreench;
//    }
//
//    public void setOutDescrPreench(String outDescrPreench) {
//        this.outDescrPreench = outDescrPreench;
//    }
//
//    public String getOutDescrProgEstadual() {
//        return outDescrProgEstadual;
//    }
//
//    public void setOutDescrProgEstadual(String outDescrProgEstadual) {
//        this.outDescrProgEstadual = outDescrProgEstadual;
//    }
//
//    public String getOutDescrSala() {
//        return outDescrSala;
//    }
//
//    public void setOutDescrSala(String outDescrSala) {
//        this.outDescrSala = outDescrSala;
//    }
//
//    public String getOutDescrSerie() {
//        return outDescrSerie;
//    }
//
//    public void setOutDescrSerie(String outDescrSerie) {
//        this.outDescrSerie = outDescrSerie;
//    }
//
//    public String getOutDescrSituacaoClasse() {
//        return outDescrSituacaoClasse;
//    }
//
//    public void setOutDescrSituacaoClasse(String outDescrSituacaoClasse) {
//        this.outDescrSituacaoClasse = outDescrSituacaoClasse;
//    }
//
//    public String getOutDescrTipoEnsino() {
//        return outDescrTipoEnsino;
//    }
//
//    public void setOutDescrTipoEnsino(String outDescrTipoEnsino) {
//        this.outDescrTipoEnsino = outDescrTipoEnsino;
//    }
//
//    public String getOutDescrTurma() {
//        return outDescrTurma;
//    }
//
//    public void setOutDescrTurma(String outDescrTurma) {
//        this.outDescrTurma = outDescrTurma;
//    }
//
//    public String getOutDescrTurno() {
//        return outDescrTurno;
//    }
//
//    public void setOutDescrTurno(String outDescrTurno) {
//        this.outDescrTurno = outDescrTurno;
//    }
//
//    public String getOutDomingo() {
//        return outDomingo;
//    }
//
//    public void setOutDomingo(String outDomingo) {
//        this.outDomingo = outDomingo;
//    }
//
//    public String getOutDurClasse() {
//        return outDurClasse;
//    }
//
//    public void setOutDurClasse(String outDurClasse) {
//        this.outDurClasse = outDurClasse;
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
//    public String getOutHabilitacao() {
//        return outHabilitacao;
//    }
//
//    public void setOutHabilitacao(String outHabilitacao) {
//        this.outHabilitacao = outHabilitacao;
//    }
//
//    public String getOutHoraFinal() {
//        return outHoraFinal;
//    }
//
//    public void setOutHoraFinal(String outHoraFinal) {
//        this.outHoraFinal = outHoraFinal;
//    }
//
//    public String getOutHoraInicial() {
//        return outHoraInicial;
//    }
//
//    public void setOutHoraInicial(String outHoraInicial) {
//        this.outHoraInicial = outHoraInicial;
//    }
//
//    public String getOutInicioAula() {
//        return outInicioAula;
//    }
//
//    public void setOutInicioAula(String outInicioAula) {
//        this.outInicioAula = outInicioAula;
//    }
//
//    public String getOutNivel() {
//        return outNivel;
//    }
//
//    public void setOutNivel(String outNivel) {
//        this.outNivel = outNivel;
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
//    public String getOutNomeUnidade() {
//        return outNomeUnidade;
//    }
//
//    public void setOutNomeUnidade(String outNomeUnidade) {
//        this.outNomeUnidade = outNomeUnidade;
//    }
//
//    public String getOutNumeroSala() {
//        return outNumeroSala;
//    }
//
//    public void setOutNumeroSala(String outNumeroSala) {
//        this.outNumeroSala = outNumeroSala;
//    }
//
//    public String getOutProgMaisEduc() {
//        return outProgMaisEduc;
//    }
//
//    public void setOutProgMaisEduc(String outProgMaisEduc) {
//        this.outProgMaisEduc = outProgMaisEduc;
//    }
//
//    public String getOutQtdAlunoClasse() {
//        return outQtdAlunoClasse;
//    }
//
//    public void setOutQtdAlunoClasse(String outQtdAlunoClasse) {
//        this.outQtdAlunoClasse = outQtdAlunoClasse;
//    }
//
//    public String getOutQtdCargaHoraHabilitaca() {
//        return outQtdCargaHoraHabilitaca;
//    }
//
//    public void setOutQtdCargaHoraHabilitaca(String outQtdCargaHoraHabilitaca) {
//        this.outQtdCargaHoraHabilitaca = outQtdCargaHoraHabilitaca;
//    }
//
//    public String getOutQuartaFeira() {
//        return outQuartaFeira;
//    }
//
//    public void setOutQuartaFeira(String outQuartaFeira) {
//        this.outQuartaFeira = outQuartaFeira;
//    }
//
//    public String getOutQuintaFeira() {
//        return outQuintaFeira;
//    }
//
//    public void setOutQuintaFeira(String outQuintaFeira) {
//        this.outQuintaFeira = outQuintaFeira;
//    }
//
//    public String getOutSabado() {
//        return outSabado;
//    }
//
//    public void setOutSabado(String outSabado) {
//        this.outSabado = outSabado;
//    }
//
//    public String getOutSegundaFeira() {
//        return outSegundaFeira;
//    }
//
//    public void setOutSegundaFeira(String outSegundaFeira) {
//        this.outSegundaFeira = outSegundaFeira;
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
//    public String getOutSextaFeira() {
//        return outSextaFeira;
//    }
//
//    public void setOutSextaFeira(String outSextaFeira) {
//        this.outSextaFeira = outSextaFeira;
//    }
//
//    public String getOutTercaFeira() {
//        return outTercaFeira;
//    }
//
//    public void setOutTercaFeira(String outTercaFeira) {
//        this.outTercaFeira = outTercaFeira;
//    }
//
//    public String getOutTerminoAula() {
//        return outTerminoAula;
//    }
//
//    public void setOutTerminoAula(String outTerminoAula) {
//        this.outTerminoAula = outTerminoAula;
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
//    public String getOutTipoEnsino() {
//        return outTipoEnsino;
//    }
//
//    public void setOutTipoEnsino(String outTipoEnsino) {
//        this.outTipoEnsino = outTipoEnsino;
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
//    public String getOutTurno() {
//        return outTurno;
//    }
//
//    public void setOutTurno(String outTurno) {
//        this.outTurno = outTurno;
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
//    public String getOutCodATC01() {
//        return outCodATC01;
//    }
//
//    public void setOutCodATC01(String outCodATC01) {
//        this.outCodATC01 = outCodATC01;
//    }
//
//    public String getOutCodATC02() {
//        return outCodATC02;
//    }
//
//    public void setOutCodATC02(String outCodATC02) {
//        this.outCodATC02 = outCodATC02;
//    }
//
//    public String getOutCodATC03() {
//        return outCodATC03;
//    }
//
//    public void setOutCodATC03(String outCodATC03) {
//        this.outCodATC03 = outCodATC03;
//    }
//
//    public String getOutCodATC04() {
//        return outCodATC04;
//    }
//
//    public void setOutCodATC04(String outCodATC04) {
//        this.outCodATC04 = outCodATC04;
//    }
//
//    public String getOutCodATC05() {
//        return outCodATC05;
//    }
//
//    public void setOutCodATC05(String outCodATC05) {
//        this.outCodATC05 = outCodATC05;
//    }
//
//    public String getOutCodATC06() {
//        return outCodATC06;
//    }
//
//    public void setOutCodATC06(String outCodATC06) {
//        this.outCodATC06 = outCodATC06;
//    }
//
//    public String getOutDescrATC01() {
//        return outDescrATC01;
//    }
//
//    public void setOutDescrATC01(String outDescrATC01) {
//        this.outDescrATC01 = outDescrATC01;
//    }
//
//    public String getOutDescrATC02() {
//        return outDescrATC02;
//    }
//
//    public void setOutDescrATC02(String outDescrATC02) {
//        this.outDescrATC02 = outDescrATC02;
//    }
//
//    public String getOutDescrATC03() {
//        return outDescrATC03;
//    }
//
//    public void setOutDescrATC03(String outDescrATC03) {
//        this.outDescrATC03 = outDescrATC03;
//    }
//
//    public String getOutDescrATC04() {
//        return outDescrATC04;
//    }
//
//    public void setOutDescrATC04(String outDescrATC04) {
//        this.outDescrATC04 = outDescrATC04;
//    }
//
//    public String getOutDescrATC05() {
//        return outDescrATC05;
//    }
//
//    public void setOutDescrATC05(String outDescrATC05) {
//        this.outDescrATC05 = outDescrATC05;
//    }
//
//    public String getOutDescrATC06() {
//        return outDescrATC06;
//    }
//
//    public void setOutDescrATC06(String outDescrATC06) {
//        this.outDescrATC06 = outDescrATC06;
//    }
//
//    public String getOutClasseConvenioEst() {
//        return outClasseConvenioEst;
//    }
//
//    public void setOutClasseConvenioEst(String outClasseConvenioEst) {
//        this.outClasseConvenioEst = outClasseConvenioEst;
//    }
//
//}
