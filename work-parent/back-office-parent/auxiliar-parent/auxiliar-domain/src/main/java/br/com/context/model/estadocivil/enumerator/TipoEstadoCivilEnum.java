package br.com.context.model.estadocivil.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoEstadoCivilEnum implements Entidade {

    SOLTEIRO("Solteiro", 1),
    CASADO("Casado", 2);

    private final String descricao;
    private final Integer orderBy;

    TipoEstadoCivilEnum(String descricao, Integer orderBy) {
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
