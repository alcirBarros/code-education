package br.com.context.model.tipoturno.model;

import br.com.context.model.tipoturno.enumerator.TipoTurnoEnum;
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
@Table(name = "trn_tipo_turno", catalog = "auxiliar")
public class TipoTurno extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trn_id", nullable = false)
    private Integer id;

    @Column(name = "trn_codigo", length = 10)
    private String codigo;

    @Column(name = "trn_descricao", length = 60)
    private String descicao;

    @Enumerated(EnumType.STRING)
    @Column(name = "trn_tipo_turno_enum")
    private TipoTurnoEnum tipoTurnoEnum;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public TipoTurnoEnum getTipoTurnoEnum() {
        return tipoTurnoEnum;
    }

    public void setTipoTurnoEnum(TipoTurnoEnum tipoTurnoEnum) {
        this.tipoTurnoEnum = tipoTurnoEnum;
    }

    @Override
    public Serializable getOrderBy() {
        return descicao;
    }

    @Override
    public String getDisplay() {
        return descicao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.id);
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
        final TipoTurno other = (TipoTurno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}