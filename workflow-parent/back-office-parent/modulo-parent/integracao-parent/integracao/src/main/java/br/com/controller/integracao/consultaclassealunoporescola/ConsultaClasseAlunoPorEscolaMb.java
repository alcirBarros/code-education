//package br.com.controller.integracao.consultaclassealunoporescola;
//
//import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
//import br.com.service.integracao.consultaclassealunoporescola.ConsultaClasseAlunoPorEscolaService;
//import br.com.template.controller.AbstractMb;
//import br.com.template.scoped.ConfigurableBeanFactory;
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
//public class ConsultaClasseAlunoPorEscolaMb extends AbstractMb {
//
//    @Autowired
//    private ConsultaClasseAlunoPorEscolaService consultaClasseAlunoPorEscolaService;
//    
//    private List<ConsultaClasseAlunoPorEscola> consultaClasseAlunoPorEscolaList = new ArrayList<>();
//    private ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola = ConsultaClasseAlunoPorEscola.criarInstancia();
//
//    @PostConstruct
//    public void init() {
//        consultaClasseAlunoPorEscolaList = consultaClasseAlunoPorEscolaService.findAll();
//    }
//
//    @Override
//    public void carregarTela() {
//        consultaClasseAlunoPorEscola = ConsultaClasseAlunoPorEscola.criarInstancia();
//        consultaClasseAlunoPorEscola.setInAnoLetivo("2019");
//        consultaClasseAlunoPorEscola.setInCodEscola("339805");
//    }
//
//    @Override
//    public void inserir() {
//        modoTela.mudarParaInsercao();
//    }
//
//    @Override
//    public void salvar() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//        modoTela.mudarParaVisualizacao();
//    }
//
//    @Override
//    public void alterar() {
//       modoTela.mudarParaAlteracao();
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
//        carregarTela();
//        modoTela.mudarParaLocalizacao();
//    }
//
//    @Override
//    public void processar() {
//        consultaClasseAlunoPorEscola = consultaClasseAlunoPorEscolaService.consultaClasseAlunoPorEscola(consultaClasseAlunoPorEscola);
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", consultaClasseAlunoPorEscola.getConsultaClasseAlunoPorEscolaResponse().getMensagem()));
//        modoTela.mudarParaProcessado();
//    }
//
//    public ConsultaClasseAlunoPorEscola getConsultaClasseAlunoPorEscola() {
//        return consultaClasseAlunoPorEscola;
//    }
//
//    public List<ConsultaClasseAlunoPorEscola> getConsultaClasseAlunoPorEscolaList() {
//        return consultaClasseAlunoPorEscolaList;
//    }
//}
