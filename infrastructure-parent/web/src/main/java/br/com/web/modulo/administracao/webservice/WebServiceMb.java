package br.com.web.modulo.administracao.webservice;



import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("request")
public class WebServiceMb {

//    @Autowired
//    private StatusRest statusRestClient;

    @PostConstruct
    private void init() {
//        Response status = statusRestClient.status();
    }

    public void carregarTela() {
        try {
            System.out.println("");
        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

}
