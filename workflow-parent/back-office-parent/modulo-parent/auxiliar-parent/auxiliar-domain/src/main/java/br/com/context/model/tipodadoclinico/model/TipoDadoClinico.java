package br.com.context.model.tipodadoclinico.model;

import br.com.context.model.tipogrupoanamnese.model.TipoGrupoAnamnese;
import br.com.context.model.AbstractEntidade;
import br.com.context.model.Entidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tcl_tipo_dado_clinico", catalog = "auxiliar")
public class TipoDadoClinico extends AbstractEntidade implements Entidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tcl_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tgn_id", referencedColumnName = "tgn_id", foreignKey = @ForeignKey(name = "fk_tcl_tgn_id"), nullable = false)
    private TipoGrupoAnamnese tipoGrupoAnamnese;

    @Column(name = "tcl_descricao", length = 255)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public TipoGrupoAnamnese getTipoGrupoAnamnese() {
        return tipoGrupoAnamnese;
    }

    public void setTipoGrupoAnamnese(TipoGrupoAnamnese tipoGrupoAnamnese) {
        this.tipoGrupoAnamnese = tipoGrupoAnamnese;
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
