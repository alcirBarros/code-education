package br.com.context.model.tiporesponsavel.model;

import br.com.context.model.tiporesponsavel.enumerator.TipoResponsavelEnum;
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
@Table(name = "trp_tipo_responsavel", catalog = "auxiliar")
public class TipoResponsavel extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trp_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "trp_tipo_responsavel_enum")
    private TipoResponsavelEnum tipoResponsavelEnum;

    @Column(name = "trp_descricao", length = 50)
    private String descricao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoResponsavelEnum getTipoResponsavelEnum() {
        return tipoResponsavelEnum;
    }

    public void setTipoResponsavelEnum(TipoResponsavelEnum tipoResponsavelEnum) {
        this.tipoResponsavelEnum = tipoResponsavelEnum;
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
}
