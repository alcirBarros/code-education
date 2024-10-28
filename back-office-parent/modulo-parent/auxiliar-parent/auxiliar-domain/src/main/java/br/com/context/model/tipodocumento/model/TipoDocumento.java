package br.com.context.model.tipodocumento.model;

import br.com.context.model.tipodocumento.enumerator.TipoDocumentoEnum;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tdc_tipo_documento", catalog = "auxiliar")
public class TipoDocumento extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tdc_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tdc_tipo_ensino_enum")
    private TipoDocumentoEnum tipoDocumentoEnum;

    @Column(name = "tdc_mask", length = 100)
    private String mask;

    @Column(name = "tdc_descricao", length = 255)
    private String descricao;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDocumentoEnum getTipoDocumentoEnum() {
        return tipoDocumentoEnum;
    }

    public void setTipoDocumentoEnum(TipoDocumentoEnum tipoDocumentoEnum) {
        this.tipoDocumentoEnum = tipoDocumentoEnum;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }
}
