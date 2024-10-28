//package br.com.controller.integracao.excluirmatricula;
//
//import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
//import br.com.domain.integracao.consultaformacaoclasse.ConsultaClasse;
//import br.com.domain.integracao.excluirmatricula.model.ExcluirMatricula;
//import br.com.service.auxiliar.tipoensino.TipoEnsinoService;
//import br.com.service.integracao.excluirmatricula.ExcluirMatriculaService;
//import br.com.template.controller.AbstractMb;
//import br.com.template.scoped.ConfigurableBeanFactory;
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import org.primefaces.event.SelectEvent;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
//public class ExcluirMatriculaMb extends AbstractMb {
//
//    @Autowired
//    private TipoEnsinoService tipoEnsinoService;
//    @Autowired
//    private ExcluirMatriculaService excluirMatriculaService;
//
//    private List<ExcluirMatricula> excluirMatriculaList = new ArrayList<>();
//    private ExcluirMatricula excluirMatricula;
//
//    @PostConstruct
//    public void init() {
//        excluirMatriculaList = excluirMatriculaService.findAll();
//    }
//
//    @Override
//    public void carregarTela() {
//        try {
//            excluirMatricula = ExcluirMatricula.criarInstancia();
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
//        excluirMatricula = ExcluirMatricula.criarInstancia();
//        modoTela.mudarParaLocalizacao();
//    }
//
//    @Override
//    public void processar() {
//        excluirMatriculaService.excluirMatricula(excluirMatricula);
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
//        modoTela.mudarParaProcessado();
//    }
//
//    public void localizar() {
//
//    }
//
//    public void selecionaConsultaClasseSelectEvent(SelectEvent selectEvent) {
//        ConsultaClasse consultaClasse = (ConsultaClasse) selectEvent.getObject();
//        excluirMatricula.setInRA(consultaClasse.getRa());
//        excluirMatricula.setInDigitoRA(consultaClasse.getDigitoRA());
//        excluirMatricula.setInUF(consultaClasse.getUf());
//        excluirMatricula.setInNumClasse(consultaClasse.getOutNumClasse());
//        excluirMatricula.setInAno(consultaClasse.getOutAno());
////        excluirMatricula.setInSerieAno("");
//        TipoEnsino tipoEnsino = tipoEnsinoService.findByDescricaoIgnoreCase(consultaClasse.getOutTipoEnsino());
//        excluirMatricula.setTipoEnsino(tipoEnsino);
//        modoTela.mudarParaInsercao();
//    }
//
//    public List<ExcluirMatricula> getExcluirMatriculaList() {
//        return excluirMatriculaList;
//    }
//
//    public ExcluirMatricula getExcluirMatricula() {
//        return excluirMatricula;
//    }
//
//    public void setExcluirMatricula(ExcluirMatricula excluirMatricula) {
//        this.excluirMatricula = excluirMatricula;
//    }
//}
