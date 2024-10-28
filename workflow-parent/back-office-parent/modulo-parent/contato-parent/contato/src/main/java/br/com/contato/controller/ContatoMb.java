package br.com.contato.controller;

import br.com.context.model.contato.ContactEntity;
import br.com.service.contato.ContatoService;
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
public class ContatoMb extends AbstractMb {

    @Autowired
    private ContatoService contatoService;

    private List<ContactEntity> contatoList = new ArrayList<>();
    private ContactEntity contato = new ContactEntity();

    @PostConstruct
    public void init() {
        contatoList = contatoService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            contato = contatoService.save(contato);
            contatoList = contatoService.findAll();
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
        contato = new ContactEntity();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaContatoSelectEvent(SelectEvent selectEvent) {
        contato = (ContactEntity) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

}
