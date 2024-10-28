package br.com.domain.movimentacaoproduto;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum StatusProdutoMovimentacaoEnum implements Entidade {

    DIGITADO("DIGITADO"),
    PROCESSADO("PROCESSADO"),
    ESTORNO("ESTORNO"),
    EXCLUIDO("EXCLUÍDO");

    private final String descricao;

    private StatusProdutoMovimentacaoEnum(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getRandomId() {
        return this.ordinal();
    }

    public String getDescricao() {
        return descricao;
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