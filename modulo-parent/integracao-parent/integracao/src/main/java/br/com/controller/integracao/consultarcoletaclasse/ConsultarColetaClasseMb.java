//package br.com.controller.integracao.consultarcoletaclasse;
//
//import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
//import br.com.service.integracao.consultarcoletaclasse.ConsultarColetaClasseService;
//import br.com.template.controller.AbstractMb;
//import br.com.template.scoped.ConfigurableBeanFactory;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
//public class ConsultarColetaClasseMb extends AbstractMb {
//
//    @Autowired
//    private ConsultarColetaClasseService consultarColetaClasseService;
//
//    private ConsultarColetaClasse consultarColetaClasse = ConsultarColetaClasse.criarInstancia();
//
//    @PostConstruct
//    public void init() {
//
//    }
//
//    @Override
//    public void carregarTela() {
//        try {
//            consultarColetaClasse.setInAno("2019");
//            consultarColetaClasse.setInNumClasse("232495192");
//        } catch (Exception e) {
//            e.printStackTrace();
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
//        }
//    }
//
//    @Override
//    public void inserir() {
//        modoTela.mudarParaInsercao();
//    }
//
//    @Override
//    public void salvar() {
//        modoTela.mudarParaVisualizacao();
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//    }
//
//    @Override
//    public void alterar() {
//        modoTela.mudarParaAlteracao();
//    }
//
//    public void visualizar() {
//    }
//
//    @Override
//    public void excluir() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//        modoTela.mudarParaLocalizacao();
//    }
//
//    @Override
//    public void cancelar() {
//        consultarColetaClasse = ConsultarColetaClasse.criarInstancia();
//        modoTela.mudarParaLocalizacao();
//    }
//
//    @Override
//    public void processar() {
//        consultarColetaClasse = consultarColetaClasseService.consultarColetaClasse(consultarColetaClasse);
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//        modoTela.mudarParaProcessado();
//    }
//
//    public ConsultarColetaClasse getConsultarColetaClasse() {
//        return consultarColetaClasse;
//    }
//
//    public void setConsultarColetaClasse(ConsultarColetaClasse consultarColetaClasse) {
//        this.consultarColetaClasse = consultarColetaClasse;
//    }
//}
