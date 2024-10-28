//package br.com.domain.integracao.consultaformacaoclasse;
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;
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
//@Table(name = "fcr_consulta_formacao_classe_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_fcr_pdr_id"))})
//public class ConsultaFormacaoClasseResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "fcr_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "css_consulta_classe",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_css_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "csl_id", referencedColumnName = "csl_id", foreignKey = @ForeignKey(name = "fk_css_csl_id"))})
//    private Set<ConsultaClasse> consultaClasseList = new HashSet<>();
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
//    public Set<ConsultaClasse> getConsultaClasseList() {
//        return consultaClasseList;
//    }
//
//    public void setConsultaClasseList(Set<ConsultaClasse> consultaClasseList) {
//        this.consultaClasseList = consultaClasseList;
//    }
//}
