package br.com.context.controller;

import br.com.context.model.Operador;
import br.com.service.modulo.administracao.operador.OperadorService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class OperadorMb extends AbstractMb {

    @Autowired
    private OperadorService operadorService;

    private Iterable<Operador> operadorList = new ArrayList<>();
    private Operador operador = new Operador();

    @PostConstruct
    public void init() {
        operadorList = operadorService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            operador = operadorService.save(operador);
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        operador = new Operador();
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        operador = new Operador();
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        operador = new Operador();
        modoTela.mudarParaLocalizacao();
    }

    public Iterable<Operador> getOperadorList() {
        return operadorList;
    }

    public Operador getOperador() {
        return operador;
    }
}
