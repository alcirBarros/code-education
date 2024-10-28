package br.com.paciente.controller;

import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;

public interface PacienteComponentListener {

    public void selecionaPessoa(SelectEvent selecionaPessoa);
    
    public void actionLocalizarEvent(ActionEvent actionEvent);
    
}
