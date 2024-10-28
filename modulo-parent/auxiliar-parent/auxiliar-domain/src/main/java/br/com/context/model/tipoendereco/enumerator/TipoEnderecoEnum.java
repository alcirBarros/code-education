package br.com.context.model.tipoendereco.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoEnderecoEnum implements Entidade {

    CASA("Casa", 1),
    TRABALHO("Trabalho", 2);

    private final String descricao;
    private final Integer orderBy;

    private TipoEnderecoEnum(String descricao, Integer orderBy) {
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
