package br.com.educafaciltemplate.versao.controller;

import br.com.educafaciltemplate.versao.model.Versao;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class VersaoMb {

    private List<Versao> versaoList = new ArrayList<>();
    
    @PostConstruct
    public void init() {
        versaoList.add(new Versao("API 1.00.00"));
    }

    public List<Versao> getVersaoList() {
        return versaoList;
    }
}