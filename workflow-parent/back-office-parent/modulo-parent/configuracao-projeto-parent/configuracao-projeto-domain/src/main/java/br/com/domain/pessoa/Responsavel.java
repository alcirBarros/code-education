//package br.com.domain.pessoa;
//
//import br.com.domain.auxiliar.tiporesponsavel.model.TipoResponsavel;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "rsp_responsavel", catalog = "pessoa")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "rsp_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_rsp_pss_id"))})
//public class Responsavel extends Pessoa {
//
//    @ManyToOne
//    @JoinColumn(name = "trp_id", referencedColumnName = "trp_id", foreignKey = @ForeignKey(name = "fk_rps_trp_id"))
//    private TipoResponsavel tipoResponsavel;
//
//    public TipoResponsavel getTipoResponsavel() {
//        return tipoResponsavel;
//    }
//
//    public void setTipoResponsavel(TipoResponsavel tipoResponsavel) {
//        this.tipoResponsavel = tipoResponsavel;
//    }
//
//    @Override
//    public String getDisplay() {
//        return super.getNome();
//    }
//}
