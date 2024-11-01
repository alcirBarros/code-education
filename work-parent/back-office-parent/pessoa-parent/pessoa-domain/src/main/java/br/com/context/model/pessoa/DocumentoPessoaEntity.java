package br.com.context.model.pessoa;

import br.com.context.model.tipodocumento.model.TipoDocumento;
import br.com.context.model.AbstractEntidade;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tdp_tipo_documento_pessoa", catalog = "pessoa")
public class DocumentoPessoaEntity extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tdp_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tdc_id", referencedColumnName = "tdc_id", foreignKey = @ForeignKey(name = "fk_tdp_tdc_id"))
    private TipoDocumento tipoDocumento;

    @ManyToOne
    @JoinColumn(name = "pss_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_tdp_pss_id"))
    private PessoaEntity pessoa;

    @Column(name = "tdp_documento", scale = 255)
    private String documento;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
