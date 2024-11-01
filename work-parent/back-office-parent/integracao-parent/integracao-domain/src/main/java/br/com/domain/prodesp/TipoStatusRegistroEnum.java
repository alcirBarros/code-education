package br.com.domain.prodesp;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoStatusRegistroEnum implements Entidade {

    DIGITACAO("DIGITAÇÃO"),
    PROCESSADO("PROCESSADO"),
    EXCLUIDO("EXCLUIDO"),
    ERRO("ERRO");

    private final String descricao;

    private TipoStatusRegistroEnum(String descricao) {
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
    public String getOrderBy() {
        return this.name();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

}
