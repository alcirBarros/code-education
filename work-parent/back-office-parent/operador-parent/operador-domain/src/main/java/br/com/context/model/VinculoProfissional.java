package br.com.context.model;

import br.com.context.model.servicoexterno.model.AuthorizationServicoExterno;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Objects;
import javax.persistence.CascadeType;
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
@Table(name = "vpf_vinculo_profissional", catalog = "operador")
public class VinculoProfissional extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vpf_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "opr_id", referencedColumnName = "opr_id", foreignKey = @ForeignKey(name = "fk_vpf_opr_id"))
    private Operador operador;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "prf_id", referencedColumnName = "prf_id", foreignKey = @ForeignKey(name = "fk_vpf_prf_id"))
    private Perfil perfil;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mnc_id", referencedColumnName = "mnc_id", foreignKey = @ForeignKey(name = "fk_vpf_mnc_id"))
    private Municipio municipio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "asx_id", referencedColumnName = "asx_id", foreignKey = @ForeignKey(name = "fk_vpf_asx_id"))
    private AuthorizationServicoExterno authorizationServicoExterno;

    public VinculoProfissional() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public AuthorizationServicoExterno getAuthorizationServicoExterno() {
        return authorizationServicoExterno;
    }

    public void setAuthorizationServicoExterno(AuthorizationServicoExterno authorizationServicoExterno) {
        this.authorizationServicoExterno = authorizationServicoExterno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final VinculoProfissional other = (VinculoProfissional) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
