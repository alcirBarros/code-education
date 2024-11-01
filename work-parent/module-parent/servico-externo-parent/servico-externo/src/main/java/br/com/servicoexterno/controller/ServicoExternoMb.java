package br.com.servicoexterno.controller;

import br.com.context.model.servicoexterno.model.ServicoExterno;
import br.com.context.model.servicoexterno.model.TipoServicoExterno;
import br.com.service.modulo.configuracao.serviceexterno.ServicoExternoService;

import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class ServicoExternoMb extends AbstractMb {

    @Autowired
    private ServicoExternoService servicoExternoService;

    private ServicoExterno servicoExterno = new ServicoExterno();

    @PostConstruct
    public void init() {
        System.out.println("br.com.servicoexterno.controller.ServicoExternoMb.init()");
    }

    @Override
    public void carregarTela() {
        servicoExterno = servicoExternoService.findByTipoServicoExterno(TipoServicoExterno.PRODESP);
        System.out.println("br.com.servicoexterno.controller.ServicoExternoMb.carregarTela()");
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

    public ServicoExterno getServicoExterno() {
        return servicoExterno;
    }
}
