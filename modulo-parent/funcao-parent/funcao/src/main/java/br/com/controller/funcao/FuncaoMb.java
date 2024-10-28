package br.com.controller.funcao;

import br.com.context.model.funcao.FuncaoEntity;
import br.com.service.funcao.FuncaoService;
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
public class FuncaoMb extends AbstractMb {

    @Autowired
    private FuncaoService pessoaService;

    private List<FuncaoEntity> funcaoList = new ArrayList<>();
    private FuncaoEntity funcao = new FuncaoEntity();

    @PostConstruct
    public void init() {
        funcaoList = pessoaService.findAll();
        System.out.println("br.com.pessoa.controller.Pessoa.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            funcao = pessoaService.save(funcao);
            funcaoList = pessoaService.findAll();
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
        funcao = new FuncaoEntity();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaFuncaoSelectEvent(SelectEvent selectEvent) {
        funcao = (FuncaoEntity) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }


}
