package br.com.context.model.tipodadoclinico.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoDadoClinicoEnum implements Entidade {

    DADO_CLINICO("Dados Clinicos", 1),
    HISTORICO("Histórico Paciente", 2),
    OBSERVACAO("Observações Durante Consulta", 3),
    RELACIONAMENTO("Relacionamento", 4),
    VIDA_ADULTA("Vida Adulta", 5),
    OUTRO("Outros", 6);

    private final String descricao;
    private final Integer orderBy;

    private TipoDadoClinicoEnum(String descricao, Integer orderBy) {
        this.descricao = descricao;
        this.orderBy = orderBy;
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
    public Serializable getOrderBy() {
        return orderBy;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

}
