package br.com.context.endereco.controller;

import br.com.context.model.bairro.BairroEntity;
import br.com.context.model.cidade.CidadeEntity;
import br.com.context.model.endereco.EnderecoEntity;
import br.com.context.model.logradouro.LogradouroEntity;
import br.com.context.service.endereco.EnderecoService;
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
public class EnderecoMb extends AbstractMb {

    @Autowired
    private EnderecoService enderecoService;
    @Autowired
    private CidadeService cidadeService;
    @Autowired
    private LogradouroService logradouroService;

    private List<EnderecoEntity> enderecoList = new ArrayList<>();
    private List<CidadeEntity> cidadeList = new ArrayList<>();
    private List<LogradouroEntity> logradouroList = new ArrayList<>();

    private EnderecoEntity endereco = criarEndereco();

    @PostConstruct
    public void init() {
        enderecoList = enderecoService.findAll();
        cidadeList = cidadeService.findAll();
        logradouroList = logradouroService.findAll();
        System.out.println("br.com.endereco.controller.EnderecoMb.init()");;
    }

    @Override
    public void carregarTela() {

    }

    @Override
    public void salvar() {
        try {
            endereco = enderecoService.save(endereco);
            enderecoList = enderecoService.findAll();
            modoTela.mudarParaVisualizacao();
            FacesContext.getCurrentInstance().addMessage("info-messages", new FacesMessage(FacesMessage.SEVERITY_INFO, "INFO", "Registro processado com sucesso."));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void inserir() {
        if (endereco == null || endereco.getId() != null) {
            endereco = criarEndereco();
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
        endereco = criarEndereco();
        modoTela.mudarParaLocalizacao();
    }

    public void selecionaEnderecoSelectEvent(SelectEvent selectEvent) {
        endereco = (EnderecoEntity) selectEvent.getObject();
        modoTela.mudarParaVisualizacao();
    }

    public EnderecoComponentListener enderecoComponentListener() {
        return new EnderecoComponentListener() {

            public List<CidadeEntity> completeMethodCidade(String query) {
                Predicate<CidadeEntity> predicate = new Predicate<CidadeEntity>() {
                    @Override
                    public boolean test(CidadeEntity arg0) {
                        return arg0.getNome().toUpperCase().contains(query.toUpperCase());
                    }
                };
                return cidadeList.stream().filter(predicate).collect(Collectors.toList());
            }

            public void selecionaCidade(SelectEvent selectEvent) {
                CidadeEntity pessoa = (CidadeEntity) selectEvent.getObject();
                endereco.getLogradouro().getBairro().setCidade(pessoa);
            }

            public void actionUnlockedCidade() {
                endereco.setLogradouro(criarLogradouro());
            }

            public List<LogradouroEntity> completeMethodLogradouro(String query) {
                Predicate<LogradouroEntity> predicate = new Predicate<LogradouroEntity>() {
                    @Override
                    public boolean test(LogradouroEntity arg0) {
                        return arg0.getNome().toUpperCase().contains(query.toUpperCase());
                    }
                };
                return logradouroList.stream().filter(predicate).collect(Collectors.toList());
            }

            public void actionLocalizarEvent(ActionEvent actionEvent) {
                System.out.println(".actionLocalizarEvent()");
            }

            public void selecionaLogradouro(SelectEvent selectEvent) {
                CidadeEntity pessoa = (CidadeEntity) selectEvent.getObject();
                endereco.getLogradouro().getBairro().setCidade(pessoa);
            }

            public void actionUnlockedLogradouro() {
                endereco.setLogradouro(criarLogradouro());
            }

        };
    }

    private static CidadeEntity criarCidade() {
        return new CidadeEntity();
    }

    private static BairroEntity criarBairro() {
        BairroEntity bairro = new BairroEntity();
        bairro.setCidade(criarCidade());
        return bairro;
    }

    private static LogradouroEntity criarLogradouro() {
        LogradouroEntity logradouro = new LogradouroEntity();
        logradouro.setBairro(criarBairro());
        return logradouro;
    }

    private static EnderecoEntity criarEndereco() {
        EnderecoEntity endereco = new EnderecoEntity();
        endereco.setLogradouro(criarLogradouro());
        return endereco;
    }

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }
}
