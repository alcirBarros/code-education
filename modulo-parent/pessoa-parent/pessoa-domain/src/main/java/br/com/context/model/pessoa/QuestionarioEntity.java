package br.com.context.model.pessoa;

import br.com.context.model.tipoquestionario.model.TipoQuestionario;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "qus_questionario", catalog = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class QuestionarioEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qus_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_qus_pss_id"))
    private PessoaEntity pessoa;

    @ManyToOne
    @JoinColumn(name = "tpq_id", referencedColumnName = "tpq_id", foreignKey = @ForeignKey(name = "fk_qus_tpq_id"))
    private TipoQuestionario tipoQuestionario;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public TipoQuestionario getTipoQuestionario() {
        return tipoQuestionario;
    }

    public void setTipoQuestionario(TipoQuestionario tipoQuestionario) {
        this.tipoQuestionario = tipoQuestionario;
    }
}
