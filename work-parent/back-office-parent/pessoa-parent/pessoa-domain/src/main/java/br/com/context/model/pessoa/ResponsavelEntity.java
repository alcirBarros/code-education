package br.com.context.model.pessoa;

import br.com.context.model.tiporesponsavel.model.TipoResponsavel;

import javax.persistence.*;

@Entity
@Table(name = "rsp_responsavel", catalog = "pessoa")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "rsp_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_rsp_pss_id"))})
public class ResponsavelEntity extends PessoaEntity {

    @ManyToOne
    @JoinColumn(name = "trp_id", referencedColumnName = "trp_id", foreignKey = @ForeignKey(name = "fk_rps_trp_id"))
    private TipoResponsavel tipoResponsavel;

    public TipoResponsavel getTipoResponsavel() {
        return tipoResponsavel;
    }

    public void setTipoResponsavel(TipoResponsavel tipoResponsavel) {
        this.tipoResponsavel = tipoResponsavel;
    }

    @Override
    public String getDisplay() {
        return super.getNome();
    }
}
