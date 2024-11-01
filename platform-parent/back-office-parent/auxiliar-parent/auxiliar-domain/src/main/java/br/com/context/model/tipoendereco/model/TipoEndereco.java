package br.com.context.model.tipoendereco.model;

import br.com.context.model.tipoendereco.enumerator.TipoEnderecoEnum;
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
@Table(name = "tpe_tipo_endereco", catalog = "auxiliar")
public class TipoEndereco extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tpe_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tpe_tipo_endereco_enum")
    private TipoEnderecoEnum tipoEnderecoEnum;

    @Column(name = "tpe_descricao", length = 50)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoEnderecoEnum getTipoEnderecoEnum() {
        return tipoEnderecoEnum;
    }

    public void setTipoEnderecoEnum(TipoEnderecoEnum tipoEnderecoEnum) {
        this.tipoEnderecoEnum = tipoEnderecoEnum;
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
