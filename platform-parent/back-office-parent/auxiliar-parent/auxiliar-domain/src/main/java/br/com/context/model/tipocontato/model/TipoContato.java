package br.com.context.model.tipocontato.model;

import br.com.context.model.tipocontato.enumerator.TipoContatoEnum;
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
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

@Entity
@Audited
@AuditTable(value="tct_tipo_contato_aud", catalog="hibernate_db_aud")
@Table(name = "tct_tipo_contato", catalog = "auxiliar")
public class TipoContato extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tct_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tct_tipo_contato_enum")
    private TipoContatoEnum tipoContatoEnum;

    @Column(name = "tct_descricao", length = 50)
    private String descricao;

    @Column(name = "tct_mask", length = 100)
    private String mask;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoContatoEnum getTipoContatoEnum() {
        return tipoContatoEnum;
    }

    public void setTipoContatoEnum(TipoContatoEnum tipoContatoEnum) {
        this.tipoContatoEnum = tipoContatoEnum;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return tipoContatoEnum.getOrderBy();
    }

    @Override
    public String getDisplay() {
        return descricao;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    
}
