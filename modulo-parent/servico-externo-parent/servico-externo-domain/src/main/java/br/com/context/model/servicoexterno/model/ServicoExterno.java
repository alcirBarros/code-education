package br.com.context.model.servicoexterno.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sxt_servico_externo")
public class ServicoExterno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sxt_id", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "sxt_tipo_servico_externo", unique = true, length = 20)
    private TipoServicoExterno tipoServicoExterno;

    @OneToMany(mappedBy = "servicoExterno", fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<AuthorizationServicoExterno> authorizationServicoExternoList = new ArrayList<>();

    public static ServicoExterno criarInstancia() {
        ServicoExterno servicoExterno = new ServicoExterno();
        return servicoExterno;
    }

    public static ServicoExterno setNull(ServicoExterno servicoExterno) {
        return servicoExterno;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoServicoExterno getTipoServicoExterno() {
        return tipoServicoExterno;
    }

    public void setTipoServicoExterno(TipoServicoExterno tipoServicoExterno) {
        this.tipoServicoExterno = tipoServicoExterno;
    }

    public List<AuthorizationServicoExterno> getAuthorizationServicoExternoList() {
        return authorizationServicoExternoList;
    }

    public void setAuthorizationServicoExternoList(List<AuthorizationServicoExterno> authorizationServicoExternoList) {
        this.authorizationServicoExternoList = authorizationServicoExternoList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.id);
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
        final ServicoExterno other = (ServicoExterno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
