package br.com.context.model.tipodocumento.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoDocumentoEnum implements Entidade {

    CPF("CPF", 1),
    CNPJ("CNPJ", 2);

    private final String descricao;
    private final Integer orderBy;

    private TipoDocumentoEnum(String descricao, Integer orderBy) {
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
