package br.com.controller.websocket;

import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class WebSocketMb extends AbstractMb {

    @PostConstruct
    public void init() {
        System.out.println("br.com.controller.websocket.WebSocketMb.init()");
    }

    @Override
    public void carregarTela() {
    }

    @Override
    public void salvar() {
        try {
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaWebSocketSelectEvent(SelectEvent selectEvent) {
        modoTela.mudarParaVisualizacao();
    }

}
