package br.com.context.model.tipodocumento;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoTramiteEnum implements Entidade {

    ESTABELECIMENTO("Estabelecimento"),
    USUARIO("Usuário"),
    CLIENTE("Cliente"),
    FORNECEDOR("Fornecedor");

    private final String descricao;

    private TipoTramiteEnum(String descricao) {
        this.descricao = descricao;
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
    public String getDisplay() {
        return this.descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return this.name();
    }
}
