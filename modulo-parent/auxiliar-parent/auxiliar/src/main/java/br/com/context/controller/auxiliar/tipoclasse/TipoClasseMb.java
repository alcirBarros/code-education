package br.com.context.controller.auxiliar.tipoclasse;

import br.com.service.auxiliar.tipoclasse.TipoClasseService;
import br.com.context.model.tipoclasse.model.TipoClasse;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SESSION)
public class TipoClasseMb {

    @Autowired
    private TipoClasseService tipoClasseService;

    private List<TipoClasse> tipoClasseList = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            tipoClasseList = tipoClasseService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TipoClasse> getTipoClasseList() {
        return tipoClasseList;
    }
}