package br.com.context.model;

import javax.persistence.*;

@Entity
@Table(name = "rpf_role_perfil", catalog = "perfil")
public class RolePerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rpf_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "prf_id", referencedColumnName = "prf_id", foreignKey = @ForeignKey(name = "fk_rpf_prf_id"))
    private PerfilEntity perfil;

    @ManyToOne
    @JoinColumn(name = "rle_id", referencedColumnName = "rle_id", foreignKey = @ForeignKey(name = "fk_rpf_rle_id"))
    private RoleEntity role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PerfilEntity getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEntity perfil) {
        this.perfil = perfil;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }
}
