//package br.com.domain.integracao.excluircoletaclasse.model;
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
//@Table(name = "ecr_excluir_coleta_classe_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_ecr_pdr_id"))})
//public class ExcluirColetaClasseResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "ecr_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "mxc_mensagem_excluir_coleta_classe",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_mxc_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "xcc_id", referencedColumnName = "xcc_id", foreignKey = @ForeignKey(name = "fk_mxc_xcc_id"))})
//    private List<MsgExcluirColetaClasse> msgExcluirColetaClasse;
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
//    public List<MsgExcluirColetaClasse> getMsgExcluirColetaClasse() {
//        return msgExcluirColetaClasse;
//    }
//
//    public void setMsgExcluirColetaClasse(List<MsgExcluirColetaClasse> msgExcluirColetaClasse) {
//        this.msgExcluirColetaClasse = msgExcluirColetaClasse;
//    }
//}
