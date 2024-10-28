//package br.com.apirest.models.user.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import br.com.apirest.models.foundation.entity.AbstractModel;
//import br.com.apirest.models.foundation.entity.Credential;
//import br.com.apirest.models.foundation.entity.IModel;
//
//@Entity
//@Table(name = "USER")
//@EntityListeners(AuditingEntityListener.class)
//public class User extends AbstractModel implements IModel {
//
//    private static final long serialVersionUID = 8809076259755608105L;
//
//    @Column(name = "NAME")
//    private String name;
//
//    @Column(name = "FAMILY_NAME")
//    private String familyName;
//
//    @JoinColumn(name = "credential", nullable = false, referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_USER_credential"))
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Credential credential;
//
//    @JsonIgnore
//    @Column(name = "PICTURE_NAME")
//    private String pictureName;
//
//    @JsonIgnore
//    @Column(name = "PICTURE_EXTENSION")
//    private String pictureExtension;
//
//    @Transient
//    private String picture;
//
//    public User() {
//        super();
//    }
//
//    @Transient
//    public String getRole() {
//        return credential.getRole().getName();
//    }
//
//    public Credential getCredential() {
//        return credential;
//    }
//
//    public void setCredential(Credential credential) {
//        this.credential = credential;
//    }
//
//    public String getPictureName() {
//        return pictureName;
//    }
//
//    public void setPictureName(String pictureName) {
//        this.pictureName = pictureName;
//    }
//
//    @Transient
//    public String getPicture() {
//        return picture;
//    }
//
//    @Transient
//    public void setPicture(String picture) {
//        this.picture = picture;
//    }
//
//    public String getPictureExtension() {
//        return pictureExtension;
//    }
//
//    public void setPictureExtension(String pictureExtension) {
//        this.pictureExtension = pictureExtension;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getFamilyName() {
//        return familyName;
//    }
//
//    public void setFamilyName(String familyName) {
//        this.familyName = familyName;
//    }
//
//    public void setUser(User user) {
//        this.name = user.getName();
//        this.familyName = user.getFamilyName();
//        this.credential.setUsername(user.getCredential().getUsername());
//        if (user.getCredential().getPassword() != null && !user.getCredential().getPassword().isEmpty()) {
//            this.credential.setPassword(user.getCredential().getPassword());
//        }
//        user.getCredential();
//        this.picture = user.getPicture();
//    }
//
//}
