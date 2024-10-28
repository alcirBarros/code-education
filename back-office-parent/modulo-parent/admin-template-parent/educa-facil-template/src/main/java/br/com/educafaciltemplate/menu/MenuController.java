//package br.com.educafaciltemplate.menu;
//
//import br.com.projeto.configuracao.ConfiguracaoProjeto;
//import br.com.template.scoped.ConfigurableBeanFactory;
//import java.util.ArrayList;
//import java.util.List;
//import javax.annotation.PostConstruct;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//@Controller
//@Scope(ConfigurableBeanFactory.SCOPE_VIEW)
//public class MenuController {
//
//    @Autowired(required = false)
//    private List<ConfiguracaoProjeto> configuracaoProjetoList = new ArrayList<>();
//
//    @PostConstruct
//    public void init() {
//
//    }
//
//    public List<ConfiguracaoProjeto> getConfiguracaoProjetoList() {
//        return configuracaoProjetoList;
//    }
//}
//
//
