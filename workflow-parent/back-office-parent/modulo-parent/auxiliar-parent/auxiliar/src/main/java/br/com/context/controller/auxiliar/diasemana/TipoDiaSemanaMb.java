package br.com.context.controller.auxiliar.diasemana;

import br.com.service.auxiliar.diasemana.TipoDiaSemanaService;
import br.com.context.model.diasemana.model.TipoDiaSemana;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SESSION)
public class TipoDiaSemanaMb {

    @Autowired
    private TipoDiaSemanaService tipoDiaSemanaService;

    private List<TipoDiaSemana> tipoDiaSemanaList = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            tipoDiaSemanaList = tipoDiaSemanaService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TipoDiaSemana> getTipoDiaSemanaList() {
        return tipoDiaSemanaList;
    }
}