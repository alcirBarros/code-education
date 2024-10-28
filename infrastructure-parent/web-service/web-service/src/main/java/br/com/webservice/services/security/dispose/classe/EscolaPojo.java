package br.com.webservice.services.security.dispose.classe;

import java.util.ArrayList;
import java.util.List;

class EscolaPojo {

    private String codigoEscola;
    private String nome;

    private List<ClassePojo> classeList = new ArrayList<>();

    public String getCodigoEscola() {
        return codigoEscola;
    }

    public void setCodigoEscola(String codigoEscola) {
        this.codigoEscola = codigoEscola;
    }

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
