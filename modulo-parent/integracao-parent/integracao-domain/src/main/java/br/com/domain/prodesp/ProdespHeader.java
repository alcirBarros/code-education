package br.com.domain.prodesp;

import br.com.context.model.AbstractEntidade;
import br.com.context.model.statusresponse.StatusResponseEnum;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "pdh_prodesp_header")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "pdp_tipo_object_classe", length = 45, discriminatorType = DiscriminatorType.STRING)
public class ProdespHeader extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdh_id", nullable = false)
    private Integer id;

    @Column(name = "pdp_tipo_object_classe", insertable = false, updatable = false)
    private String tipoObjectClasse;

//    @ManyToOne
//    @JoinColumn(name = "opr_id", referencedColumnName = "opr_id")
//    private Operador operador;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "pdh_tipo_status_registro_enum")
    private TipoStatusRegistroEnum tipoStatusRegistroEnum = TipoStatusRegistroEnum.DIGITACAO;

    @Enumerated(EnumType.STRING)
    @Column(name = "pdr_status_response_enum", length = 60)
    private StatusResponseEnum statusResponseEnum;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pdp_data_hora", updatable = false)
//    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date dataHora = new Date();

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "pdp_data_hora_alteracao", updatable = false)
//    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date dataHoraAlteracao = new Date();

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoObjectClasse() {
        return tipoObjectClasse;
    }

//    public Operador getOperador() {
//        return operador;
//    }
//
//    public void setOperador(Operador operador) {
//        this.operador = operador;
//    }
    public TipoStatusRegistroEnum getTipoStatusRegistroEnum() {
        return tipoStatusRegistroEnum;
    }

    public void setTipoStatusRegistroEnum(TipoStatusRegistroEnum tipoStatusRegistroEnum) {
        this.tipoStatusRegistroEnum = tipoStatusRegistroEnum;
    }

    public StatusResponseEnum getStatusResponseEnum() {
        return statusResponseEnum;
    }

    public void setStatusResponseEnum(StatusResponseEnum statusResponseEnum) {
        this.statusResponseEnum = statusResponseEnum;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public Date getDataHoraAlteracao() {
        return dataHoraAlteracao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ProdespHeader other = (ProdespHeader) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
