package br.com.context.pessoa.controller;

import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;

public interface PessoaComponentListener {

    public void selecionaPessoa(SelectEvent seleciona);
    
    public void actionLocalizarEvent(ActionEvent actionEvent);
    
}
