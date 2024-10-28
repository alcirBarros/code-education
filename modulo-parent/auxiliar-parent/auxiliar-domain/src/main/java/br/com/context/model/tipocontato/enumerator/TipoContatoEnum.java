package br.com.context.model.tipocontato.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoContatoEnum implements Entidade {

    TELEFONE("Telefone", 1),
    EMAIL("E-mail", 2),
    OUTROS("Outros", 3);

    private final String descricao;
    private final Integer orderBy;

    private TipoContatoEnum(String descricao, Integer orderBy) {
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
