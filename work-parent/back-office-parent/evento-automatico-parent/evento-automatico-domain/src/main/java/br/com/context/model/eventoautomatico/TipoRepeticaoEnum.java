package br.com.context.model.eventoautomatico;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoRepeticaoEnum implements Entidade, EnumInterface {

    DIARIO("Diário"),
    MENSAL("Mensal");

    private final String descricao;

    private TipoRepeticaoEnum(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String getValue(){
        return this.name();
    }

    @Override
    public String getDescricao() {
        return descricao;
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