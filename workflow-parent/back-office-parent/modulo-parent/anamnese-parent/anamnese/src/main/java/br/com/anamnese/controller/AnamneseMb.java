package br.com.anamnese.controller;

import br.com.context.model.pessoa.AnamneseEntity;
import br.com.context.model.tipodadoclinico.model.TipoDadoClinico;
import br.com.context.model.tipogrupoanamnese.model.TipoGrupoAnamnese;
import br.com.context.model.pessoa.DadoClinco;
import br.com.context.model.pessoa.PessoaEntity;
import br.com.context.pessoa.controller.PessoaComponentListener;
import br.com.service.anamnese.AnamneseService;
import br.com.service.auxiliar.tipodadoclinico.TipoDadoClinicoService;

import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.event.SelectEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(ConfigurableBeanFactory.SCOPE_SESSION)
public class AnamneseMb extends AbstractMb {

    @Autowired
    private TipoDadoClinicoService tipoDadoClinicoService;
    @Autowired
    private AnamneseService anamneseService;

    private Map<TipoGrupoAnamnese, List<TipoDadoClinico>> tipoDadoClinicoMap;

    private AnamneseEntity anamneseEntity = new AnamneseEntity();
    private DadoClinco dadoClinico = new DadoClinco();

    @PostConstruct
    public void init() {
        System.out.println("br.com.anamnese.controller.AnamneseMb.init()");
        List<TipoDadoClinico> tipoDadoClinicoList = tipoDadoClinicoService.findAll();
        tipoDadoClinicoMap = tipoDadoClinicoList.stream().collect(Collectors.groupingBy(TipoDadoClinico::getTipoGrupoAnamnese));

    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            anamneseEntity = anamneseService.save(anamneseEntity);
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        anamneseEntity = new AnamneseEntity();
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
        anamneseEntity = new AnamneseEntity();
        modoTela.mudarParaLocalizacao();
    }

    public void adicionarDadoClinico() {
        anamneseEntity.adicionarAnamnse(dadoClinico);
        dadoClinico = new DadoClinco();
    }

    public PessoaComponentListener pessoaComponentListener() {
        return new PessoaComponentListener() {

            public void selecionaPessoa(SelectEvent selectEvent) {
                PessoaEntity pessoa = (PessoaEntity) selectEvent.getObject();
                anamneseEntity.setPessoa(pessoa);
            }

            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionEvent()");
            }

        };
    }
    
    public List<Map.Entry<TipoGrupoAnamnese, List<DadoClinco>>> getDadoClinicoGrupoList(){
        Map<TipoGrupoAnamnese, List<DadoClinco>> collect = anamneseEntity.getDadoClinicoList().stream().collect(Collectors.groupingBy(x->x.getTipoDadoClinico().getTipoGrupoAnamnese()));
        Set<Map.Entry<TipoGrupoAnamnese, List<DadoClinco>>> a = collect.entrySet();
        ArrayList<Map.Entry<TipoGrupoAnamnese, List<DadoClinco>>> arrayList = new ArrayList<>(a);
        return arrayList;
    }

    public AnamneseEntity getAnamnese() {
        return anamneseEntity;
    }

    public void setAnamnese(AnamneseEntity anamneseEntity) {
        this.anamneseEntity = anamneseEntity;
    }

    public DadoClinco getDadoClinico() {
        return dadoClinico;
    }

    public void setDadoClinico(DadoClinco dadoClinico) {
        this.dadoClinico = dadoClinico;
    }

    public Map<TipoGrupoAnamnese, List<TipoDadoClinico>> getTipoDadoClinicoMap() {
        return tipoDadoClinicoMap;
    }
}
