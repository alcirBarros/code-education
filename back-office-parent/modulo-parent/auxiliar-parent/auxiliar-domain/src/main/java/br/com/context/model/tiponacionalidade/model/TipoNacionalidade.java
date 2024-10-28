package br.com.context.model.tiponacionalidade.model;

import br.com.context.model.tiponacionalidade.enumerator.TipoNacionalidadeEnum;
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
@Table(name = "ncd_nacionalidade", catalog = "auxiliar")
public class TipoNacionalidade extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ncd_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "ncd_tipo_nacionalidade_enum")
    private TipoNacionalidadeEnum tipoNacionalidadeEnum;

    @Column(name = "ncd_codigo", length = 1)
    private String codigo;

    @Column(name = "ncd_descricao", length = 50)
    private String descricao;

    public TipoNacionalidade() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoNacionalidadeEnum getTipoNacionalidadeEnum() {
        return tipoNacionalidadeEnum;
    }

    public void setTipoNacionalidadeEnum(TipoNacionalidadeEnum tipoNacionalidadeEnum) {
        this.tipoNacionalidadeEnum = tipoNacionalidadeEnum;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return descricao;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
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
        final TipoNacionalidade other = (TipoNacionalidade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}