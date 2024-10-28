///**
// *
// */
//package br.com.apirest.models.foundation.entity;
//
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import br.com.apirest.models.user.entity.Permission;
//import br.com.apirest.models.user.entity.Role;
//
///**
// * @author wilton
// *
// */
//@Entity
//@Table(name = "credentials")
//@EntityListeners(AuditingEntityListener.class)
//public class Credential extends AbstractModel implements IModel, UserDetails {
//
//    private static final long serialVersionUID = 7695900622864124399L;
//
//    @Column(name = "USERNAME")
//    private String username;
//
//    @Column(name = "PASSWORD")
//    private String password;
//
//    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Role.class)
//    @JoinColumn(name = "credential_role", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_credential_role"))
//    @JsonIgnore
//    private Role role;
//
//    @Override
//    public Integer getId() {
//        return super.getId();
//    }
//
//    public Credential() {
//        super();
//    }
//
//    public Credential(String username, String password) {
//        super();
//        this.username = username;
//        this.password = password;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    @Override
//    @JsonIgnore
//    public Collection<GrantedAuthority> getAuthorities() {
//        List<GrantedAuthority> list = new ArrayList<>(0);
//        role.getPermissions().stream().forEach(p -> list.add((GrantedAuthority) new Permission(p.getAuthority())));
//        return list;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isAccountNonExpired() {
//        // TODO Auto-generated method stub
//        return true;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isAccountNonLocked() {
//        // TODO Auto-generated method stub
//        return true;
//    }
//
//    @Override
//    @JsonIgnore
//    public boolean isCredentialsNonExpired() {
//        // TODO Auto-generated method stub
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "Credential [username=" + username + ", password=" + password + ", role=" + role + "]";
//    }
//
//}
