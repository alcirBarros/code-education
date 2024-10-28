package br.com.context.model.funcao;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoFuncaoEnum implements Entidade {

    INCLUIR_COLETA_CLASSE,
    TIPO_DOCUMENTO;

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
