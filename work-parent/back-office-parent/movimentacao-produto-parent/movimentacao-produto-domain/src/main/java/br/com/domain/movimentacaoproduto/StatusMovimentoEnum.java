package br.com.domain.movimentacaoproduto;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum StatusMovimentoEnum implements Entidade {

    DIGITADO("DIGITADO"),
    PROCESSADO("PROCESSADO"),
    EXCLUIDO("EXCLUÍDO");

    private final String descricao;

    private StatusMovimentoEnum(String descricao) {
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
    public Serializable getOrderBy() {
        return this.name();
    }

    @Override
    public String getDisplay() {
        return this.name();
    }

}
