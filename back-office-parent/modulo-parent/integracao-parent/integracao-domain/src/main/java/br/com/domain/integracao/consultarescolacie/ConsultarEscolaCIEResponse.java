//package br.com.domain.integracao.consultarescolacie;
//
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cer_consultar_escola_cie_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_cer_pdr_id"))})
//public class ConsultarEscolaCIEResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "cer_codigo_processo", length = 16)
//    private String outProcessoID;
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "cec_consultar_escola",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_cer_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "csc_id", referencedColumnName = "csc_id", foreignKey = @ForeignKey(name = "fk_cer_csc_id"))})
//    private List<ConsultEscolaCIE> consultEscolaCIE;
//
//    @Override
//    public String getOutProcessoID() {
//        return outProcessoID;
//    }
//
//    public void setOutProcessoID(String outProcessoID) {
//        this.outProcessoID = outProcessoID;
//    }
//
//    public List<ConsultEscolaCIE> getConsultEscolaCIE() {
//        return consultEscolaCIE;
//    }
//
//    public void setConsultEscolaCIE(List<ConsultEscolaCIE> consultEscolaCIE) {
//        this.consultEscolaCIE = consultEscolaCIE;
//    }
//}
