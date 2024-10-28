package br.com.paciente.controller;

import br.com.domain.auxiliar.escolaridade.model.TipoEscolaridade;
import br.com.domain.auxiliar.estadocivil.model.TipoEstadoCivil;
import br.com.domain.auxiliar.tipocontato.model.TipoContato;
import br.com.domain.auxiliar.tipodocumento.model.TipoDocumento;
import br.com.domain.auxiliar.tipoendereco.model.TipoEndereco;

import br.com.domain.auxiliar.tiporesponsavel.model.TipoResponsavel;
import br.com.domain.auxiliar.tiposexo.model.TipoSexo;
import br.com.domain.cidade.Cidade;
import br.com.domain.logradouro.Logradouro;
import br.com.domain.paciente.Paciente;
import br.com.domain.pessoa.ContatoPessoa;
import br.com.domain.pessoa.DocumentoPessoa;
import br.com.domain.pessoa.EnderecoPessoa;
import br.com.domain.pessoa.Pessoa;
import br.com.domain.pessoa.ResponsavelPessoa;
import br.com.endereco.controller.EnderecoComponentListener;
import br.com.service.auxiliar.escolaridade.TipoEscolaridadeService;
import br.com.service.auxiliar.estadocivil.TipoEstadoCivilService;
import br.com.service.auxiliar.sexo.TipoSexoService;
import br.com.service.auxiliar.tipocontato.TipoContatoService;
import br.com.service.auxiliar.tipodocumento.TipoDocumentoService;
import br.com.service.auxiliar.tipoendereco.TipoEnderecoService;
import br.com.service.auxiliar.tiporesponsavel.TipoResponsavelService;
import br.com.service.cidade.CidadeService;
import br.com.service.logradouro.LogradouroService;
import br.com.service.paciente.PacienteService;
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
public class PacienteMb extends AbstractMb {

    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private PacienteService pacienteService;
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
    @Autowired
    private CidadeService cidadeService;
    @Autowired
    private LogradouroService logradouroService;
    @Autowired
    private TipoEnderecoService tipoEnderecoService;
    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    private List<TipoResponsavel> tipoResponsavelList;
    private List<TipoSexo> tipoSexoList;
    private List<TipoContato> tipoContatoList;
    private List<TipoEstadoCivil> tipoEstadoCivilList;
    private List<TipoEscolaridade> tipoEscolaridadeList;

    private List<TipoEndereco> tipoEnderecoList;
    private List<TipoDocumento> tipoDocumentoList;

    private List<Pessoa> pessoaList = new ArrayList<>();
    private List<Paciente> pacienteList = new ArrayList<>();

    private Pessoa pessoa = new Pessoa();
    private Paciente paciente = new Paciente();

    private EnderecoPessoa enderecoPessoa = EnderecoPessoa.criarInstancia();
    private DocumentoPessoa documentoPessoa = new DocumentoPessoa();
    private ResponsavelPessoa responsavelPessoa = new ResponsavelPessoa();
    private ContatoPessoa contatoPessoa = new ContatoPessoa();

    @PostConstruct
    public void init() {
        tipoResponsavelList = tipoResponsavelService.findAll();
        tipoSexoList = tipoSexoService.findAll();
        tipoContatoList = tipoContatoService.findAll();
        tipoEstadoCivilList = tipoEstadoCivilService.findAll();
        tipoEscolaridadeList = tipoEscolaridadeService.findAll();
        tipoEnderecoList = tipoEnderecoService.findAll();
        tipoDocumentoList = tipoDocumentoService.findAll();

        System.out.println("br.com.pessoa.controller.Paciente.init()");
    }

    @Override
    public void carregarTela() {
        pessoaList = pessoaService.findAll();
        pacienteList = pacienteService.findAll();
    }

