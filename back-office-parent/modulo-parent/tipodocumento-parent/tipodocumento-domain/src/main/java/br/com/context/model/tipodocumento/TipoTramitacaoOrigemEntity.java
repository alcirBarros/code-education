package br.com.context.model.tipodocumento;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name = "tto_tipo_tramitacao_origem")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "tto_id", referencedColumnName = "tmc_id", foreignKey = @ForeignKey(name = "fk_tto_tmc_id"))})
public class TipoTramitacaoOrigemEntity extends TipoTramitacaoEntity {

    @Override
    public String getDisplay() {
        return super.getDisplay(); 
    }
}
