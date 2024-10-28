package br.com.context.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "rlp_role_operador", catalog = "operador")
public class RoleOperador implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rlp_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "opr_id", referencedColumnName = "opr_id", foreignKey = @ForeignKey(name = "fk_rlp_opr_id"))
    private Operador operador;

    @ManyToOne
    @JoinColumn(name = "rle_id", referencedColumnName = "rle_id", foreignKey = @ForeignKey(name = "fk_rlp_rle_id"))
    private Role role;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getDescricao();
    }
}
