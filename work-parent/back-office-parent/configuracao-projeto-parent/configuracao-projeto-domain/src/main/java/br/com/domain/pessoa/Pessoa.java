//package br.com.domain.pessoa;
//
//import br.com.domain.auxiliar.codigobrasileiraocupacao.model.CodigoBrasileiroOcupacao;
//import br.com.domain.auxiliar.escolaridade.model.TipoEscolaridade;
//import br.com.domain.auxiliar.estadocivil.model.TipoEstadoCivil;
//import br.com.domain.auxiliar.tiposexo.model.TipoSexo;
//import br.com.domain.endereco.Endereco;
//import br.com.projeto.model.AbstractEntidade;
//import br.com.projeto.model.Entidade;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Inheritance;
//import javax.persistence.InheritanceType;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "pss_pessoa", catalog = "pessoa")
//@Inheritance(strategy = InheritanceType.JOINED)
//public class Pessoa extends AbstractEntidade {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "pss_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "pss_nome", scale = 255, nullable = false)
//    private String nome;
//
//    @Column(name = "pss_data_nascimento")
//    private Date dataNascimento;
//
//    @ManyToOne
//    @JoinColumn(name = "sxo_id", referencedColumnName = "sxo_id")
//    private TipoSexo tipoSexo;
//
//    @ManyToOne
//    @JoinColumn(name = "tsc_id", referencedColumnName = "tsc_id")
//    private TipoEstadoCivil tipoEstadoCivil;
//
//    @ManyToOne
//    @JoinColumn(name = "tsl_id", referencedColumnName = "tsl_id")
//    private TipoEscolaridade tipoEscolaridade;
//
//    @ManyToOne
//    @JoinColumn(name = "end_uuid", referencedColumnName = "end_uuid")
//    private Endereco endereco;
//
//    @ManyToOne
//    @JoinColumn(name = "cbo_id", referencedColumnName = "cbo_id")
//    private CodigoBrasileiroOcupacao codigoBrasileiroOcupacao;
//
//    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
//    private List<ResponsavelPessoa> responsavelPessoaList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
//    private List<ContatoPessoa> contatoList = new ArrayList<>();
//
//    public void adicionarResponsavelPessoa(ResponsavelPessoa responsavelPessoa) {
//        if (!existe(responsavelPessoaList, responsavelPessoa)) {
//            responsavelPessoa.setPessoa(this);
//            responsavelPessoaList.add(responsavelPessoa);
//        }
//    }
//
//    private <T extends Entidade> boolean existe(List<T> list, T entidade) {
//        return list.contains(entidade);
//    }
//
//    public void adicionarContato(ContatoPessoa contatoPessoa) {
//        if (!existe(contatoList, contatoPessoa)) {
//            contatoPessoa.setPessoa(this);
//            contatoList.add(contatoPessoa);
//        }
//    }
//
//    @Override
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public TipoSexo getTipoSexo() {
//        return tipoSexo;
//    }
//
//    public void setTipoSexo(TipoSexo tipoSexo) {
//        this.tipoSexo = tipoSexo;
//    }
//
//    public TipoEstadoCivil getTipoEstadoCivil() {
//        return tipoEstadoCivil;
//    }
//
//    public void setTipoEstadoCivil(TipoEstadoCivil tipoEstadoCivil) {
//        this.tipoEstadoCivil = tipoEstadoCivil;
//    }
//
//    public TipoEscolaridade getTipoEscolaridade() {
//        return tipoEscolaridade;
//    }
//
//    public void setTipoEscolaridade(TipoEscolaridade tipoEscolaridade) {
//        this.tipoEscolaridade = tipoEscolaridade;
//    }
//
//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
//
//    public CodigoBrasileiroOcupacao getCodigoBrasileiroOcupacao() {
//        return codigoBrasileiroOcupacao;
//    }
//
//    public void setCodigoBrasileiroOcupacao(CodigoBrasileiroOcupacao codigoBrasileiroOcupacao) {
//        this.codigoBrasileiroOcupacao = codigoBrasileiroOcupacao;
//    }
//
//    public List<ResponsavelPessoa> getResponsavelPessoaList() {
//        return responsavelPessoaList;
//    }
//
//    public List<ContatoPessoa> getContatoList() {
//        return contatoList;
//    }
//
//    @Override
//    public String getDisplay() {
//        return nome;
//    }
//}
