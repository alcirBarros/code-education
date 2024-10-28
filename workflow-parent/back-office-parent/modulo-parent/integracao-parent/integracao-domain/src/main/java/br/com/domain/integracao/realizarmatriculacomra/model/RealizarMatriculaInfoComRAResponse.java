//package br.com.domain.integracao.realizarmatriculacomra.model;
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
//@Table(name = "rma_realizar_matricula_com_registro_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_rma_pdr_id"))})
//public class RealizarMatriculaInfoComRAResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "rma_suecce_matricula", columnDefinition = "TEXT")
//    private String outSucessoMatricula;
//
//    @Column(name = "rma_errp_matricula", columnDefinition = "TEXT")
//    private String outErroMatricula;
//
//    @Column(name = "rma_sucesso_alteracao_endereco", columnDefinition = "TEXT")
//    private String outSucessoAltEndereco;
//
//    @Column(name = "rma_erro_alteracao_endereco", columnDefinition = "TEXT")
//    private String outErroAltEndereco;
//
//    @Column(name = "rma_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    public String getOutSucessoMatricula() {
//        return outSucessoMatricula;
//    }
//
//    public void setOutSucessoMatricula(String outSucessoMatricula) {
//        this.outSucessoMatricula = outSucessoMatricula;
//    }
//
//    public String getOutErroMatricula() {
//        return outErroMatricula;
//    }
//
//    public void setOutErroMatricula(String outErroMatricula) {
//        this.outErroMatricula = outErroMatricula;
//    }
//
//    public String getOutSucessoAltEndereco() {
//        return outSucessoAltEndereco;
//    }
//
//    public void setOutSucessoAltEndereco(String outSucessoAltEndereco) {
//        this.outSucessoAltEndereco = outSucessoAltEndereco;
//    }
//
//    public String getOutErroAltEndereco() {
//        return outErroAltEndereco;
//    }
//
//    public void setOutErroAltEndereco(String outErroAltEndereco) {
//        this.outErroAltEndereco = outErroAltEndereco;
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
