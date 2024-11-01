//package br.com.domain.integracao.alterardadospessoaisfichaaluno.model;
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
//@Table(name = "adr_alterar_dados_pessoais_ficha_aluno_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_adr_pdr_id"))})
//public class AlterarDadosPessoaisFichaAlunoResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "mac_erro", columnDefinition = "TEXT")
//    private String erro;
//
//    @Column(name = "ear_sucesso", columnDefinition = "TEXT")
//    private String sucesso;
//
//    @Column(name = "ear_codigo_processo", columnDefinition = "TEXT")
//    private String outProcessoID;
//
//    public String getErro() {
//        return erro;
//    }
//
//    public void setErro(String erro) {
//        this.erro = erro;
//    }
//
//    public String getSucesso() {
//        return sucesso;
//    }
//
//    public void setSucesso(String sucesso) {
//        this.sucesso = sucesso;
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
