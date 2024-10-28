package br.com.pessoa.controller;

import br.com.domain.auxiliar.escolaridade.model.TipoEscolaridade;
import br.com.domain.auxiliar.estadocivil.model.TipoEstadoCivil;
import br.com.domain.auxiliar.tipocontato.model.TipoContato;
import br.com.domain.auxiliar.tiporesponsavel.model.TipoResponsavel;
import br.com.domain.auxiliar.tiposexo.model.TipoSexo;
import br.com.domain.pessoa.ContatoPessoa;
import br.com.domain.pessoa.Pessoa;
import br.com.domain.pessoa.ResponsavelPessoa;
import br.com.service.auxiliar.escolaridade.TipoEscolaridadeService;
import br.com.service.auxiliar.estadocivil.TipoEstadoCivilService;
import br.com.service.auxiliar.sexo.TipoSexoService;
import br.com.service.auxiliar.tipocontato.TipoContatoService;
import br.com.service.auxiliar.tiporesponsavel.TipoResponsavelService;
import br.com.service.pessoa.PessoaService;
import br.com.template.controller.AbstractMb;
import br.com.template.scoped.ConfigurableBeanFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
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
public class PessoaMb extends AbstractMb {

    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private TipoSexoService tipoSexoService;
    @Autowired
    private TipoContatoService tipoContatoService;
    @Autowired
    private TipoResponsavelService tipoResponsavelService;
    @Autowired
    private TipoEstadoCivilService tipoEstadoCivilService;
    @Autowired
    private TipoEscolaridadeService tipoEscolaridadeService;

    private List<TipoResponsavel> tipoResponsavelList;
    private List<TipoSexo> tipoSexoList;
    private List<TipoContato> tipoContatoList;
    private List<TipoEstadoCivil> tipoEstadoCivilList;
    private List<TipoEscolaridade> tipoEscolaridadeList;

    private List<Pessoa> pessoaList = new ArrayList<>();

    private Pessoa pessoa = new Pessoa();
    private ResponsavelPessoa responsavelPessoa = new ResponsavelPessoa();
    private ContatoPessoa contatoPessoa = new ContatoPessoa();

    @PostConstruct
    public void init() {
        tipoResponsavelList = tipoResponsavelService.findAll();
        tipoSexoList = tipoSexoService.findAll();
        tipoContatoList = tipoContatoService.findAll();
        tipoEstadoCivilList = tipoEstadoCivilService.findAll();
        tipoEscolaridadeList = tipoEscolaridadeService.findAll();

        pessoaList = pessoaService.findAll();
        System.out.println("br.com.pessoa.controller.Pessoa.init()");
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            pessoa = pessoaService.save(pessoa);
            pessoaList = pessoaService.findAll();
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        if (pessoa == null || pessoa.getId() != null) {
            pessoa = new Pessoa();
        }
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
        pessoa = new Pessoa();
        responsavelPessoa = new ResponsavelPessoa();
        contatoPessoa = new ContatoPessoa();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaPessoaSelectEvent(SelectEvent selectEvent) {
        pessoa = (Pessoa) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaResponsavelPessoaSelectEvent(SelectEvent selectEvent) {
        responsavelPessoa = (ResponsavelPessoa) selectEvent.getObject();
    }

    public void selecionaContatoSelectEvent(SelectEvent selectEvent) {
        contatoPessoa = (ContatoPessoa) selectEvent.getObject();
    }

    public void adicionarResponsavelPessoa() {
        pessoa.adicionarResponsavelPessoa(responsavelPessoa);
        responsavelPessoa = new ResponsavelPessoa();
    }

    public void adicionarContato() {
        pessoa.adicionarContato(contatoPessoa);
        contatoPessoa = new ContatoPessoa();
    }

    public List<Pessoa> completaPessoaAtivo(String query) {

        Predicate<Pessoa> predicate = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa arg0) {
                return arg0.getNome().contains(query);
            }
        };
        return pessoaList.stream().filter(predicate).collect(Collectors.toList());
    }

    public PessoaComponentListener pessoaComponentListener() {
        return new PessoaComponentListener() {

            public void selecionaPessoa(SelectEvent selectEvent) {
                pessoa = (Pessoa) selectEvent.getObject();
                modoTela.mudarParaVisualizacao();
            }

            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionEvent()");
            }

        };
    }

    public List<Pessoa> getPessoaList() {
        return pessoaList;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public ResponsavelPessoa getResponsavelPessoa() {
        return responsavelPessoa;
    }

    public ContatoPessoa getContatoPessoa() {
        return contatoPessoa;
    }

    public List<TipoResponsavel> getTipoResponsavelList() {
        return tipoResponsavelList;
    }

    public List<TipoSexo> getTipoSexoList() {
        return tipoSexoList;
    }

    public List<TipoContato> getTipoContatoList() {
        return tipoContatoList;
    }

    public List<TipoEstadoCivil> getTipoEstadoCivilList() {
        return tipoEstadoCivilList;
    }

    public List<TipoEscolaridade> getTipoEscolaridadeList() {
        return tipoEscolaridadeList;
    }
}
