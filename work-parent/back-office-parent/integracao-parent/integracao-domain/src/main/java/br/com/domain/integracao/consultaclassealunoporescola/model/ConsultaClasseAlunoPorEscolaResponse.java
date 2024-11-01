//package br.com.domain.integracao.consultaclassealunoporescola.model;
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.List;
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
//@Table(name = "cer_consultar_classe_aluno_por_escola_response")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_cer_pdr_id"))})
//public class ConsultaClasseAlunoPorEscolaResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "cer_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "cer_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "mce_mensagem_consultar_classe_aluno_por_escola",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_mce_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "mcc_id", referencedColumnName = "mcc_id", foreignKey = @ForeignKey(name = "fk_mce_mcc_id"))})
//    private Set<MsgConsultaClasseAlunoPorEscola> msgConsultaClasseAlunoPorEscolaList = new HashSet<>();
//
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = outErro;
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
//    public Set<MsgConsultaClasseAlunoPorEscola> getMsgConsultaClasseAlunoPorEscolaList() {
//        return msgConsultaClasseAlunoPorEscolaList;
//    }
//
//    public void setMsgConsultaClasseAlunoPorEscolaList(Set<MsgConsultaClasseAlunoPorEscola> msgConsultaClasseAlunoPorEscolaList) {
//        this.msgConsultaClasseAlunoPorEscolaList = msgConsultaClasseAlunoPorEscolaList;
//    }
//}
