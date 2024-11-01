package br.com.context.model.tiporacacor.model;

import br.com.context.model.tiporacacor.enumerator.TipoRacaCorEnum;
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
@Table(name = "rcr_raca_cor", catalog = "auxiliar")
public class TipoRacaCor extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rcr_id", nullable = false)
    private Integer id;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "rcr_tipo_raca_cor_enum")
    private TipoRacaCorEnum tipoRacaCorEnum;

    @Column(name = "rcr_codigo", length = 2)
    private String codigo;

    @Column(name = "rcr_descricao", length = 50)
    private String descricao;

    public TipoRacaCor() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoRacaCorEnum getTipoRacaCorEnum() {
        return tipoRacaCorEnum;
    }

    public void setTipoRacaCorEnum(TipoRacaCorEnum tipoRacaCorEnum) {
        this.tipoRacaCorEnum = tipoRacaCorEnum;
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
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final TipoRacaCor other = (TipoRacaCor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
