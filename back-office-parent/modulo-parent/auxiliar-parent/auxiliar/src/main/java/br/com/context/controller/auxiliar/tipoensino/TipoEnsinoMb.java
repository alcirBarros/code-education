package br.com.context.controller.auxiliar.tipoensino;

import br.com.service.auxiliar.tipoensino.TipoEnsinoService;
import br.com.context.model.tipoensino.model.TipoEnsino;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SESSION)
public class TipoEnsinoMb {

    @Autowired
    private TipoEnsinoService tipoEnsinoService;

    private List<TipoEnsino> tipoEnsinoList = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            tipoEnsinoList = tipoEnsinoService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TipoEnsino> getTipoEnsinoList() {
        return tipoEnsinoList;
    }

}
