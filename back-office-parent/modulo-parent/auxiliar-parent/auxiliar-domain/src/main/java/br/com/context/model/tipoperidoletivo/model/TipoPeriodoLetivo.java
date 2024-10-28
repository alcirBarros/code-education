package br.com.context.model.tipoperidoletivo.model;

import br.com.context.model.tipoperidoletivo.enumerator.TipoPeriodoLetivoEnum;
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
@Table(name = "plv_tipo_periodo_letivo", catalog = "auxiliar")
public class TipoPeriodoLetivo extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plv_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "plv_tipo_periodo_letivo_enum")
    private TipoPeriodoLetivoEnum tipoPeriodoLetivoEnum;

    @Column(name = "plv_descricao", length = 50)
    private String descricao;

    public TipoPeriodoLetivo() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoPeriodoLetivoEnum getTipoPeriodoLetivoEnum() {
        return tipoPeriodoLetivoEnum;
    }

    public void setTipoPeriodoLetivoEnum(TipoPeriodoLetivoEnum tipoPeriodoLetivoEnum) {
        this.tipoPeriodoLetivoEnum = tipoPeriodoLetivoEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return tipoPeriodoLetivoEnum.getOrderBy();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
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
        final TipoPeriodoLetivo other = (TipoPeriodoLetivo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
