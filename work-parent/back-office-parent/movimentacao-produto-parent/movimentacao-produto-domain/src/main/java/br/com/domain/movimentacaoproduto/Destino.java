package br.com.domain.movimentacaoproduto;

import br.com.domain.Estabelecimento;
import br.com.domain.tipodocumento.TipoTramitacaoDestino;
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
@Table(name = "dst_origem")
public class Destino extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dst_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ttd_id", referencedColumnName = "ttd_id", foreignKey = @ForeignKey(name = "fk_dst_ttd_id"))
    private TipoTramitacaoDestino tipoTramitacaoDestino;

    @ManyToOne
    @JoinColumn(name = "est_id", referencedColumnName = "est_id", foreignKey = @ForeignKey(name = "fk_dst_est_id"))
    private Estabelecimento estabelecimento;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoTramitacaoDestino getTipoTramitacaoDestino() {
        return tipoTramitacaoDestino;
    }

    public void setTipoTramitacaoDestino(TipoTramitacaoDestino tipoTramitacaoDestino) {
        this.tipoTramitacaoDestino = tipoTramitacaoDestino;
    }
}
