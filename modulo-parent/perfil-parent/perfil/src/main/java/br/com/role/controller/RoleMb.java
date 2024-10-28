package br.com.role.controller;

import br.com.context.model.PerfilEntity;
import br.com.service.perfil.PerfilService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import java.util.ArrayList;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class RoleMb extends AbstractMb {

    @Autowired
    private PerfilService perfilService;

    private Iterable<PerfilEntity> operadorList = new ArrayList<>();
    private PerfilEntity perfil = new PerfilEntity();

    @PostConstruct
    public void init() {
        operadorList = perfilService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            perfil = perfilService.save(perfil);
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        perfil = new PerfilEntity();
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        perfil = new PerfilEntity();
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        perfil = new PerfilEntity();
        modoTela.mudarParaLocalizacao();
    }

    public Iterable<PerfilEntity> getOperadorList() {
        return operadorList;
    }

    public PerfilEntity getRole() {
        return perfil;
    }
}
