package br.com.role.controller;

import br.com.context.model.Role;
import br.com.service.modulo.administracao.operador.RoleService;
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
public class RoleMb extends AbstractMb {

    @Autowired
    private RoleService roleService;

    private Iterable<Role> roleList = new ArrayList<>();
    private Role role = new Role();

    @PostConstruct
    public void init() {
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {
    }

    @Override
    public void salvar() {
        try {
            role = roleService.save(role);
            modoTela.mudarParaVisualizacao();
            roleList = roleService.findAll();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        role = new Role();
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        role = new Role();
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        role = new Role();
        modoTela.mudarParaLocalizacao();
    }

    public Iterable<Role> getRoleList() {
        return roleList;
    }

    public Role getRole() {
        return role;
    }
}
