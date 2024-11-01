package br.com.context.controller.auxiliar.tipoconsultafichaaluno;

import br.com.context.model.tipoconsultafichaaluno.TipoConsultaFichaAluno;
import br.com.service.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaalunoService;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = ConfigurableBeanFactory.SCOPE_APPLICATION)
public class TipoConsultaFichaalunoMb {

    @Autowired
    private TipoConsultaFichaalunoService tipoConsultaFichaalunoService;

    private List<TipoConsultaFichaAluno> tipoConsultaFichaAlunoList = new ArrayList<>();

    @PostConstruct
    public void init() {
        try {
            tipoConsultaFichaAlunoList = tipoConsultaFichaalunoService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<TipoConsultaFichaAluno> getTipoConsultaFichaAlunoList() {
        return tipoConsultaFichaAlunoList;
    }
}