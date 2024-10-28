package br.com.context.model.tipodocumento;

public enum TipoTramitacaoEnum {

    ORIGEM("Origem"),
    DESTINO("Destino");

    private final String descricao;

    private TipoTramitacaoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}