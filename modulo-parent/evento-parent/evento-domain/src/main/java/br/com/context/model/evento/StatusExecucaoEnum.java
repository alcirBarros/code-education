package br.com.context.model.evento;

public enum StatusExecucaoEnum {

    NAO_AGENDADO("Não Agendado"),
    AGENDADO("Agendado"),
    EXECUTANDO("Executando"),
    EXECUTADO("Executado"),
    NAO_EXECUTADO("Não Executado");
    
    private final String descricao;

    private StatusExecucaoEnum(String descricao) {
        this.descricao = descricao;
    }
        
    public String value() {
        return this.name();
    }

    public String getDescricao() {
        return descricao;
    }
}
