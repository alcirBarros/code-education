package br.com.context.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "prf_perfil", catalog = "perfil")
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prf_id", nullable = false)
    private Integer id;

    @Column(name = "prf_descricao")
    private String descricao;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "perfil", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<RolePerfilEntity> rolePerfilList = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<RolePerfilEntity> getRolePerfilList() {
        return rolePerfilList;
    }

    public void setRolePerfilList(Set<RolePerfilEntity> rolePerfilList) {
        this.rolePerfilList = rolePerfilList;
    }
}
