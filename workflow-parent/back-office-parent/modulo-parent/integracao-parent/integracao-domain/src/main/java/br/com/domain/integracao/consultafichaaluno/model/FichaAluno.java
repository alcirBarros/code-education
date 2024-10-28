//package br.com.domain.integracao.consultafichaaluno.model;
//
//import br.com.projeto.model.EntidadeSerialVersion;
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name = "fln_ficha_aluno")
//public class FichaAluno extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "fln_id")
//    private Integer id;
//
//    @Column(name = "fln_bairro", columnDefinition = "TEXT")
//    private String outBairro; //
//
//    @Column(name = "fln_baolsa_familia", columnDefinition = "TEXT")
//    private String outBolsaFamilia;//
//
//    @Column(name = "fln_cep", columnDefinition = "TEXT")
//    private String outCEP; //
//    
//    @Column(name = "fln_cpf", columnDefinition = "TEXT")
//    private String outCPF;//
//    
//    @Column(name = "fln_cidade", columnDefinition = "TEXT")
//    private String outCidade; //
//
////    private ArrayOfoutDeficienciasItemString outDeficiencias;
//    @Column(name = "fln_cod_pais_origem", columnDefinition = "TEXT")
//    private String outCodPaisOrigem;
//
//    @Column(name = "fln_cor_raca", columnDefinition = "TEXT")
//    private String outCorRaca;//
//
//    @Column(name = "fln_ddd", columnDefinition = "TEXT")
//    private String outDDD;
//
//    @Column(name = "fln_data_alteracao", columnDefinition = "TEXT")
//    private String outDataAlteracao;
//
//    @Column(name = "fln_data_emis_reg_nasc", columnDefinition = "TEXT")
//    private String outDataEmisRegNasc;
//
//    @Column(name = "fln_data_emissao_rg", columnDefinition = "TEXT")
//    private String outDataEmissaoRG;
//
//    @Column(name = "fln_data_entrada_brasil", columnDefinition = "TEXT")
//    private String outDataEntrBrasil; //
//
//    @Column(name = "fln_data_nascimento", columnDefinition = "TEXT")
//    private String outDataNascimento; //
//
//    @Column(name = "fln_desc_municipio", columnDefinition = "TEXT")
//    private String outDescMunNasc;
//
//    @Column(name = "fln_digito_ra", columnDefinition = "TEXT")
//    private String outDigitoRA; //
//
//    @Column(name = "fln_digito_rg", columnDefinition = "TEXT")
//    private String outDigitoRG;
//
//    @Column(name = "fln_endereco", columnDefinition = "TEXT")
//    private String outEndereco; //
//
//    @Column(name = "fln_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "fln_fone_recado", columnDefinition = "TEXT")
//    private String outFoneRecado; //
//
//    @Column(name = "fln_fone_residencial", columnDefinition = "TEXT")
//    private String outFoneResidencial;
//
//    @Column(name = "fln_gemeo", columnDefinition = "TEXT")
//    private String outGemeo;
//
//    @Column(name = "fln_ident_aluno_mec", columnDefinition = "TEXT")
//    private String outIdentAlunoMEC;
//
//    @Column(name = "fln_mobilidade_reduzida", columnDefinition = "TEXT")
//    private String outMobilidadeReduzida; //
//
//    @Column(name = "fln_nascionalidade", columnDefinition = "TEXT")
//    private String outNacionalidade; //
//
//    @Column(name = "fln_nome_aluno", columnDefinition = "TEXT")
//    private String outNomeAluno; //
//
//    @Column(name = "fln_nome_mae", columnDefinition = "TEXT")
//    private String outNomeMae; //
//
//    @Column(name = "fln_nome_pai", columnDefinition = "TEXT")
//    private String outNomePai; //
//
//    @Column(name = "fln_nome_pais_origem", columnDefinition = "TEXT")
//    private String outNomePaisOrigem;
//
//    @Column(name = "fln_num_nis", columnDefinition = "TEXT")
//    private String outNumNis;
//
//    @Column(name = "fln_num_rg", columnDefinition = "TEXT")
//    private String outNumRG; //
//
//    @Column(name = "fln_num_registro_nascimento", columnDefinition = "TEXT")
//    private String outNumRegNasc;
//
//    @Column(name = "fln_observacao_recado", columnDefinition = "TEXT")
//    private String outObsRecado;
//
//    @Column(name = "fln_operador", columnDefinition = "TEXT")
//    private String outOperador;
//
//    @Column(name = "fln_ra", columnDefinition = "TEXT")
//    private String outRA; //
//
//    @Column(name = "fln_sexo", columnDefinition = "TEXT")
//    private String outSexo; //
//
//    @Column(name = "fln_uf", columnDefinition = "TEXT")
//    private String outUF;
//
//    @Column(name = "fln_uf_nascimento", columnDefinition = "TEXT")
//    private String outUFNascimento;//
//
//    @Column(name = "fln_uf_ra", columnDefinition = "TEXT")
//    private String outUFRA;
//
//    @Column(name = "fln_uf_rg", columnDefinition = "TEXT")
//    private String outUFRG;
//
//    @Column(name = "fln_zona", columnDefinition = "TEXT")
//    private String outZona;
//
//    @Transient
//    private TipoCertidaoResp outCertidaoResp;
//
//    @Column(name = "fln_auxilio_leitor", columnDefinition = "TEXT")
//    private String outAuxilioLeitor;
//
//    @Column(name = "fln_auxilio_transcricao", columnDefinition = "TEXT")
//    private String outAuxilioTranscricao;
//
//    @Column(name = "fln_ddd_cel", columnDefinition = "TEXT")
//    private String outDDDCel;
//
//    @Column(name = "fln_fone_cel", columnDefinition = "TEXT")
//    private String outFoneCel;//
//
//    @Column(name = "fln_guia_interprete", columnDefinition = "TEXT")
//    private String outGuiaInterprete;
//
//    @Column(name = "fln_interprete_libras", columnDefinition = "TEXT")
//    private String outInterpreteLibras;
//
//    @Column(name = "fln_leitura_labial", columnDefinition = "TEXT")
//    private String outLeituraLabial;
//
//    @Column(name = "fln_nenhum", columnDefinition = "TEXT")
//    private String outNenhum;
//
//    @Column(name = "fln_prova_ampliada", columnDefinition = "TEXT")
//    private String outProvaAmpliada;
//
//    @Column(name = "fln_prova_brasil", columnDefinition = "TEXT")
//    private String outProvaBraile;
//
//    @Column(name = "fln_sms", columnDefinition = "TEXT")
//    private String outSMS;
//
//    @Column(name = "fln_tam_dezesseis", columnDefinition = "TEXT")
//    private String outTam16;
//
//    @Column(name = "fln_tam_vinte", columnDefinition = "TEXT")
//    private String outTam20;
//
//    @Column(name = "fln_tamaho_vinte_quatro", columnDefinition = "TEXT")
//    private String outTam24;
//
//    @Column(name = "fln_cuidador", columnDefinition = "TEXT")
//    private String outCuidador;
//
//    @Column(name = "fln_email", columnDefinition = "TEXT")
//    private String outEmail; //
//
//    @Column(name = "fln_irmao", columnDefinition = "TEXT")
//    private String outIrmaos;
//
//    @Column(name = "fln_nome_social", columnDefinition = "TEXT")
//    private String outNomeSocial;
//
//    @Column(name = "fln_profissional_saude", columnDefinition = "TEXT")
//    private String outProfisSaude;
//
//    @Column(name = "fln_quilombola", columnDefinition = "TEXT")
//    private String outQuilombola; //
//
//    @Column(name = "fln_latitude", columnDefinition = "TEXT")
//    private String outLatitude;
//
//    @Column(name = "fln_longitude", columnDefinition = "TEXT")
//    private String outLongitude;
//
//    @Column(name = "fln_logradouro", columnDefinition = "TEXT")
//    private String outLogradouro;
//
//    @Column(name = "fln_numero", columnDefinition = "TEXT")
//    private String outNumero; //
//
//    @Column(name = "fln_complemento", columnDefinition = "TEXT")
//    private String outComplemento; //
//
//    @Transient
//    private FichaAlunoEndIndicativo outEndIndicativo;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//    
//    public String getOutBairro() {
//        return outBairro;
//    }
//
//    public void setOutBairro(String outBairro) {
//        this.outBairro = (outBairro != null && outBairro.trim().equals("")) ? null : outBairro;
//    }
//
//    public String getOutBolsaFamilia() {
//        return outBolsaFamilia;
//    }
//
//    public void setOutBolsaFamilia(String outBolsaFamilia) {
//        this.outBolsaFamilia = (outBolsaFamilia != null && outBolsaFamilia.trim().equals("")) ? null : outBolsaFamilia;
//    }
//
//    public String getOutCEP() {
//        return outCEP;
//    }
//
//    public void setOutCEP(String outCEP) {
//        this.outCEP = (outCEP != null && outCEP.trim().equals("")) ? null : outCEP;
//    }
//
//    public String getOutCPF() {
//        return outCPF;
//    }
//
//    public void setOutCPF(String outCPF) {
//        this.outCPF = (outCPF != null && outCPF.trim().equals("")) ? null : outCPF;
//    }
//
//    public String getOutCidade() {
//        return outCidade;
//    }
//
//    public void setOutCidade(String outCidade) {
//        this.outCidade = (outCidade != null && outCidade.trim().equals("")) ? null : outCidade;
//    }
//
//    public String getOutCodPaisOrigem() {
//        return outCodPaisOrigem;
//    }
//
//    public void setOutCodPaisOrigem(String outCodPaisOrigem) {
//        this.outCodPaisOrigem = (outCodPaisOrigem != null && outCodPaisOrigem.trim().equals("")) ? null : outCodPaisOrigem;
//    }
//
//    public String getOutCorRaca() {
//        return outCorRaca;
//    }
//
//    public void setOutCorRaca(String outCorRaca) {
//        this.outCorRaca = (outCorRaca != null && outCorRaca.trim().equals("")) ? null : outCorRaca;
//    }
//
//    public String getOutDDD() {
//        return outDDD;
//    }
//
//    public void setOutDDD(String outDDD) {
//        this.outDDD = (outDDD != null && outDDD.trim().equals("")) ? null : outDDD;
//    }
//
//    public String getOutDataAlteracao() {
//        return outDataAlteracao;
//    }
//
//    public void setOutDataAlteracao(String outDataAlteracao) {
//        this.outDataAlteracao = (outDataAlteracao != null && outDataAlteracao.trim().equals("")) ? null : outDataAlteracao;
//    }
//
//    public String getOutDataEmisRegNasc() {
//        return outDataEmisRegNasc;
//    }
//
//    public void setOutDataEmisRegNasc(String outDataEmisRegNasc) {
//        this.outDataEmisRegNasc = (outDataEmisRegNasc != null && outDataEmisRegNasc.trim().equals("")) ? null : outDataEmisRegNasc;
//    }
//
//    public String getOutDataEmissaoRG() {
//        return outDataEmissaoRG;
//    }
//
//    public void setOutDataEmissaoRG(String outDataEmissaoRG) {
//        this.outDataEmissaoRG = (outDataEmissaoRG != null && outDataEmissaoRG.trim().equals("")) ? null : outDataEmissaoRG;
//    }
//
//    public String getOutDataEntrBrasil() {
//        return outDataEntrBrasil;
//    }
//
//    public void setOutDataEntrBrasil(String outDataEntrBrasil) {
//        this.outDataEntrBrasil = (outDataEntrBrasil != null && outDataEntrBrasil.trim().equals("")) ? null : outDataEntrBrasil;
//    }
//
//    public String getOutDataNascimento() {
//        return outDataNascimento;
//    }
//
//    public void setOutDataNascimento(String outDataNascimento) {
//        this.outDataNascimento = (outDataNascimento != null && outDataNascimento.trim().equals("")) ? null : outDataNascimento;
//    }
//
//    public String getOutDescMunNasc() {
//        return outDescMunNasc;
//    }
//
//    public void setOutDescMunNasc(String outDescMunNasc) {
//        this.outDescMunNasc = (outDescMunNasc != null && outDescMunNasc.trim().equals("")) ? null : outDescMunNasc;
//    }
//
//    public String getOutDigitoRA() {
//        return outDigitoRA;
//    }
//
//    public void setOutDigitoRA(String outDigitoRA) {
//        this.outDigitoRA = (outDigitoRA != null && outDigitoRA.trim().equals("")) ? null : outDigitoRA;
//    }
//
//    public String getOutDigitoRG() {
//        return outDigitoRG;
//    }
//
//    public void setOutDigitoRG(String outDigitoRG) {
//        this.outDigitoRG = (outDigitoRG != null && outDigitoRG.trim().equals("")) ? null : outDigitoRG;
//    }
//
//    public String getOutEndereco() {
//        return outEndereco;
//    }
//
//    public void setOutEndereco(String outEndereco) {
//        this.outEndereco = (outEndereco != null && outEndereco.trim().equals("")) ? null : outEndereco;
//    }
//
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = (outErro != null && outErro.trim().equals("")) ? null : outErro;
//    }
//
//    public String getOutFoneRecado() {
//        return outFoneRecado;
//    }
//
//    public void setOutFoneRecado(String outFoneRecado) {
//        this.outFoneRecado = (outFoneRecado != null && outFoneRecado.trim().equals("")) ? null : outFoneRecado;
//    }
//
//    public String getOutFoneResidencial() {
//        return outFoneResidencial;
//    }
//
//    public void setOutFoneResidencial(String outFoneResidencial) {
//        this.outFoneResidencial = (outFoneResidencial != null && outFoneResidencial.trim().equals("")) ? null : outFoneResidencial;
//    }
//
//    public String getOutGemeo() {
//        return outGemeo;
//    }
//
//    public void setOutGemeo(String outGemeo) {
//        this.outGemeo = (outGemeo != null && outGemeo.trim().equals("")) ? null : outGemeo;
//    }
//
//    public String getOutIdentAlunoMEC() {
//        return outIdentAlunoMEC;
//    }
//
//    public void setOutIdentAlunoMEC(String outIdentAlunoMEC) {
//        this.outIdentAlunoMEC = (outIdentAlunoMEC != null && outIdentAlunoMEC.trim().equals("")) ? null : outIdentAlunoMEC;
//    }
//
//    public String getOutMobilidadeReduzida() {
//        return outMobilidadeReduzida;
//    }
//
//    public void setOutMobilidadeReduzida(String outMobilidadeReduzida) {
//        this.outMobilidadeReduzida = (outMobilidadeReduzida != null && outMobilidadeReduzida.trim().equals("")) ? null : outMobilidadeReduzida;
//    }
//
//    public String getOutNacionalidade() {
//        return outNacionalidade;
//    }
//
//    public void setOutNacionalidade(String outNacionalidade) {
//        this.outNacionalidade = (outNacionalidade != null && outNacionalidade.trim().equals("")) ? null : outNacionalidade;
//    }
//
//    public String getOutNomeAluno() {
//        return outNomeAluno;
//    }
//
//    public void setOutNomeAluno(String outNomeAluno) {
//        this.outNomeAluno = (outNomeAluno != null && outNomeAluno.trim().equals("")) ? null : outNomeAluno;
//    }
//
//    public String getOutNomeMae() {
//        return outNomeMae;
//    }
//
//    public void setOutNomeMae(String outNomeMae) {
//        this.outNomeMae = (outNomeMae != null && outNomeMae.trim().equals("")) ? null : outNomeMae;
//    }
//
//    public String getOutNomePai() {
//        return outNomePai;
//    }
//
//    public void setOutNomePai(String outNomePai) {
//        this.outNomePai = (outNomePai != null && outNomePai.trim().equals("")) ? null : outNomePai;
//    }
//
//    public String getOutNomePaisOrigem() {
//        return outNomePaisOrigem;
//    }
//
//    public void setOutNomePaisOrigem(String outNomePaisOrigem) {
//        this.outNomePaisOrigem = (outNomePaisOrigem != null && outNomePaisOrigem.trim().equals("")) ? null : outNomePaisOrigem;
//    }
//
//    public String getOutNumNis() {
//        return outNumNis;
//    }
//
//    public void setOutNumNis(String outNumNis) {
//        this.outNumNis = (outNumNis != null && outNumNis.trim().equals("")) ? null : outNumNis;
//    }
//
//    public String getOutNumRG() {
//        return outNumRG;
//    }
//
//    public void setOutNumRG(String outNumRG) {
//        this.outNumRG = (outNumRG != null && outNumRG.trim().equals("")) ? null : outNumRG;
//    }
//
//    public String getOutNumRegNasc() {
//        return outNumRegNasc;
//    }
//
//    public void setOutNumRegNasc(String outNumRegNasc) {
//        this.outNumRegNasc = (outNumRegNasc != null && outNumRegNasc.trim().equals("")) ? null : outNumRegNasc;
//    }
//
//    public String getOutObsRecado() {
//        return outObsRecado;
//    }
//
//    public void setOutObsRecado(String outObsRecado) {
//        this.outObsRecado = (outObsRecado != null && outObsRecado.trim().equals("")) ? null : outObsRecado;
//    }
//
//    public String getOutOperador() {
//        return outOperador;
//    }
//
//    public void setOutOperador(String outOperador) {
//        this.outOperador = (outOperador != null && outOperador.trim().equals("")) ? null : outOperador;
//    }
//
//    public String getOutRA() {
//        return outRA;
//    }
//
//    public void setOutRA(String outRA) {
//        this.outRA = (outRA != null && outRA.trim().equals("")) ? null : outRA;
//    }
//
//    public String getOutSexo() {
//        return outSexo;
//    }
//
//    public void setOutSexo(String outSexo) {
//        this.outSexo = (outSexo != null && outSexo.trim().equals("")) ? null : outSexo;
//    }
//
//    public String getOutUF() {
//        return outUF;
//    }
//
//    public void setOutUF(String outUF) {
//        this.outUF = (outUF != null && outUF.trim().equals("")) ? null : outUF;
//    }
//
//    public String getOutUFNascimento() {
//        return outUFNascimento;
//    }
//
//    public void setOutUFNascimento(String outUFNascimento) {
//        this.outUFNascimento = (outUFNascimento != null && outUFNascimento.trim().equals("")) ? null : outUFNascimento;
//    }
//
//    public String getOutUFRA() {
//        return outUFRA;
//    }
//
//    public void setOutUFRA(String outUFRA) {
//        this.outUFRA = (outUFRA != null && outUFRA.trim().equals("")) ? null : outUFRA;
//    }
//
//    public String getOutUFRG() {
//        return outUFRG;
//    }
//
//    public void setOutUFRG(String outUFRG) {
//        this.outUFRG = (outUFRG != null && outUFRG.trim().equals("")) ? null : outUFRG;
//    }
//
//    public String getOutZona() {
//        return outZona;
//    }
//
//    public void setOutZona(String outZona) {
//        this.outZona = (outZona != null && outZona.trim().equals("")) ? null : outZona;
//    }
//
//    public TipoCertidaoResp getOutCertidaoResp() {
//        return outCertidaoResp;
//    }
//
//    public void setOutCertidaoResp(TipoCertidaoResp outCertidaoResp) {
//        this.outCertidaoResp = outCertidaoResp;
//    }
//
//    public String getOutAuxilioLeitor() {
//        return outAuxilioLeitor;
//    }
//
//    public void setOutAuxilioLeitor(String outAuxilioLeitor) {
//        this.outAuxilioLeitor = (outAuxilioLeitor != null && outAuxilioLeitor.trim().equals("")) ? null : outAuxilioLeitor;
//    }
//
//    public String getOutAuxilioTranscricao() {
//        return outAuxilioTranscricao;
//    }
//
//    public void setOutAuxilioTranscricao(String outAuxilioTranscricao) {
//        this.outAuxilioTranscricao = (outAuxilioTranscricao != null && outAuxilioTranscricao.trim().equals("")) ? null : outAuxilioTranscricao;
//    }
//
//    public String getOutDDDCel() {
//        return outDDDCel;
//    }
//
//    public void setOutDDDCel(String outDDDCel) {
//        this.outDDDCel = (outDDDCel != null && outDDDCel.trim().equals("")) ? null : outDDDCel;
//    }
//
//    public String getOutFoneCel() {
//        return outFoneCel;
//    }
//
//    public void setOutFoneCel(String outFoneCel) {
//        this.outFoneCel = (outFoneCel != null && outFoneCel.trim().equals("")) ? null : outFoneCel;
//    }
//
//    public String getOutGuiaInterprete() {
//        return outGuiaInterprete;
//    }
//
//    public void setOutGuiaInterprete(String outGuiaInterprete) {
//        this.outGuiaInterprete = (outGuiaInterprete != null && outGuiaInterprete.trim().equals("")) ? null : outGuiaInterprete;
//    }
//
//    public String getOutInterpreteLibras() {
//        return outInterpreteLibras;
//    }
//
//    public void setOutInterpreteLibras(String outInterpreteLibras) {
//        this.outInterpreteLibras = (outInterpreteLibras != null && outInterpreteLibras.trim().equals("")) ? null : outInterpreteLibras;
//    }
//
//    public String getOutLeituraLabial() {
//        return outLeituraLabial;
//    }
//
//    public void setOutLeituraLabial(String outLeituraLabial) {
//        this.outLeituraLabial = (outLeituraLabial != null && outLeituraLabial.trim().equals("")) ? null : outLeituraLabial;
//    }
//
//    public String getOutNenhum() {
//        return outNenhum;
//    }
//
//    public void setOutNenhum(String outNenhum) {
//        this.outNenhum = (outNenhum != null && outNenhum.trim().equals("")) ? null : outNenhum;
//    }
//
//    public String getOutProvaAmpliada() {
//        return outProvaAmpliada;
//    }
//
//    public void setOutProvaAmpliada(String outProvaAmpliada) {
//        this.outProvaAmpliada = (outProvaAmpliada != null && outProvaAmpliada.trim().equals("")) ? null : outProvaAmpliada;
//    }
//
//    public String getOutProvaBraile() {
//        return outProvaBraile;
//    }
//
//    public void setOutProvaBraile(String outProvaBraile) {
//        this.outProvaBraile = (outProvaBraile != null && outProvaBraile.trim().equals("")) ? null : outProvaBraile;
//    }
//
//    public String getOutSMS() {
//        return outSMS;
//    }
//
//    public void setOutSMS(String outSMS) {
//        this.outSMS = (outSMS != null && outSMS.trim().equals("")) ? null : outSMS;
//    }
//
//    public String getOutTam16() {
//        return outTam16;
//    }
//
//    public void setOutTam16(String outTam16) {
//        this.outTam16 = (outTam16 != null && outTam16.trim().equals("")) ? null : outTam16;
//    }
//
//    public String getOutTam20() {
//        return outTam20;
//    }
//
//    public void setOutTam20(String outTam20) {
//        this.outTam20 = (outTam20 != null && outTam20.trim().equals("")) ? null : outTam20;
//    }
//
//    public String getOutTam24() {
//        return outTam24;
//    }
//
//    public void setOutTam24(String outTam24) {
//        this.outTam24 = (outTam24 != null && outTam24.trim().equals("")) ? null : outTam24;
//    }
//
//    public String getOutCuidador() {
//        return outCuidador;
//    }
//
//    public void setOutCuidador(String outCuidador) {
//        this.outCuidador = (outCuidador != null && outCuidador.trim().equals("")) ? null : outCuidador;
//    }
//
//    public String getOutEmail() {
//        return outEmail;
//    }
//
//    public void setOutEmail(String outEmail) {
//        this.outEmail = (outEmail != null && outEmail.trim().equals("")) ? null : outEmail;
//    }
//
//    public String getOutIrmaos() {
//        return outIrmaos;
//    }
//
//    public void setOutIrmaos(String outIrmaos) {
//        this.outIrmaos = (outIrmaos != null && outIrmaos.trim().equals("")) ? null : outIrmaos;
//    }
//
//    public String getOutNomeSocial() {
//        return outNomeSocial;
//    }
//
//    public void setOutNomeSocial(String outNomeSocial) {
//        this.outNomeSocial = (outNomeSocial != null && outNomeSocial.trim().equals("")) ? null : outNomeSocial;
//    }
//
//    public String getOutProfisSaude() {
//        return outProfisSaude;
//    }
//
//    public void setOutProfisSaude(String outProfisSaude) {
//        this.outProfisSaude = (outProfisSaude != null && outProfisSaude.trim().equals("")) ? null : outProfisSaude;
//    }
//
//    public String getOutQuilombola() {
//        return outQuilombola;
//    }
//
//    public void setOutQuilombola(String outQuilombola) {
//        this.outQuilombola = (outQuilombola != null && outQuilombola.trim().equals("")) ? null : outQuilombola;
//    }
//
//    public String getOutLatitude() {
//        return outLatitude;
//    }
//
//    public void setOutLatitude(String outLatitude) {
//        this.outLatitude = (outLatitude != null && outLatitude.trim().equals("")) ? null : outLatitude;
//    }
//
//    public String getOutLongitude() {
//        return outLongitude;
//    }
//
//    public void setOutLongitude(String outLongitude) {
//        this.outLongitude = (outLongitude != null && outLongitude.trim().equals("")) ? null : outLongitude;
//    }
//
//    public String getOutLogradouro() {
//        return outLogradouro;
//    }
//
//    public void setOutLogradouro(String outLogradouro) {
//        this.outLogradouro = (outLogradouro != null && outLogradouro.trim().equals("")) ? null : outLogradouro;
//    }
//
//    public String getOutNumero() {
//        return outNumero;
//    }
//
//    public void setOutNumero(String outNumero) {
//        this.outNumero = (outNumero != null && outNumero.trim().equals("")) ? null : outNumero;
//    }
//
//    public String getOutComplemento() {
//        return outComplemento;
//    }
//
//    public void setOutComplemento(String outComplemento) {
//        this.outComplemento = (outComplemento != null && outComplemento.trim().equals("")) ? null : outComplemento;
//    }
//
//    public FichaAlunoEndIndicativo getOutEndIndicativo() {
//        return outEndIndicativo;
//    }
//
//    public void setOutEndIndicativo(FichaAlunoEndIndicativo outEndIndicativo) {
//        this.outEndIndicativo = outEndIndicativo;
//    }
//}
