package br.com.controller.movimentacaoproduto;

import br.com.domain.movimentacaoproduto.MovimentacaoProduto;
import br.com.domain.movimentacaoproduto.ProdutoMovimentacao;
import br.com.domain.produto.Produto;
import br.com.domain.tipodocumento.TipoDocumento;
import br.com.domain.tipodocumento.TipoTramitacaoDestino;
import br.com.domain.tipodocumento.TipoTramitacaoOrigem;
import br.com.produto.controller.ProdutoComponentListener;
import br.com.service.movimentacaoproduto.MovimentacaoProdutoService;
import br.com.service.produto.ProdutoService;
import br.com.service.tipodocumento.impl.TipoDocumentoService;

import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
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
public class MovimentacaoProdutoMb extends AbstractMb {

    @Autowired
    private MovimentacaoProdutoService movimentacaoProdutoService;
    @Autowired
    private TipoDocumentoService tipoDocumentoService;
    @Autowired
    private ProdutoService produtoService;

    private List<TipoDocumento> tipoDocumentoList;

    private List<MovimentacaoProduto> movimentacaoProdutoList = new ArrayList<>();

    private List<TipoTramitacaoOrigem> tipoTramitacaoOrigemList = new ArrayList<>();
    private List<TipoTramitacaoDestino> tipoTramitacaoDestinoList = new ArrayList<>();

    private MovimentacaoProduto movimentacaoProduto = new MovimentacaoProduto();
    private ProdutoMovimentacao produtoMovimentacao = new ProdutoMovimentacao();

    @PostConstruct
    public void init() {
        tipoDocumentoList = tipoDocumentoService.findAll();
        movimentacaoProdutoList = movimentacaoProdutoService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            movimentacaoProduto = movimentacaoProdutoService.save(movimentacaoProduto);
            movimentacaoProdutoList = movimentacaoProdutoService.findAll();
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
        movimentacaoProduto = new MovimentacaoProduto();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaMovimentacaoProdutoSelectEvent(SelectEvent selectEvent) {
        movimentacaoProduto = (MovimentacaoProduto) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaTipoDocumentoAjaxBehaviorEvent(AjaxBehaviorEvent ajaxBehaviorEvent) {
        HtmlSelectOneMenu htmlSelectOneMenu = (HtmlSelectOneMenu) ajaxBehaviorEvent.getSource();
        TipoDocumento tipoDocumento = (TipoDocumento) htmlSelectOneMenu.getValue();
        tipoTramitacaoOrigemList = tipoDocumento.getTipoTramitacaoOrigemList();
        tipoTramitacaoDestinoList = tipoDocumento.getTipoTramitacaoDestinoList();
    }

    public ProdutoComponentListener produtoComponentListener() {
        return new ProdutoComponentListener() {

            public void selecionaProduto(SelectEvent selecionaProduto) {
                Produto produto = (Produto) selecionaProduto.getObject();
                produtoMovimentacao.setProduto(produto);
            }

            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println("br.com.produto.controller.ProdutoMb.actionLocalizarEvent()");
            }

        };
    }

    public void adicionarProduto() {
        movimentacaoProduto.adicionarProduto(produtoMovimentacao);
        produtoMovimentacao = new ProdutoMovimentacao();
    }

    public List<MovimentacaoProduto> getMovimentacaoProdutoList() {
        return movimentacaoProdutoList;
    }

    public MovimentacaoProduto getMovimentacaoProduto() {
        return movimentacaoProduto;
    }

    public ProdutoMovimentacao getProdutoMovimentacao() {
        return produtoMovimentacao;
    }

    public List<TipoDocumento> getTipoDocumentoList() {
        return tipoDocumentoList;
    }

    public List<TipoTramitacaoOrigem> getTipoTramitacaoOrigemList() {
        return tipoTramitacaoOrigemList;
    }

    public List<TipoTramitacaoDestino> getTipoTramitacaoDestinoList() {
        return tipoTramitacaoDestinoList;
    }
}
