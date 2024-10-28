package br.com.template.controller;

import br.com.template.scoped.ConfigurableBeanFactory;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ModoTela {

    @PostConstruct
    public void init() {
        System.out.println("br.com.template.controller.ModoTela.init()");
    }

    private ModoTelaEnum modotela = ModoTelaEnum.LOCALIZACAO;

    public boolean isLocalizacao() {
        return modotela.equals(ModoTelaEnum.LOCALIZACAO);
    }

    public boolean isVisualizacao() {
        return modotela.equals(ModoTelaEnum.VISUALIZACAO);
    }

    public boolean isInsercao() {
        return modotela.equals(ModoTelaEnum.INSERCAO);
    }

    public boolean isAlteracao() {
        return modotela.equals(ModoTelaEnum.ALTERACAO);
    }

    public boolean isInsercaoOrAlteracao() {
        return isInsercao() || isAlteracao();
    }

    public boolean isInsercaoOrAlteracaoOrVisualizacao() {
        return isInsercao() || isAlteracao() || isVisualizacao();
    }
    
    public void mudarParaLocalizacao() {
        modotela = ModoTelaEnum.LOCALIZACAO;
    }

    public void mudarParaInsercao() {
        modotela = ModoTelaEnum.INSERCAO;
    }

    public void mudarParaAlteracao() {
        modotela = ModoTelaEnum.ALTERACAO;
    }

    public void mudarParaVisualizacao() {
        modotela = ModoTelaEnum.VISUALIZACAO;
    }

    public void mudarParaProcessado() {
        modotela = ModoTelaEnum.PROCESSADO;
    }

    public ModoTelaEnum getModotela() {
        return modotela;
    }
}
