//package br.com.domain.integracao.realizarmatricula.model;
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
//@Table(name = "rmr_realizar_matricula_sem_registro_aluno_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_rmr_pdr_id"))})
//public class RealizarMatriculaInfoSemRAResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "rmr_sucesso")
//    private String sucesso;
//
//    @Column(name = "rmr_erro")
//    private String erro;
//
//    @Column(name = "rmr_codigo_processo")
//    private String outProcessoID;
//
//    @Column(name = "rmr_digito_registro_aluno")
//    protected String digitoRA;
//
//    @Column(name = "rmr_registro_aluno")
//    protected String ra;
//
//    @Column(name = "rmr_uf")
//    protected String uf;
//
//    public String getSucesso() {
//        return sucesso;
//    }
//
//    public void setSucesso(String sucesso) {
//        this.sucesso = sucesso;
//    }
//
//    public String getErro() {
//        return erro;
//    }
//
//    public void setErro(String erro) {
//        this.erro = erro;
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
//    public String getDigitoRA() {
//        return digitoRA;
//    }
//
//    public void setDigitoRA(String digitoRA) {
//        this.digitoRA = digitoRA;
//    }
//
//    public String getRa() {
//        return ra;
//    }
//
//    public void setRa(String ra) {
//        this.ra = ra;
//    }
//
//    public String getUf() {
//        return uf;
//    }
//
//    public void setUf(String uf) {
//        this.uf = uf;
//    }
//
//}
