package br.com.produto.controller;

import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;

public interface ProdutoComponentListener {

    public void selecionaProduto(SelectEvent selecionaProduto);
    
    public void actionLocalizarEvent(ActionEvent actionEvent);
    
}
