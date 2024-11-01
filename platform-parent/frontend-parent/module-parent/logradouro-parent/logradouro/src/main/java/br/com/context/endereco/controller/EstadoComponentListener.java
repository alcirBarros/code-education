package br.com.context.endereco.controller;

import br.com.context.model.estado.EstadoEntity;
import java.util.List;
import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;

public interface EstadoComponentListener {

    public List<EstadoEntity> completeMethodEstado(String query);

    public void selecionaEstado(SelectEvent selecionaProduto);

    public void actionLocalizarEstadoEvent(ActionEvent actionEvent);
    
    public void actionUnlockedEstado();

}
