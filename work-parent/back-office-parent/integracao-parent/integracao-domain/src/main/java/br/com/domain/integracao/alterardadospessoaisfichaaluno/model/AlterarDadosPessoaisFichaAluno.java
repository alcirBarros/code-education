//package br.com.domain.integracao.alterardadospessoaisfichaaluno.model;
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
//@Table(name = "afa_alterar_dados_pessoais_ficha_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_afa_pdh_id"))})
//public class AlterarDadosPessoaisFichaAluno extends ProdespHeader implements Serializable {
//
//    @Column(name = "afa_registro_aluno", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "afa_ano_nascimento", columnDefinition = "TEXT")
//    private String inAnoNascimento;
//
//    @Column(name = "afa_bolsa_familia", columnDefinition = "TEXT")
//    private String inBolsaFamilia;
//
//    @Column(name = "afa_cor_raca", columnDefinition = "TEXT")
//    private String inCorRaca;
//
//    @Column(name = "afa_dia_nascimento", columnDefinition = "TEXT")
//    private String inDiaNascimento;
//
//    @Column(name = "afa_mes_nascimento", columnDefinition = "TEXT")
//    private String inMesNascimento;
//
//    @Column(name = "afa_nec_especial", columnDefinition = "TEXT")
//    private String inNecEspecial;
//
//    @Column(name = "afa_nome_aluno", columnDefinition = "TEXT")
//    private String inNomeAluno;
//
//    @Column(name = "afa_nome_mae", columnDefinition = "TEXT")
//    private String inNomeMae;
//
//    @Column(name = "afa_nome_pai", columnDefinition = "TEXT")
//    private String inNomePai;
//
//    @Column(name = "afa_sexo", columnDefinition = "TEXT")
//    private String inSexo;
//
//    @Column(name = "afa_altas_hab_super_dotacao", columnDefinition = "TEXT")
//    private String inAltasHabSuperdotacao;
//
//    @Column(name = "afa_autisca_classico", columnDefinition = "TEXT")
//    private String inAutistaClassico;
//
//    @Column(name = "afa_baixa_visao", columnDefinition = "TEXT")
//    private String inBaixaVisao;
//
//    @Column(name = "afa_cegueira", columnDefinition = "TEXT")
//    private String inCegueira;
//
//    @Column(name = "afa_fisica_cadeirante", columnDefinition = "TEXT")
//    private String inFisicaCadeirante;
//
//    @Column(name = "afa_fisica_outros", columnDefinition = "TEXT")
//    private String inFisicaOutros;
//
//    @Column(name = "afa_fisica_paralisia_cerebral", columnDefinition = "TEXT")
//    private String inFisicaParalisiaCerebral;
//
//    @Column(name = "afa_intelectual", columnDefinition = "TEXT")
//    private String inIntelectual;
//
//    @Column(name = "afa_multipla", columnDefinition = "TEXT")
//    private String inMultipla;
//
//    @Column(name = "afa_sindrome_asperger", columnDefinition = "TEXT")
//    private String inSindromeAsperger;
//
//    @Column(name = "afa_sindrome_down", columnDefinition = "TEXT")
//    private String inSindromeDown;
//
//    @Column(name = "afa_sindrome_rett", columnDefinition = "TEXT")
//    private String inSindromeRett;
//
//    @Column(name = "afa_surdez_leve_moderada", columnDefinition = "TEXT")
//    private String inSurdezLeveModerada;
//
//    @Column(name = "afa_surcez_severa_profunda", columnDefinition = "TEXT")
//    private String inSurdezSeveraProfunda;
//
//    @Column(name = "afa_surdocegueira", columnDefinition = "TEXT")
//    private String inSurdocegueira;
//
//    @Column(name = "afa_trans_desintegrativo_inf", columnDefinition = "TEXT")
//    private String inTransDesintegrativoInf;
//
//    @Column(name = "afa_gemeo", columnDefinition = "TEXT")
//    private String inGemeo = "N";
//
//    @Column(name = "afa_irmao_registro_aluno", columnDefinition = "TEXT")
//    private String inIrmaoRA;
//
//    @Column(name = "afa_permanente", columnDefinition = "TEXT")
//    private String inPermanente;
//
//    @Column(name = "afa_temporaria", columnDefinition = "TEXT")
//    private String inTemporaria;
//
//    @Column(name = "afa_mobilidade_reduzida", columnDefinition = "TEXT")
//    private String inMobilidadeReduzida = "N";
//
//    @Column(name = "afa_digito_registro_aluno", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//    @Column(name = "afa_uf_registro_aluno", columnDefinition = "TEXT")
//    private String inUFRA;
//
//    @Column(name = "afa_auxilio_leitor", columnDefinition = "TEXT")
//    private String inAuxilioLeitor;
//
//    @Column(name = "afa_lna_registro_aluno", columnDefinition = "TEXT")
//    private String inAuxilioTranscricao;
//
//    @Column(name = "afa_guia_interprete", columnDefinition = "TEXT")
//    private String inGuiaInterprete;
//
//    @Column(name = "afa_interprete_libras", columnDefinition = "TEXT")
//    private String inInterpreteLibras;
//
//    @Column(name = "afa_leitura_labial", columnDefinition = "TEXT")
//    private String inLeituraLabial;
//
//    @Column(name = "afa_nenhum", columnDefinition = "TEXT")
//    private String inNenhum;
//
//    @Column(name = "afa_prava_brasil", columnDefinition = "TEXT")
//    private String inProvaBraile;
//
//    @Column(name = "afa_prova_ampliada", columnDefinition = "TEXT")
//    private String inProvaAmpliada;
//
//    @Column(name = "afa_tam_16", columnDefinition = "TEXT")
//    private String inTam16;
//
//    @Column(name = "afa_tam_20", columnDefinition = "TEXT")
//    private String inTam20;
//
//    @Column(name = "afa_tam_24", columnDefinition = "TEXT")
//    private String inTam24;
//
//    @Column(name = "afa_nome_social", columnDefinition = "TEXT")
//    private String inNomeSocial;
//
//    @Column(name = "afa_quilombola", columnDefinition = "TEXT")
//    private String inQuilombola;
//
//    @Column(name = "afa_email", columnDefinition = "TEXT")
//    private String inEmail;
//
//    @Column(name = "afa_irmao_uf_registro_aluno", columnDefinition = "TEXT")
//    private String inIrmaoUFRA;
//
//    @Column(name = "afa_irmao_digito_registro_aluno", columnDefinition = "TEXT")
//    private String inIrmaoDigitoRA;
//
//    @JoinColumn(name = "lcr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private AlterarDadosPessoaisFichaAlunoResponse alterarDadosPessoaisFichaAlunoResponse;
//
//    public static AlterarDadosPessoaisFichaAluno criarInstancia() {
//        AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno = new AlterarDadosPessoaisFichaAluno();
//        return alterarDadosPessoaisFichaAluno;
//    }
//
//    public static AlterarDadosPessoaisFichaAluno setNull(AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno) {
//        return alterarDadosPessoaisFichaAluno;
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
//    public String getInAnoNascimento() {
//        return inAnoNascimento;
//    }
//
//    public void setInAnoNascimento(String inAnoNascimento) {
//        this.inAnoNascimento = inAnoNascimento;
//    }
//
//    public String getInBolsaFamilia() {
//        return inBolsaFamilia;
//    }
//
//    public void setInBolsaFamilia(String inBolsaFamilia) {
//        this.inBolsaFamilia = inBolsaFamilia;
//    }
//
//    public String getInCorRaca() {
//        return inCorRaca;
//    }
//
//    public void setInCorRaca(String inCorRaca) {
//        this.inCorRaca = inCorRaca;
//    }
//
//    public String getInDiaNascimento() {
//        return inDiaNascimento;
//    }
//
//    public void setInDiaNascimento(String inDiaNascimento) {
//        this.inDiaNascimento = inDiaNascimento;
//    }
//
//    public String getInMesNascimento() {
//        return inMesNascimento;
//    }
//
//    public void setInMesNascimento(String inMesNascimento) {
//        this.inMesNascimento = inMesNascimento;
//    }
//
//    public String getInNecEspecial() {
//        return inNecEspecial;
//    }
//
//    public void setInNecEspecial(String inNecEspecial) {
//        this.inNecEspecial = inNecEspecial;
//    }
//
//    public String getInNomeAluno() {
//        return inNomeAluno;
//    }
//
//    public void setInNomeAluno(String inNomeAluno) {
//        this.inNomeAluno = inNomeAluno;
//    }
//
//    public String getInNomeMae() {
//        return inNomeMae;
//    }
//
//    public void setInNomeMae(String inNomeMae) {
//        this.inNomeMae = inNomeMae;
//    }
//
//    public String getInNomePai() {
//        return inNomePai;
//    }
//
//    public void setInNomePai(String inNomePai) {
//        this.inNomePai = inNomePai;
//    }
//
//    public String getInSexo() {
//        return inSexo;
//    }
//
//    public void setInSexo(String inSexo) {
//        this.inSexo = inSexo;
//    }
//
//    public String getInAltasHabSuperdotacao() {
//        return inAltasHabSuperdotacao;
//    }
//
//    public void setInAltasHabSuperdotacao(String inAltasHabSuperdotacao) {
//        this.inAltasHabSuperdotacao = inAltasHabSuperdotacao;
//    }
//
//    public String getInAutistaClassico() {
//        return inAutistaClassico;
//    }
//
//    public void setInAutistaClassico(String inAutistaClassico) {
//        this.inAutistaClassico = inAutistaClassico;
//    }
//
//    public String getInBaixaVisao() {
//        return inBaixaVisao;
//    }
//
//    public void setInBaixaVisao(String inBaixaVisao) {
//        this.inBaixaVisao = inBaixaVisao;
//    }
//
//    public String getInCegueira() {
//        return inCegueira;
//    }
//
//    public void setInCegueira(String inCegueira) {
//        this.inCegueira = inCegueira;
//    }
//
//    public String getInFisicaCadeirante() {
//        return inFisicaCadeirante;
//    }
//
//    public void setInFisicaCadeirante(String inFisicaCadeirante) {
//        this.inFisicaCadeirante = inFisicaCadeirante;
//    }
//
//    public String getInFisicaOutros() {
//        return inFisicaOutros;
//    }
//
//    public void setInFisicaOutros(String inFisicaOutros) {
//        this.inFisicaOutros = inFisicaOutros;
//    }
//
//    public String getInFisicaParalisiaCerebral() {
//        return inFisicaParalisiaCerebral;
//    }
//
//    public void setInFisicaParalisiaCerebral(String inFisicaParalisiaCerebral) {
//        this.inFisicaParalisiaCerebral = inFisicaParalisiaCerebral;
//    }
//
//    public String getInIntelectual() {
//        return inIntelectual;
//    }
//
//    public void setInIntelectual(String inIntelectual) {
//        this.inIntelectual = inIntelectual;
//    }
//
//    public String getInMultipla() {
//        return inMultipla;
//    }
//
//    public void setInMultipla(String inMultipla) {
//        this.inMultipla = inMultipla;
//    }
//
//    public String getInSindromeAsperger() {
//        return inSindromeAsperger;
//    }
//
//    public void setInSindromeAsperger(String inSindromeAsperger) {
//        this.inSindromeAsperger = inSindromeAsperger;
//    }
//
//    public String getInSindromeDown() {
//        return inSindromeDown;
//    }
//
//    public void setInSindromeDown(String inSindromeDown) {
//        this.inSindromeDown = inSindromeDown;
//    }
//
//    public String getInSindromeRett() {
//        return inSindromeRett;
//    }
//
//    public void setInSindromeRett(String inSindromeRett) {
//        this.inSindromeRett = inSindromeRett;
//    }
//
//    public String getInSurdezLeveModerada() {
//        return inSurdezLeveModerada;
//    }
//
//    public void setInSurdezLeveModerada(String inSurdezLeveModerada) {
//        this.inSurdezLeveModerada = inSurdezLeveModerada;
//    }
//
//    public String getInSurdezSeveraProfunda() {
//        return inSurdezSeveraProfunda;
//    }
//
//    public void setInSurdezSeveraProfunda(String inSurdezSeveraProfunda) {
//        this.inSurdezSeveraProfunda = inSurdezSeveraProfunda;
//    }
//
//    public String getInSurdocegueira() {
//        return inSurdocegueira;
//    }
//
//    public void setInSurdocegueira(String inSurdocegueira) {
//        this.inSurdocegueira = inSurdocegueira;
//    }
//
//    public String getInTransDesintegrativoInf() {
//        return inTransDesintegrativoInf;
//    }
//
//    public void setInTransDesintegrativoInf(String inTransDesintegrativoInf) {
//        this.inTransDesintegrativoInf = inTransDesintegrativoInf;
//    }
//
//    public String getInGemeo() {
//        return inGemeo;
//    }
//
//    public void setInGemeo(String inGemeo) {
//        this.inGemeo = inGemeo;
//    }
//
//    public String getInIrmaoRA() {
//        return inIrmaoRA;
//    }
//
//    public void setInIrmaoRA(String inIrmaoRA) {
//        this.inIrmaoRA = inIrmaoRA;
//    }
//
//    public String getInPermanente() {
//        return inPermanente;
//    }
//
//    public void setInPermanente(String inPermanente) {
//        this.inPermanente = inPermanente;
//    }
//
//    public String getInTemporaria() {
//        return inTemporaria;
//    }
//
//    public void setInTemporaria(String inTemporaria) {
//        this.inTemporaria = inTemporaria;
//    }
//
//    public String getInMobilidadeReduzida() {
//        return inMobilidadeReduzida;
//    }
//
//    public void setInMobilidadeReduzida(String inMobilidadeReduzida) {
//        this.inMobilidadeReduzida = inMobilidadeReduzida;
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
//    public String getInUFRA() {
//        return inUFRA;
//    }
//
//    public void setInUFRA(String inUFRA) {
//        this.inUFRA = inUFRA;
//    }
//
//    public String getInAuxilioLeitor() {
//        return inAuxilioLeitor;
//    }
//
//    public void setInAuxilioLeitor(String inAuxilioLeitor) {
//        this.inAuxilioLeitor = inAuxilioLeitor;
//    }
//
//    public String getInAuxilioTranscricao() {
//        return inAuxilioTranscricao;
//    }
//
//    public void setInAuxilioTranscricao(String inAuxilioTranscricao) {
//        this.inAuxilioTranscricao = inAuxilioTranscricao;
//    }
//
//    public String getInGuiaInterprete() {
//        return inGuiaInterprete;
//    }
//
//    public void setInGuiaInterprete(String inGuiaInterprete) {
//        this.inGuiaInterprete = inGuiaInterprete;
//    }
//
//    public String getInInterpreteLibras() {
//        return inInterpreteLibras;
//    }
//
//    public void setInInterpreteLibras(String inInterpreteLibras) {
//        this.inInterpreteLibras = inInterpreteLibras;
//    }
//
//    public String getInLeituraLabial() {
//        return inLeituraLabial;
//    }
//
//    public void setInLeituraLabial(String inLeituraLabial) {
//        this.inLeituraLabial = inLeituraLabial;
//    }
//
//    public String getInNenhum() {
//        return inNenhum;
//    }
//
//    public void setInNenhum(String inNenhum) {
//        this.inNenhum = inNenhum;
//    }
//
//    public String getInProvaBraile() {
//        return inProvaBraile;
//    }
//
//    public void setInProvaBraile(String inProvaBraile) {
//        this.inProvaBraile = inProvaBraile;
//    }
//
//    public String getInProvaAmpliada() {
//        return inProvaAmpliada;
//    }
//
//    public void setInProvaAmpliada(String inProvaAmpliada) {
//        this.inProvaAmpliada = inProvaAmpliada;
//    }
//
//    public String getInTam16() {
//        return inTam16;
//    }
//
//    public void setInTam16(String inTam16) {
//        this.inTam16 = inTam16;
//    }
//
//    public String getInTam20() {
//        return inTam20;
//    }
//
//    public void setInTam20(String inTam20) {
//        this.inTam20 = inTam20;
//    }
//
//    public String getInTam24() {
//        return inTam24;
//    }
//
//    public void setInTam24(String inTam24) {
//        this.inTam24 = inTam24;
//    }
//
//    public String getInNomeSocial() {
//        return inNomeSocial;
//    }
//
//    public void setInNomeSocial(String inNomeSocial) {
//        this.inNomeSocial = inNomeSocial;
//    }
//
//    public String getInQuilombola() {
//        return inQuilombola;
//    }
//
//    public void setInQuilombola(String inQuilombola) {
//        this.inQuilombola = inQuilombola;
//    }
//
//    public String getInEmail() {
//        return inEmail;
//    }
//
//    public void setInEmail(String inEmail) {
//        this.inEmail = inEmail;
//    }
//
//    public String getInIrmaoUFRA() {
//        return inIrmaoUFRA;
//    }
//
//    public void setInIrmaoUFRA(String inIrmaoUFRA) {
//        this.inIrmaoUFRA = inIrmaoUFRA;
//    }
//
//    public String getInIrmaoDigitoRA() {
//        return inIrmaoDigitoRA;
//    }
//
//    public void setInIrmaoDigitoRA(String inIrmaoDigitoRA) {
//        this.inIrmaoDigitoRA = inIrmaoDigitoRA;
//    }
//
//    public AlterarDadosPessoaisFichaAlunoResponse getAlterarDadosPessoaisFichaAlunoResponse() {
//        return alterarDadosPessoaisFichaAlunoResponse;
//    }
//
//    public void setAlterarDadosPessoaisFichaAlunoResponse(AlterarDadosPessoaisFichaAlunoResponse alterarDadosPessoaisFichaAlunoResponse) {
//        this.alterarDadosPessoaisFichaAlunoResponse = alterarDadosPessoaisFichaAlunoResponse;
//    }
//}