//package br.com.controller.integracao.realizarmatriculainfosemra;
//
//import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRA;
//import br.com.service.integracao.realizarmatriculainfosemra.RealizarMatriculaInfoSemRaService;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope("request")
//public class RealizarMatriculaSemRaMb {
//
//    @Autowired
//    private RealizarMatriculaInfoSemRaService realizarMatriculaInfoSemRaService;
//
//    private RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA = RealizarMatriculaInfoSemRA.criarInstancia();
//
//    @PostConstruct
//    public void init() {
//
//    }
//
//    public void carregarTela() {
//        try {
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
//        }
//    }
//
//    public void inserir() {
//    }
//
//    public void salvar() {
//        realizarMatriculaInfoSemRaService.realizarMatriculaInfoSemRA(realizarMatriculaInfoSemRA);
//    }
//
//    public void alterar() {
//    }
//
//    public void visualizar() {
//    }
//
//    public void excluir() {
//    }
//
//    public void cancelar() {
//    }
//
//    public void processar() {
//
//    }
//
//    public void localizar() {
//
//    }
//
//    public RealizarMatriculaInfoSemRA getRealizarMatriculaInfoSemRA() {
//        return realizarMatriculaInfoSemRA;
//    }
//
//    public void setRealizarMatriculaInfoSemRA(RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA) {
//        this.realizarMatriculaInfoSemRA = realizarMatriculaInfoSemRA;
//    }
//}
