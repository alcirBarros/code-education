package br.com.context.model.diasemana.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoDiaSemanaEnum implements Entidade {

    SEGUNDA_FEIRA("Segunda-feira", 1),
    TERCA_FEIRA("Terça-feira", 2),
    QUARTA_FEIRA("Quarta-feira", 3),
    QUINTA_FEIRA("Quinta-feira", 4),
    SEXTA_FEIRA("Sexta-feira", 5),
    SABADO("Sábado", 6),
    DOMINGO("Domingo", 7);

    private final String descricao;
    private final Integer orderBy;

    private TipoDiaSemanaEnum(String descricao, Integer orderBy) {
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
