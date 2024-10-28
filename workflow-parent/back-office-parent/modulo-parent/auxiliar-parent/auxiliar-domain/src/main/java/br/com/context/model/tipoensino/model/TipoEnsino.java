package br.com.context.model.tipoensino.model;

import br.com.context.model.tipoensino.enumerator.TipoEnsinoEnum;
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
@Table(name = "esn_tipo_ensino", catalog = "auxiliar")
public class TipoEnsino extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "esn_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "esn_tipo_ensino_enum")
    private TipoEnsinoEnum tipoEnsinoEnum;

    @Column(name = "esn_codigo")
    private String codigo;

    @Column(name = "esn_descricao", length = 255)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoEnsinoEnum getTipoEnsinoEnum() {
        return tipoEnsinoEnum;
    }

    public void setTipoEnsinoEnum(TipoEnsinoEnum tipoClasseEnum) {
        this.tipoEnsinoEnum = tipoClasseEnum;
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
        final TipoEnsino other = (TipoEnsino) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
