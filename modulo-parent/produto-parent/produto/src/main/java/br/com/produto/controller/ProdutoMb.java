package br.com.produto.controller;

import br.com.domain.grupoproduto.GrupoProduto;
import br.com.domain.produto.Produto;
import br.com.service.produto.ProdutoService;
import br.com.service.grupoproduto.GrupoProdutoService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class ProdutoMb extends AbstractMb {

    @Autowired
    private ProdutoService instituicaoService;
    @Autowired
    private GrupoProdutoService grupoProdutoService;

    private List<GrupoProduto> grupoProdutoList = new ArrayList<>();
    private List<Produto> produtoList = new ArrayList<>();
    private Produto produto = new Produto();

    @PostConstruct
    public void init() {
        grupoProdutoList = grupoProdutoService.findAll();
        produtoList = instituicaoService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            produto = instituicaoService.save(produto);
            produtoList = instituicaoService.findAll();
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
        produto = new Produto();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaProdutoSelectEvent(SelectEvent selectEvent) {
        produto = (Produto) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaGrupoProdutoAjaxBehaviorEvent(AjaxBehaviorEvent ajaxBehaviorEvent) {
        HtmlSelectOneMenu htmlSelectOneMenu = (HtmlSelectOneMenu) ajaxBehaviorEvent.getSource();
        GrupoProduto grupoProduto = (GrupoProduto) htmlSelectOneMenu.getValue();
    }

    public ProdutoComponentListener produtoComponentListener() {
        return new ProdutoComponentListener() {

            public void selecionaProduto(SelectEvent selecionaProduto) {
                produto = (Produto) selecionaProduto.getObject();
                modoTela.mudarParaVisualizacao();
            }

            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println("br.com.produto.controller.ProdutoMb.actionLocalizarEvent()");
            }

        };
    }

    public List<Produto> completaProdutoAtivo(String query) {
        
        Predicate<Produto> predicate = new Predicate<>() {
            @Override
            public boolean test(Produto arg0) {
                return arg0.getDescricao().contains(query);
            }
        };        
        return produtoList.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<GrupoProduto> getGrupoProdutoList() {
        return grupoProdutoList;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }
}
