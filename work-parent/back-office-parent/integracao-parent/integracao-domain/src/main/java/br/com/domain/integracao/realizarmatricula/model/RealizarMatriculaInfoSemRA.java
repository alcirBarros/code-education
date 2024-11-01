//package br.com.domain.integracao.realizarmatricula.model;
//
//import br.com.domain.auxiliar.tiponacionalidade.model.TipoNacionalidade;
//import br.com.domain.auxiliar.tiporacacor.model.TipoRacaCor;
//import br.com.domain.auxiliar.tiposexo.model.TipoSexo;
//import br.com.domain.prodesp.ProdespHeader;
//import java.io.Serializable;
//import java.util.Date;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//import javax.persistence.Temporal;
//
//@Entity
//@Table(name = "rsr_realizar_matricula_sem_registro_aluno")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_rsr_pdh_id"))})
//public class RealizarMatriculaInfoSemRA extends ProdespHeader implements Serializable {
//
//    @Column(name = "rsr_nome_aluno", length = 60)
//    private String inNomeAluno;
//
//    @Column(name = "rsr_nome_sicial", length = 50)
//    private String inNomeSocial;
//    
//    
//
//    @Column(name = "rsr_numero_classe", length = 9)
//    private String inNumClasse;
//
//    @Column(name = "rsr_numero_aluno", length = 2)
//    private String inNumAluno;
//
//    @Column(name = "rsr_data_matricula", length = 2)
//    private String inDataMatricula;
//
//    @Column(name = "rsr_mes_matricula", length = 2)
//    private String inMesMatricula;
//
//    @Column(name = "rsr_ano", length = 4)
//    private String inAno;
//
////    @Column(name = "rsr_sexo", length = 1)
////    private String inSexo;
//    @ManyToOne
//    @JoinColumn(name = "sxo_id")
//    private TipoSexo tipoSexo;
//
////    @Column(name = "rsr_raca_cor", length = 2)
////    private String inCorRaca;
//    @ManyToOne
//    @JoinColumn(name = "rcr_id")
//    private TipoRacaCor tipoRacaCor;
//
//    /*
//    Data dataNascimento
//        Substistuindo atributos.
//            -inDiaNascimento
//            -inMesNascimento
//            -inAnoNascimento
//        Por 
//            -dataNascimento  
//     */
//    @Column(name = "rsr_data_nascimento")
//    @Temporal(javax.persistence.TemporalType.DATE)
//    private Date dataNascimento;
//
//    @Column(name = "rsr_nome_mae", length = 60)
//    private String inNomeMae;
//
//    @Column(name = "rsr_nome_pai", length = 60)
//    private String inNomePai;
//
//    /*
//    Nacionalidade
//        Substistuindo o atributo.
//            -inNacionalidade
//        Por 
//            -nacionalidade  
//     */
//    @ManyToOne
//    @JoinColumn(name = "ncd_id")
//    private TipoNacionalidade tipoNacionalidade;
//
//    /*
//    * Deve ser nulo para inNacionalidade=”1” ou “3”;
//    *
//    * Obrigatório para inNacionalidade=”2”;
//     */
//    @Column(name = "rsr_pais_origem", length = 40)
//    private String inPaisOrigem;
//
//    /*
//    Data entrada no brasil
//        Substistuindo atributos.
//            -inDiaEntBrasil
//            -inMesEntBrasil
//            -inAnoEntBrasil
//        Por 
//            -dataEntradaBrasil  
//     */
//    @Column(name = "rsr_data_entrada_brasil")
//    @Temporal(javax.persistence.TemporalType.DATE)
//    private Date dataEntradaBrasil;
//
//    @Column(name = "rsr_rgrne01", length = 14)
//    private String inRGRNE01;
//
//    @Column(name = "rsr_rgrne02", length = 2)
//    private String inRGRNE02;
//
//    @Column(name = "rsr_rgrne03", length = 2)
//    private String inRGRNE03;
//
//    @Column(name = "rsr_dia_emissao", length = 2)
//    private String inDiaEmissao;
//
//    @Column(name = "rsr_mes_emissao", length = 2)
//    private String inMesEmissao;
//
//    @Column(name = "rsr_ano_emissao", length = 4)
//    private String inAnoEmissao;
//
//    @Column(name = "rsr_bolsa_familia", length = 1)
//    private String inBolsaFamilia;
//
//    @Column(name = "rsr_necesita_educacao_especial", length = 1)
//    private String inNecEducEspecial;
//
//    @Column(name = "rsr_multipla", length = 1)
//    private String inMultipla;
//
//    @Column(name = "rsr_cegueira", length = 1)
//    private String inCegueira;
//
//    @Column(name = "rsr_baixa_visao", length = 1)
//    private String inBaixaVisao;
//
//    @Column(name = "rsr_surdez_severa_profunda", length = 1)
//    private String inSurdezSeveraProfunda;
//
//    @Column(name = "rsr_surdez_leve_moderada", length = 1)
//    private String inSurdezLeveModerada;
//
//    @Column(name = "rsr_surdocegueira", length = 1)
//    private String inSurdocegueira;
//
//    @Column(name = "rsr_fisica_paralisia_cereblal", length = 1)
//    private String inFisicaParalisiaCerebral;
//
//    @Column(name = "rsr_fisica_cadeirante", length = 1)
//    private String inFisicaCadeirante;
//
//    @Column(name = "rsr_fisica_outros", length = 1)
//    private String inFisicaOutros;
//
//    @Column(name = "rsr_sindrome_down", length = 1)
//    private String inSindromeDown;
//
//    @Column(name = "rsr_intelectual", length = 1)
//    private String inIntelectual;
//
//    @Column(name = "rsr_autista_classico", length = 1)
//    private String inAutistaClassico;
//
//    @Column(name = "rsr_sindrome_asperger", length = 1)
//    private String inSindromeAsperger;
//
//    @Column(name = "rsr_sindrome_rett", length = 1)
//    private String inSindromeRett;
//
//    @Column(name = "rsr_trans_desintegrativo_inf", length = 1)
//    private String inTransDesintegrativoInf;
//
//    @Column(name = "rsr_altas_habilidades_superdotacao", length = 1)
//    private String inAltasHabSuperdotacao;
//
//    @Column(name = "rsr_tipo_log", length = 1)
//    private String inTipLog;
//
//    @Column(name = "rsr_complemento", length = 13)
//    private String inComplemento;
//
//    @Column(name = "rsr_ddd", length = 2)
//    private String inDDD;
//
//    @Column(name = "rsr_fone_residencial", length = 9)
//    private String inFoneResidencial;
//
//    @Column(name = "rsr_fone_recado", length = 9)
//    private String inFoneRecados;
//
//    @Column(name = "rsr_nome_fone_recado", length = 10)
//    private String inNomeFoneRecado;
//
//    @Column(name = "rsr_municipio_nascimento", length = 22)
//    private String inMunicipioNasc;
//
//    @Column(name = "rsr_uf_nascimento", length = 2)
//    private String inUFNasc;
//
////    @Column(name = "rsr_gemeo")
////    private String inGemeo;
////
////    @Column(name = "rsr_irmao_registro_aluno")
////    private String inIrmaoRA;
//    @JoinColumn(name = "cta_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private CertidaoAntiga certidaoAntiga;
//
//    @JoinColumn(name = "cnv_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private CertidaoNova certidaoNova;
//
//    @Column(name = "rsr_serie_ano", length = 2)
//    private String inSerieAno;
//
//    @Column(name = "rsr_tipo_ensino", length = 2)
//    private String inTipoEnsino;
//
//    @Column(name = "rsr_permanente", length = 1)
//    private String inPermanente;
//
//    @Column(name = "rsr_temporaria", length = 1)
//    private String inTemporaria;
//
//    @Column(name = "rsr_mobilidade_reduzida", length = 1)
//    private String inMobilidadeReduzida;
//
//    @Column(name = "rsr_auxilio_leitor", length = 1)
//    private String inAuxilioLeitor;
//
//    @Column(name = "rsr_auxilio_transcricao", length = 1)
//    private String inAuxilioTranscricao;
//
//    @Column(name = "rsr_guia_interprete", length = 1)
//    private String inGuiaInterprete;
//
//    @Column(name = "rsr_interprete_libras", length = 1)
//    private String inInterpreteLibras;
//
//    @Column(name = "rsr_leitura_labial", length = 1)
//    private String inLeituraLabial;
//
//    @Column(name = "rsr_nenhum", length = 1)
//    private String inNenhum;
//
//    @Column(name = "rsr_prova_ampliada", length = 1)
//    private String inProvaAmpliada;
//
//    @Column(name = "rsr_prova_braile", length = 1)
//    private String inProvaBraile;
//
//    @Column(name = "rsr_tam16", length = 1)
//    private String inTam16;
//
//    @Column(name = "rsr_tam20", length = 1)
//    private String inTam20;
//
//    @Column(name = "rsr_tam24", length = 1)
//    private String inTam24;
//
//    @Column(name = "rsr_ddd_cel", length = 2)
//    private String inDDDCel;
//
//    @Column(name = "rsr_fone_cel", length = 9)
//    private String inFoneCel;
//
//    @Column(name = "rsr_sms", length = 1)
//    private String inSMS;
//
//    @Column(name = "rsr_email", length = 40)
//    private String inEmail;
//
////    @Column(name = "rsr_irmao")
////    private String inIrmao;
//    @Column(name = "rsr_quilombola", length = 1)
//    private String inQuilombola;
//
//    /*
//    * É obrigatória a informação caso osseguintes documentos não sejam informados:
//    - Numero do NIS
//    - CPF
//    - Certidão de Nascimento (Nova ou Antiga)
//     */
//    @Column(name = "rsr_justificativa_documento", length = 1)
//    private String inJustificativaDocumentos;
//
//    @Column(name = "rsr_cpf", length = 11)
//    private String inCPF;
//
//    @Column(name = "rsr_numero_identificacao_social", length = 11)
//    private String inNumNIS;
//
//    @JoinColumn(name = "enc_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private EndIndicativo endIndicativo;
//
//    @JoinColumn(name = "rmr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private RealizarMatriculaInfoSemRAResponse response;
//
//    public static RealizarMatriculaInfoSemRA criarInstancia() {
//        return new RealizarMatriculaInfoSemRA();
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
//    public String getInNumClasse() {
//        return inNumClasse;
//    }
//
//    public void setInNumClasse(String inNumClasse) {
//        this.inNumClasse = inNumClasse;
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
//    public String getInDataMatricula() {
//        return inDataMatricula;
//    }
//
//    public void setInDataMatricula(String inDataMatricula) {
//        this.inDataMatricula = inDataMatricula;
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
//    public String getInNomeAluno() {
//        return inNomeAluno;
//    }
//
//    public void setInNomeAluno(String inNomeAluno) {
//        this.inNomeAluno = inNomeAluno;
//    }
//
//    public TipoSexo getTipoSexo() {
//        return tipoSexo;
//    }
//
//    public void setTipoSexo(TipoSexo tipoSexo) {
//        this.tipoSexo = tipoSexo;
//    }
//
//    public TipoRacaCor getTipoRacaCor() {
//        return tipoRacaCor;
//    }
//
//    public void setTipoRacaCor(TipoRacaCor tipoRacaCor) {
//        this.tipoRacaCor = tipoRacaCor;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
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
//    public TipoNacionalidade getTipoNacionalidade() {
//        return tipoNacionalidade;
//    }
//
//    public void setTipoNacionalidade(TipoNacionalidade tipoNacionalidade) {
//        this.tipoNacionalidade = tipoNacionalidade;
//    }
//
//    public String getInPaisOrigem() {
//        return inPaisOrigem;
//    }
//
//    public void setInPaisOrigem(String inPaisOrigem) {
//        this.inPaisOrigem = inPaisOrigem;
//    }
//
//    public Date getDataEntradaBrasil() {
//        return dataEntradaBrasil;
//    }
//
//    public void setDataEntradaBrasil(Date dataEntradaBrasil) {
//        this.dataEntradaBrasil = dataEntradaBrasil;
//    }
//
//    public String getInRGRNE01() {
//        return inRGRNE01;
//    }
//
//    public void setInRGRNE01(String inRGRNE01) {
//        this.inRGRNE01 = inRGRNE01;
//    }
//
//    public String getInRGRNE02() {
//        return inRGRNE02;
//    }
//
//    public void setInRGRNE02(String inRGRNE02) {
//        this.inRGRNE02 = inRGRNE02;
//    }
//
//    public String getInRGRNE03() {
//        return inRGRNE03;
//    }
//
//    public void setInRGRNE03(String inRGRNE03) {
//        this.inRGRNE03 = inRGRNE03;
//    }
//
//    public String getInDiaEmissao() {
//        return inDiaEmissao;
//    }
//
//    public void setInDiaEmissao(String inDiaEmissao) {
//        this.inDiaEmissao = inDiaEmissao;
//    }
//
//    public String getInMesEmissao() {
//        return inMesEmissao;
//    }
//
//    public void setInMesEmissao(String inMesEmissao) {
//        this.inMesEmissao = inMesEmissao;
//    }
//
//    public String getInAnoEmissao() {
//        return inAnoEmissao;
//    }
//
//    public void setInAnoEmissao(String inAnoEmissao) {
//        this.inAnoEmissao = inAnoEmissao;
//    }
//
//    public String getInNumNIS() {
//        return inNumNIS;
//    }
//
//    public void setInNumNIS(String inNumNIS) {
//        this.inNumNIS = inNumNIS;
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
//    public String getInNecEducEspecial() {
//        return inNecEducEspecial;
//    }
//
//    public void setInNecEducEspecial(String inNecEducEspecial) {
//        this.inNecEducEspecial = inNecEducEspecial;
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
//    public String getInCegueira() {
//        return inCegueira;
//    }
//
//    public void setInCegueira(String inCegueira) {
//        this.inCegueira = inCegueira;
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
//    public String getInSurdezSeveraProfunda() {
//        return inSurdezSeveraProfunda;
//    }
//
//    public void setInSurdezSeveraProfunda(String inSurdezSeveraProfunda) {
//        this.inSurdezSeveraProfunda = inSurdezSeveraProfunda;
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
//    public String getInSurdocegueira() {
//        return inSurdocegueira;
//    }
//
//    public void setInSurdocegueira(String inSurdocegueira) {
//        this.inSurdocegueira = inSurdocegueira;
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
//    public String getInSindromeDown() {
//        return inSindromeDown;
//    }
//
//    public void setInSindromeDown(String inSindromeDown) {
//        this.inSindromeDown = inSindromeDown;
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
//    public String getInAutistaClassico() {
//        return inAutistaClassico;
//    }
//
//    public void setInAutistaClassico(String inAutistaClassico) {
//        this.inAutistaClassico = inAutistaClassico;
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
//    public String getInSindromeRett() {
//        return inSindromeRett;
//    }
//
//    public void setInSindromeRett(String inSindromeRett) {
//        this.inSindromeRett = inSindromeRett;
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
//    public String getInAltasHabSuperdotacao() {
//        return inAltasHabSuperdotacao;
//    }
//
//    public void setInAltasHabSuperdotacao(String inAltasHabSuperdotacao) {
//        this.inAltasHabSuperdotacao = inAltasHabSuperdotacao;
//    }
//
//    public String getInTipLog() {
//        return inTipLog;
//    }
//
//    public void setInTipLog(String inTipLog) {
//        this.inTipLog = inTipLog;
//    }
//
//    public String getInComplemento() {
//        return inComplemento;
//    }
//
//    public void setInComplemento(String inComplemento) {
//        this.inComplemento = inComplemento;
//    }
//
//    public String getInDDD() {
//        return inDDD;
//    }
//
//    public void setInDDD(String inDDD) {
//        this.inDDD = inDDD;
//    }
//
//    public String getInFoneResidencial() {
//        return inFoneResidencial;
//    }
//
//    public void setInFoneResidencial(String inFoneResidencial) {
//        this.inFoneResidencial = inFoneResidencial;
//    }
//
//    public String getInFoneRecados() {
//        return inFoneRecados;
//    }
//
//    public void setInFoneRecados(String inFoneRecados) {
//        this.inFoneRecados = inFoneRecados;
//    }
//
//    public String getInNomeFoneRecado() {
//        return inNomeFoneRecado;
//    }
//
//    public void setInNomeFoneRecado(String inNomeFoneRecado) {
//        this.inNomeFoneRecado = inNomeFoneRecado;
//    }
//
//    public String getInMunicipioNasc() {
//        return inMunicipioNasc;
//    }
//
//    public void setInMunicipioNasc(String inMunicipioNasc) {
//        this.inMunicipioNasc = inMunicipioNasc;
//    }
//
//    public String getInUFNasc() {
//        return inUFNasc;
//    }
//
//    public void setInUFNasc(String inUFNasc) {
//        this.inUFNasc = inUFNasc;
//    }
//
//    public CertidaoAntiga getCertidaoAntiga() {
//        return certidaoAntiga;
//    }
//
//    public void setCertidaoAntiga(CertidaoAntiga certidaoAntiga) {
//        this.certidaoAntiga = certidaoAntiga;
//    }
//
//    public CertidaoNova getCertidaoNova() {
//        return certidaoNova;
//    }
//
//    public void setCertidaoNova(CertidaoNova certidaoNova) {
//        this.certidaoNova = certidaoNova;
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
//    public String getInCPF() {
//        return inCPF;
//    }
//
//    public void setInCPF(String inCPF) {
//        this.inCPF = inCPF;
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
//    public String getInProvaAmpliada() {
//        return inProvaAmpliada;
//    }
//
//    public void setInProvaAmpliada(String inProvaAmpliada) {
//        this.inProvaAmpliada = inProvaAmpliada;
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
//    public String getInEmail() {
//        return inEmail;
//    }
//
//    public void setInEmail(String inEmail) {
//        this.inEmail = inEmail;
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
//    public EndIndicativo getEndIndicativo() {
//        return endIndicativo;
//    }
//
//    public void setEndIndicativo(EndIndicativo endIndicativo) {
//        this.endIndicativo = endIndicativo;
//    }
//
//    public RealizarMatriculaInfoSemRAResponse getResponse() {
//        return response;
//    }
//
//    public void setResponse(RealizarMatriculaInfoSemRAResponse response) {
//        this.response = response;
//    }
//}
