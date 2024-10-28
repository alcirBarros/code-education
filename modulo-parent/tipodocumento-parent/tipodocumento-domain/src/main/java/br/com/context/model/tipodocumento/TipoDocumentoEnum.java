package br.com.context.model.tipodocumento;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoDocumentoEnum implements Entidade {

    ACERTO_ESTOQUE("Acerto Estoque"),
    AQUISICAO("Aquisição"),
    DOACAO("Doação"),
    ESTORNO("Estorno"),
    NOTA_FISCAL("Nota Fiscal"),
    SOLICITACAO_PRODUTO("Solicitação Produto"),
    TRANSFENCIA("Transferência"),
    CONSUMO_INTERNO("Consumo interno"),
    DESCARTE("Descarte"),
    DEVOLUCAO("Devolução"),
    DISPENSACAO("Dispensação"),
    MANDADO_DE_SEGURANCA("Mandado de Segurança"),
    OUTROS("Outros");

    private final String descricao;

    private TipoDocumentoEnum(String descricao) {
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
