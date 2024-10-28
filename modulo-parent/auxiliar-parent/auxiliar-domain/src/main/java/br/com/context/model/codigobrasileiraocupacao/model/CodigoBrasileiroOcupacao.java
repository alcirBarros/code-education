package br.com.context.model.codigobrasileiraocupacao.model;

import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cbo_codigo_brasileiro_ocupacao", catalog = "auxiliar")
public class CodigoBrasileiroOcupacao extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cbo_id")
    private Integer id;

    @Column(name = "cbo_codigo", nullable = false)
    private String codigo;

    @Column(name = "cbo_descricao", nullable = false)
    private String descricao;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
