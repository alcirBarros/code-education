package br.com.context.model.pessoa;

import br.com.context.model.AbstractEntidade;
import br.com.context.model.EncriptValue;
import br.com.context.model.Entidade;
import br.com.context.model.codigobrasileiraocupacao.model.CodigoBrasileiroOcupacao;
import br.com.context.model.escolaridade.model.TipoEscolaridade;
import br.com.context.model.estadocivil.model.TipoEstadoCivil;
import br.com.context.model.tiposexo.model.TipoSexo;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Getter
@Setter
@Entity
@Table( catalog = "pessoa", name = "\"model::pss_pessoa\"")
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaEntity extends AbstractEntidade {

    @Id
    @Comment("I am id")
    @PropertyColumn()
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pss_id", updatable = false, unique = true, nullable = false)
    private UUID id;

    @CreationTimestamp
    @Comment("I am id")
    @Column(name = "pss_timestamp_create", nullable = false)
    private LocalDateTime createDateTime;

    @UpdateTimestamp
    @Comment("I am id")
    @Column(name = "pss_timestamp_update", nullable = false)
    private LocalDateTime updateDateTime;

    @Comment("I am id")
    @Convert(converter = EncriptValue.class)
    @Column(name = "pss_nome", scale = 255, nullable = false)
    private String nome;

    @Comment("I am id")
    @Column(name = "pss_data_nascimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;

    @ManyToOne
    @Comment("I am id")
    @JoinColumn(name = "sxo_id", referencedColumnName = "sxo_id", foreignKey = @ForeignKey(name = "fk_pss_sxo_id"))
    private TipoSexo tipoSexo;

    @ManyToOne
    @Comment("I am id")
    @JoinColumn(name = "tsc_id", referencedColumnName = "tsc_id", foreignKey = @ForeignKey(name = "fk_pss_tsc_id"))
    private TipoEstadoCivil tipoEstadoCivil;

    @ManyToOne
    @Comment("I am id")
    @JoinColumn(name = "tsl_id", referencedColumnName = "tsl_id", foreignKey = @ForeignKey(name = "fk_pss_tsl_id"))
    private TipoEscolaridade tipoEscolaridade;

    @ManyToOne
    @Comment("I am id")
    @JoinColumn(name = "cbo_id", referencedColumnName = "cbo_id", foreignKey = @ForeignKey(name = "fk_pss_cbo_id"))
    private CodigoBrasileiroOcupacao codigoBrasileiroOcupacao;

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<ResponsavelPessoaEntity> responsavelPessoaList = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<DocumentoPessoaEntity> documentoPessoaLost = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<ContactPessoaEntity> contatoList = new ArrayList<>();

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<EnderecoPessoaEntity> enderecoPessoaList = new ArrayList<>();

    private <T extends Entidade> boolean existe(List<T> list, T entidade) {
        return list.contains(entidade);
    }

    public void adicionarResponsavel(ResponsavelPessoaEntity responsavelPessoa) {
//        if (!existe(responsavelPessoaList, responsavelPessoa)) {
//            responsavelPessoa.setPessoa(this);
//            responsavelPessoaList.add(responsavelPessoa);
//        }
    }

    public void adicionarDocumento(DocumentoPessoaEntity documentoPessoa) {
//        if (!existe(documentoPessoaLost, documentoPessoa)) {
//            documentoPessoa.setPessoa(this);
//            documentoPessoaLost.add(documentoPessoa);
//        }
    }

    public void adicionarContato(ContactPessoaEntity contatoPessoa) {
//        if (!existe(contatoList, contatoPessoa)) {
//            contatoPessoa.setPessoa(this);
//            contatoList.add(contatoPessoa);
//        }
    }

    public void adicionarEndereco(EnderecoPessoaEntity enderecoPessoa) {
//        if (!existe(enderecoPessoaList, enderecoPessoa)) {
//            enderecoPessoa.setPessoa(this);
//            enderecoPessoaList.add(enderecoPessoa);
//        }
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public String getDisplay() {
        return nome;
    }
}
