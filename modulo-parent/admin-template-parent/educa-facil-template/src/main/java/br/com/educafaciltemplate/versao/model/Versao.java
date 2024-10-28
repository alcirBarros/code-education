package br.com.educafaciltemplate.versao.model;

public class Versao {

    private String descricao;

    public Versao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
