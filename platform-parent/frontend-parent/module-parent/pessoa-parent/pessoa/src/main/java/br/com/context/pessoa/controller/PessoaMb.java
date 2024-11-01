package br.com.context.pessoa.controller;

import br.com.context.model.escolaridade.model.TipoEscolaridade;
import br.com.context.model.estadocivil.model.TipoEstadoCivil;
import br.com.context.model.tipocontato.model.TipoContato;
import br.com.context.model.tipodocumento.model.TipoDocumento;
import br.com.context.model.tipoendereco.model.TipoEndereco;

import br.com.context.model.tiporesponsavel.model.TipoResponsavel;
import br.com.context.model.tiposexo.model.TipoSexo;
import br.com.context.model.cidade.CidadeEntity;
import br.com.context.model.logradouro.LogradouroEntity;
import br.com.context.model.pessoa.ContactPessoaEntity;
import br.com.context.model.pessoa.DocumentoPessoaEntity;
import br.com.context.model.pessoa.EnderecoPessoaEntity;
import br.com.context.model.pessoa.PessoaEntity;
import br.com.context.model.pessoa.ResponsavelPessoaEntity;

import br.com.context.api.pessoa.PessoaService;
import br.com.endereco.controller.EnderecoComponentListener;
import br.com.service.auxiliar.escolaridade.TipoEscolaridadeService;
import br.com.service.auxiliar.estadocivil.TipoEstadoCivilService;
import br.com.service.auxiliar.sexo.TipoSexoService;
import br.com.service.auxiliar.tipocontato.TipoContatoService;
import br.com.service.auxiliar.tipodocumento.TipoDocumentoService;
import br.com.service.auxiliar.tipoendereco.TipoEnderecoService;
import br.com.service.auxiliar.tiporesponsavel.TipoResponsavelService;
import br.com.context.service.cidade.CidadeService;
import br.com.context.service.logradouro.LogradouroService;
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
    private CidadeService cidadeService;
    @Autowired
    private LogradouroService logradouroService;
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

    private List<PessoaEntity> pessoaList = new ArrayList<>();

    private PessoaEntity pessoa = new PessoaEntity();

    private EnderecoPessoaEntity enderecoPessoa = EnderecoPessoaEntity.criarInstancia();
    private DocumentoPessoaEntity documentoPessoa = new DocumentoPessoaEntity();
    private ResponsavelPessoaEntity responsavelPessoa = new ResponsavelPessoaEntity();
    private ContactPessoaEntity contatoPessoa = new ContactPessoaEntity();

    @PostConstruct
    public void init() {
        tipoResponsavelList = tipoResponsavelService.findAll();
        tipoSexoList = tipoSexoService.findAll();
        tipoContatoList = tipoContatoService.findAll();
        tipoEstadoCivilList = tipoEstadoCivilService.findAll();
        tipoEscolaridadeList = tipoEscolaridadeService.findAll();
        tipoEnderecoList = tipoEnderecoService.findAll();
        tipoDocumentoList = tipoDocumentoService.findAll();

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
        pessoa = new PessoaEntity();
        enderecoPessoa = EnderecoPessoaEntity.criarInstancia();
        documentoPessoa = new DocumentoPessoaEntity();
        responsavelPessoa = new ResponsavelPessoaEntity();
        contatoPessoa = new ContactPessoaEntity();
        modoTela.mudarParaInsercao();
    }

    @Override
    public void alterar() {
        enderecoPessoa = EnderecoPessoaEntity.criarInstancia();
        documentoPessoa = new DocumentoPessoaEntity();
        responsavelPessoa = new ResponsavelPessoaEntity();
        contatoPessoa = new ContactPessoaEntity();
        modoTela.mudarParaAlteracao();
    }

    @Override
    public void excluir() {
        modoTela.mudarParaLocalizacao();
    }

    @Override
    public void cancelar() {
        pessoa = new PessoaEntity();
        enderecoPessoa = EnderecoPessoaEntity.criarInstancia();
        documentoPessoa = new DocumentoPessoaEntity();
        responsavelPessoa = new ResponsavelPessoaEntity();
        contatoPessoa = new ContactPessoaEntity();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaPessoaSelectEvent(SelectEvent selectEvent) {
        pessoa = (PessoaEntity) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public void selecionaResponsavelPessoaSelectEvent(SelectEvent selectEvent) {
        responsavelPessoa = (ResponsavelPessoaEntity) selectEvent.getObject();
    }

    public void selecionaContatoSelectEvent(SelectEvent selectEvent) {
        contatoPessoa = (ContactPessoaEntity) selectEvent.getObject();
    }

    public void selecionaDocumentoSelectEvent(SelectEvent selectEvent) {
        documentoPessoa = (DocumentoPessoaEntity) selectEvent.getObject();
    }

    public void adicionarEndereco() {
        pessoa.adicionarEndereco(enderecoPessoa);
        enderecoPessoa = EnderecoPessoaEntity.criarInstancia();
    }

    public void adicionarDocumento() {
        pessoa.adicionarDocumento(documentoPessoa);
        documentoPessoa = new DocumentoPessoaEntity();
    }

    public void adicionarResponsavel() {
        pessoa.adicionarResponsavel(responsavelPessoa);
        responsavelPessoa = new ResponsavelPessoaEntity();
    }

    public void cancelarAdicionarResponsavel() {
        responsavelPessoa = new ResponsavelPessoaEntity();
    }

    public void adicionarContato() {
        pessoa.adicionarContato(contatoPessoa);
        contatoPessoa = new ContactPessoaEntity();
    }

    public List<PessoaEntity> completaPessoaAtivo(String query) {

        Predicate<PessoaEntity> predicate = new Predicate<PessoaEntity>() {
            @Override
            public boolean test(PessoaEntity arg0) {
                return arg0.getNome().toUpperCase().contains(query.toUpperCase());
            }
        };
        return pessoaList.stream().filter(predicate).collect(Collectors.toList());
    }

    public EnderecoComponentListener enderecoComponentListener() {
        return new EnderecoComponentListener() {

            @Override
            public List<CidadeEntity> completeMethodCidade(String query) {
                List<CidadeEntity> cidadeList = cidadeService.findByNomeIgnoreCaseStartingWith(query);
                return cidadeList;
            }

            @Override
            public void selecionaCidade(SelectEvent selectEvent) {
                CidadeEntity cidade = (CidadeEntity) selectEvent.getObject();
                //  endereco.getLogradouro().getBairro().setCidade(pessoa);
            }

            @Override
            public void actionUnlockedCidade() {
                enderecoPessoa.setLogradouro(LogradouroEntity.criarInstancia());
            }

            @Override
            public List<LogradouroEntity> completeMethodLogradouro(String query) {
                CidadeEntity cidade = enderecoPessoa.getLogradouro().getBairro().getCidade();
                List<LogradouroEntity> logradouroList = logradouroService.findByCidadeAndNomeLike(cidade, query);
                return logradouroList;
            }

            @Override
            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionLocalizarEvent()");
            }

            @Override
            public void selecionaLogradouro(SelectEvent selectEvent) {
                LogradouroEntity cidade = (LogradouroEntity) selectEvent.getObject();
            }

            @Override
            public void actionUnlockedLogradouro() {
                enderecoPessoa.setLogradouro(LogradouroEntity.criarInstancia());
            }

        };
    }

    public PessoaComponentListener pessoaComponentListener() {
        return new PessoaComponentListener() {

            @Override
            public void selecionaPessoa(SelectEvent selectEvent) {
                pessoa = (PessoaEntity) selectEvent.getObject();
                modoTela.mudarParaVisualizacao();
            }

            @Override
            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionEvent()");
            }

        };
    }

    public List<PessoaEntity> getPessoaList() {
        return pessoaList;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public DocumentoPessoaEntity getDocumentoPessoa() {
        return documentoPessoa;
    }

    public ResponsavelPessoaEntity getResponsavelPessoa() {
        return responsavelPessoa;
    }

    public ContactPessoaEntity getContatoPessoa() {
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

    public EnderecoPessoaEntity getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(EnderecoPessoaEntity enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }
}
