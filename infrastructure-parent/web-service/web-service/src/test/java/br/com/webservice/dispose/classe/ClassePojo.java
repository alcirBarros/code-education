package br.com.webservice.dispose.classe;

import java.util.ArrayList;
import java.util.List;

class ClassePojo {

    private String numeroClasse;

    private String numeroSala;
    private String tipoTurno;
    private String turma;
    

    private List<AlunoPojo> alunoList = new ArrayList<>();

    public String getNumeroClasse() {
        return numeroClasse;
    }

    public void setNumeroClasse(String numeroClasse) {
        this.numeroClasse = numeroClasse;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }
    
    public String getTipoTurno() {
        return tipoTurno;
    }

    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<AlunoPojo> getAlunoList() {
        return alunoList;
    }

    public void setAlunoList(List<AlunoPojo> alunoList) {
        this.alunoList = alunoList;
    }
}
