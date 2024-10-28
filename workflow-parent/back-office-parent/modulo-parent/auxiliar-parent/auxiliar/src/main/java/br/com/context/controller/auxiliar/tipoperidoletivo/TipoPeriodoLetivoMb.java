package br.com.context.controller.auxiliar.tipoperidoletivo;

import br.com.service.auxiliar.tipoperidoletivo.TipoPeriodoLetivoService;
import br.com.context.model.tipoperidoletivo.model.TipoPeriodoLetivo;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_SESSION)
public class TipoPeriodoLetivoMb {

    @Autowired
    private TipoPeriodoLetivoService tipoPeriodoLetivoService;

    private List<TipoPeriodoLetivo> tipoPeriodoLetivoList = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            tipoPeriodoLetivoList = tipoPeriodoLetivoService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TipoPeriodoLetivo> getTipoPeriodoLetivoList() {
        return tipoPeriodoLetivoList;
    }
}
