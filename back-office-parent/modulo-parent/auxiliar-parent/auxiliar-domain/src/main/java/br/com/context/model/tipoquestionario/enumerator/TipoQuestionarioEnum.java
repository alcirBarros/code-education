package br.com.context.model.tipoquestionario.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoQuestionarioEnum implements Entidade {

    ESTADO_CIVIL("Estado Civil", 1),
    ESCOLARIDADE("Escolaridade", 2);

    private final String descricao;
    private final Integer orderBy;

    private TipoQuestionarioEnum(String descricao, Integer orderBy) {
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
