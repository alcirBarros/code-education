package br.com.context.model.tipoturno.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoTurnoEnum implements Entidade {

    MANHA,
    INTERMEDIARIO,
    TARDE,
    VESPERTINO,
    NOITE,
    INTEGRAL,
    OUTRO;

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
        return this.name();
    }

}
