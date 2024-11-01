package br.com.context.model.pessoa;

import br.com.context.model.tipoendereco.model.TipoEndereco;
import br.com.context.model.endereco.EnderecoEntity;
import br.com.context.model.logradouro.LogradouroEntity;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enp_endereco_pessoa", catalog = "pessoa")
public class EnderecoPessoaEntity extends EnderecoEntity {

    @ManyToOne
    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_enp_pss_id"))
    private PessoaEntity pessoa;

    @ManyToOne
    @JoinColumn(name = "tpe_id", referencedColumnName = "tpe_id", foreignKey = @ForeignKey(name = "fk_enp_tpe_id"))
    private TipoEndereco tipoEndereco;

    public static EnderecoPessoaEntity criarInstancia() {
        EnderecoPessoaEntity enderecoPessoa = new EnderecoPessoaEntity();
        enderecoPessoa.setLogradouro(LogradouroEntity.criarInstancia());
        return enderecoPessoa;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public TipoEndereco getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEndereco tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }
}
