//package br.com.controller.integracao.consultarfichaaluno;
//
//import br.com.domain.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaAluno;
//import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
//import br.com.service.integracao.consultarfichaaluno.ConsultarFichaAlunoService;
//import br.com.template.scoped.ConfigurableBeanFactory;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import javax.faces.application.FacesMessage;
//import javax.faces.context.FacesContext;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
//public class ConsultarFichaAlunoMb {
//
//    @Autowired
//    private ConsultarFichaAlunoService consultarFichaAlunoService;
//
//    private List<ConsultarFichaAluno> consultarFichaAlunoList = new ArrayList<>();
//
//    private TipoConsultaFichaAluno tipoConsultaFichaAluno = new TipoConsultaFichaAluno();
//    private ConsultarFichaAluno consultarFichaAluno = ConsultarFichaAluno.criarInstancia();
//
//    @PostConstruct
//    public void init() {
//        consultarFichaAlunoList = consultarFichaAlunoService.findAll();
//    }
//
//    public void carregarTela() {
//        try {
//            consultarFichaAluno = ConsultarFichaAluno.criarInstancia();
//            consultarFichaAluno.getConsultaRA().setInRA("116584739");
//            consultarFichaAluno.getConsultaRA().setInUF("SP");
//            consultarFichaAluno.getConsultaRA().setInDigitoRA("5");
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
//        try {
//
//        } catch (Exception e) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
//        }
//    }
//
//    public void alterar() {
//
//    }
//
//    public void visualizar() {
//    }
//
//    public void excluir() {
//
//    }
//
//    public void cancelar() {
//    }
//
//    public void processar() {
//        try {
//
//        } catch (Exception e) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
//        }
//    }
//
//    public void localizar() {
//        try {
//            consultarFichaAluno = consultarFichaAlunoService.consultarFichaAluno(consultarFichaAluno);
//        } catch (Exception e) {
//            e.printStackTrace();
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
//        }
//    }
//
//    //Get/s e Set/s
//    public List<ConsultarFichaAluno> getConsultarFichaAlunoList() {
//        return consultarFichaAlunoList;
//    }
//
//    public ConsultarFichaAluno getConsultarFichaAluno() {
//        return consultarFichaAluno;
//    }
//
//    public void setConsultarFichaAluno(ConsultarFichaAluno consultarFichaAluno) {
//        this.consultarFichaAluno = consultarFichaAluno;
//    }
//
//    public TipoConsultaFichaAluno getTipoConsultaFichaAluno() {
//        return tipoConsultaFichaAluno;
//    }
//
//    public void setTipoConsultaFichaAluno(TipoConsultaFichaAluno tipoConsultaFichaAluno) {
//        this.tipoConsultaFichaAluno = tipoConsultaFichaAluno;
//    }
//}
