package br.com.context.model.statusresponse;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum StatusResponseEnum implements Entidade {

    OK(200),
    INTERNAL_SERVER_INTERRUPTER_METHOD(300);

    private final Integer value;

    private StatusResponseEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
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
        return name();
    }
}
