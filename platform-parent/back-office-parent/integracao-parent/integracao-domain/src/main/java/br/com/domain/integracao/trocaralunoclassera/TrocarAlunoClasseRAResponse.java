//package br.com.domain.integracao.trocaralunoclassera;
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
//@Table(name = "tar_troca_aluno_classe_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_tar_pdr_id"))})
//public class TrocarAlunoClasseRAResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "tar_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "tcs_troca_entre_classe",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_tcs_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "tac_id", referencedColumnName = "tac_id", foreignKey = @ForeignKey(name = "fk_tcs_tac_id"))})
//    private List<TrocaEntreClasses> trocaEntreClassesList;
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
//    public List<TrocaEntreClasses> getTrocaEntreClassesList() {
//        return trocaEntreClassesList;
//    }
//
//    public void setTrocaEntreClassesList(List<TrocaEntreClasses> trocaEntreClassesList) {
//        this.trocaEntreClassesList = trocaEntreClassesList;
//    }
//}
