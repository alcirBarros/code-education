package br.com.context.model.tipodocumento;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "ttd_tipo_tramitacao_destino")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "ttd_id", referencedColumnName = "tmc_id", foreignKey = @ForeignKey(name = "fk_tto_tmc_id"))})
public class TipoTramitacaoDestinoEntity extends TipoTramitacaoEntity {

    @Override
    public String getDisplay() {
        return super.getDisplay();
    }
}
