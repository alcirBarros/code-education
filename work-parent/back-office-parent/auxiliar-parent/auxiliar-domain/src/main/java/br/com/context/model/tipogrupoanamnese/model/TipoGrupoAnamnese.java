package br.com.context.model.tipogrupoanamnese.model;

import br.com.context.model.tipogrupoanamnese.enumerator.TipoGrupoAnamneseEnum;
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
@Table(name = "tgn_tipo_grupo_anamnese", catalog = "auxiliar")
public class TipoGrupoAnamnese extends AbstractEntidade{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tgn_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tgn_tipo_grupo_anamnese_enum")
    private TipoGrupoAnamneseEnum tipoGrupoAnamneseEnum;

    @Column(name = "tgn_descricao", length = 255)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoGrupoAnamneseEnum getTipoGrupoAnamneseEnum() {
        return tipoGrupoAnamneseEnum;
    }

    public void setTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum tipoGrupoAnamneseEnum) {
        this.tipoGrupoAnamneseEnum = tipoGrupoAnamneseEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return tipoGrupoAnamneseEnum.getOrderBy();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }
}
