package br.com.context.controller.auxiliar.turno;

import br.com.service.auxiliar.turno.TipoTurnoService;
import br.com.context.model.tipoturno.model.TipoTurno;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SESSION)
public class TipoTurnoMb {

    @Autowired
    private TipoTurnoService tipoTurnoService;

    private List<TipoTurno> tipoTurnoList = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            tipoTurnoList = tipoTurnoService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TipoTurno> getTipoTurnoList() {
        return tipoTurnoList;
    }
}