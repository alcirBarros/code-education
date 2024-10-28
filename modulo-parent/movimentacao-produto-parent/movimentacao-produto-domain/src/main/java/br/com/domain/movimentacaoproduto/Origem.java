package br.com.domain.movimentacaoproduto;

import br.com.domain.Estabelecimento;
import br.com.domain.fornecedor.Fornecedor;
import br.com.domain.tipodocumento.TipoTramitacaoOrigem;
import br.com.context.model.AbstractEntidade;
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
@Table(name = "rgm_origem")
public class Origem extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rgm_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tto_id", referencedColumnName = "tto_id", foreignKey = @ForeignKey(name = "fk_rgm_tto_id"))
    private TipoTramitacaoOrigem tipoTramitacaoOrigem;
    
    @ManyToOne
    @JoinColumn(name = "est_id", referencedColumnName = "est_id", foreignKey = @ForeignKey(name = "fk_rgm_est_id"))
    private Estabelecimento estabelecimento;

    @ManyToOne
    @JoinColumn(name = "frn_id", referencedColumnName = "frn_id", foreignKey = @ForeignKey(name = "fk_rgm_frn_id"))
    private Fornecedor fornecedor;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoTramitacaoOrigem getTipoTramitacaoOrigem() {
        return tipoTramitacaoOrigem;
    }

    public void setTipoTramitacaoOrigem(TipoTramitacaoOrigem tipoTramitacaoOrigem) {
        this.tipoTramitacaoOrigem = tipoTramitacaoOrigem;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
