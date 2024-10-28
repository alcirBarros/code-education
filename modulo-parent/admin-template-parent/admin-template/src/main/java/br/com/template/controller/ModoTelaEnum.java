package br.com.template.controller;

public enum ModoTelaEnum {

    LOCALIZACAO("Localização"),
    INSERCAO("Inserção"),
    ALTERACAO("Alteração"),
    VISUALIZACAO("Visualização"),
    PROCESSADO("Processado");

    private final String descricao;

    private ModoTelaEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
