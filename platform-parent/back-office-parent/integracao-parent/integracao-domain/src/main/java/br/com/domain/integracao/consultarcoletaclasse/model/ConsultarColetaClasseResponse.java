//package br.com.domain.integracao.consultarcoletaclasse.model;
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "ccr_consultar_coleta_classe_response")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_ccr_pdr_id"))})
//public class ConsultarColetaClasseResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "ccr_codigo_processo")
//    private String outProcessoID;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "mcr_mensagem_consulta_coleta_classe_response",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_mcr_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "mcc_id", referencedColumnName = "mcc_id", foreignKey = @ForeignKey(name = "fk_mcr_mcc_id"))})
//    private List<MsgConsultaColetaClasse> msgConsultaColetaClasses;
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
//    public List<MsgConsultaColetaClasse> getMsgConsultaColetaClasses() {
//        return msgConsultaColetaClasses;
//    }
//
//    public void setMsgConsultaColetaClasses(List<MsgConsultaColetaClasse> msgConsultaColetaClasses) {
//        this.msgConsultaColetaClasses = msgConsultaColetaClasses;
//    }
//}
