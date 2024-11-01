package br.com.eventoautomatico.controller;

import br.com.context.model.evento.Evento;
import br.com.context.model.eventoautomatico.EventoAutomatico;
import br.com.context.model.eventoautomatico.TipoFrequenciaEnum;
import br.com.context.model.eventoautomatico.TipoRepeticaoEnum;
//import br.com.projeto.exception.BusinessException;
import br.com.service.evento.EventoService;
import br.com.service.eventoautomatico.EventoAutomaticoService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.event.AjaxBehaviorEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class EventoAutomaticoMb extends AbstractMb {

    @Autowired
    private EventoService eventoService;
    @Autowired
    private EventoAutomaticoService eventoAutomaticoService;

//    @Autowired
//    private EventoAutomaticoService eventoAutomaticoService;
//
//    //-----------
//    private List<SelectItem> eventoItemList;
//    private List<SelectItem> tipoRepeticaoEnumItemList;
//
//    private TipoFrequenciaEnum[] tipoFrequenciaEnumArray;
//    private List<SelectItem> tipoFrequenciaEnumItemList;
//    private List<SelectItem> terminoEnumItemList;
//
//    //-----------
    private EventoAutomatico eventoAutomatico = new EventoAutomatico();

    private TipoFrequenciaEnum[] tipoFrequenciaEnumArray = TipoFrequenciaEnum.values(eventoAutomatico.getTipoRepeticaoEnum());
    private List<EventoAutomatico> eventoAutomaticoList = new ArrayList<>();
    private TipoRepeticaoEnum[] tipoRepeticaoEnumArray;
    private List<Evento> eventoList;
//    private FrequenciaRepeticao frequenciaRepeticao = FrequenciaRepeticao.criaInstancia();
//

    @PostConstruct
    private void init() {
        eventoAutomaticoList = eventoAutomaticoService.findAll();
        eventoList = eventoService.findAll();
        tipoRepeticaoEnumArray = TipoRepeticaoEnum.values();
    }
//

    @Override
    public void carregarTela() {

//            eventoItemList = JsfUtil.getSelectItems(eventoList, true);
//            tipoRepeticaoEnumItemList = JsfUtil.getSelectItemsFromEnumWithDescricao(TipoRepeticaoEnum.values(), false);
//            TipoRepeticaoEnum tipoRepeticaoEnum = eventoAutomatico.getTipoRepeticaoEnum();
//            TipoFrequenciaEnum[] tipoFrequenciaEnumArray = TipoFrequenciaEnum.values(tipoRepeticaoEnum);
//            tipoFrequenciaEnumItemList = JsfUtil.getSelectItemsFromEnumWithDescricao(tipoFrequenciaEnumArray, false);
//            terminoEnumItemList = JsfUtil.getSelectItems(TerminoEnum.values(), false);
//            eventoAutomaticoList = eventoAutomaticoService.listar();
    }

    @Override
    public void salvar() {
        try {
            eventoAutomatico = eventoAutomaticoService.save(eventoAutomatico);
            eventoAutomaticoList = eventoAutomaticoService.findAll();
            modoTela.mudarParaVisualizacao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
//            logger.error(ex.getMessage());
            System.err.println(ex);
        }
    }

    @Override
    public void inserir() {
        try {
            modoTela.mudarParaInsercao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
//            logger.error(ex.getMessage());
        }
    }

    @Override
    public void alterar() {
        try {
            modoTela.mudarParaAlteracao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
//            logger.error(ex.getMessage());
        }
    }

    @Override
    public void cancelar() {
        try {
            eventoAutomatico = new EventoAutomatico();
            modoTela.mudarParaLocalizacao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
//            logger.error(ex.getMessage());
        }
    }

    @Override
    public void excluir() {
        try {
            eventoAutomaticoService.delete(eventoAutomatico);
            eventoAutomatico = new EventoAutomatico();
            eventoAutomaticoList = eventoAutomaticoService.findAll();
//            JsfUtil.adicionarMensagemDeSucesso("message.excluidocomsucesso");
            modoTela.mudarParaLocalizacao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
//            logger.error(ex.getMessage());
        }
    }

    public void executar() {
        try {
//            eventoAutomatico = eventoAutomaticoService.executar(eventoAutomatico);
//            JsfUtil.adicionarMensagemDeSucesso("message.evento.info.executar", eventoAutomatico.getId());
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
//            logger.error(ex.getMessage());
        }
    }
//
//    public void agenarEventoAutomatico() {
//        try {
//            eventoAutomatico = eventoAutomaticoService.agenarEventoAutomatico(eventoAutomatico);
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//        }
//    }
//
//    public void localicarEventoAutomaticoAjaxBehaviorEvent(AjaxBehaviorEvent event) {
//        try {
//            Map<String, Object> map = event.getComponent().getAttributes();
//            Integer eventoAutomaticoId = (Integer) map.get("value");
//            eventoAutomatico = eventoAutomaticoService.localizar(eventoAutomaticoId);
//
//            TipoRepeticaoEnum tipoRepeticaoEnum = eventoAutomatico.getTipoRepeticaoEnum();
//            TipoFrequenciaEnum[] tipoFrequenciaEnumArray = TipoFrequenciaEnum.values(tipoRepeticaoEnum);
//            tipoFrequenciaEnumItemList = JsfUtil.getSelectItemsFromEnumWithDescricao(tipoFrequenciaEnumArray, false);
//
//            modo.mudarParaVisualizacao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//        }
//    }
//

    public void selecionaTipoRepeticaoAjaxBehaviorEvent(AjaxBehaviorEvent ajaxBehaviorEvent) {
        try {
            HtmlSelectOneMenu htmlSelectOneMenu = (HtmlSelectOneMenu) ajaxBehaviorEvent.getSource();
            TipoRepeticaoEnum tipoRepeticaoEnum = (TipoRepeticaoEnum) htmlSelectOneMenu.getValue();
            tipoFrequenciaEnumArray = TipoFrequenciaEnum.values(tipoRepeticaoEnum);
            eventoAutomatico.getFrequenciaRepeticaoList().clear();
 //       } catch (BusinessException ex) {
            //    JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
        } catch (Exception ex) {
            //    logger.error(ex.getMessage());
        }
    }
//
//    public void selecionarEventoAutomaticoSelectEvent(SelectEvent e) {
//        try {
//            EventoAutomatico eventoAutomatico = (EventoAutomatico) e.getObject();
//            this.eventoAutomatico = eventoAutomaticoService.localizar(eventoAutomatico.getId());
//            modo.mudarParaVisualizacao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//        }
//    }
//
//    public void carregarEventoAutomatico(EventoAutomatico eventoAutomatico) {
//        try {
//            Integer eventoAutomaticoId = eventoAutomatico.getId();
//            this.eventoAutomatico = eventoAutomaticoService.localizar(eventoAutomaticoId);
//
//            TipoRepeticaoEnum tipoRepeticaoEnum = eventoAutomatico.getTipoRepeticaoEnum();
//            TipoFrequenciaEnum[] tipoFrequenciaEnumArray = TipoFrequenciaEnum.values(tipoRepeticaoEnum);
//            tipoFrequenciaEnumItemList = JsfUtil.getSelectItemsFromEnumWithDescricao(tipoFrequenciaEnumArray, false);
//
//            modo.mudarParaVisualizacao();
//        } catch (BusinessException ex) {
//            JsfUtil.adicionarMensagemDeErro(ex.getMessage(), ex.getArgs());
//        } catch (Exception ex) {
//            logger.error(ex.getMessage());
//        }
//    }
//
//    public void selecionaTerminoEnumAjaxBehaviorEvent(AjaxBehaviorEvent ajaxBehaviorEvent) {
//        SelectOneRadio htmlSelectOneMenu = (SelectOneRadio) ajaxBehaviorEvent.getSource();
//        TerminoEnum terminoEnum = (TerminoEnum) htmlSelectOneMenu.getValue();
//        eventoAutomatico.terminoExecucao(terminoEnum);
//    }
//

    public List<Evento> getEventoList() {
        return eventoList;
    }

    public TipoRepeticaoEnum[] getTipoRepeticaoEnumArray() {
        return tipoRepeticaoEnumArray;
    }

    public TipoFrequenciaEnum[] getTipoFrequenciaEnumArray() {
        return tipoFrequenciaEnumArray;
    }

    public EventoAutomatico getEventoAutomatico() {
        return eventoAutomatico;
    }

    public void setEventoAutomatico(EventoAutomatico eventoAutomatico) {
        this.eventoAutomatico = eventoAutomatico;
    }
}
