package br.com.context.endereco.controller;

import br.com.context.model.cidade.CidadeEntity;
import br.com.context.model.logradouro.LogradouroEntity;
import java.util.List;
import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;

public interface EnderecoComponentListener {

    public List<CidadeEntity> completeMethodCidade(String query);

    public void selecionaCidade(SelectEvent selecionaProduto);

    public void actionUnlockedCidade();

    public List<LogradouroEntity> completeMethodLogradouro(String query);

    public void selecionaLogradouro(SelectEvent selecionaProduto);

    public void actionLocalizarEvent(ActionEvent actionEvent);

    public void actionUnlockedLogradouro();

}
