package br.com.context.model.tipodocumento;

import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tmc_tipo_tramitacao")
@Inheritance(strategy = InheritanceType.JOINED)
public class TipoTramitacaoEntity extends AbstractEntidade implements Serializable {

    private static final long serialVersionUID = -527837408520674389L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tmc_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tdc_id", referencedColumnName = "tdc_id", foreignKey = @ForeignKey(name = "fk_tmc_tdc_id"), nullable = false)
    private TipoDocumentoEntity tipoDocumento;

//    @Column(name = "tmc_tipo_tramitacao_enum", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private TipoTramitacaoEnum tipoTramitacaoEnum;

    @Column(name = "tmc_tipo_tramite_enum", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoTramiteEnum tipoTramiteEnum;

    @Enumerated(EnumType.STRING)
    @Column(name = "tmc_exige_tramite_enum", nullable = false)
    private TipoExigeTramiteEnum tipoExigeTramiteEnum;

    @Column(name = "tmc_padrao", nullable = false)
    private Boolean padrao = Boolean.TRUE;

    public TipoTramitacaoEntity() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoDocumentoEntity getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumentoEntity tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

//    public TipoTramitacaoEnum getTipoTramitacaoEnum() {
//        return tipoTramitacaoEnum;
//    }
//
//    public void setTipoTramitacaoEnum(TipoTramitacaoEnum tipoTramitacaoEnum) {
//        this.tipoTramitacaoEnum = tipoTramitacaoEnum;
//    }

    public TipoTramiteEnum getTipoTramiteEnum() {
        return tipoTramiteEnum;
    }

    public void setTipoTramiteEnum(TipoTramiteEnum tipoTramiteEnum) {
        this.tipoTramiteEnum = tipoTramiteEnum;
    }

    public TipoExigeTramiteEnum getTipoExigeTramiteEnum() {
        return tipoExigeTramiteEnum;
    }

    public void setTipoExigeTramiteEnum(TipoExigeTramiteEnum tipoExigeTramiteEnum) {
        this.tipoExigeTramiteEnum = tipoExigeTramiteEnum;
    }
      
    public Boolean getPadrao() {
        return padrao;
    }

    public void setPadrao(Boolean padrao) {
        this.padrao = padrao;
    }

    @Override
    public String getDisplay() {
        return tipoTramiteEnum.getDisplay();
    }
    
}
