package br.com.context.model.tiposexo.model;


import br.com.context.model.tiposexo.enumerator.TipoSexoEnum;
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
@Table(name = "sxo_sexo", catalog = "auxiliar")
public class TipoSexo extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sxo_id", nullable = false)
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "sxo_tipo_sexo_enum")
    private TipoSexoEnum tipoSexoEnum;

    @Column(name = "sxo_codigo", length = 1)
    private String codigo;

    @Column(name = "sxo_descricao", length = 50)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoSexoEnum getTipoSexoEnum() {
        return tipoSexoEnum;
    }

    public void setTipoSexoEnum(TipoSexoEnum tipoSexoEnum) {
        this.tipoSexoEnum = tipoSexoEnum;
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
        int hash = 3;
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
        final TipoSexo other = (TipoSexo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
