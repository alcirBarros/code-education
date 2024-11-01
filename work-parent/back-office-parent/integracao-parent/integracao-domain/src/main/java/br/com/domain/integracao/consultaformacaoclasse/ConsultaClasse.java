//package br.com.domain.integracao.consultaformacaoclasse;
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
//@Table(name = "csl_consulta_classe")
//public class ConsultaClasse extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "csl_id", nullable = false)
//    private Integer id;
//
////    @XmlElement(name = "RA")
//    @Column(name = "csl_registro_aluno", columnDefinition = "TEXT")
//    private String ra;
//
////    @XmlElement(name = "UF")
//    @Column(name = "csl_unidade_federada", columnDefinition = "TEXT")
//    private String uf;
//
//    @Column(name = "csl_digito_registro_aluno", columnDefinition = "TEXT")
//    private String digitoRA;
//
//    @Column(name = "csl_nome_aluno", columnDefinition = "TEXT")
//    private String nomeAluno;
//
//    @Column(name = "csl_numero", columnDefinition = "TEXT")
//    private String numero;
//
//    @Column(name = "csl_abandono", columnDefinition = "TEXT")
//    private String outAbandono;
//
//    @Column(name = "csl_ano", columnDefinition = "TEXT")
//    private String outAno;
//
//    @Column(name = "csl_atual", columnDefinition = "TEXT")
//    private String outAtual;
//
//    @Column(name = "csl_cadastrado", columnDefinition = "TEXT")
//    private String outCadastrado;
//
//    @Column(name = "csl_codigo_escola", columnDefinition = "TEXT")
//    private String outCodEscola;
//
//    @Column(name = "csl_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "csl_horario", columnDefinition = "TEXT")
//    private String outHorario;
//
//    @Column(name = "csl_nao_compareceu", columnDefinition = "TEXT")
//    private String outNaoCompareceu;
//
//    @Column(name = "csl_nome_escola", columnDefinition = "TEXT")
//    private String outNomeEscola;
//
//    @Column(name = "csl_numero_classe", columnDefinition = "TEXT")
//    private String outNumClasse;
//
//    @Column(name = "csl_numero_sala", columnDefinition = "TEXT")
//    private String outNumSala;
//
//    @Column(name = "csl_outros", columnDefinition = "TEXT")
//    private String outOutros;
//
//    @Column(name = "csl_remanejado", columnDefinition = "TEXT")
//    private String outRemanejado;
//
//    @Column(name = "csl_serie", columnDefinition = "TEXT")
//    private String outSerie;
//
//    @Column(name = "csl_tipo_ensino", columnDefinition = "TEXT")
//    private String outTipoEnsino;
//
//    @Column(name = "csl_transferido", columnDefinition = "TEXT")
//    private String outTransferido;
//
//    @Column(name = "csl_turma", columnDefinition = "TEXT")
//    private String outTurma;
//
//    @Column(name = "csl_turno", columnDefinition = "TEXT")
//    private String outTurno;
//
//    @Column(name = "csl_status", columnDefinition = "TEXT")
//    private String status;
//
//    @Column(name = "csl_tipo_classe", columnDefinition = "TEXT")
//    private String outTipoClasse;
//
//    @Column(name = "csl_serie_multisseriada", columnDefinition = "TEXT")
//    private String seriemulti;
//
//    @Column(name = "csl_tipo_ensina_multisseriada", columnDefinition = "TEXT")
//    private String tipoensinomulti;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getRa() {
//        return ra;
//    }
//
//    public void setRa(String ra) {
//        this.ra = ra;
//    }
//
//    public String getUf() {
//        return uf;
//    }
//
//    public void setUf(String uf) {
//        this.uf = uf;
//    }
//
//    public String getDigitoRA() {
//        return digitoRA;
//    }
//
//    public void setDigitoRA(String digitoRA) {
//        this.digitoRA = digitoRA;
//    }
//
//    public String getNomeAluno() {
//        return nomeAluno;
//    }
//
//    public void setNomeAluno(String nomeAluno) {
//        this.nomeAluno = nomeAluno;
//    }
//
//    public String getNumero() {
//        return numero;
//    }
//
//    public void setNumero(String numero) {
//        this.numero = numero;
//    }
//
//    public String getOutAbandono() {
//        return outAbandono;
//    }
//
//    public void setOutAbandono(String outAbandono) {
//        this.outAbandono = outAbandono;
//    }
//
//    public String getOutAno() {
//        return outAno;
//    }
//
//    public void setOutAno(String outAno) {
//        this.outAno = outAno;
//    }
//
//    public String getOutAtual() {
//        return outAtual;
//    }
//
//    public void setOutAtual(String outAtual) {
//        this.outAtual = outAtual;
//    }
//
//    public String getOutCadastrado() {
//        return outCadastrado;
//    }
//
//    public void setOutCadastrado(String outCadastrado) {
//        this.outCadastrado = outCadastrado;
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
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = outErro;
//    }
//
//    public String getOutHorario() {
//        return outHorario;
//    }
//
//    public void setOutHorario(String outHorario) {
//        this.outHorario = outHorario;
//    }
//
//    public String getOutNaoCompareceu() {
//        return outNaoCompareceu;
//    }
//
//    public void setOutNaoCompareceu(String outNaoCompareceu) {
//        this.outNaoCompareceu = outNaoCompareceu;
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
//    public String getOutNumClasse() {
//        return outNumClasse;
//    }
//
//    public void setOutNumClasse(String outNumClasse) {
//        this.outNumClasse = outNumClasse;
//    }
//
//    public String getOutNumSala() {
//        return outNumSala;
//    }
//
//    public void setOutNumSala(String outNumSala) {
//        this.outNumSala = outNumSala;
//    }
//
//    public String getOutOutros() {
//        return outOutros;
//    }
//
//    public void setOutOutros(String outOutros) {
//        this.outOutros = outOutros;
//    }
//
//    public String getOutRemanejado() {
//        return outRemanejado;
//    }
//
//    public void setOutRemanejado(String outRemanejado) {
//        this.outRemanejado = outRemanejado;
//    }
//
//    public String getOutSerie() {
//        return outSerie;
//    }
//
//    public void setOutSerie(String outSerie) {
//        this.outSerie = outSerie;
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
//    public String getOutTransferido() {
//        return outTransferido;
//    }
//
//    public void setOutTransferido(String outTransferido) {
//        this.outTransferido = outTransferido;
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
//    public String getStatus() {
//        return status;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
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
//    public String getSeriemulti() {
//        return seriemulti;
//    }
//
//    public void setSeriemulti(String seriemulti) {
//        this.seriemulti = seriemulti;
//    }
//
//    public String getTipoensinomulti() {
//        return tipoensinomulti;
//    }
//
//    public void setTipoensinomulti(String tipoensinomulti) {
//        this.tipoensinomulti = tipoensinomulti;
//    }
//}
