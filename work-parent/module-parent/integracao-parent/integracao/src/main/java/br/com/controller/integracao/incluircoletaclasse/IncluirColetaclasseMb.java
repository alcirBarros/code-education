package br.com.controller.integracao.incluircoletaclasse;

import br.com.domain.auxiliar.diasemana.model.TipoDiaSemana;
import br.com.domain.auxiliar.tipoensino.enumerator.TipoEnsinoEnum;
import br.com.domain.auxiliar.tipoensino.model.TipoEnsino;
import br.com.domain.auxiliar.tipoperidoletivo.enumerator.TipoPeriodoLetivoEnum;
import br.com.domain.auxiliar.tipoperidoletivo.model.TipoPeriodoLetivo;
import br.com.domain.auxiliar.tipoturno.enumerator.TipoTurnoEnum;
import br.com.domain.auxiliar.tipoturno.model.TipoTurno;
import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
import br.com.service.auxiliar.diasemana.TipoDiaSemanaService;
import br.com.service.auxiliar.tipoensino.TipoEnsinoService;
import br.com.service.auxiliar.tipoperidoletivo.TipoPeriodoLetivoService;
import br.com.service.auxiliar.turno.TipoTurnoService;
import br.com.service.integracao.incluircoletaclasse.IncluirColetaClasseService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.component.selectcheckboxmenu.SelectCheckboxMenu;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class IncluirColetaclasseMb extends AbstractMb {

    @Autowired
    private TipoPeriodoLetivoService tipoPeriodoLetivoService;
    @Autowired
    private TipoTurnoService tipoTurnoService;
    @Autowired
    private TipoEnsinoService tipoEnsinoService;
    @Autowired
    private TipoDiaSemanaService tipoDiaSemanaService;
    @Autowired
    private IncluirColetaClasseService incluirColetaClasseService;

    private List<IncluirColetaClasse> incluirColetaClasseList = new ArrayList<>();
    private IncluirColetaClasse incluirColetaClasse = IncluirColetaClasse.criarInstancia();

    @PostConstruct
    public void init() {
//        funcao = controleTela.findByTipoFuncaoEnum(TipoFuncaoEnum.INCLUIR_COLETA_CLASSE);
        incluirColetaClasseList = incluirColetaClasseService.findAll();
    }

    @Override
    public void carregarTela() {
        try {
            incluirColetaClasse.setInCodEscola("339805");
            incluirColetaClasse.setInCapacidadeFisica("20");

            {
                LocalDate primeiroDiaDoMes = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
                Date dataInicio = Date.from(primeiroDiaDoMes.atStartOfDay(ZoneId.systemDefault()).toInstant());
                incluirColetaClasse.setDataInicioAula(dataInicio);
            }
            {
                LocalDate ultimoDiaDoMes = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
                Date terminoAula = Date.from(ultimoDiaDoMes.atStartOfDay(ZoneId.systemDefault()).toInstant());
                incluirColetaClasse.setDataTerminoAula(terminoAula);
            }

            {
                LocalDate date = LocalDate.now();
                LocalTime localTime = LocalTime.of(6, 0);
                LocalDateTime localDateTime = LocalDateTime.of(date, localTime);
                Date horaInicioAula = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
                incluirColetaClasse.setHoraInicioAula(horaInicioAula);
            }

            {
                LocalDate date = LocalDate.now();
                LocalTime localTime = LocalTime.of(12, 0);
                LocalDateTime localDateTime = LocalDateTime.of(date, localTime);
                Date horaTerminoAula = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
                incluirColetaClasse.setHoraTerminoAula(horaTerminoAula);
            }
            {
                List<TipoDiaSemana> tipoDiaSemanaList = tipoDiaSemanaService.findAll();
                incluirColetaClasse.getInDiasSemana().getTipoDiaSemanaList().addAll(tipoDiaSemanaList);
            }
            {
                TipoPeriodoLetivo tipoPeriodoLetivo = tipoPeriodoLetivoService.findByTipoPeriodoLetivoEnum(TipoPeriodoLetivoEnum.PRIMEIRO_SEMESTRE);
                incluirColetaClasse.setTipoPeriodoLetivo(tipoPeriodoLetivo);
            }

            {
                TipoEnsino tipoEnsino = tipoEnsinoService.findByTipoEnsinoEnum(TipoEnsinoEnum.ENSINO_MEDIO);
                incluirColetaClasse.setTipoEnsino(tipoEnsino);
            }

            incluirColetaClasse.setInTurma("A");

            {
                TipoTurno tipoTurno = tipoTurnoService.findByTipoTurnoEnum(TipoTurnoEnum.MANHA);
                incluirColetaClasse.setTipoTurno(tipoTurno);
            }

            modoTela.mudarParaVisualizacao();

        } catch (Exception e) {
            e.printStackTrace();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Erro", e.getMessage()));
        }
    }

    @Override
    public void salvar() {
        try {
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        incluirColetaClasse = IncluirColetaClasse.criarInstancia();
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void processar() {
        incluirColetaClasse = incluirColetaClasseService.incluirColetaClasse(incluirColetaClasse);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", incluirColetaClasse.getIncluirColetaClasseResponse().getMensagem()));
        modoTela.mudarParaProcessado();
    }

    public void selecionaIncluirColetaClasseselectEvent(SelectEvent selectEvent) {
        incluirColetaClasse = (IncluirColetaClasse) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaTipoDiaSemanaAjaxBehaviorEvent(AjaxBehaviorEvent ajaxBehaviorEvent) {
        SelectCheckboxMenu htmlSelectOneMenu = (SelectCheckboxMenu) ajaxBehaviorEvent.getSource();
//        HashSet<TipoDiaSemana> name = (HashSet) htmlSelectOneMenu.getValue();
    }

    public IncluirColetaClasse getIncluirColetaClasse() {
        return incluirColetaClasse;
    }

    public void setIncluirColetaClasse(IncluirColetaClasse incluirColetaClasse) {
        this.incluirColetaClasse = incluirColetaClasse;
    }

    public List<IncluirColetaClasse> getIncluirColetaClasseList() {
        return incluirColetaClasseList;
    }
}