    @Override
    public void salvar() {
        try {
            paciente = pacienteService.save(paciente);
            pacienteList = pacienteService.findAll();
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        paciente = new Paciente();
        enderecoPessoa = EnderecoPessoa.criarInstancia();
        documentoPessoa = new DocumentoPessoa();
        responsavelPessoa = new ResponsavelPessoa();
        contatoPessoa = new ContatoPessoa();
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        enderecoPessoa = EnderecoPessoa.criarInstancia();
        documentoPessoa = new DocumentoPessoa();
        responsavelPessoa = new ResponsavelPessoa();
        contatoPessoa = new ContatoPessoa();
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        paciente = new Paciente();
        enderecoPessoa = EnderecoPessoa.criarInstancia();
        documentoPessoa = new DocumentoPessoa();
        responsavelPessoa = new ResponsavelPessoa();
        contatoPessoa = new ContatoPessoa();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaPacienteSelectEvent(SelectEvent selectEvent) {
        paciente = (Paciente) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaResponsavelPessoaSelectEvent(SelectEvent selectEvent) {
        responsavelPessoa = (ResponsavelPessoa) selectEvent.getObject();
    }

    public void selecionaContatoSelectEvent(SelectEvent selectEvent) {
        contatoPessoa = (ContatoPessoa) selectEvent.getObject();
    }

    public void selecionaDocumentoSelectEvent(SelectEvent selectEvent) {
        documentoPessoa = (DocumentoPessoa) selectEvent.getObject();
    }

    public void adicionarEndereco() {
        paciente.adicionarEndereco(enderecoPessoa);
        enderecoPessoa = EnderecoPessoa.criarInstancia();
    }

    public void adicionarDocumento() {
        paciente.adicionarDocumento(documentoPessoa);
        documentoPessoa = new DocumentoPessoa();
    }

    public void adicionarResponsavel() {
        paciente.adicionarResponsavel(responsavelPessoa);
        responsavelPessoa = new ResponsavelPessoa();
    }

    public void cancelarAdicionarResponsavel() {
        responsavelPessoa = new ResponsavelPessoa();
    }

    public void adicionarContato() {
        paciente.adicionarContato(contatoPessoa);
        contatoPessoa = new ContatoPessoa();
    }

    public List<Paciente> completaPacienteAtivo(String query) {

        Predicate<Paciente> predicate = new Predicate<Paciente>() {
            @Override
            public boolean test(Paciente arg0) {
                return arg0.getNome().toUpperCase().contains(query.toUpperCase());
            }
        };
        return pacienteList.stream().filter(predicate).collect(Collectors.toList());
    }

    public EnderecoComponentListener enderecoComponentListener() {
        return new EnderecoComponentListener() {

            @Override
            public List<Cidade> completeMethodCidade(String query) {
                List<Cidade> cidadeList = cidadeService.findByNomeIgnoreCaseStartingWith(query);
                return cidadeList;
            }

            @Override
            public void selecionaCidade(SelectEvent selectEvent) {
                Cidade cidade = (Cidade) selectEvent.getObject();
                //  endereco.getLogradouro().getBairro().setCidade(pessoa);
            }

            @Override
            public void actionUnlockedCidade() {
                enderecoPessoa.setLogradouro(Logradouro.criarInstancia());
            }

            @Override
            public List<Logradouro> completeMethodLogradouro(String query) {
                Cidade cidade = enderecoPessoa.getLogradouro().getBairro().getCidade();
                List<Logradouro> logradouroList = logradouroService.findByCidadeAndNomeLike(cidade, query);
                return logradouroList;
            }

            @Override
            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionLocalizarEvent()");
            }

            @Override
            public void selecionaLogradouro(SelectEvent selectEvent) {
                Logradouro cidade = (Logradouro) selectEvent.getObject();
            }

            @Override
            public void actionUnlockedLogradouro() {
                enderecoPessoa.setLogradouro(Logradouro.criarInstancia());
            }

        };
    }

    public PacienteComponentListener pessoaComponentListener() {
        return new PacienteComponentListener() {

            @Override
            public void selecionaPessoa(SelectEvent selectEvent) {
                Pessoa pessoa = (Pessoa) selectEvent.getObject();
                if (pessoa instanceof Paciente) {
                    paciente = (Paciente) pessoa;
                } else {
                    paciente = pacienteService.converter(pessoa);
                }
                modoTela.mudarParaAlteracao();
            }

            @Override
            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionEvent()");
            }

        };
    }

    public List<Pessoa> completaPessoaAtivo(String query) {

        Predicate<Pessoa> predicate = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa arg0) {
                return arg0.getNome().toUpperCase().contains(query.toUpperCase());
            }
        };
        return pessoaList.stream().filter(predicate).collect(Collectors.toList());
    }

    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente pessoa) {
        this.paciente = pessoa;
    }

    public DocumentoPessoa getDocumentoPessoa() {
        return documentoPessoa;
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

    public List<TipoEndereco> getTipoEnderecoList() {
        return tipoEnderecoList;
    }

    public List<TipoDocumento> getTipoDocumentoList() {
        return tipoDocumentoList;
    }

    public EnderecoPessoa getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(EnderecoPessoa enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
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
}
