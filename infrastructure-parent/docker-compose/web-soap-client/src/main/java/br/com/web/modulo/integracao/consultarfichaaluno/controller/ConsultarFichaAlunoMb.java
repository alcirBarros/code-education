package br.com.web.modulo.integracao.consultarfichaaluno.controller;

import br.com.web.modulo.integracao.soap.StudentClientService;
import com.concretepage.wsdl.GetArticleByIdResponse;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("request")
public class ConsultarFichaAlunoMb {

    @Autowired
    private StudentClientService studentClientService;

    @PostConstruct
    public void init() {
        System.out.println("**********************************************************************************************");
        System.out.println("*");
        System.out.println(this.getClass().getPackage().getName());
        System.out.println("*");
        System.out.println("**********************************************************************************************");

        GetArticleByIdResponse response = studentClientService.getStudentById(0);
        System.out.println("Name:" + response.getArticleInfo().getTitle());
        System.out.println("Age:" + response.getArticleInfo().getCategory());
        System.out.println("Class:" + response.getArticleInfo().getArticleId());

    }

    public void carregarTela() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    public void inserir() {
    }

    public void salvar() {
        try {

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    public void alterar() {

    }

    public void visualizar() {
    }

    public void excluir() {

    }

    public void cancelar() {
    }

    public void processar() {
        try {

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    public void localizar() {
        try {

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

}
