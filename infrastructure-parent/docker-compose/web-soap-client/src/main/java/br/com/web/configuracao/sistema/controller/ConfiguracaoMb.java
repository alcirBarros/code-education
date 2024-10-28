package br.com.web.configuracao.sistema.controller;

import br.com.web.configuracao.sistema.model.Configuracao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.persistence.NoResultException;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
public class ConfiguracaoMb {

    private List<Configuracao> configuracaoList = new ArrayList();

    @PostConstruct
    public void init() {
        try {

            Configuracao configuracao = new Configuracao();
            configuracao.setTitulo("Sistema");
            configuracao.setVersao("1.00.00.00");
            configuracaoList.add(configuracao);

        } catch (NoResultException e) {
            e.printStackTrace();
        }
    }

    public List<Configuracao> getConfiguracaoList() {
        return configuracaoList;
    }
}
