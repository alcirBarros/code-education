//package br.com.controller.integracao.alterarcoletaclasse;
//
//import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasse;
//import br.com.service.integracao.alterarcoletaclasse.AlterarColetaClasseService;
////import br.com.service.modulo.integracao.alterarcoletaclasse.AlterarColetaClasseService;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope("request")
//public class AlterarColetaClasseMb {
//
//    @Autowired
//    private AlterarColetaClasseService alterarColetaClasseService;
//
//    private AlterarColetaClasse alterarColetaClasse = AlterarColetaClasse.criarInstancia();
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
//        alterarColetaClasse = alterarColetaClasseService.alterarColetaClasse(alterarColetaClasse);
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
//    }
//
//    public AlterarColetaClasse getAlterarColetaClasse() {
//        return alterarColetaClasse;
//    }
//
//    public void setAlterarColetaClasse(AlterarColetaClasse alterarColetaClasse) {
//        this.alterarColetaClasse = alterarColetaClasse;
//    }
//}
