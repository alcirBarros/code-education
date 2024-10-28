package br.com.web.configuracao.sistema.controller;

import br.com.projeto.configuracao.Configuracao;
import br.com.template.controller.AbstractMb;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
//import javax.persistence.NoResultException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
public class ConfiguracaoMb extends AbstractMb {

//    @Autowired
//    private List<ConfiguracaoProjeto> versaoList;

    @Autowired
    private Environment env;

    private String[] activeProfiles;
    private String[] defaultProfiles;

    private final List<Configuracao> configuracaoList = new ArrayList();

    @PostConstruct
    public void init() {
//        try {
//            activeProfiles = env.getActiveProfiles();
//            defaultProfiles = env.getDefaultProfiles();
//
//            for (ConfiguracaoProjeto configuracaoService : versaoList) {
//                configuracaoList.addAll(configuracaoService.findAll());
//            }
//        } catch (NoResultException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void inserir() {
        modoTela.mudarParaInsercao();
    }

    @Override
    public void salvar() {
        modoTela.mudarParaVisualizacao();
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

    @Override
    public void processar() {
        modoTela.mudarParaProcessado();
    }

    public String[] getActiveProfiles() {
        return activeProfiles;
    }

    public void setActiveProfiles(String[] activeProfiles) {
        this.activeProfiles = activeProfiles;
    }

    public String[] getDefaultProfiles() {
        return defaultProfiles;
    }

    public void setDefaultProfiles(String[] defaultProfiles) {
        this.defaultProfiles = defaultProfiles;
    }

    public List<Configuracao> getConfiguracaoList() {
        return configuracaoList;
    }
}
