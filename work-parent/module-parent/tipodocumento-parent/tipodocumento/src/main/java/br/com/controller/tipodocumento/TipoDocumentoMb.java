package br.com.controller.tipodocumento;

import br.com.context.model.tipodocumento.TipoExigePreenchimentoEntity;
import br.com.context.model.tipodocumento.TipoDocumentoEntity;
import br.com.context.model.tipodocumento.TipoDocumentoEnum;
import br.com.context.model.tipodocumento.TipoExigePreenchimentoEnum;
import br.com.context.model.tipodocumento.TipoExigeTramiteEnum;
import br.com.context.model.tipodocumento.TipoMovimentacaoEnum;
import br.com.context.model.tipodocumento.TipoTramitacaoDestinoEntity;
import br.com.context.model.tipodocumento.TipoTramitacaoOrigemEntity;
import br.com.context.model.tipodocumento.TipoTramiteEnum;
import br.com.service.tipodocumento.ITipoDocumentoService;
import br.com.service.tipoexigepreenchimento.impl.TipoExigePreenchimentoService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.component.selectonemenu.SelectOneMenu;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_VIEW)
public class TipoDocumentoMb extends AbstractMb {

    @Autowired
    private TipoExigePreenchimentoService tipoExigePreenchimentoService;
    @Autowired
    private ITipoDocumentoService tipoDocumentoService;

    private List<TipoExigePreenchimentoEntity> tipoExigePreenchimentoList;
    private TipoDocumentoEnum[] tipoDocumentoEnumArray;
    private TipoMovimentacaoEnum[] tipoMovimentacaoEnumArray;
    private TipoExigeTramiteEnum[] tipoExigeTramiteEnumArray;
    private TipoTramiteEnum[] tipoTramiteEnumArray;
    private TipoExigePreenchimentoEnum[] tipoExigePreenchimentoEnumArray;

    private List<TipoDocumentoEntity> tipoDocumentoList = new ArrayList<>();

    private TipoExigePreenchimentoEntity exigePreenchimento = new TipoExigePreenchimentoEntity();

    private TipoTramitacaoOrigemEntity tipoTramitacaoOrigem = new TipoTramitacaoOrigemEntity();
    private TipoTramitacaoDestinoEntity tipoTramitacaoDestino = new TipoTramitacaoDestinoEntity();

    private TipoDocumentoEntity tipoDocumento = new TipoDocumentoEntity();
    
    private Object objectTest;

    @PostConstruct
    public void init() {
        tipoDocumentoList = tipoDocumentoService.findAll();
        tipoExigePreenchimentoList = tipoExigePreenchimentoService.findAll();
        tipoDocumentoEnumArray = TipoDocumentoEnum.values();
        tipoMovimentacaoEnumArray = TipoMovimentacaoEnum.values();
        tipoExigeTramiteEnumArray = TipoExigeTramiteEnum.values();
        tipoTramiteEnumArray = TipoTramiteEnum.values();
        tipoExigePreenchimentoEnumArray = TipoExigePreenchimentoEnum.values();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            tipoDocumento = tipoDocumentoService.save(tipoDocumento);
            tipoDocumentoList = tipoDocumentoService.findAll();
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
        tipoDocumento = new TipoDocumentoEntity();
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void processar() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        modoTela.mudarParaProcessado();
    }

    public void selecionaInstituicaoSelectEvent(SelectEvent selectEvent) {
        tipoDocumento = (TipoDocumentoEntity) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaTipoExigePreenchimentoEnumAjaxBehaviorEvent(AjaxBehaviorEvent ajaxBehaviorEvent) {
        SelectOneMenu htmlSelectOneMenu = (SelectOneMenu) ajaxBehaviorEvent.getSource();
        TipoExigePreenchimentoEnum tipoExigePreenchimentoEnum = (TipoExigePreenchimentoEnum) htmlSelectOneMenu.getValue();

        exigePreenchimento.setTipoExigePreenchimentoEnum(tipoExigePreenchimentoEnum);
//        tipoDocumento.getExigePreenchimentoList().add(exigePreenchimento);

        exigePreenchimento = new TipoExigePreenchimentoEntity();
    }

    public void adicionarTramiteOrigem() {
        tipoTramitacaoOrigem.setTipoDocumento(tipoDocumento);
        tipoDocumento.getTipoTramitacaoOrigemList().add(tipoTramitacaoOrigem);
        tipoTramitacaoOrigem = new TipoTramitacaoOrigemEntity();
    }

    public void adicionarTramiteDestino() {
        tipoTramitacaoDestino.setTipoDocumento(tipoDocumento);
        tipoDocumento.getTipoTramitacaoDestinoList().add(tipoTramitacaoDestino);
        tipoTramitacaoDestino = new TipoTramitacaoDestinoEntity();
    }

    public TipoDocumentoEnum[] getTipoDocumentoEnumArray() {
        return tipoDocumentoEnumArray;
    }

    public TipoMovimentacaoEnum[] getTipoMovimentacaoEnumArray() {
        return tipoMovimentacaoEnumArray;
    }

    public TipoExigeTramiteEnum[] getTipoExigeTramiteEnumArray() {
        return tipoExigeTramiteEnumArray;
    }

    public TipoTramiteEnum[] getTipoTramiteEnumArray() {
        return tipoTramiteEnumArray;
    }

    public TipoExigePreenchimentoEnum[] getTipoExigePreenchimentoEnumArray() {
        return tipoExigePreenchimentoEnumArray;
    }

    public List<TipoDocumentoEntity> getTipoDocumentoList() {
        return tipoDocumentoList;
    }

    public List<TipoExigePreenchimentoEntity> getTipoExigePreenchimentoList() {
        return tipoExigePreenchimentoList;
    }

    public TipoExigePreenchimentoEntity getExigePreenchimento() {
        return exigePreenchimento;
    }

    public TipoTramitacaoOrigemEntity getTipoTramitacaoOrigem() {
        return tipoTramitacaoOrigem;
    }

    public void setTipoTramitacaoOrigem(TipoTramitacaoOrigemEntity tipoTramitacaoOrigem) {
        this.tipoTramitacaoOrigem = tipoTramitacaoOrigem;
    }

    public TipoTramitacaoDestinoEntity getTipoTramitacaoDestino() {
        return tipoTramitacaoDestino;
    }

    public void setTipoTramitacaoDestino(TipoTramitacaoDestinoEntity tipoTramitacaoDestino) {
        this.tipoTramitacaoDestino = tipoTramitacaoDestino;
    }

    public TipoDocumentoEntity getTipoDocumento() {
        return tipoDocumento;
    }

    public Object getObjectTest() {
        return objectTest;
    }

    public void setObjectTest(Object objectTest) {
        this.objectTest = objectTest;
    }
}
