package br.com.context.model.tipoconsultafichaaluno;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoConsultarFichaAlunoEnum implements Entidade {

    REGISTRO_GERAL("Registro Geral (RG)"),
    CADASTRO_PESSOA_FISICA("Cadastro Pessoa Física (CPF)"),
    INSTITUTO_NACIONAL_DE_ESTUDOS_E_PESQUISAS("Instituto Nacional de Estudos e Pesquisas (INEP)"),
    NUMERO_DE_IDENTIFICACAO_SOCIAL("Número de Identificação Social (NIS)"),
    CERTIDAO_NASCIMENTO("Certidão Nascimento"),
    ALUNO_NOME_COMPLETO("Aluno - Nome Completo"),
    DATA_NASCIMENTO("Data Nascimento"),
    MAE("Mãe"),
    PAI("Pai"),
    CONSULTAR_REGISTRO_ALUNO("Consultar Registro Aluno (RA)");

    private final String descricao;

    TipoConsultarFichaAlunoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getRandomId() {
        return this.ordinal();
    }

    @Override
    public Serializable getId() {
        return this.name();
    }

    @Override
    public String getOrderBy() {
        return this.name();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

}
