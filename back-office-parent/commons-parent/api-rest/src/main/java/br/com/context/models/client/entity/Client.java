///**
// *
// */
//package br.com.apirest.models.client.entity;
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
///**
// * @author wilton
// *
// */
//@Entity
//@Table(name = "clients")
//@EntityListeners(AuditingEntityListener.class)
//public class Client extends AbstractModel implements IModel {
//
//    /**
//     *
//     */
//    private static final long serialVersionUID = -6680226441220458094L;
//
//    @Column(name = "NAME")
//    private String name;
//
//    @Column(name = "FAMILY_NAME")
//    private String familyName;
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
//    @JoinColumn(name = "credential", nullable = false, referencedColumnName = "id",
//            foreignKey = @ForeignKey(name = "FK_CLIENT_credential"))
//    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Credential credential;
//
//    public Client() {
//        super();
//    }
//
//    public Client(Credential credential, String name, String familyName) {
//        super();
//        this.name = name;
//        this.familyName = familyName;
//    }
//
//    public Integer getId() {
//        return super.getId();
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
//    public void setClient(Client client) {
//        this.name = client.getName();
//        this.familyName = client.getFamilyName();
//        this.credential.setUsername(client.getCredential().getUsername());
//        if (client.getCredential().getPassword() != null && !client.getCredential().getPassword().isEmpty()) {
//            this.credential.setPassword(client.getCredential().getPassword());
//        }
//        this.picture = client.getPicture();
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
//    @Override
//    public String toString() {
//        return "Client [name=" + name + ", familyName=" + familyName + ", pictureName=" + pictureName
//                + ", pictureExtension=" + pictureExtension + ", picture=" + picture + ", credential=" + credential
//                + "]";
//    }
//
//}
