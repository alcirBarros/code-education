package br.com.context.model.estadocivil.model;

import br.com.context.model.estadocivil.enumerator.TipoEstadoCivilEnum;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tsc_tipo_estado_civil", catalog = "auxiliar")
public class TipoEstadoCivil extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tsc_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tsc_tipo_estado_civil_enum", nullable = false)
    private TipoEstadoCivilEnum tipoEstadoCivilEnum;

    @Column(name = "tsc_descricao", nullable = false)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoEstadoCivilEnum getTipoEstadoCivilEnum() {
        return tipoEstadoCivilEnum;
    }

    public void setTipoEstadoCivilEnum(TipoEstadoCivilEnum tipoEstadoCivilEnum) {
        this.tipoEstadoCivilEnum = tipoEstadoCivilEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return tipoEstadoCivilEnum.getOrderBy();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }
    
    
}
