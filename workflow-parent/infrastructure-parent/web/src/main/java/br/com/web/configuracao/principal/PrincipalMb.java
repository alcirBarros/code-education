package br.com.web.configuracao.principal;


//import br.com.domain.Operador;
//import br.com.service.security.OperadorLogadoImpl;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.event.MenuActionEvent;
import org.primefaces.model.menu.BaseMenuModel;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultSubMenu;
import org.primefaces.model.menu.MenuItem;
import org.primefaces.model.menu.MenuModel;
import org.springframework.context.annotation.Scope;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

@Controller
@Scope("session")
public class PrincipalMb {

//    @Autowired
//    private OperadorLogadoImpl operadorLogado;

    private String firstName = "";
    private String lastName = "";

    private MenuModel menuModel = new BaseMenuModel();
//    private Operador operador;

    @PostConstruct
    private void init() {
        //First submenu
        DefaultSubMenu firstSubmenu = new DefaultSubMenu("Dynamic Submenu");

        DefaultMenuItem item = new DefaultMenuItem("External");
        item.setUrl("http://www.primefaces.org");
        item.setIcon("pi pi-home");
        firstSubmenu.addElement(item);

        menuModel.addElement(firstSubmenu);

        //Second submenu
        DefaultSubMenu secondSubmenu = new DefaultSubMenu("Integração");

        item = new DefaultMenuItem("Configuração");
        item.setIcon("pi pi-search");
        item.setUrl("/pages/private/administracao/configuracao/configuracao.xhtml");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Consulta Formação Classe");
        item.setIcon("pi pi-search");
        item.setUrl("/pages/private/integracao/consultaFormacaoClasse/consultaFormacaoClasse.xhtml");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Consulta Classe Aluno Por Escola");
        item.setIcon("pi pi-search");
        item.setUrl("/pages/private/integracao/consultaClasseAlunoPorEscola/consultaClasseAlunoPorEscola.xhtml");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Consultar Ficha Aluno");
        item.setIcon("pi pi-save");
        item.setUrl("/pages/private/integracao/consultarFichaAluno/consultarFichaAluno.xhtml");
        item.setCommand("#{principalMb.afficherTable}");
//        item.setUpdate("messages");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Incluir Coleta Classe");
        item.setIcon("pi pi-times");
        item.setUrl("/pages/private/integracao/incluirColetaClasse/incluirColetaClasse.xhtml");
        item.setCommand("#{principalMb.afficherTable}");
        item.setImmediate(true);
//        item.setAjax(false);
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Consultar Coleta Classe");
        item.setIcon("pi pi-save");
        item.setUrl("/pages/private/integracao/consultarColetaClasse/consultarColetaClasse.xhtml");
        item.setCommand("#{principalMb.afficherTable}");
//        item.setUpdate("messages");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Alterar Coleta Classe");
        item.setIcon("pi pi-save");
        item.setUrl("/pages/private/integracao/alterarColetaClasse/alterarColetaClasse.xhtml");
        item.setCommand("#{principalMb.afficherTable}");
//        item.setUpdate("messages");
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Realizar Matricula Sem RA");
        item.setIcon("pi pi-times");
        item.setUrl("/pages/private/integracao/realizarMatriculaSemRA/realizarMatriculaSemRA.xhtml");
        item.setCommand("#{principalMb.afficherTable}");
        item.setAjax(false);
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Excluir Matricula");
        item.setIcon("pi pi-times");
        item.setUrl("/pages/private/integracao/excluirMatricula/excluirMatricula.xhtml");
        item.setCommand("#{principalMb.afficherTable}");
        item.setAjax(false);
        secondSubmenu.addElement(item);

        item = new DefaultMenuItem("Redirect");
        item.setIcon("pi pi-search");
        item.setCommand("#{principalMb.afficherTable}");
        secondSubmenu.addElement(item);

        menuModel.addElement(secondSubmenu);

        System.out.println("A");
    }

    public void carregarTela() {
        try {
//            operador = operadorLogado.getUser();
            System.out.println("br.com.web.configuracao.principal.PrincipalMb.carregarTela()");
        } catch (Exception e) {
            e.printStackTrace();
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

//    public void afficherTable(MenuActionEvent event) {
//        MenuItem menuItem = event.getMenuItem();
//        System.out.println(event.getSource());
//    }

    public String logout() {
//        SecurityContextHolder.clearContext();
        return "/index.xhtml?faces-redirect=true";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

//    public String showGreeting() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        return "Hello " + authentication.getName() + "!";
//    }
//
//    public MenuModel getMenuModel() {
//        return menuModel;
//    }
//
//    public Operador getOperador() {
//        return operador;
//    }
//
//    public void setOperador(Operador operador) {
//        this.operador = operador;
//    }

    
}
