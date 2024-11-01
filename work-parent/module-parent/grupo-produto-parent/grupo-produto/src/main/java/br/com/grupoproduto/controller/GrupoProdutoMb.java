package br.com.grupoproduto.controller;

import br.com.context.model.grupoproduto.GrupoProduto;
import br.com.service.grupoproduto.GrupoProdutoService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class GrupoProdutoMb extends AbstractMb {

    @Autowired
    private GrupoProdutoService grupoProdutoService;

    private List<GrupoProduto> grupoProdutoList = new ArrayList<>();
    private GrupoProduto grupoProduto = new GrupoProduto();

    @PostConstruct
    public void init() {
        grupoProdutoList = grupoProdutoService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            grupoProduto = grupoProdutoService.save(grupoProduto);
            grupoProdutoList = grupoProdutoService.findAll();
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
        grupoProduto = new GrupoProduto();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaGrupoProdutoSelectEvent(SelectEvent selectEvent) {
        grupoProduto = (GrupoProduto) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public List<GrupoProduto> getGrupoProdutoList() {
        return grupoProdutoList;
    }

    public GrupoProduto getGrupoProduto() {
        return grupoProduto;
    }
}
