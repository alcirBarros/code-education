package br.com.webservice.dispose.classe;

import java.util.ArrayList;
import java.util.List;

class EscolaPojo {

    private String nome;

    private List<ClassePojo> classeList = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ClassePojo> getClasseList() {
        return classeList;
    }

    public void setClasseList(List<ClassePojo> classeList) {
        this.classeList = classeList;
    }
}
