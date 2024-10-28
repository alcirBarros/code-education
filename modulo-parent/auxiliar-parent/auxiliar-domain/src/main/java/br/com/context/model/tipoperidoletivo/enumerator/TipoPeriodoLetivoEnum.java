package br.com.context.model.tipoperidoletivo.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoPeriodoLetivoEnum implements Entidade {

    PRIMEIRO_SEMESTRE(1),
    SEGUNDO_SEMESTRE(2);

    private final Integer orderBy;

    private TipoPeriodoLetivoEnum(Integer orderBy) {
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
        return this.name();
    }

}
