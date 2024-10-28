package br.com.context.model.tipoclasse.model;

import br.com.context.model.tipoclasse.numerator.TipoClasseEnum;
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
@Table(name = "cls_tipo_classe", catalog = "auxiliar")
public class TipoClasse extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cls_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "cls_tipo_classe_enum")
    private TipoClasseEnum tipoClasseEnum;

    @Column(name = "cls_codigo")
    private String codigo;

    @Column(name = "cls_descricao", length = 50)
    private String descricao;

    @Column(name = "cls_abreviacao", length = 50)
    private String abreviacao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoClasseEnum getTipoClasseEnum() {
        return tipoClasseEnum;
    }

    public void setTipoClasseEnum(TipoClasseEnum tipoClasseEnum) {
        this.tipoClasseEnum = tipoClasseEnum;
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

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
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
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final TipoClasse other = (TipoClasse) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
