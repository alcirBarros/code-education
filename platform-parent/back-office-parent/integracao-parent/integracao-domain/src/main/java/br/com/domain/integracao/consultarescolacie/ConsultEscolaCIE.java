//package br.com.domain.integracao.consultarescolacie;
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
//@Table(name = "csc_consultar_escola_cie")
//public class ConsultEscolaCIE extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "csc_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "csc_ano_letivo", columnDefinition = "TEXT")
//    protected String outAnoLetivo;
//
//    @Column(name = "csc_ano_munc", columnDefinition = "TEXT")
//    protected String outAnoMunc;
//
//    @Column(name = "csc_bairro", columnDefinition = "TEXT")
//    protected String outBairro;
//
//    @Column(name = "csc_caixa_postal", columnDefinition = "TEXT")
//    protected String outCaixaPostal;
//
//    @Column(name = "csc_categoria_escola", columnDefinition = "TEXT")
//    protected String outCategoriaEscola;
//
//    @Column(name = "csc_cep", columnDefinition = "TEXT")
//    protected String outCep;
//
//    @Column(name = "csc_cep_caixa_postal", columnDefinition = "TEXT")
//    protected String outCepCaixaPostal;
//
//    @Column(name = "csc_codigo_distrito", columnDefinition = "TEXT")
//    protected String outCodDistrito;
//
//    @Column(name = "csc_codigo_escola_municipio", columnDefinition = "TEXT")
//    protected String outCodEscMun;
//
//    @Column(name = "csc_codigo_escola", columnDefinition = "TEXT")
//    protected String outCodEscola;
//
//    @Column(name = "csc_codigo_escola_vinculadora", columnDefinition = "TEXT")
//    protected String outCodEscolaVinc;
//
//    @Column(name = "csc_codigo_identificacao_municipio", columnDefinition = "TEXT")
//    protected String outCodIdentMunicipio;
//
//    @Column(name = "csc_codigo_unidade_administrativa", columnDefinition = "TEXT")
//    protected String outCodUnidAdm;
//
//    @Column(name = "csc_data_alterecao", columnDefinition = "TEXT")
//    protected String outDataAlteracao;
//
//    @Column(name = "csc_codigo_ddd_escola", columnDefinition = "TEXT")
//    protected String outDDD;
//
//    @Column(name = "csc_desc_adicional", columnDefinition = "TEXT")
//    protected String outDescAdicional;
//
//    @Column(name = "csc_descricao_dependencia_administrativa", columnDefinition = "TEXT")
//    protected String outDescDepAdm;
//
//    @Column(name = "csc_descricao_diretoria_01", columnDefinition = "TEXT")
//    protected String outDescDiretoria01;
//
//    @Column(name = "csc_descricao_diretoria_02", columnDefinition = "TEXT")
//    protected String outDescDiretoria02;
//
//    @Column(name = "csc_descricao_ensino_01", columnDefinition = "TEXT")
//    protected String outDescEnsino01;
//
//    @Column(name = "csc_descricao_ensino_02", columnDefinition = "TEXT")
//    protected String outDescEnsino02;
//
//    @Column(name = "csc_descricao_ensino_03", columnDefinition = "TEXT")
//    protected String outDescEnsino03;
//
//    @Column(name = "csc_descricao_ensino_04", columnDefinition = "TEXT")
//    protected String outDescEnsino04;
//
//    @Column(name = "csc_descricao_ensino_05", columnDefinition = "TEXT")
//    protected String outDescEnsino05;
//
//    @Column(name = "csc_descricao_ensino_06", columnDefinition = "TEXT")
//    protected String outDescEnsino06;
//
//    @Column(name = "csc_descricao_ensino_07", columnDefinition = "TEXT")
//    protected String outDescEnsino07;
//
//    @Column(name = "csc_descricao_ensino_08", columnDefinition = "TEXT")
//    protected String outDescEnsino08;
//
//    @Column(name = "csc_descricao_rendimento", columnDefinition = "TEXT")
//    protected String outDescRendimento;
//
//    @Column(name = "csc_descricao_tipo_escola", columnDefinition = "TEXT")
//    protected String outDescTipoEscola;
//
//    @Column(name = "csc_data_fim_digitar_rendimento", columnDefinition = "TEXT")
//    protected String outDtFimDigRendimento;
//
//    @Column(name = "csc_email_escola", columnDefinition = "TEXT")
//    protected String outEmail;
//
//    @Column(name = "csc_endereco", columnDefinition = "TEXT")
//    protected String outEndereco;
//
//    @Column(name = "csc_endereco_zona", columnDefinition = "TEXT")
//    protected String outEndZona;
//
//    @Column(name = "csc_fax_escola", columnDefinition = "TEXT")
//    protected String outFax;
//
//    @Column(name = "csc_codigo_unidade", columnDefinition = "TEXT")
//    protected String outLitCodUnid;
//
//    @Column(name = "csc_lit_mun", columnDefinition = "TEXT")
//    protected String outLitMun;
//
//    @Column(name = "csc_lit_vinc", columnDefinition = "TEXT")
//    protected String outLitVinc;
//
//    @Column(name = "csc_nome_abreviado_escola", columnDefinition = "TEXT")
//    protected String outNomeAbrEscola;
//
//    @Column(name = "csc_nome_abreviado_escola_vinculadora", columnDefinition = "TEXT")
//    protected String outNomeAbrEscolaVinc;
//
//    @Column(name = "csc_nome_abreviado_municipio", columnDefinition = "TEXT")
//    protected String outNomeAbrMunicipio;
//
//    @Column(name = "csc_nome_distrito", columnDefinition = "TEXT")
//    protected String outNomeDistrito;
//
//    @Column(name = "csc_nome_escola", columnDefinition = "TEXT")
//    protected String outNomeEscola;
//
//    @Column(name = "csc_numero_caixa_postal", columnDefinition = "TEXT")
//    protected String outNumCaixaPostal;
//
//    @Column(name = "csc_numero_diretoria_01", columnDefinition = "TEXT")
//    protected String outNumDiretoria01;
//
//    @Column(name = "csc_numero_diretoria_02", columnDefinition = "TEXT")
//    protected String outNumDiretoria02;
//
//    @Column(name = "csc_prog_pai", columnDefinition = "TEXT")
//    protected String outProgPAI;
//
//    @Column(name = "csc_situacao_escola", columnDefinition = "TEXT")
//    protected String outSitEscola;
//
//    @Column(name = "csc_telefone_escola_01", columnDefinition = "TEXT")
//    protected String outTelefone01;
//
//    @Column(name = "csc_telefone_escola_02", columnDefinition = "TEXT")
//    protected String outTelefone02;
//
//    @Column(name = "csc_codigo_tipo_escola", columnDefinition = "TEXT")
//    protected String outTipoEscola;
//
//    @Column(name = "csc_quantidade_aluno", columnDefinition = "TEXT")
//    protected String aluno;
//
//    @Column(name = "csc_ano_historico_escolar", columnDefinition = "TEXT")
//    protected String ano;
//
//    @Column(name = "csc_quanidade_classe", columnDefinition = "TEXT")
//    protected String classe;
//
//    @Column(name = "csc_quantidade_aluno_ensino_especial", columnDefinition = "TEXT")
//    protected String educEspec;
//
//    @Column(name = "csc_quantidade_aluno_ensino_fundamental_eja", columnDefinition = "TEXT")
//    protected String ejaFund;
//
//    @Column(name = "csc_quantidade_aluno_ensino_medio_eja", columnDefinition = "TEXT")
//    protected String ejaMedio;
//
//    @Column(name = "csc_quantidade_aluno_ensino_fundamental_1a4", columnDefinition = "TEXT")
//    protected String fundamental1A4;
//
//    @Column(name = "csc_quantidade_aluno_ensino_fundamental_5a8", columnDefinition = "TEXT")
//    protected String fundamental5A8;
//
//    @Column(name = "csc_quantidade_aluno_ensino_fundamental_9", columnDefinition = "TEXT")
//    protected String fundamental9;
//
//    @Column(name = "csc_quantidade_aluno_ensino_medio", columnDefinition = "TEXT")
//    protected String medio;
//
//    @Column(name = "csc_quantidade_aluno_outro_tipo_ensino", columnDefinition = "TEXT")
//    protected String outros;
//
//    @Column(name = "csc_erro", columnDefinition = "TEXT")
//    protected String outErro;
//
//    @Column(name = "csc_total_area_construida_escola", columnDefinition = "TEXT")
//    protected String outConstr;
//
//    @Column(name = "csc_rede_fisica", columnDefinition = "TEXT")
//    protected String outRedeFisica;
//
//    @Column(name = "csc_quantidade_aluno_educacao_infantil", columnDefinition = "TEXT")
//    protected String educinfantil;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOutAnoLetivo() {
//        return outAnoLetivo;
//    }
//
//    public void setOutAnoLetivo(String outAnoLetivo) {
//        this.outAnoLetivo = outAnoLetivo;
//    }
//
//    public String getOutAnoMunc() {
//        return outAnoMunc;
//    }
//
//    public void setOutAnoMunc(String outAnoMunc) {
//        this.outAnoMunc = outAnoMunc;
//    }
//
//    public String getOutBairro() {
//        return outBairro;
//    }
//
//    public void setOutBairro(String outBairro) {
//        this.outBairro = outBairro;
//    }
//
//    public String getOutCaixaPostal() {
//        return outCaixaPostal;
//    }
//
//    public void setOutCaixaPostal(String outCaixaPostal) {
//        this.outCaixaPostal = outCaixaPostal;
//    }
//
//    public String getOutCategoriaEscola() {
//        return outCategoriaEscola;
//    }
//
//    public void setOutCategoriaEscola(String outCategoriaEscola) {
//        this.outCategoriaEscola = outCategoriaEscola;
//    }
//
//    public String getOutCep() {
//        return outCep;
//    }
//
//    public void setOutCep(String outCep) {
//        this.outCep = outCep;
//    }
//
//    public String getOutCepCaixaPostal() {
//        return outCepCaixaPostal;
//    }
//
//    public void setOutCepCaixaPostal(String outCepCaixaPostal) {
//        this.outCepCaixaPostal = outCepCaixaPostal;
//    }
//
//    public String getOutCodDistrito() {
//        return outCodDistrito;
//    }
//
//    public void setOutCodDistrito(String outCodDistrito) {
//        this.outCodDistrito = outCodDistrito;
//    }
//
//    public String getOutCodEscMun() {
//        return outCodEscMun;
//    }
//
//    public void setOutCodEscMun(String outCodEscMun) {
//        this.outCodEscMun = outCodEscMun;
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
//    public String getOutCodEscolaVinc() {
//        return outCodEscolaVinc;
//    }
//
//    public void setOutCodEscolaVinc(String outCodEscolaVinc) {
//        this.outCodEscolaVinc = outCodEscolaVinc;
//    }
//
//    public String getOutCodIdentMunicipio() {
//        return outCodIdentMunicipio;
//    }
//
//    public void setOutCodIdentMunicipio(String outCodIdentMunicipio) {
//        this.outCodIdentMunicipio = outCodIdentMunicipio;
//    }
//
//    public String getOutCodUnidAdm() {
//        return outCodUnidAdm;
//    }
//
//    public void setOutCodUnidAdm(String outCodUnidAdm) {
//        this.outCodUnidAdm = outCodUnidAdm;
//    }
//
//    public String getOutDataAlteracao() {
//        return outDataAlteracao;
//    }
//
//    public void setOutDataAlteracao(String outDataAlteracao) {
//        this.outDataAlteracao = outDataAlteracao;
//    }
//
//    public String getOutDDD() {
//        return outDDD;
//    }
//
//    public void setOutDDD(String outDDD) {
//        this.outDDD = outDDD;
//    }
//
//    public String getOutDescAdicional() {
//        return outDescAdicional;
//    }
//
//    public void setOutDescAdicional(String outDescAdicional) {
//        this.outDescAdicional = outDescAdicional;
//    }
//
//    public String getOutDescDepAdm() {
//        return outDescDepAdm;
//    }
//
//    public void setOutDescDepAdm(String outDescDepAdm) {
//        this.outDescDepAdm = outDescDepAdm;
//    }
//
//    public String getOutDescDiretoria01() {
//        return outDescDiretoria01;
//    }
//
//    public void setOutDescDiretoria01(String outDescDiretoria01) {
//        this.outDescDiretoria01 = outDescDiretoria01;
//    }
//
//    public String getOutDescDiretoria02() {
//        return outDescDiretoria02;
//    }
//
//    public void setOutDescDiretoria02(String outDescDiretoria02) {
//        this.outDescDiretoria02 = outDescDiretoria02;
//    }
//
//    public String getOutDescEnsino01() {
//        return outDescEnsino01;
//    }
//
//    public void setOutDescEnsino01(String outDescEnsino01) {
//        this.outDescEnsino01 = outDescEnsino01;
//    }
//
//    public String getOutDescEnsino02() {
//        return outDescEnsino02;
//    }
//
//    public void setOutDescEnsino02(String outDescEnsino02) {
//        this.outDescEnsino02 = outDescEnsino02;
//    }
//
//    public String getOutDescEnsino03() {
//        return outDescEnsino03;
//    }
//
//    public void setOutDescEnsino03(String outDescEnsino03) {
//        this.outDescEnsino03 = outDescEnsino03;
//    }
//
//    public String getOutDescEnsino04() {
//        return outDescEnsino04;
//    }
//
//    public void setOutDescEnsino04(String outDescEnsino04) {
//        this.outDescEnsino04 = outDescEnsino04;
//    }
//
//    public String getOutDescEnsino05() {
//        return outDescEnsino05;
//    }
//
//    public void setOutDescEnsino05(String outDescEnsino05) {
//        this.outDescEnsino05 = outDescEnsino05;
//    }
//
//    public String getOutDescEnsino06() {
//        return outDescEnsino06;
//    }
//
//    public void setOutDescEnsino06(String outDescEnsino06) {
//        this.outDescEnsino06 = outDescEnsino06;
//    }
//
//    public String getOutDescEnsino07() {
//        return outDescEnsino07;
//    }
//
//    public void setOutDescEnsino07(String outDescEnsino07) {
//        this.outDescEnsino07 = outDescEnsino07;
//    }
//
//    public String getOutDescEnsino08() {
//        return outDescEnsino08;
//    }
//
//    public void setOutDescEnsino08(String outDescEnsino08) {
//        this.outDescEnsino08 = outDescEnsino08;
//    }
//
//    public String getOutDescRendimento() {
//        return outDescRendimento;
//    }
//
//    public void setOutDescRendimento(String outDescRendimento) {
//        this.outDescRendimento = outDescRendimento;
//    }
//
//    public String getOutDescTipoEscola() {
//        return outDescTipoEscola;
//    }
//
//    public void setOutDescTipoEscola(String outDescTipoEscola) {
//        this.outDescTipoEscola = outDescTipoEscola;
//    }
//
//    public String getOutDtFimDigRendimento() {
//        return outDtFimDigRendimento;
//    }
//
//    public void setOutDtFimDigRendimento(String outDtFimDigRendimento) {
//        this.outDtFimDigRendimento = outDtFimDigRendimento;
//    }
//
//    public String getOutEmail() {
//        return outEmail;
//    }
//
//    public void setOutEmail(String outEmail) {
//        this.outEmail = outEmail;
//    }
//
//    public String getOutEndereco() {
//        return outEndereco;
//    }
//
//    public void setOutEndereco(String outEndereco) {
//        this.outEndereco = outEndereco;
//    }
//
//    public String getOutEndZona() {
//        return outEndZona;
//    }
//
//    public void setOutEndZona(String outEndZona) {
//        this.outEndZona = outEndZona;
//    }
//
//    public String getOutFax() {
//        return outFax;
//    }
//
//    public void setOutFax(String outFax) {
//        this.outFax = outFax;
//    }
//
//    public String getOutLitCodUnid() {
//        return outLitCodUnid;
//    }
//
//    public void setOutLitCodUnid(String outLitCodUnid) {
//        this.outLitCodUnid = outLitCodUnid;
//    }
//
//    public String getOutLitMun() {
//        return outLitMun;
//    }
//
//    public void setOutLitMun(String outLitMun) {
//        this.outLitMun = outLitMun;
//    }
//
//    public String getOutLitVinc() {
//        return outLitVinc;
//    }
//
//    public void setOutLitVinc(String outLitVinc) {
//        this.outLitVinc = outLitVinc;
//    }
//
//    public String getOutNomeAbrEscola() {
//        return outNomeAbrEscola;
//    }
//
//    public void setOutNomeAbrEscola(String outNomeAbrEscola) {
//        this.outNomeAbrEscola = outNomeAbrEscola;
//    }
//
//    public String getOutNomeAbrEscolaVinc() {
//        return outNomeAbrEscolaVinc;
//    }
//
//    public void setOutNomeAbrEscolaVinc(String outNomeAbrEscolaVinc) {
//        this.outNomeAbrEscolaVinc = outNomeAbrEscolaVinc;
//    }
//
//    public String getOutNomeAbrMunicipio() {
//        return outNomeAbrMunicipio;
//    }
//
//    public void setOutNomeAbrMunicipio(String outNomeAbrMunicipio) {
//        this.outNomeAbrMunicipio = outNomeAbrMunicipio;
//    }
//
//    public String getOutNomeDistrito() {
//        return outNomeDistrito;
//    }
//
//    public void setOutNomeDistrito(String outNomeDistrito) {
//        this.outNomeDistrito = outNomeDistrito;
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
//    public String getOutNumCaixaPostal() {
//        return outNumCaixaPostal;
//    }
//
//    public void setOutNumCaixaPostal(String outNumCaixaPostal) {
//        this.outNumCaixaPostal = outNumCaixaPostal;
//    }
//
//    public String getOutNumDiretoria01() {
//        return outNumDiretoria01;
//    }
//
//    public void setOutNumDiretoria01(String outNumDiretoria01) {
//        this.outNumDiretoria01 = outNumDiretoria01;
//    }
//
//    public String getOutNumDiretoria02() {
//        return outNumDiretoria02;
//    }
//
//    public void setOutNumDiretoria02(String outNumDiretoria02) {
//        this.outNumDiretoria02 = outNumDiretoria02;
//    }
//
//    public String getOutProgPAI() {
//        return outProgPAI;
//    }
//
//    public void setOutProgPAI(String outProgPAI) {
//        this.outProgPAI = outProgPAI;
//    }
//
//    public String getOutSitEscola() {
//        return outSitEscola;
//    }
//
//    public void setOutSitEscola(String outSitEscola) {
//        this.outSitEscola = outSitEscola;
//    }
//
//    public String getOutTelefone01() {
//        return outTelefone01;
//    }
//
//    public void setOutTelefone01(String outTelefone01) {
//        this.outTelefone01 = outTelefone01;
//    }
//
//    public String getOutTelefone02() {
//        return outTelefone02;
//    }
//
//    public void setOutTelefone02(String outTelefone02) {
//        this.outTelefone02 = outTelefone02;
//    }
//
//    public String getOutTipoEscola() {
//        return outTipoEscola;
//    }
//
//    public void setOutTipoEscola(String outTipoEscola) {
//        this.outTipoEscola = outTipoEscola;
//    }
//
//    public String getAluno() {
//        return aluno;
//    }
//
//    public void setAluno(String aluno) {
//        this.aluno = aluno;
//    }
//
//    public String getAno() {
//        return ano;
//    }
//
//    public void setAno(String ano) {
//        this.ano = ano;
//    }
//
//    public String getClasse() {
//        return classe;
//    }
//
//    public void setClasse(String classe) {
//        this.classe = classe;
//    }
//
//    public String getEducEspec() {
//        return educEspec;
//    }
//
//    public void setEducEspec(String educEspec) {
//        this.educEspec = educEspec;
//    }
//
//    public String getEjaFund() {
//        return ejaFund;
//    }
//
//    public void setEjaFund(String ejaFund) {
//        this.ejaFund = ejaFund;
//    }
//
//    public String getEjaMedio() {
//        return ejaMedio;
//    }
//
//    public void setEjaMedio(String ejaMedio) {
//        this.ejaMedio = ejaMedio;
//    }
//
//    public String getFundamental1A4() {
//        return fundamental1A4;
//    }
//
//    public void setFundamental1A4(String fundamental1A4) {
//        this.fundamental1A4 = fundamental1A4;
//    }
//
//    public String getFundamental5A8() {
//        return fundamental5A8;
//    }
//
//    public void setFundamental5A8(String fundamental5A8) {
//        this.fundamental5A8 = fundamental5A8;
//    }
//
//    public String getFundamental9() {
//        return fundamental9;
//    }
//
//    public void setFundamental9(String fundamental9) {
//        this.fundamental9 = fundamental9;
//    }
//
//    public String getMedio() {
//        return medio;
//    }
//
//    public void setMedio(String medio) {
//        this.medio = medio;
//    }
//
//    public String getOutros() {
//        return outros;
//    }
//
//    public void setOutros(String outros) {
//        this.outros = outros;
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
//    public String getOutConstr() {
//        return outConstr;
//    }
//
//    public void setOutConstr(String outConstr) {
//        this.outConstr = outConstr;
//    }
//
//    public String getOutRedeFisica() {
//        return outRedeFisica;
//    }
//
//    public void setOutRedeFisica(String outRedeFisica) {
//        this.outRedeFisica = outRedeFisica;
//    }
//
//    public String getEducinfantil() {
//        return educinfantil;
//    }
//
//    public void setEducinfantil(String educinfantil) {
//        this.educinfantil = educinfantil;
//    }
//}
