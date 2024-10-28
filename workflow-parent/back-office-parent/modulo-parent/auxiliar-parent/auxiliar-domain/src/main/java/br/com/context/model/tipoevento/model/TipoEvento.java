package br.com.context.model.tipoevento.model;

import br.com.context.model.tipoevento.enumerator.TipoEventoEnum;
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
@Table(name = "tev_tipo_evento", catalog = "auxiliar")
public class TipoEvento extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tev_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tev_tipo_evento_enum")
    private TipoEventoEnum tipoEventoEnum;

    @Column(name = "tev_descricao", length = 50)
    private String descricao;

    public TipoEvento() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoEventoEnum getTipoEventoEnum() {
        return tipoEventoEnum;
    }

    public void setTipoEventoEnum(TipoEventoEnum tipoEventoEnum) {
        this.tipoEventoEnum = tipoEventoEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.id);
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
        final TipoEvento other = (TipoEvento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
}
