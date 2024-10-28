package br.com.template.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractMb implements InterfaceMb {

    @Autowired
    protected ModoTela modoTela;

    @PostConstruct
    private void init() {
        System.out.println("br.com.template.controller.AbstractMb.init()");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("br.com.template.controller.AbstractMb.destroy()");
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

    //    public void permicaoInserir() {
//
//    }
//
//    public void permicaoAlterar() {
//
//    }
//
//    public void permicaoVisualizar() {
//
//    }
//
//    public void permicaoExcluir() {
//
//    }
//
//    public void permicaoProcessar() {
//
//    }
    public ModoTela getModoTela() {
        return modoTela;
    }
}
