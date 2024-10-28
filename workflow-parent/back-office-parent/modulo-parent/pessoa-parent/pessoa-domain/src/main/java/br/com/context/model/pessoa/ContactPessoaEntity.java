package br.com.context.model.pessoa;

import br.com.context.model.contato.ContactEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;


@Entity
@Table(name = "cps_contato_pessoa", catalog = "pessoa")
@PrimaryKeyJoinColumns({
        @PrimaryKeyJoinColumn(name = "cps_id", referencedColumnName = "ctt_id", foreignKey = @ForeignKey(name = "fk_cps_ctt_id"))})
public class ContactPessoaEntity extends ContactEntity {

    @ManyToOne
    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_cps_pss_id"))
    private PessoaEntity pessoa;

    @Column(name = "cps_observacao", scale = 255)
    private String observacao;

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
