package br.com.context.model.eventoautomatico;

public enum TerminoEnum {

    NUNCA,
    OCORRENCIA,
    DATA;

    public String value() {
        return this.name();
    }
}