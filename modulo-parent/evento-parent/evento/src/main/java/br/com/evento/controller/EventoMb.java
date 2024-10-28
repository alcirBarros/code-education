package br.com.evento.controller;

import br.com.context.model.evento.Evento;
import br.com.context.model.tipoevento.model.TipoEvento;
import br.com.service.auxiliar.tipoevento.TipoEventoService;
import br.com.service.evento.EventoService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class EventoMb extends AbstractMb {

    @Autowired
    private TipoEventoService tipoEventoService;
    @Autowired
    private EventoService eventoService;

    private List<TipoEvento> tipoTipoEventoList;

    private List<Evento> eventoList = new ArrayList<>();

    private Evento evento = new Evento();

    @PostConstruct
    public void init() {
        eventoList = eventoService.findAll();
        tipoTipoEventoList = tipoEventoService.findAll();
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            evento = eventoService.save(evento);
            eventoList = eventoService.findAll();
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
        evento = new Evento();
        modoTela.mudarParaLocalizacao();
    }

    public List<Evento> getEventoList() {
        return eventoList;
    }

    public void setEventoList(List<Evento> eventoList) {
        this.eventoList = eventoList;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public List<TipoEvento> getTipoTipoEventoList() {
        return tipoTipoEventoList;
    }
}
