//package br.com.controller.integracao.consultaformacaoclasse;
//
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
//import br.com.service.integracao.consultaformacaoclasse.ConsultaFormacaoClasseService;
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
//@Scope(ConfigurableBeanFactory.SCOPE_VIEW)
//public class ConsultaFormacaoClasseMb extends AbstractMb {
//
//    @Autowired
//    private ConsultaFormacaoClasseService consultaClasseAlunoPorEscolaService;
//
//    private ConsultaFormacaoClasse consultaFormacaoClasse = ConsultaFormacaoClasse.criarInstancia();
//
//    @PostConstruct
//    public void init() {
//
//    }
//
//    @Override
//    public void carregarTela() {
//        try {
//            consultaFormacaoClasse.setInNumClasse("232495192");
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
//    @Override
//    public void excluir() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//        modoTela.mudarParaLocalizacao();
//    }
//
//    @Override
//    public void cancelar() {
//        consultaFormacaoClasse = ConsultaFormacaoClasse.criarInstancia();
//        modoTela.mudarParaLocalizacao();
//    }
//
//    @Override
//    public void processar() {
//        consultaFormacaoClasse = consultaClasseAlunoPorEscolaService.consultaFormacaoClasse(consultaFormacaoClasse);
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//        modoTela.mudarParaProcessado();
//    }
//
//    public ConsultaFormacaoClasse getConsultaFormacaoClasse() {
//        return consultaFormacaoClasse;
//    }
//}
