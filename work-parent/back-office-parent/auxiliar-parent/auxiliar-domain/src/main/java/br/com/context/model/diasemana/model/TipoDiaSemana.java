package br.com.context.model.diasemana.model;

import br.com.context.model.diasemana.enumerator.TipoDiaSemanaEnum;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dsn_tipo_dia_semana", catalog = "auxiliar")
public class TipoDiaSemana extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dsn_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "dsn_tipo_dia_semana_enum")
    private TipoDiaSemanaEnum tipoDiaSemanaEnum;

    @Column(name = "dsn_descricao", length = 50)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDiaSemanaEnum getTipoDiaSemanaEnum() {
        return tipoDiaSemanaEnum;
    }

    public void setTipoDiaSemanaEnum(TipoDiaSemanaEnum tipoDiaSemanaEnum) {
        this.tipoDiaSemanaEnum = tipoDiaSemanaEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return tipoDiaSemanaEnum.getOrderBy();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoDiaSemana other = (TipoDiaSemana) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}