//package br.com.domain.integracao.consultarquadroresumo;
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
//@Table(name = "qrr_consultar_quadro_resumo_response")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_qrr_pdr_id"))})
//public class ConsultarQuadroResumoResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "qrr_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    @Column(name = "qrr_sucesso", columnDefinition = "TEXT")
//    private String outSucesso;
//
//    @Column(name = "qrr_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "mqr_mensagem_consultar_quadro_resumo_response",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_mqr_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "mcq_id", referencedColumnName = "mcq_id", foreignKey = @ForeignKey(name = "fk_mqr_mcq_id"))})
//    private List<MsgConsultarQuadroResumo> msgConsultarQuadroResumoList;
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
//    public String getOutSucesso() {
//        return outSucesso;
//    }
//
//    public void setOutSucesso(String outSucesso) {
//        this.outSucesso = outSucesso;
//    }
//
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = outErro;
//    }
//
//    public List<MsgConsultarQuadroResumo> getMsgConsultarQuadroResumoList() {
//        return msgConsultarQuadroResumoList;
//    }
//
//    public void setMsgConsultarQuadroResumoList(List<MsgConsultarQuadroResumo> msgConsultarQuadroResumoList) {
//        this.msgConsultarQuadroResumoList = msgConsultarQuadroResumoList;
//    }
//}