package br.com.context.model.grupoproduto;

import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "gpd_grupo_produto")
@Inheritance(strategy = InheritanceType.JOINED)
public class GrupoProduto extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gpd_id", nullable = false)
    private Integer id;

    @Column(name = "gpd_descricao")
    private String descrição;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    @Override
    public String getDisplay() {
        return descrição;
    }

    
}
