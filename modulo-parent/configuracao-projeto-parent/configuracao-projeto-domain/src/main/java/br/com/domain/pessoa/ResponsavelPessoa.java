//package br.com.domain.pessoa;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "rps_responsavel_pessoa", catalog = "pessoa")
//public class ResponsavelPessoa extends Responsavel {
//
//    @ManyToOne
//    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_rps_pss_id"))
//    private Pessoa pessoa;
//
//    @Column(name = "rps_observacao", scale = 255)
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
