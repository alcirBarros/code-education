package br.com.context.model;

import br.com.context.model.pessoa.Pessoa;
import br.com.context.security.OperadorDetail;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "opr_operador", catalog = "operador")
@PrimaryKeyJoinColumns({
    @PrimaryKeyJoinColumn(name = "opr_id", referencedColumnName = "pss_id", foreignKey = @ForeignKey(name = "fk_opr_pss_id"))})
public class Operador extends Pessoa implements OperadorDetail, UserDetails, Serializable {

    private static final long serialVersionUID = 1L;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "snh_id", referencedColumnName = "snh_id", foreignKey = @ForeignKey(name = "fk_opr_snh_id"))
    private Senha senha;

    @Column(name = "opr_user_name")
    private String username;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "act_id", referencedColumnName = "act_id", foreignKey = @ForeignKey(name = "fk_opr_act_id"))
    private AcessoAtivo acessoAtivo;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "operador", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<VinculoProfissional> vinculoProfissionalList = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "operador", orphanRemoval = true, cascade = CascadeType.ALL)
    private Set<RoleOperador> roleOperadorList = new HashSet<>();

    public void adicionarRole(RoleOperador roleOperador) {
        roleOperador.setOperador(this);
        roleOperadorList.add(roleOperador);
    }

    public Senha getSenha() {
        return senha;
    }

    public void setSenha(Senha senha) {
        this.senha = senha;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return senha.getPassword();
    }

    public AcessoAtivo getAcessoAtivo() {
        return acessoAtivo;
    }

    public void setAcessoAtivo(AcessoAtivo acessoAtivo) {
        this.acessoAtivo = acessoAtivo;
    }

    public Set<VinculoProfissional> getVinculoProfissionalList() {
        return vinculoProfissionalList;
    }

    public void setVinculoProfissionalList(Set<VinculoProfissional> vinculoProfissionalList) {
        this.vinculoProfissionalList = vinculoProfissionalList;
    }

    public Set<RoleOperador> getRoleList() {
        return roleOperadorList;
    }

    public void setRoleList(Set<RoleOperador> roleOperadorList) {
        this.roleOperadorList = roleOperadorList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roleOperadorList;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public String getDisplay() {
        return username;
    }
}
