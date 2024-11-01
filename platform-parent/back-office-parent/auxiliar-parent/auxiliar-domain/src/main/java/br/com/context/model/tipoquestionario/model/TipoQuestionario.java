package br.com.context.model.tipoquestionario.model;

import br.com.context.model.tipoquestionario.enumerator.TipoQuestionarioEnum;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tpq_tipo_questionario", catalog = "auxiliar")
public class TipoQuestionario extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tpq_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tpq_tipo_questionario_enum")
    private TipoQuestionarioEnum tipoQuestionarioEnum;

    @Column(name = "tpq_descricao", length = 50)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoQuestionarioEnum getTipoQuestionarioEnum() {
        return tipoQuestionarioEnum;
    }

    public void setTipoQuestionarioEnum(TipoQuestionarioEnum tipoQuestionarioEnum) {
        this.tipoQuestionarioEnum = tipoQuestionarioEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
