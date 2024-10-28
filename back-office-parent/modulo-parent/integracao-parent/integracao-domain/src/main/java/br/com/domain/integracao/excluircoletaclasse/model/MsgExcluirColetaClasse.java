//package br.com.domain.integracao.excluircoletaclasse.model;
//
//import br.com.projeto.model.EntidadeSerialVersion;
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "xcc_mensagem_excluir_coleta_classe")
//public class MsgExcluirColetaClasse extends EntidadeSerialVersion implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "xcc_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "xcc_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "xcc_sucesso", columnDefinition = "TEXT")
//    private String outSucesso;
//
//    @Override
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
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
//    public String getOutSucesso() {
//        return outSucesso;
//    }
//
//    public void setOutSucesso(String outSucesso) {
//        this.outSucesso = outSucesso;
//    }
//}
