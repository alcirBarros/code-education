package br.com.context.model.tiporesponsavel.enumerator;

import br.com.context.model.Entidade;
import java.io.Serializable;

public enum TipoResponsavelEnum implements Entidade {

    MAE("Mãe", 1),
    PAI("PAI", 2),
    TIO("TIO", 3),
    TIA("TIA", 4),
    IRMAO("IRMÃO", 5),
    IRMA("IRMÃ", 6),
    OUTROS("Outros", 7);

    private final String descricao;
    private final Integer orderBy;

    private TipoResponsavelEnum(String descricao, Integer orderBy) {
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
