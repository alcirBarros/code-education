package br.com.context.model.tipodocumento;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoExigePreenchimentoEnum implements Entidade {

    NUMERO_NOTA("Número nota"),
    VALOR_UNITARIO("Valor Unitário"),
    NUMERO_LOTE("Número Lote"),
    DATA_VALIDADE("Data Validade"),
    OBSERVAÇÃO("Observação");

    private final String descricao;

    private TipoExigePreenchimentoEnum(String descricao) {
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
