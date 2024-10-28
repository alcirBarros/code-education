//package br.com.apirest.models.user.entity;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//import org.springframework.security.core.GrantedAuthority;
//
//import io.swagger.annotations.ApiModelProperty;
//
//@Entity
//@Table(name = "PERMISSION")
//@EntityListeners(AuditingEntityListener.class)
//public class Permission implements Serializable, GrantedAuthority {
//
//    private static final long serialVersionUID = -6270769411197525965L;
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ApiModelProperty(notes = "The auto generated identity")
//    private Integer id;
//
//    @Column(name = "authority")
//    private String authority;
//
//    public Integer getId() {
//        return this.id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    @Override
//    public String getAuthority() {
//        return this.authority;
//    }
//
//    public void setAuthority(String authority) {
//        this.authority = authority;
//    }
//
//    public Permission() {
//        super();
//    }
//
//    public Permission(String authority) {
//        super();
//        this.authority = authority;
//    }
//
//}
