//package br.com.apirest.models.user.entity;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.FetchType;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import br.com.apirest.models.foundation.entity.AbstractModel;
//import br.com.apirest.models.foundation.entity.IModel;
//
//@Entity
//@Table(name = "ROLE")
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties({"permissions"})
//public class Role extends AbstractModel implements IModel {
//
//    /**
//     *
//     */
//    private static final long serialVersionUID = -6270769411197525965L;
//
//    public Role() {
//        super();
//    }
//
//    @Column(name = "name")
//    private String name;
//
//    @ManyToMany(fetch = FetchType.EAGER, targetEntity = Permission.class)
//    @JoinTable(name = "ROLE_PERMISSION",
//            joinColumns = {
//                @JoinColumn(name = "user_id", nullable = false)},
//            inverseJoinColumns = {
//                @JoinColumn(name = "role_id", nullable = false)}
//    )
//    private Set<Permission> permissions = new HashSet<>();
//
//    public String getName() {
//        return this.name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Set<Permission> getPermissions() {
//        return this.permissions;
//    }
//
//    public void setPermissions(Set<Permission> permissions) {
//        this.permissions = permissions;
//    }
//
//}
