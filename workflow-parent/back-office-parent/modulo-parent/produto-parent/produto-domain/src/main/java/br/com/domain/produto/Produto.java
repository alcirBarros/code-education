package br.com.domain.produto;

import br.com.domain.grupoproduto.GrupoProduto;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pdt_produto")
@Inheritance(strategy = InheritanceType.JOINED)
public class Produto extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdt_id", nullable = false)
    private Integer id;

    @Column(name = "pdt_descricao")
    private String descricao;
    
    @OneToOne
    @JoinColumn(name = "gpd_id", referencedColumnName = "gpd_id")
    private GrupoProduto grupoProduto;

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

    public GrupoProduto getGrupoProduto() {
        return grupoProduto;
    }

    public void setGrupoProduto(GrupoProduto grupoProduto) {
        this.grupoProduto = grupoProduto;
    }

    @Override
    public String getDisplay() {
        return descricao;
    } 
}
