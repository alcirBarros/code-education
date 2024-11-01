package br.com.instituicao.controller;

import br.com.context.model.InstituicaoEntity;
import br.com.service.modulo.administracao.instituicao.InstituicaoService;
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
public class InstituicaoMb extends AbstractMb {

    @Autowired
    private InstituicaoService instituicaoService;

    private List<InstituicaoEntity> instituicaoEntityList = new ArrayList<>();
    private InstituicaoEntity instituicaoEntity = new InstituicaoEntity();

    @PostConstruct
    public void init() {
        instituicaoEntityList = instituicaoService.findAll();
        System.out.println("br.com.instituicao.controller.InstituicaoMb.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            instituicaoEntity = instituicaoService.save(instituicaoEntity);
            instituicaoEntityList = instituicaoService.findAll();
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
        instituicaoEntity = new InstituicaoEntity();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaInstituicaoSelectEvent(SelectEvent selectEvent) {
        instituicaoEntity = (InstituicaoEntity) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public InstituicaoEntity getInstituicao() {
        return instituicaoEntity;
    }

    public List<InstituicaoEntity> getInstituicaoList() {
        return instituicaoEntityList;
    }
}