//package br.com.domain.integracao.alterarcoletaclasse.model;
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import java.util.ArrayList;
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
//@Table(name = "lcr_alterar_coleta_classe_response")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_lcr_pdr_id"))})
//public class AlterarColetaClasseResponse extends ProdespResponse  implements ResponseEntity, Serializable {
//
//    @Deprecated
//    @Column(name = "lcr_sucesso", length = 30)
//    private String outSucesso;
//
//    @Column(name = "lcr_codigo_processo", length = 16)
//    private String outProcessoID;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "acr_mensagem_alterar_coleta_classe_response",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_acr_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "mac_id", referencedColumnName = "mac_id", foreignKey = @ForeignKey(name = "fk_acr_mac_id"))})
//    private List<MsgAlterarColetaClasse> mensagensErroItem = new ArrayList<>();
//
//    public String getOutSucesso() {
//        return outSucesso;
//    }
//
//    public void setOutSucesso(String outSucesso) {
//        this.outSucesso = outSucesso;
//    }
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
//    public List<MsgAlterarColetaClasse> getMensagensErroItem() {
//        return mensagensErroItem;
//    }
//
//    public void setMensagensErroItem(List<MsgAlterarColetaClasse> mensagensErroItem) {
//        this.mensagensErroItem = mensagensErroItem;
//    }
//}
