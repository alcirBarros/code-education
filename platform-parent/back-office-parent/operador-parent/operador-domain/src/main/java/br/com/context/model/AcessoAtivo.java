package br.com.context.model;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "act_acesso_ativo", catalog = "operador")
public class AcessoAtivo extends AbstractEntidade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "act_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "vpf_id", referencedColumnName = "vpf_id", foreignKey = @ForeignKey(name = "fk_act_vpf_id"))
    private VinculoProfissional vinculoProfissional;

    public AcessoAtivo() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VinculoProfissional getVinculoProfissional() {
        return vinculoProfissional;
    }

    public void setVinculoProfissional(VinculoProfissional vinculoProfissional) {
        this.vinculoProfissional = vinculoProfissional;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final AcessoAtivo other = (AcessoAtivo) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
