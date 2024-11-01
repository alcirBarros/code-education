package br.com.pessoa.controller;

import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;

public interface PessoaComponentListener {

    public void selecionaPessoa(SelectEvent selecionaProduto);
    
    public void actionLocalizarEvent(ActionEvent actionEvent);
    
}
