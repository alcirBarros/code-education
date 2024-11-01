//package br.com.domain.integracao.excluirmatricula.model;
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "xmr_excluir_matricula_response")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_xmr_pdr_id"))})
//public class ExcluirMatriculaResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "xmr_sucesso", columnDefinition = "TEXT")
//    private String outSucesso;
//
//    @Column(name = "xmr_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "xmr_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
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
//    @Override
//    public String getOutProcessoID() {
//        return outProcessoID;
//    }
//
//    public void setOutProcessoID(String outProcessoID) {
//        this.outProcessoID = outProcessoID;
//    }
//}