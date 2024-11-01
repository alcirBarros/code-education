package br.com.context.model.tipodocumento;

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
@Table(name = "txp_tipo_exige_preenchimento")
public class TipoExigePreenchimentoEntity extends AbstractEntidade implements Serializable {

    private static final long serialVersionUID = -527837408520674389L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "txp_id")
    private Integer id;

    @Column(name = "txp_descricao")
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "txp_tipo_exige_preenchimento_enum", nullable = false)
    private TipoExigePreenchimentoEnum tipoExigePreenchimentoEnum;

    public TipoExigePreenchimentoEntity() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoExigePreenchimentoEnum getTipoExigePreenchimentoEnum() {
        return tipoExigePreenchimentoEnum;
    }

    public void setTipoExigePreenchimentoEnum(TipoExigePreenchimentoEnum tipoExigePreenchimentoEnum) {
        this.tipoExigePreenchimentoEnum = tipoExigePreenchimentoEnum;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final TipoExigePreenchimentoEntity other = (TipoExigePreenchimentoEntity) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }  
}
