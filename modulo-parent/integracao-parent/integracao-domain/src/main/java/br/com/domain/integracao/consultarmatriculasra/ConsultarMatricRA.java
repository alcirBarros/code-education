//package br.com.domain.integracao.consultarmatriculasra;
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
//@Table(name = "cma_consultar_matricula_registro_aluno")
//public class ConsultarMatricRA extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cma_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "cma_ano_letivo", length = 4)
//    private String anoLetivo;
//
//    @Column(name = "cma_codigo_escola", length = 9)
//    private String codigoEscola;
//
//    @Column(name = "cma_data_matricula", length = 10)
//    private String dataMatricula;
//
//    @Column(name = "cma_nome_municipio_07", length = 7)
//    private String outNomeMunicipio07;
//
//    //
//    @Column(name = "cma_habilitacao", length = 4)
//    private String hab;
//
//    @Column(name = "cma_out_habilitacao", length = 4)
//    private String outHab;
//
//    @Column(name = "cma_hab_03", length = 7)
//    private String outHab03;
//
//    //
//    @Column(name = "cma_numero_classe", length = 11)
//    private String numeroClasse;
//    //
//
//    @Column(name = "aluno_matricula", length = 7)
//    private String outAlunoMatric;
//
//    @Column(name = "cma_aluno_matricula_det", length = 7)
//    private String outAlunoMatricDet;
//
//    //
//    @Column(name = "cma_out_ano_letivo", length = 4)
//    private String outAnoLetivo;
//
//    @Column(name = "cma_ano_letivo_02", length = 7)
//    private String outAnoLetivo02;
//
//    @Column(name = "cma_ano_letivo_03", length = 7)
//    private String outAnoLetivo03;
//
//    @Column(name = "cma_ano_letivo_05", length = 7)
//    private String outAnoLetivo05;
//
//    @Column(name = "cma_ano_letivo_07", length = 7)
//    private String outAnoLetivo07;
//
//    //
//    @Column(name = "cma_atende_07", length = 7)
//    private String outAtende07;
//
//    @Column(name = "cma_bairro_07", length = 7)
//    private String outBairro07;
//
//    @Column(name = "cma_bairro_aluno_02", length = 7)
//    private String outBairroAluno02;
//
//    @Column(name = "cma_bairro_matricula_02", length = 7)
//    private String outBairroMatric02;
//
//    @Column(name = "cma_carga_hora", length = 7)
//    private String outCargaHora;
//
//    @Column(name = "cma_cep_07", length = 7)
//    private String outCep07;
//
//    @Column(name = "cma_cep_aluno_02", length = 7)
//    private String outCepAluno02;
//
//    @Column(name = "cma_cep_matricula_02", length = 7)
//    private String outCepMatric02;
//
//    @Column(name = "cma_cidade_07", length = 7)
//    private String outCidade07;
//
//    @Column(name = "cma_cidade_aluno_02", length = 7)
//    private String outCidadeAluno02;
//
//    @Column(name = "cma_cidade_matricula_02", length = 7)
//    private String outCidadeMatric02;
//
//    @Column(name = "cma_codigo_escola_02", length = 7)
//    private String outCodEscola02;
//
//    @Column(name = "cma_codigo_escola_03", length = 7)
//    private String outCodEscola03;
//
//    @Column(name = "cma_codigo_escola_04", length = 7)
//    private String outCodEscola04;
//
//    @Column(name = "cma_codigo_escola_05", length = 7)
//    private String outCodEscola05;
//
//    @Column(name = "cma_codigo_escola_07", length = 7)
//    private String outCodEscola07;
//
//    @Column(name = "cma_codigo_escola_aloc_07", length = 7)
//    private String outCodEscolaAloc07;
//
//    @Column(name = "cma_codigo_escola_sugestao_07", length = 7)
//    private String outCodEscolaSugestao07;
//
//    @Column(name = "cma_municipio_02", length = 7)
//    private String outCodMunicipio02;
//
//    @Column(name = "cma_icc_dia_inicio_aula", length = 7)
//    private String outCodMunicipio07;
//
//    @Column(name = "cma_codigo_situacao_aluno_04", length = 7)
//    private String outCodSituacaoAluno04;
//
//    @Column(name = "cma_cod_unidade_05", length = 7)
//    private String outCodUnidade05;
//
//    @Column(name = "cma_ddd_aluno_02", length = 7)
//    private String outDDDAluno02;
//
//    @Column(name = "cma_data", length = 10)
//    private String outData;
//
//    @Column(name = "cma_data_aloc_07", length = 7)
//    private String outDataAloc07;
//
//    @Column(name = "cma_data_alteracao", length = 7)
//    private String outDataAlter;
//
//    @Column(name = "cma_data_alteracao_03", length = 7)
//    private String outDataAlter03;
//
//    @Column(name = "cma_data_alteracao_04", length = 7)
//    private String outDataAlter04;
//
//    @Column(name = "cma_data_alteracao_05", length = 7)
//    private String outDataAlter05;
//
//    @Column(name = "cma_data_fim", length = 10)
//    private String outDataFim;
//
//    @Column(name = "cma_data_fim_03", length = 7)
//    private String outDataFim03;
//
//    @Column(name = "cma_data_fim_04", length = 7)
//    private String outDataFim04;
//
//    @Column(name = "cma_data_fim_matricula_05", length = 7)
//    private String outDataFimMatric05;
//
//    @Column(name = "cma_data_inclusao_censo", length = 7)
//    private String outDataInclusaoCenso;
//
//    @Column(name = "cma_data_inicio", length = 10)
//    private String outDataInicio;
//
//    @Column(name = "cma_data_inicio_03", length = 7)
//    private String outDataInicio03;
//
//    @Column(name = "cma_data_inicio_04", length = 7)
//    private String outDataInicio04;
//
//    @Column(name = "cma_data_inicio_matricula_05", length = 7)
//    private String outDataInicioMatric05;
//
//    @Column(name = "cma_data_inscricao_02", length = 7)
//    private String outDataInscricao02;
//
//    @Column(name = "cma_data_inscricao_07", length = 7)
//    private String outDataInscricao07;
//
//    @Column(name = "cma_data_nascimento", length = 10)
//    private String outDataNascimento;
//
//    @Column(name = "cma_data_nascimento_02", length = 7)
//    private String outDataNascimento02;
//
//    @Column(name = "cma_data_nascimento_03", length = 7)
//    private String outDataNascimento03;
//
//    @Column(name = "cma_data_nascimento_04", length = 7)
//    private String outDataNascimento04;
//
//    @Column(name = "cma_data_nascimento_05", length = 7)
//    private String outDataNascimento05;
//
//    @Column(name = "cma_data_nascimento_07", length = 7)
//    private String outDataNascimento07;
//
//    @Column(name = "cma_desc_hab", length = 7)
//    private String outDescHab;
//
//    @Column(name = "cma_desc_hab_03", length = 7)
//    private String outDescHab03;
//
//    @Column(name = "cma_desc_hab_04", length = 7)
//    private String outDescHab04;
//
//    @Column(name = "cma_desc_hab_nivel_03", length = 7)
//    private String outDescHabNivel03;
//
//    @Column(name = "cma_desc_hora_final", length = 7)
//    private String outDescHoraFinal;
//
//    @Column(name = "cma_desc_hora_final_03", length = 7)
//    private String outDescHoraFinal03;
//
//    @Column(name = "cma_desc_hora_inicial", length = 7)
//    private String outDescHoraInicial;
//
//    @Column(name = "cma_desc_hora_inicial_03", length = 7)
//    private String outDescHoraInicial03;
//
//    @Column(name = "cma_desc_hora_inicial_02", length = 7)
//    private String outDescMunicipio02;
//
//    @Column(name = "cma_desc_nivel_ensino_03", length = 7)
//    private String outDescNivelEnsino03;
//
//    @Column(name = "cma_desc_nivel_serie_03", length = 7)
//    private String outDescNivelSerie03;
//
//    @Column(name = "cma_desc_rend", length = 7)
//    private String outDescRend;
//
//    @Column(name = "cma_desc_serie_02", length = 7)
//    private String outDescSerie02;
//
//    @Column(name = "cma_desc_serie_03", length = 7)
//    private String outDescSerie03;
//
//    @Column(name = "cma_desc_serie_04", length = 7)
//    private String outDescSerie04;
//
//    @Column(name = "cma_desc_serie_05", length = 7)
//    private String outDescSerie05;
//
//    @Column(name = "cma_desc_serie_07", length = 7)
//    private String outDescSerie07;
//
//    @Column(name = "cma_desc_situacao_05", length = 7)
//    private String outDescSituacao05;
//    //
//
//    @Column(name = "cma_desc_tipo_ensino", length = 40)
//    private String outDescTipoEnsino;
//
//    @Column(name = "cma_desc_tipo_ensino_02", length = 7)
//    private String outDescTipoEnsino02;
//
//    @Column(name = "cma_desc_tipo_ensino_03", length = 7)
//    private String outDescTipoEnsino03;
//
//    @Column(name = "cma_desc_tipo_ensino_04", length = 7)
//    private String outDescTipoEnsino04;
//
//    @Column(name = "cma_desc_tipo_ensino_05", length = 7)
//    private String outDescTipoEnsino05;
//
//    @Column(name = "cma_desc_tipo_ensino_07", length = 7)
//    private String outDescTipoEnsino07;
//    //
//
//    @Column(name = "cma_desc_turma", length = 7)
//    private String outDescTurma;
//
//    @Column(name = "cma_desc_turma_03", length = 7)
//    private String outDescTurma03;
//    //
//
//    @Column(name = "cma_desc_turno_03", length = 7)
//    private String outDescTurno03;
//
//    @Column(name = "cma_desc_turno_07", length = 7)
//    private String outDescTurno07;
//    //
//
//    @Column(name = "cma_descricao_turno", length = 40)
//    private String outDescricaoTurno;
//
//    @Column(name = "cma_digito_registro_aluno", length = 1)
//    private String outDigitoRA;
//
//    @Column(name = "cma_digito_registro_aluno_02", length = 7)
//    private String outDigitoRA02;
//
//    @Column(name = "cma_digito_registro_aluno_03", length = 7)
//    private String outDigitoRA03;
//
//    @Column(name = "cma_digito_registro_aluno_04", length = 7)
//    private String outDigitoRA04;
//
//    @Column(name = "cma_digito_registro_aluno_05", length = 7)
//    private String outDigitoRA05;
//
//    @Column(name = "cma_digito_registro_aluno_07", length = 7)
//    private String outDigitoRA07;
//    //
//
//    @Column(name = "cma_data_confirmada_04", length = 7)
//    private String outDtaConfirmada04;
//
//    @Column(name = "cma_end_matricula_02", length = 7)
//    private String outEndMatricula02;
//
//    @Column(name = "cma_end_uf_07", length = 7)
//    private String outEndUF07;
//
//    @Column(name = "cma_endereco_aluno_02", length = 7)
//    private String outEnderecoAluno02;
//
//    @Column(name = "cma_endereco_07", length = 7)
//    private String outEndreco07;
//
//    @Column(name = "cma_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "cma_escola", length = 53)
//    private String outEscola;
//
//    @Column(name = "cma_fase_02", length = 7)
//    private String outFase02;
//
//    @Column(name = "cma_fase_07", length = 7)
//    private String outFase07;
//
//    @Column(name = "cma_hora_altera", length = 7)
//    private String outHoraAlter;
//
//    @Column(name = "cma_hora_alteracao_03", length = 7)
//    private String outHoraAlter03;
//
//    @Column(name = "cma_hora_alteracao_04", length = 7)
//    private String outHoraAlter04;
//
//    @Column(name = "cma_hora_alteracao_05", length = 7)
//    private String outHoraAlter05;
//
//    @Column(name = "cma_hora_fim_domingo_05", length = 7)
//    private String outHoraFimDomingo05;
//
//    @Column(name = "cma_hora_fim_quarta_05", length = 7)
//    private String outHoraFimQuarta05;
//
//    @Column(name = "cma_hora_fim_quinta_05", length = 7)
//    private String outHoraFimQuinta05;
//
//    @Column(name = "cma_hora_fim_sabado_05", length = 7)
//    private String outHoraFimSabado05;
//
//    @Column(name = "cma_hora_fim_segunda_05", length = 7)
//    private String outHoraFimSegunda05;
//
//    @Column(name = "cma_hora_fim_sexta_05", length = 7)
//    private String outHoraFimSexta05;
//
//    @Column(name = "cma_hora_fim_terca_05", length = 7)
//    private String outHoraFimTerca05;
//
//    @Column(name = "cma_hora_final", length = 5)
//    private String outHoraFinal;
//
//    @Column(name = "cma_hora_final_03", length = 7)
//    private String outHoraFinal03;
//
//    @Column(name = "cma_hora_inicio_domingo_05", length = 7)
//    private String outHoraInicDomingo05;
//
//    @Column(name = "cma_hora_inicio_quarta_05", length = 7)
//    private String outHoraInicQuarta05;
//
//    @Column(name = "cma_hora_inicio_quinta_05", length = 7)
//    private String outHoraInicQuinta05;
//
//    @Column(name = "cma_hora_inicio_sabado_05", length = 7)
//    private String outHoraInicSabado05;
//
//    @Column(name = "cma_hora_inicio_segunda_05", length = 7)
//    private String outHoraInicSegunda05;
//
//    @Column(name = "cma_hora_inicio_sexta_05", length = 7)
//    private String outHoraInicSexta05;
//
//    @Column(name = "cma_hora_inicio_terca_05", length = 7)
//    private String outHoraInicTerca05;
//
//    @Column(name = "cma_hora_inicial", length = 5)
//    private String outHoraInicial;
//
//    @Column(name = "cma_hora_inicial_03", length = 7)
//    private String outHoraInicial03;
//
//    @Column(name = "cma_ident_hab_04", length = 7)
//    private String outIdentHab04;
//
//    @Column(name = "cma_ident_hab_nivel_03", length = 7)
//    private String outIdentHabNivel03;
//
//    @Column(name = "cma_ident_serie_04", length = 7)
//    private String outIdentSerie04;
//
//    @Column(name = "cma_lit_censo", length = 7)
//    private String outLitCenso;
//
//    @Column(name = "cma_lit_classe_07", length = 7)
//    private String outLitClasse07;
//
//    @Column(name = "cma_lit_hab_04", length = 7)
//    private String outLitHab04;
//
//    @Column(name = "cma_lit_serie_04", length = 7)
//    private String outLitSerie04;
//
//    @Column(name = "cma_lit_situacao_05", length = 7)
//    private String outLitSituacao05;
//
//    @Column(name = "lit_transf", length = 7)
//    private String outLitTransf;
//
//    @Column(name = "cma_lit_transf_03", length = 7)
//    private String outLitTransf03;
//
//    @Column(name = "cma_lit_transf_04", length = 7)
//    private String outLitTransf04;
//
//    @Column(name = "cma_lit_transp", length = 35)
//    private String outLitTransp;
//
//    @Column(name = "cma_mensagem_compartilhado", length = 7)
//    private String outMsgCompartilhado;
//
//    @Column(name = "cma_mensagem_compartilhado_det", length = 7)
//    private String outMsgCompartilhadoDet;
//
//    @Column(name = "cma_nivel_ensina_03", length = 7)
//    private String outNivelEnsino03;
//
//    @Column(name = "cma_nome_02", length = 7)
//    private String outNome02;
//
//    @Column(name = "cma_nome_abrev_escola_03", length = 7)
//    private String outNomeAbrevEscola03;
//
//    @Column(name = "cma_nome_abrev_escola_04", length = 7)
//    private String outNomeAbrevEscola04;
//
//    @Column(name = "cma_nome_abrev_escola_05", length = 7)
//    private String outNomeAbrevEscola05;
//
//    ///
//    @Column(name = "cma_nome_aluno", length = 70)
//    private String outNomeAluno;
//
//    @Column(name = "cma_nome_aluno_03", length = 7)
//    private String outNomeAluno03;
//
//    @Column(name = "cma_nome_aluno_04", length = 7)
//    private String outNomeAluno04;
//
//    @Column(name = "cma_nome_aluno_05", length = 7)
//    private String outNomeAluno05;
//
//    @Column(name = "cma_nome_aluno_07", length = 7)
//    private String outNomeAluno07;
//
//    @Column(name = "cma_nome_escola_02", length = 7)
//    private String outNomeEscola02;
//
//    @Column(name = "cma_nome_escola_07", length = 7)
//    private String outNomeEscola07;
//
//    //    
//    @Column(name = "cma_nome_escola_aloc_07", length = 7)
//    private String outNomeEscolaAloc07;
//
//    @Column(name = "cma_nome_escola_sugestao_07", length = 7)
//    private String outNomeEscolaSugestao07;
//
//    //
//    @Column(name = "cma_nome_mae", length = 7)
//    private String outNomeMae;
//
//    @Column(name = "cma_nome_mae_02", length = 60)
//    private String outNomeMae02;
//
//    @Column(name = "cma_nome_mae_03", length = 7)
//    private String outNomeMae03;
//
//    @Column(name = "cma_nome_mae_04", length = 7)
//    private String outNomeMae04;
//
//    @Column(name = "cma_nome_mae_05", length = 7)
//    private String outNomeMae05;
//
//    @Column(name = "cma_nome_mae_07", length = 7)
//    private String outNomeMae07;
//
//    //
//    @Column(name = "cma_nome_pai", length = 60)
//    private String outNomePai;
//
//    @Column(name = "cma_nome_pai_02", length = 7)
//    private String outNomePai02;
//
//    @Column(name = "cma_nome_pai_03", length = 7)
//    private String outNomePai03;
//
//    @Column(name = "cma_nome_pai_04", length = 7)
//    private String outNomePai04;
//
//    @Column(name = "cma_nome_pai_05", length = 7)
//    private String outNomePai05;
//
//    @Column(name = "cma_nome_pai_07", length = 7)
//    private String outNomePai07;
//
//    //
//    @Column(name = "cma_nome_unidade_05", length = 7)
//    private String outNomeUnidade05;
//
//    //
//    @Column(name = "cma_numero_aluno", length = 2)
//    private String numero;
//
//    @Column(name = "cma_out_numero_aluno", length = 2)
//    private String outNumAluno;
//
//    @Column(name = "cma_numero_aluno_03", length = 7)
//    private String outNumAluno03;
//
//    @Column(name = "cma_numero_aluno_05", length = 7)
//    private String outNumAluno05;
//
//    //
//    @Column(name = "cma_out_numero_classe", length = 11)
//    private String outNumClasse;
//
//    @Column(name = "cma_numero_classe_03", length = 7)
//    private String outNumClasse03;
//
//    @Column(name = "cma_numero_classe_05", length = 7)
//    private String outNumClasse05;
//
//    ///
//    @Column(name = "cma_numero_classe_Aloc_07", length = 7)
//    private String outNumClasseAloc07;
//
//    //
//    @Column(name = "cma_observacao", length = 7)
//    private String outObservacao;
//
//    @Column(name = "cma_observacao_04", length = 7)
//    private String outObservacao04;
//
//    @Column(name = "cma_observacao_07", length = 7)
//    private String outObservacao07;
//
//    //
//    @Column(name = "cma_opcao_alteracao", length = 7)
//    private String outOpcaoAlter;
//
//    @Column(name = "cma_opcao_alteracao_03", length = 7)
//    private String outOpcaoAlter03;
//
//    @Column(name = "cma_pronatec", length = 14)
//    private String outPronatec;
//
//    @Column(name = "cma_quantidade_hora_hab", length = 7)
//    private String outQtCargaHoraHab;
//
//    //
//    @Column(name = "cma_registro_aluno", length = 12)
//    private String outRA;
//
//    @Column(name = "cma_registro_aluno_02", length = 7)
//    private String outRA02;
//
//    @Column(name = "cma_registro_aluno_03", length = 7)
//    private String outRA03;
//
//    @Column(name = "cma_registro_aluno_04", length = 7)
//    private String outRA04;
//
//    @Column(name = "cma_registro_aluno_05", length = 7)
//    private String outRA05;
//
//    @Column(name = "cma_registro_aluno_07", length = 7)
//    private String outRA07;
//
//    //
//    @Column(name = "cma_segunda_feira", length = 7)
//    private String outSegundaFeira;
//
//    @Column(name = "cma_terca_feira", length = 7)
//    private String outTercaFeira;
//
//    @Column(name = "cma_quarta_feira", length = 7)
//    private String outQuartaFeira;
//
//    @Column(name = "cma_quinta_feira", length = 7)
//    private String outQuintaFeira;
//
//    @Column(name = "cma_sexta_feira", length = 7)
//    private String outSextaFeira;
//
//    @Column(name = "cma_sabado", length = 7)
//    private String outSabado;
//
//    @Column(name = "cma_domingo", length = 7)
//    private String outDomingo;
//    //
//
//    @Column(name = "cma_serie", length = 7)
//    private String serie;
//
//    @Column(name = "cma_out_serie", length = 2)
//    private String outSerie;
//
//    @Column(name = "cma_serie_02", length = 2)
//    private String outSerie02;
//
//    @Column(name = "cma_serie_03", length = 7)
//    private String outSerie03;
//
//    @Column(name = "cma_serie_05", length = 7)
//    private String outSerie05;
//
//    @Column(name = "cma_serie_07", length = 7)
//    private String outSerie07;
//
//    //
//    @Column(name = "cma_situacao_04", length = 7)
//    private String outSituacao04;
//
//    @Column(name = "cma_sugestao_07", length = 7)
//    private String outSugestao07;
//    //
//
//    @Column(name = "cma_telefone_residencial_02", length = 7)
//    private String outTelResidencial02;
//
//    //
//    @Column(name = "cma_tipo_classe", length = 7)
//    private String outTipoClasse;
//
//    @Column(name = "cma_tipo_classe_03", length = 7)
//    private String outTipoClasse03;
//
//    //
//    @Column(name = "cma_tipo_ensino", length = 2)
//    private String tipoEnsino;
//
//    @Column(name = "cma_out_tipo_ensino", length = 2)
//    private String outTipoEnsino;
//
//    @Column(name = "cma_tipo_ensino_02", length = 7)
//    private String outTipoEnsino02;
//
//    @Column(name = "cma_tipo_ensino_03", length = 7)
//    private String outTipoEnsino03;
//
//    @Column(name = "cma_tipo_ensino_04", length = 7)
//    private String outTipoEnsino04;
//
//    @Column(name = "cma_tipo_ensino_05", length = 7)
//    private String outTipoEnsino05;
//
//    @Column(name = "cma_tipo_ensino_07", length = 7)
//    private String outTipoEnsino07;
//
//    //
//    @Column(name = "cma_turma", length = 7)
//    private String turma;
//
//    @Column(name = "cma_out_turma", length = 2)
//    private String outTurma;
//
//    @Column(name = "cma_turma_03", length = 7)
//    private String outTurma03;
//
//    @Column(name = "cma_turma_05", length = 7)
//    private String outTurma05;
//
//    //
//    @Column(name = "cma_turno", length = 7)
//    private String turno;
//
//    @Column(name = "cma_out_turno", length = 1)
//    private String outTurno;
//
//    @Column(name = "cma_turno_03", length = 7)
//    private String outTurno03;
//
//    @Column(name = "cma_turno_07", length = 7)
//    private String outTurno07;
//
//    //
//    @Column(name = "cma_uf", length = 2)
//    private String outUF;
//
//    @Column(name = "cma_uf_02", length = 7)
//    private String outUF02;
//
//    @Column(name = "cma_uf_03", length = 7)
//    private String outUF03;
//
//    @Column(name = "cma_uf_04", length = 7)
//    private String outUF04;
//
//    @Column(name = "cma_uf_05", length = 7)
//    private String outUF05;
//
//    @Column(name = "cma_uf_07", length = 7)
//    private String outUF07;
//
//    //
//    @Column(name = "cma_uf_aluno_02", length = 7)
//    private String outUFAluno02;
//
//    @Column(name = "cma_uf_matricula_02", length = 7)
//    private String outUFMatric02;
//
//    @Column(name = "cma_situacao_matricula", length = 2)
//    private String situacaoMatricula;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getAnoLetivo() {
//        return anoLetivo;
//    }
//
//    public void setAnoLetivo(String anoLetivo) {
//        this.anoLetivo = anoLetivo;
//    }
//
//    public String getCodigoEscola() {
//        return codigoEscola;
//    }
//
//    public void setCodigoEscola(String codigoEscola) {
//        this.codigoEscola = codigoEscola;
//    }
//
//    public String getDataMatricula() {
//        return dataMatricula;
//    }
//
//    public void setDataMatricula(String dataMatricula) {
//        this.dataMatricula = dataMatricula;
//    }
//
//    public String getOutNomeMunicipio07() {
//        return outNomeMunicipio07;
//    }
//
//    public void setOutNomeMunicipio07(String outNomeMunicipio07) {
//        this.outNomeMunicipio07 = outNomeMunicipio07;
//    }
//
//    public String getHab() {
//        return hab;
//    }
//
//    public void setHab(String hab) {
//        this.hab = hab;
//    }
//
//    public String getOutHab() {
//        return outHab;
//    }
//
//    public void setOutHab(String outHab) {
//        this.outHab = outHab;
//    }
//
//    public String getOutHab03() {
//        return outHab03;
//    }
//
//    public void setOutHab03(String outHab03) {
//        this.outHab03 = outHab03;
//    }
//
//    public String getNumeroClasse() {
//        return numeroClasse;
//    }
//
//    public void setNumeroClasse(String numeroClasse) {
//        this.numeroClasse = numeroClasse;
//    }
//
//    public String getOutAlunoMatric() {
//        return outAlunoMatric;
//    }
//
//    public void setOutAlunoMatric(String outAlunoMatric) {
//        this.outAlunoMatric = outAlunoMatric;
//    }
//
//    public String getOutAlunoMatricDet() {
//        return outAlunoMatricDet;
//    }
//
//    public void setOutAlunoMatricDet(String outAlunoMatricDet) {
//        this.outAlunoMatricDet = outAlunoMatricDet;
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
//    public String getOutAnoLetivo02() {
//        return outAnoLetivo02;
//    }
//
//    public void setOutAnoLetivo02(String outAnoLetivo02) {
//        this.outAnoLetivo02 = outAnoLetivo02;
//    }
//
//    public String getOutAnoLetivo03() {
//        return outAnoLetivo03;
//    }
//
//    public void setOutAnoLetivo03(String outAnoLetivo03) {
//        this.outAnoLetivo03 = outAnoLetivo03;
//    }
//
//    public String getOutAnoLetivo05() {
//        return outAnoLetivo05;
//    }
//
//    public void setOutAnoLetivo05(String outAnoLetivo05) {
//        this.outAnoLetivo05 = outAnoLetivo05;
//    }
//
//    public String getOutAnoLetivo07() {
//        return outAnoLetivo07;
//    }
//
//    public void setOutAnoLetivo07(String outAnoLetivo07) {
//        this.outAnoLetivo07 = outAnoLetivo07;
//    }
//
//    public String getOutAtende07() {
//        return outAtende07;
//    }
//
//    public void setOutAtende07(String outAtende07) {
//        this.outAtende07 = outAtende07;
//    }
//
//    public String getOutBairro07() {
//        return outBairro07;
//    }
//
//    public void setOutBairro07(String outBairro07) {
//        this.outBairro07 = outBairro07;
//    }
//
//    public String getOutBairroAluno02() {
//        return outBairroAluno02;
//    }
//
//    public void setOutBairroAluno02(String outBairroAluno02) {
//        this.outBairroAluno02 = outBairroAluno02;
//    }
//
//    public String getOutBairroMatric02() {
//        return outBairroMatric02;
//    }
//
//    public void setOutBairroMatric02(String outBairroMatric02) {
//        this.outBairroMatric02 = outBairroMatric02;
//    }
//
//    public String getOutCargaHora() {
//        return outCargaHora;
//    }
//
//    public void setOutCargaHora(String outCargaHora) {
//        this.outCargaHora = outCargaHora;
//    }
//
//    public String getOutCep07() {
//        return outCep07;
//    }
//
//    public void setOutCep07(String outCep07) {
//        this.outCep07 = outCep07;
//    }
//
//    public String getOutCepAluno02() {
//        return outCepAluno02;
//    }
//
//    public void setOutCepAluno02(String outCepAluno02) {
//        this.outCepAluno02 = outCepAluno02;
//    }
//
//    public String getOutCepMatric02() {
//        return outCepMatric02;
//    }
//
//    public void setOutCepMatric02(String outCepMatric02) {
//        this.outCepMatric02 = outCepMatric02;
//    }
//
//    public String getOutCidade07() {
//        return outCidade07;
//    }
//
//    public void setOutCidade07(String outCidade07) {
//        this.outCidade07 = outCidade07;
//    }
//
//    public String getOutCidadeAluno02() {
//        return outCidadeAluno02;
//    }
//
//    public void setOutCidadeAluno02(String outCidadeAluno02) {
//        this.outCidadeAluno02 = outCidadeAluno02;
//    }
//
//    public String getOutCidadeMatric02() {
//        return outCidadeMatric02;
//    }
//
//    public void setOutCidadeMatric02(String outCidadeMatric02) {
//        this.outCidadeMatric02 = outCidadeMatric02;
//    }
//
//    public String getOutCodEscola02() {
//        return outCodEscola02;
//    }
//
//    public void setOutCodEscola02(String outCodEscola02) {
//        this.outCodEscola02 = outCodEscola02;
//    }
//
//    public String getOutCodEscola03() {
//        return outCodEscola03;
//    }
//
//    public void setOutCodEscola03(String outCodEscola03) {
//        this.outCodEscola03 = outCodEscola03;
//    }
//
//    public String getOutCodEscola04() {
//        return outCodEscola04;
//    }
//
//    public void setOutCodEscola04(String outCodEscola04) {
//        this.outCodEscola04 = outCodEscola04;
//    }
//
//    public String getOutCodEscola05() {
//        return outCodEscola05;
//    }
//
//    public void setOutCodEscola05(String outCodEscola05) {
//        this.outCodEscola05 = outCodEscola05;
//    }
//
//    public String getOutCodEscola07() {
//        return outCodEscola07;
//    }
//
//    public void setOutCodEscola07(String outCodEscola07) {
//        this.outCodEscola07 = outCodEscola07;
//    }
//
//    public String getOutCodEscolaAloc07() {
//        return outCodEscolaAloc07;
//    }
//
//    public void setOutCodEscolaAloc07(String outCodEscolaAloc07) {
//        this.outCodEscolaAloc07 = outCodEscolaAloc07;
//    }
//
//    public String getOutCodEscolaSugestao07() {
//        return outCodEscolaSugestao07;
//    }
//
//    public void setOutCodEscolaSugestao07(String outCodEscolaSugestao07) {
//        this.outCodEscolaSugestao07 = outCodEscolaSugestao07;
//    }
//
//    public String getOutCodMunicipio02() {
//        return outCodMunicipio02;
//    }
//
//    public void setOutCodMunicipio02(String outCodMunicipio02) {
//        this.outCodMunicipio02 = outCodMunicipio02;
//    }
//
//    public String getOutCodMunicipio07() {
//        return outCodMunicipio07;
//    }
//
//    public void setOutCodMunicipio07(String outCodMunicipio07) {
//        this.outCodMunicipio07 = outCodMunicipio07;
//    }
//
//    public String getOutCodSituacaoAluno04() {
//        return outCodSituacaoAluno04;
//    }
//
//    public void setOutCodSituacaoAluno04(String outCodSituacaoAluno04) {
//        this.outCodSituacaoAluno04 = outCodSituacaoAluno04;
//    }
//
//    public String getOutCodUnidade05() {
//        return outCodUnidade05;
//    }
//
//    public void setOutCodUnidade05(String outCodUnidade05) {
//        this.outCodUnidade05 = outCodUnidade05;
//    }
//
//    public String getOutDDDAluno02() {
//        return outDDDAluno02;
//    }
//
//    public void setOutDDDAluno02(String outDDDAluno02) {
//        this.outDDDAluno02 = outDDDAluno02;
//    }
//
//    public String getOutData() {
//        return outData;
//    }
//
//    public void setOutData(String outData) {
//        this.outData = outData;
//    }
//
//    public String getOutDataAloc07() {
//        return outDataAloc07;
//    }
//
//    public void setOutDataAloc07(String outDataAloc07) {
//        this.outDataAloc07 = outDataAloc07;
//    }
//
//    public String getOutDataAlter() {
//        return outDataAlter;
//    }
//
//    public void setOutDataAlter(String outDataAlter) {
//        this.outDataAlter = outDataAlter;
//    }
//
//    public String getOutDataAlter03() {
//        return outDataAlter03;
//    }
//
//    public void setOutDataAlter03(String outDataAlter03) {
//        this.outDataAlter03 = outDataAlter03;
//    }
//
//    public String getOutDataAlter04() {
//        return outDataAlter04;
//    }
//
//    public void setOutDataAlter04(String outDataAlter04) {
//        this.outDataAlter04 = outDataAlter04;
//    }
//
//    public String getOutDataAlter05() {
//        return outDataAlter05;
//    }
//
//    public void setOutDataAlter05(String outDataAlter05) {
//        this.outDataAlter05 = outDataAlter05;
//    }
//
//    public String getOutDataFim() {
//        return outDataFim;
//    }
//
//    public void setOutDataFim(String outDataFim) {
//        this.outDataFim = outDataFim;
//    }
//
//    public String getOutDataFim03() {
//        return outDataFim03;
//    }
//
//    public void setOutDataFim03(String outDataFim03) {
//        this.outDataFim03 = outDataFim03;
//    }
//
//    public String getOutDataFim04() {
//        return outDataFim04;
//    }
//
//    public void setOutDataFim04(String outDataFim04) {
//        this.outDataFim04 = outDataFim04;
//    }
//
//    public String getOutDataFimMatric05() {
//        return outDataFimMatric05;
//    }
//
//    public void setOutDataFimMatric05(String outDataFimMatric05) {
//        this.outDataFimMatric05 = outDataFimMatric05;
//    }
//
//    public String getOutDataInclusaoCenso() {
//        return outDataInclusaoCenso;
//    }
//
//    public void setOutDataInclusaoCenso(String outDataInclusaoCenso) {
//        this.outDataInclusaoCenso = outDataInclusaoCenso;
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
//    public String getOutDataInicio03() {
//        return outDataInicio03;
//    }
//
//    public void setOutDataInicio03(String outDataInicio03) {
//        this.outDataInicio03 = outDataInicio03;
//    }
//
//    public String getOutDataInicio04() {
//        return outDataInicio04;
//    }
//
//    public void setOutDataInicio04(String outDataInicio04) {
//        this.outDataInicio04 = outDataInicio04;
//    }
//
//    public String getOutDataInicioMatric05() {
//        return outDataInicioMatric05;
//    }
//
//    public void setOutDataInicioMatric05(String outDataInicioMatric05) {
//        this.outDataInicioMatric05 = outDataInicioMatric05;
//    }
//
//    public String getOutDataInscricao02() {
//        return outDataInscricao02;
//    }
//
//    public void setOutDataInscricao02(String outDataInscricao02) {
//        this.outDataInscricao02 = outDataInscricao02;
//    }
//
//    public String getOutDataInscricao07() {
//        return outDataInscricao07;
//    }
//
//    public void setOutDataInscricao07(String outDataInscricao07) {
//        this.outDataInscricao07 = outDataInscricao07;
//    }
//
//    public String getOutDataNascimento() {
//        return outDataNascimento;
//    }
//
//    public void setOutDataNascimento(String outDataNascimento) {
//        this.outDataNascimento = outDataNascimento;
//    }
//
//    public String getOutDataNascimento02() {
//        return outDataNascimento02;
//    }
//
//    public void setOutDataNascimento02(String outDataNascimento02) {
//        this.outDataNascimento02 = outDataNascimento02;
//    }
//
//    public String getOutDataNascimento03() {
//        return outDataNascimento03;
//    }
//
//    public void setOutDataNascimento03(String outDataNascimento03) {
//        this.outDataNascimento03 = outDataNascimento03;
//    }
//
//    public String getOutDataNascimento04() {
//        return outDataNascimento04;
//    }
//
//    public void setOutDataNascimento04(String outDataNascimento04) {
//        this.outDataNascimento04 = outDataNascimento04;
//    }
//
//    public String getOutDataNascimento05() {
//        return outDataNascimento05;
//    }
//
//    public void setOutDataNascimento05(String outDataNascimento05) {
//        this.outDataNascimento05 = outDataNascimento05;
//    }
//
//    public String getOutDataNascimento07() {
//        return outDataNascimento07;
//    }
//
//    public void setOutDataNascimento07(String outDataNascimento07) {
//        this.outDataNascimento07 = outDataNascimento07;
//    }
//
//    public String getOutDescHab() {
//        return outDescHab;
//    }
//
//    public void setOutDescHab(String outDescHab) {
//        this.outDescHab = outDescHab;
//    }
//
//    public String getOutDescHab03() {
//        return outDescHab03;
//    }
//
//    public void setOutDescHab03(String outDescHab03) {
//        this.outDescHab03 = outDescHab03;
//    }
//
//    public String getOutDescHab04() {
//        return outDescHab04;
//    }
//
//    public void setOutDescHab04(String outDescHab04) {
//        this.outDescHab04 = outDescHab04;
//    }
//
//    public String getOutDescHabNivel03() {
//        return outDescHabNivel03;
//    }
//
//    public void setOutDescHabNivel03(String outDescHabNivel03) {
//        this.outDescHabNivel03 = outDescHabNivel03;
//    }
//
//    public String getOutDescHoraFinal() {
//        return outDescHoraFinal;
//    }
//
//    public void setOutDescHoraFinal(String outDescHoraFinal) {
//        this.outDescHoraFinal = outDescHoraFinal;
//    }
//
//    public String getOutDescHoraFinal03() {
//        return outDescHoraFinal03;
//    }
//
//    public void setOutDescHoraFinal03(String outDescHoraFinal03) {
//        this.outDescHoraFinal03 = outDescHoraFinal03;
//    }
//
//    public String getOutDescHoraInicial() {
//        return outDescHoraInicial;
//    }
//
//    public void setOutDescHoraInicial(String outDescHoraInicial) {
//        this.outDescHoraInicial = outDescHoraInicial;
//    }
//
//    public String getOutDescHoraInicial03() {
//        return outDescHoraInicial03;
//    }
//
//    public void setOutDescHoraInicial03(String outDescHoraInicial03) {
//        this.outDescHoraInicial03 = outDescHoraInicial03;
//    }
//
//    public String getOutDescMunicipio02() {
//        return outDescMunicipio02;
//    }
//
//    public void setOutDescMunicipio02(String outDescMunicipio02) {
//        this.outDescMunicipio02 = outDescMunicipio02;
//    }
//
//    public String getOutDescNivelEnsino03() {
//        return outDescNivelEnsino03;
//    }
//
//    public void setOutDescNivelEnsino03(String outDescNivelEnsino03) {
//        this.outDescNivelEnsino03 = outDescNivelEnsino03;
//    }
//
//    public String getOutDescNivelSerie03() {
//        return outDescNivelSerie03;
//    }
//
//    public void setOutDescNivelSerie03(String outDescNivelSerie03) {
//        this.outDescNivelSerie03 = outDescNivelSerie03;
//    }
//
//    public String getOutDescRend() {
//        return outDescRend;
//    }
//
//    public void setOutDescRend(String outDescRend) {
//        this.outDescRend = outDescRend;
//    }
//
//    public String getOutDescSerie02() {
//        return outDescSerie02;
//    }
//
//    public void setOutDescSerie02(String outDescSerie02) {
//        this.outDescSerie02 = outDescSerie02;
//    }
//
//    public String getOutDescSerie03() {
//        return outDescSerie03;
//    }
//
//    public void setOutDescSerie03(String outDescSerie03) {
//        this.outDescSerie03 = outDescSerie03;
//    }
//
//    public String getOutDescSerie04() {
//        return outDescSerie04;
//    }
//
//    public void setOutDescSerie04(String outDescSerie04) {
//        this.outDescSerie04 = outDescSerie04;
//    }
//
//    public String getOutDescSerie05() {
//        return outDescSerie05;
//    }
//
//    public void setOutDescSerie05(String outDescSerie05) {
//        this.outDescSerie05 = outDescSerie05;
//    }
//
//    public String getOutDescSerie07() {
//        return outDescSerie07;
//    }
//
//    public void setOutDescSerie07(String outDescSerie07) {
//        this.outDescSerie07 = outDescSerie07;
//    }
//
//    public String getOutDescSituacao05() {
//        return outDescSituacao05;
//    }
//
//    public void setOutDescSituacao05(String outDescSituacao05) {
//        this.outDescSituacao05 = outDescSituacao05;
//    }
//
//    public String getOutDescTipoEnsino() {
//        return outDescTipoEnsino;
//    }
//
//    public void setOutDescTipoEnsino(String outDescTipoEnsino) {
//        this.outDescTipoEnsino = outDescTipoEnsino;
//    }
//
//    public String getOutDescTipoEnsino02() {
//        return outDescTipoEnsino02;
//    }
//
//    public void setOutDescTipoEnsino02(String outDescTipoEnsino02) {
//        this.outDescTipoEnsino02 = outDescTipoEnsino02;
//    }
//
//    public String getOutDescTipoEnsino03() {
//        return outDescTipoEnsino03;
//    }
//
//    public void setOutDescTipoEnsino03(String outDescTipoEnsino03) {
//        this.outDescTipoEnsino03 = outDescTipoEnsino03;
//    }
//
//    public String getOutDescTipoEnsino04() {
//        return outDescTipoEnsino04;
//    }
//
//    public void setOutDescTipoEnsino04(String outDescTipoEnsino04) {
//        this.outDescTipoEnsino04 = outDescTipoEnsino04;
//    }
//
//    public String getOutDescTipoEnsino05() {
//        return outDescTipoEnsino05;
//    }
//
//    public void setOutDescTipoEnsino05(String outDescTipoEnsino05) {
//        this.outDescTipoEnsino05 = outDescTipoEnsino05;
//    }
//
//    public String getOutDescTipoEnsino07() {
//        return outDescTipoEnsino07;
//    }
//
//    public void setOutDescTipoEnsino07(String outDescTipoEnsino07) {
//        this.outDescTipoEnsino07 = outDescTipoEnsino07;
//    }
//
//    public String getOutDescTurma() {
//        return outDescTurma;
//    }
//
//    public void setOutDescTurma(String outDescTurma) {
//        this.outDescTurma = outDescTurma;
//    }
//
//    public String getOutDescTurma03() {
//        return outDescTurma03;
//    }
//
//    public void setOutDescTurma03(String outDescTurma03) {
//        this.outDescTurma03 = outDescTurma03;
//    }
//
//    public String getOutDescTurno03() {
//        return outDescTurno03;
//    }
//
//    public void setOutDescTurno03(String outDescTurno03) {
//        this.outDescTurno03 = outDescTurno03;
//    }
//
//    public String getOutDescTurno07() {
//        return outDescTurno07;
//    }
//
//    public void setOutDescTurno07(String outDescTurno07) {
//        this.outDescTurno07 = outDescTurno07;
//    }
//
//    public String getOutDescricaoTurno() {
//        return outDescricaoTurno;
//    }
//
//    public void setOutDescricaoTurno(String outDescricaoTurno) {
//        this.outDescricaoTurno = outDescricaoTurno;
//    }
//
//    public String getOutDigitoRA() {
//        return outDigitoRA;
//    }
//
//    public void setOutDigitoRA(String outDigitoRA) {
//        this.outDigitoRA = outDigitoRA;
//    }
//
//    public String getOutDigitoRA02() {
//        return outDigitoRA02;
//    }
//
//    public void setOutDigitoRA02(String outDigitoRA02) {
//        this.outDigitoRA02 = outDigitoRA02;
//    }
//
//    public String getOutDigitoRA03() {
//        return outDigitoRA03;
//    }
//
//    public void setOutDigitoRA03(String outDigitoRA03) {
//        this.outDigitoRA03 = outDigitoRA03;
//    }
//
//    public String getOutDigitoRA04() {
//        return outDigitoRA04;
//    }
//
//    public void setOutDigitoRA04(String outDigitoRA04) {
//        this.outDigitoRA04 = outDigitoRA04;
//    }
//
//    public String getOutDigitoRA05() {
//        return outDigitoRA05;
//    }
//
//    public void setOutDigitoRA05(String outDigitoRA05) {
//        this.outDigitoRA05 = outDigitoRA05;
//    }
//
//    public String getOutDigitoRA07() {
//        return outDigitoRA07;
//    }
//
//    public void setOutDigitoRA07(String outDigitoRA07) {
//        this.outDigitoRA07 = outDigitoRA07;
//    }
//
//    public String getOutDtaConfirmada04() {
//        return outDtaConfirmada04;
//    }
//
//    public void setOutDtaConfirmada04(String outDtaConfirmada04) {
//        this.outDtaConfirmada04 = outDtaConfirmada04;
//    }
//
//    public String getOutEndMatricula02() {
//        return outEndMatricula02;
//    }
//
//    public void setOutEndMatricula02(String outEndMatricula02) {
//        this.outEndMatricula02 = outEndMatricula02;
//    }
//
//    public String getOutEndUF07() {
//        return outEndUF07;
//    }
//
//    public void setOutEndUF07(String outEndUF07) {
//        this.outEndUF07 = outEndUF07;
//    }
//
//    public String getOutEnderecoAluno02() {
//        return outEnderecoAluno02;
//    }
//
//    public void setOutEnderecoAluno02(String outEnderecoAluno02) {
//        this.outEnderecoAluno02 = outEnderecoAluno02;
//    }
//
//    public String getOutEndreco07() {
//        return outEndreco07;
//    }
//
//    public void setOutEndreco07(String outEndreco07) {
//        this.outEndreco07 = outEndreco07;
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
//    public String getOutEscola() {
//        return outEscola;
//    }
//
//    public void setOutEscola(String outEscola) {
//        this.outEscola = outEscola;
//    }
//
//    public String getOutFase02() {
//        return outFase02;
//    }
//
//    public void setOutFase02(String outFase02) {
//        this.outFase02 = outFase02;
//    }
//
//    public String getOutFase07() {
//        return outFase07;
//    }
//
//    public void setOutFase07(String outFase07) {
//        this.outFase07 = outFase07;
//    }
//
//    public String getOutHoraAlter() {
//        return outHoraAlter;
//    }
//
//    public void setOutHoraAlter(String outHoraAlter) {
//        this.outHoraAlter = outHoraAlter;
//    }
//
//    public String getOutHoraAlter03() {
//        return outHoraAlter03;
//    }
//
//    public void setOutHoraAlter03(String outHoraAlter03) {
//        this.outHoraAlter03 = outHoraAlter03;
//    }
//
//    public String getOutHoraAlter04() {
//        return outHoraAlter04;
//    }
//
//    public void setOutHoraAlter04(String outHoraAlter04) {
//        this.outHoraAlter04 = outHoraAlter04;
//    }
//
//    public String getOutHoraAlter05() {
//        return outHoraAlter05;
//    }
//
//    public void setOutHoraAlter05(String outHoraAlter05) {
//        this.outHoraAlter05 = outHoraAlter05;
//    }
//
//    public String getOutHoraFimDomingo05() {
//        return outHoraFimDomingo05;
//    }
//
//    public void setOutHoraFimDomingo05(String outHoraFimDomingo05) {
//        this.outHoraFimDomingo05 = outHoraFimDomingo05;
//    }
//
//    public String getOutHoraFimQuarta05() {
//        return outHoraFimQuarta05;
//    }
//
//    public void setOutHoraFimQuarta05(String outHoraFimQuarta05) {
//        this.outHoraFimQuarta05 = outHoraFimQuarta05;
//    }
//
//    public String getOutHoraFimQuinta05() {
//        return outHoraFimQuinta05;
//    }
//
//    public void setOutHoraFimQuinta05(String outHoraFimQuinta05) {
//        this.outHoraFimQuinta05 = outHoraFimQuinta05;
//    }
//
//    public String getOutHoraFimSabado05() {
//        return outHoraFimSabado05;
//    }
//
//    public void setOutHoraFimSabado05(String outHoraFimSabado05) {
//        this.outHoraFimSabado05 = outHoraFimSabado05;
//    }
//
//    public String getOutHoraFimSegunda05() {
//        return outHoraFimSegunda05;
//    }
//
//    public void setOutHoraFimSegunda05(String outHoraFimSegunda05) {
//        this.outHoraFimSegunda05 = outHoraFimSegunda05;
//    }
//
//    public String getOutHoraFimSexta05() {
//        return outHoraFimSexta05;
//    }
//
//    public void setOutHoraFimSexta05(String outHoraFimSexta05) {
//        this.outHoraFimSexta05 = outHoraFimSexta05;
//    }
//
//    public String getOutHoraFimTerca05() {
//        return outHoraFimTerca05;
//    }
//
//    public void setOutHoraFimTerca05(String outHoraFimTerca05) {
//        this.outHoraFimTerca05 = outHoraFimTerca05;
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
//    public String getOutHoraFinal03() {
//        return outHoraFinal03;
//    }
//
//    public void setOutHoraFinal03(String outHoraFinal03) {
//        this.outHoraFinal03 = outHoraFinal03;
//    }
//
//    public String getOutHoraInicDomingo05() {
//        return outHoraInicDomingo05;
//    }
//
//    public void setOutHoraInicDomingo05(String outHoraInicDomingo05) {
//        this.outHoraInicDomingo05 = outHoraInicDomingo05;
//    }
//
//    public String getOutHoraInicQuarta05() {
//        return outHoraInicQuarta05;
//    }
//
//    public void setOutHoraInicQuarta05(String outHoraInicQuarta05) {
//        this.outHoraInicQuarta05 = outHoraInicQuarta05;
//    }
//
//    public String getOutHoraInicQuinta05() {
//        return outHoraInicQuinta05;
//    }
//
//    public void setOutHoraInicQuinta05(String outHoraInicQuinta05) {
//        this.outHoraInicQuinta05 = outHoraInicQuinta05;
//    }
//
//    public String getOutHoraInicSabado05() {
//        return outHoraInicSabado05;
//    }
//
//    public void setOutHoraInicSabado05(String outHoraInicSabado05) {
//        this.outHoraInicSabado05 = outHoraInicSabado05;
//    }
//
//    public String getOutHoraInicSegunda05() {
//        return outHoraInicSegunda05;
//    }
//
//    public void setOutHoraInicSegunda05(String outHoraInicSegunda05) {
//        this.outHoraInicSegunda05 = outHoraInicSegunda05;
//    }
//
//    public String getOutHoraInicSexta05() {
//        return outHoraInicSexta05;
//    }
//
//    public void setOutHoraInicSexta05(String outHoraInicSexta05) {
//        this.outHoraInicSexta05 = outHoraInicSexta05;
//    }
//
//    public String getOutHoraInicTerca05() {
//        return outHoraInicTerca05;
//    }
//
//    public void setOutHoraInicTerca05(String outHoraInicTerca05) {
//        this.outHoraInicTerca05 = outHoraInicTerca05;
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
//    public String getOutHoraInicial03() {
//        return outHoraInicial03;
//    }
//
//    public void setOutHoraInicial03(String outHoraInicial03) {
//        this.outHoraInicial03 = outHoraInicial03;
//    }
//
//    public String getOutIdentHab04() {
//        return outIdentHab04;
//    }
//
//    public void setOutIdentHab04(String outIdentHab04) {
//        this.outIdentHab04 = outIdentHab04;
//    }
//
//    public String getOutIdentHabNivel03() {
//        return outIdentHabNivel03;
//    }
//
//    public void setOutIdentHabNivel03(String outIdentHabNivel03) {
//        this.outIdentHabNivel03 = outIdentHabNivel03;
//    }
//
//    public String getOutIdentSerie04() {
//        return outIdentSerie04;
//    }
//
//    public void setOutIdentSerie04(String outIdentSerie04) {
//        this.outIdentSerie04 = outIdentSerie04;
//    }
//
//    public String getOutLitCenso() {
//        return outLitCenso;
//    }
//
//    public void setOutLitCenso(String outLitCenso) {
//        this.outLitCenso = outLitCenso;
//    }
//
//    public String getOutLitClasse07() {
//        return outLitClasse07;
//    }
//
//    public void setOutLitClasse07(String outLitClasse07) {
//        this.outLitClasse07 = outLitClasse07;
//    }
//
//    public String getOutLitHab04() {
//        return outLitHab04;
//    }
//
//    public void setOutLitHab04(String outLitHab04) {
//        this.outLitHab04 = outLitHab04;
//    }
//
//    public String getOutLitSerie04() {
//        return outLitSerie04;
//    }
//
//    public void setOutLitSerie04(String outLitSerie04) {
//        this.outLitSerie04 = outLitSerie04;
//    }
//
//    public String getOutLitSituacao05() {
//        return outLitSituacao05;
//    }
//
//    public void setOutLitSituacao05(String outLitSituacao05) {
//        this.outLitSituacao05 = outLitSituacao05;
//    }
//
//    public String getOutLitTransf() {
//        return outLitTransf;
//    }
//
//    public void setOutLitTransf(String outLitTransf) {
//        this.outLitTransf = outLitTransf;
//    }
//
//    public String getOutLitTransf03() {
//        return outLitTransf03;
//    }
//
//    public void setOutLitTransf03(String outLitTransf03) {
//        this.outLitTransf03 = outLitTransf03;
//    }
//
//    public String getOutLitTransf04() {
//        return outLitTransf04;
//    }
//
//    public void setOutLitTransf04(String outLitTransf04) {
//        this.outLitTransf04 = outLitTransf04;
//    }
//
//    public String getOutLitTransp() {
//        return outLitTransp;
//    }
//
//    public void setOutLitTransp(String outLitTransp) {
//        this.outLitTransp = outLitTransp;
//    }
//
//    public String getOutMsgCompartilhado() {
//        return outMsgCompartilhado;
//    }
//
//    public void setOutMsgCompartilhado(String outMsgCompartilhado) {
//        this.outMsgCompartilhado = outMsgCompartilhado;
//    }
//
//    public String getOutMsgCompartilhadoDet() {
//        return outMsgCompartilhadoDet;
//    }
//
//    public void setOutMsgCompartilhadoDet(String outMsgCompartilhadoDet) {
//        this.outMsgCompartilhadoDet = outMsgCompartilhadoDet;
//    }
//
//    public String getOutNivelEnsino03() {
//        return outNivelEnsino03;
//    }
//
//    public void setOutNivelEnsino03(String outNivelEnsino03) {
//        this.outNivelEnsino03 = outNivelEnsino03;
//    }
//
//    public String getOutNome02() {
//        return outNome02;
//    }
//
//    public void setOutNome02(String outNome02) {
//        this.outNome02 = outNome02;
//    }
//
//    public String getOutNomeAbrevEscola03() {
//        return outNomeAbrevEscola03;
//    }
//
//    public void setOutNomeAbrevEscola03(String outNomeAbrevEscola03) {
//        this.outNomeAbrevEscola03 = outNomeAbrevEscola03;
//    }
//
//    public String getOutNomeAbrevEscola04() {
//        return outNomeAbrevEscola04;
//    }
//
//    public void setOutNomeAbrevEscola04(String outNomeAbrevEscola04) {
//        this.outNomeAbrevEscola04 = outNomeAbrevEscola04;
//    }
//
//    public String getOutNomeAbrevEscola05() {
//        return outNomeAbrevEscola05;
//    }
//
//    public void setOutNomeAbrevEscola05(String outNomeAbrevEscola05) {
//        this.outNomeAbrevEscola05 = outNomeAbrevEscola05;
//    }
//
//    public String getOutNomeAluno() {
//        return outNomeAluno;
//    }
//
//    public void setOutNomeAluno(String outNomeAluno) {
//        this.outNomeAluno = outNomeAluno;
//    }
//
//    public String getOutNomeAluno03() {
//        return outNomeAluno03;
//    }
//
//    public void setOutNomeAluno03(String outNomeAluno03) {
//        this.outNomeAluno03 = outNomeAluno03;
//    }
//
//    public String getOutNomeAluno04() {
//        return outNomeAluno04;
//    }
//
//    public void setOutNomeAluno04(String outNomeAluno04) {
//        this.outNomeAluno04 = outNomeAluno04;
//    }
//
//    public String getOutNomeAluno05() {
//        return outNomeAluno05;
//    }
//
//    public void setOutNomeAluno05(String outNomeAluno05) {
//        this.outNomeAluno05 = outNomeAluno05;
//    }
//
//    public String getOutNomeAluno07() {
//        return outNomeAluno07;
//    }
//
//    public void setOutNomeAluno07(String outNomeAluno07) {
//        this.outNomeAluno07 = outNomeAluno07;
//    }
//
//    public String getOutNomeEscola02() {
//        return outNomeEscola02;
//    }
//
//    public void setOutNomeEscola02(String outNomeEscola02) {
//        this.outNomeEscola02 = outNomeEscola02;
//    }
//
//    public String getOutNomeEscola07() {
//        return outNomeEscola07;
//    }
//
//    public void setOutNomeEscola07(String outNomeEscola07) {
//        this.outNomeEscola07 = outNomeEscola07;
//    }
//
//    public String getOutNomeEscolaAloc07() {
//        return outNomeEscolaAloc07;
//    }
//
//    public void setOutNomeEscolaAloc07(String outNomeEscolaAloc07) {
//        this.outNomeEscolaAloc07 = outNomeEscolaAloc07;
//    }
//
//    public String getOutNomeEscolaSugestao07() {
//        return outNomeEscolaSugestao07;
//    }
//
//    public void setOutNomeEscolaSugestao07(String outNomeEscolaSugestao07) {
//        this.outNomeEscolaSugestao07 = outNomeEscolaSugestao07;
//    }
//
//    public String getOutNomeMae() {
//        return outNomeMae;
//    }
//
//    public void setOutNomeMae(String outNomeMae) {
//        this.outNomeMae = outNomeMae;
//    }
//
//    public String getOutNomeMae02() {
//        return outNomeMae02;
//    }
//
//    public void setOutNomeMae02(String outNomeMae02) {
//        this.outNomeMae02 = outNomeMae02;
//    }
//
//    public String getOutNomeMae03() {
//        return outNomeMae03;
//    }
//
//    public void setOutNomeMae03(String outNomeMae03) {
//        this.outNomeMae03 = outNomeMae03;
//    }
//
//    public String getOutNomeMae04() {
//        return outNomeMae04;
//    }
//
//    public void setOutNomeMae04(String outNomeMae04) {
//        this.outNomeMae04 = outNomeMae04;
//    }
//
//    public String getOutNomeMae05() {
//        return outNomeMae05;
//    }
//
//    public void setOutNomeMae05(String outNomeMae05) {
//        this.outNomeMae05 = outNomeMae05;
//    }
//
//    public String getOutNomeMae07() {
//        return outNomeMae07;
//    }
//
//    public void setOutNomeMae07(String outNomeMae07) {
//        this.outNomeMae07 = outNomeMae07;
//    }
//
//    public String getOutNomePai() {
//        return outNomePai;
//    }
//
//    public void setOutNomePai(String outNomePai) {
//        this.outNomePai = outNomePai;
//    }
//
//    public String getOutNomePai02() {
//        return outNomePai02;
//    }
//
//    public void setOutNomePai02(String outNomePai02) {
//        this.outNomePai02 = outNomePai02;
//    }
//
//    public String getOutNomePai03() {
//        return outNomePai03;
//    }
//
//    public void setOutNomePai03(String outNomePai03) {
//        this.outNomePai03 = outNomePai03;
//    }
//
//    public String getOutNomePai04() {
//        return outNomePai04;
//    }
//
//    public void setOutNomePai04(String outNomePai04) {
//        this.outNomePai04 = outNomePai04;
//    }
//
//    public String getOutNomePai05() {
//        return outNomePai05;
//    }
//
//    public void setOutNomePai05(String outNomePai05) {
//        this.outNomePai05 = outNomePai05;
//    }
//
//    public String getOutNomePai07() {
//        return outNomePai07;
//    }
//
//    public void setOutNomePai07(String outNomePai07) {
//        this.outNomePai07 = outNomePai07;
//    }
//
//    public String getOutNomeUnidade05() {
//        return outNomeUnidade05;
//    }
//
//    public void setOutNomeUnidade05(String outNomeUnidade05) {
//        this.outNomeUnidade05 = outNomeUnidade05;
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
//    public String getOutNumAluno() {
//        return outNumAluno;
//    }
//
//    public void setOutNumAluno(String outNumAluno) {
//        this.outNumAluno = outNumAluno;
//    }
//
//    public String getOutNumAluno03() {
//        return outNumAluno03;
//    }
//
//    public void setOutNumAluno03(String outNumAluno03) {
//        this.outNumAluno03 = outNumAluno03;
//    }
//
//    public String getOutNumAluno05() {
//        return outNumAluno05;
//    }
//
//    public void setOutNumAluno05(String outNumAluno05) {
//        this.outNumAluno05 = outNumAluno05;
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
//    public String getOutNumClasse03() {
//        return outNumClasse03;
//    }
//
//    public void setOutNumClasse03(String outNumClasse03) {
//        this.outNumClasse03 = outNumClasse03;
//    }
//
//    public String getOutNumClasse05() {
//        return outNumClasse05;
//    }
//
//    public void setOutNumClasse05(String outNumClasse05) {
//        this.outNumClasse05 = outNumClasse05;
//    }
//
//    public String getOutNumClasseAloc07() {
//        return outNumClasseAloc07;
//    }
//
//    public void setOutNumClasseAloc07(String outNumClasseAloc07) {
//        this.outNumClasseAloc07 = outNumClasseAloc07;
//    }
//
//    public String getOutObservacao() {
//        return outObservacao;
//    }
//
//    public void setOutObservacao(String outObservacao) {
//        this.outObservacao = outObservacao;
//    }
//
//    public String getOutObservacao04() {
//        return outObservacao04;
//    }
//
//    public void setOutObservacao04(String outObservacao04) {
//        this.outObservacao04 = outObservacao04;
//    }
//
//    public String getOutObservacao07() {
//        return outObservacao07;
//    }
//
//    public void setOutObservacao07(String outObservacao07) {
//        this.outObservacao07 = outObservacao07;
//    }
//
//    public String getOutOpcaoAlter() {
//        return outOpcaoAlter;
//    }
//
//    public void setOutOpcaoAlter(String outOpcaoAlter) {
//        this.outOpcaoAlter = outOpcaoAlter;
//    }
//
//    public String getOutOpcaoAlter03() {
//        return outOpcaoAlter03;
//    }
//
//    public void setOutOpcaoAlter03(String outOpcaoAlter03) {
//        this.outOpcaoAlter03 = outOpcaoAlter03;
//    }
//
//    public String getOutPronatec() {
//        return outPronatec;
//    }
//
//    public void setOutPronatec(String outPronatec) {
//        this.outPronatec = outPronatec;
//    }
//
//    public String getOutQtCargaHoraHab() {
//        return outQtCargaHoraHab;
//    }
//
//    public void setOutQtCargaHoraHab(String outQtCargaHoraHab) {
//        this.outQtCargaHoraHab = outQtCargaHoraHab;
//    }
//
//    public String getOutRA() {
//        return outRA;
//    }
//
//    public void setOutRA(String outRA) {
//        this.outRA = outRA;
//    }
//
//    public String getOutRA02() {
//        return outRA02;
//    }
//
//    public void setOutRA02(String outRA02) {
//        this.outRA02 = outRA02;
//    }
//
//    public String getOutRA03() {
//        return outRA03;
//    }
//
//    public void setOutRA03(String outRA03) {
//        this.outRA03 = outRA03;
//    }
//
//    public String getOutRA04() {
//        return outRA04;
//    }
//
//    public void setOutRA04(String outRA04) {
//        this.outRA04 = outRA04;
//    }
//
//    public String getOutRA05() {
//        return outRA05;
//    }
//
//    public void setOutRA05(String outRA05) {
//        this.outRA05 = outRA05;
//    }
//
//    public String getOutRA07() {
//        return outRA07;
//    }
//
//    public void setOutRA07(String outRA07) {
//        this.outRA07 = outRA07;
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
//    public String getOutTercaFeira() {
//        return outTercaFeira;
//    }
//
//    public void setOutTercaFeira(String outTercaFeira) {
//        this.outTercaFeira = outTercaFeira;
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
//    public String getOutSextaFeira() {
//        return outSextaFeira;
//    }
//
//    public void setOutSextaFeira(String outSextaFeira) {
//        this.outSextaFeira = outSextaFeira;
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
//    public String getOutDomingo() {
//        return outDomingo;
//    }
//
//    public void setOutDomingo(String outDomingo) {
//        this.outDomingo = outDomingo;
//    }
//
//    public String getSerie() {
//        return serie;
//    }
//
//    public void setSerie(String serie) {
//        this.serie = serie;
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
//    public String getOutSerie02() {
//        return outSerie02;
//    }
//
//    public void setOutSerie02(String outSerie02) {
//        this.outSerie02 = outSerie02;
//    }
//
//    public String getOutSerie03() {
//        return outSerie03;
//    }
//
//    public void setOutSerie03(String outSerie03) {
//        this.outSerie03 = outSerie03;
//    }
//
//    public String getOutSerie05() {
//        return outSerie05;
//    }
//
//    public void setOutSerie05(String outSerie05) {
//        this.outSerie05 = outSerie05;
//    }
//
//    public String getOutSerie07() {
//        return outSerie07;
//    }
//
//    public void setOutSerie07(String outSerie07) {
//        this.outSerie07 = outSerie07;
//    }
//
//    public String getOutSituacao04() {
//        return outSituacao04;
//    }
//
//    public void setOutSituacao04(String outSituacao04) {
//        this.outSituacao04 = outSituacao04;
//    }
//
//    public String getOutSugestao07() {
//        return outSugestao07;
//    }
//
//    public void setOutSugestao07(String outSugestao07) {
//        this.outSugestao07 = outSugestao07;
//    }
//
//    public String getOutTelResidencial02() {
//        return outTelResidencial02;
//    }
//
//    public void setOutTelResidencial02(String outTelResidencial02) {
//        this.outTelResidencial02 = outTelResidencial02;
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
//    public String getOutTipoClasse03() {
//        return outTipoClasse03;
//    }
//
//    public void setOutTipoClasse03(String outTipoClasse03) {
//        this.outTipoClasse03 = outTipoClasse03;
//    }
//
//    public String getTipoEnsino() {
//        return tipoEnsino;
//    }
//
//    public void setTipoEnsino(String tipoEnsino) {
//        this.tipoEnsino = tipoEnsino;
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
//    public String getOutTipoEnsino02() {
//        return outTipoEnsino02;
//    }
//
//    public void setOutTipoEnsino02(String outTipoEnsino02) {
//        this.outTipoEnsino02 = outTipoEnsino02;
//    }
//
//    public String getOutTipoEnsino03() {
//        return outTipoEnsino03;
//    }
//
//    public void setOutTipoEnsino03(String outTipoEnsino03) {
//        this.outTipoEnsino03 = outTipoEnsino03;
//    }
//
//    public String getOutTipoEnsino04() {
//        return outTipoEnsino04;
//    }
//
//    public void setOutTipoEnsino04(String outTipoEnsino04) {
//        this.outTipoEnsino04 = outTipoEnsino04;
//    }
//
//    public String getOutTipoEnsino05() {
//        return outTipoEnsino05;
//    }
//
//    public void setOutTipoEnsino05(String outTipoEnsino05) {
//        this.outTipoEnsino05 = outTipoEnsino05;
//    }
//
//    public String getOutTipoEnsino07() {
//        return outTipoEnsino07;
//    }
//
//    public void setOutTipoEnsino07(String outTipoEnsino07) {
//        this.outTipoEnsino07 = outTipoEnsino07;
//    }
//
//    public String getTurma() {
//        return turma;
//    }
//
//    public void setTurma(String turma) {
//        this.turma = turma;
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
//    public String getOutTurma03() {
//        return outTurma03;
//    }
//
//    public void setOutTurma03(String outTurma03) {
//        this.outTurma03 = outTurma03;
//    }
//
//    public String getOutTurma05() {
//        return outTurma05;
//    }
//
//    public void setOutTurma05(String outTurma05) {
//        this.outTurma05 = outTurma05;
//    }
//
//    public String getTurno() {
//        return turno;
//    }
//
//    public void setTurno(String turno) {
//        this.turno = turno;
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
//    public String getOutTurno03() {
//        return outTurno03;
//    }
//
//    public void setOutTurno03(String outTurno03) {
//        this.outTurno03 = outTurno03;
//    }
//
//    public String getOutTurno07() {
//        return outTurno07;
//    }
//
//    public void setOutTurno07(String outTurno07) {
//        this.outTurno07 = outTurno07;
//    }
//
//    public String getOutUF() {
//        return outUF;
//    }
//
//    public void setOutUF(String outUF) {
//        this.outUF = outUF;
//    }
//
//    public String getOutUF02() {
//        return outUF02;
//    }
//
//    public void setOutUF02(String outUF02) {
//        this.outUF02 = outUF02;
//    }
//
//    public String getOutUF03() {
//        return outUF03;
//    }
//
//    public void setOutUF03(String outUF03) {
//        this.outUF03 = outUF03;
//    }
//
//    public String getOutUF04() {
//        return outUF04;
//    }
//
//    public void setOutUF04(String outUF04) {
//        this.outUF04 = outUF04;
//    }
//
//    public String getOutUF05() {
//        return outUF05;
//    }
//
//    public void setOutUF05(String outUF05) {
//        this.outUF05 = outUF05;
//    }
//
//    public String getOutUF07() {
//        return outUF07;
//    }
//
//    public void setOutUF07(String outUF07) {
//        this.outUF07 = outUF07;
//    }
//
//    public String getOutUFAluno02() {
//        return outUFAluno02;
//    }
//
//    public void setOutUFAluno02(String outUFAluno02) {
//        this.outUFAluno02 = outUFAluno02;
//    }
//
//    public String getOutUFMatric02() {
//        return outUFMatric02;
//    }
//
//    public void setOutUFMatric02(String outUFMatric02) {
//        this.outUFMatric02 = outUFMatric02;
//    }
//
//    public String getSituacaoMatricula() {
//        return situacaoMatricula;
//    }
//
//    public void setSituacaoMatricula(String situacaoMatricula) {
//        this.situacaoMatricula = situacaoMatricula;
//    }
//}
