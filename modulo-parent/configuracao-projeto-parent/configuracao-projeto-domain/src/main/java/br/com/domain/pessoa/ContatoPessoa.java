//package br.com.domain.pessoa;
//
//import br.com.domain.contato.Contato;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cps_contato_pessoa", catalog = "pessoa")
//public class ContatoPessoa extends Contato {
//
//    @ManyToOne
//    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_cps_pss_id"))
//    private Pessoa pessoa;
//
//    @Column(name = "cps_observacao", scale = 255)
//    private String observacao;
//
//    public Pessoa getPessoa() {
//        return pessoa;
//    }
//
//    public void setPessoa(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }
//
//    public String getObservacao() {
//        return observacao;
//    }
//
//    public void setObservacao(String observacao) {
//        this.observacao = observacao;
//    }
//}
