//package br.com.domain.integracao.consultarmatriculasra;
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
//@Table(name = "rar_consultar_matricula_registro_aluno_response")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_rar_pdr_id"))})
//public class ConsultarMatriculasRaResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "rar_codigo_processo", length = 16)
//    private String outProcessoID;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "mra_matricula_registro_aluno_response",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_mra_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "cma_id", referencedColumnName = "cma_id", foreignKey = @ForeignKey(name = "fk_mra_cma_id"))})
//    private List<ConsultarMatricRA> consultarMatricRAList;
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
//    public List<ConsultarMatricRA> getConsultarMatricRAList() {
//        return consultarMatricRAList;
//    }
//
//    public void setConsultarMatricRAList(List<ConsultarMatricRA> consultarMatricRAList) {
//        this.consultarMatricRAList = consultarMatricRAList;
//    }
//}
