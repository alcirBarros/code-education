//package br.com.apirest.models.foundation.entity;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.MappedSuperclass;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import io.swagger.annotations.ApiModelProperty;
//
//@MappedSuperclass
//public abstract class AbstractModel implements IModel {
//
//    /**
//     *
//     */
//    private static final long serialVersionUID = -394655476483911221L;
//
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @ApiModelProperty(notes = "The auto generated identity", required = true)
//    private Integer id;
//
//    @Column(name = "CREATED_AT", columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
//    @Temporal(TemporalType.TIMESTAMP)
//    @JsonIgnore
//    private Date createdAt = new Date();
//
//    @Column(name = "UPDATED_AT", columnDefinition = "TIMESTAMP DEFAULT current_timestamp")
//    @Temporal(TemporalType.TIMESTAMP)
//    @JsonIgnore
//    private Date updatedAt = new Date();
//
//    @Column(name = "IS_ENABLED", columnDefinition = "tinyint(1) not null default 1")
//    @JsonIgnore
//    private boolean enabled;
//
//    @Column(name = "IS_DELETED", columnDefinition = "tinyint(1) not null default 1")
//    @JsonIgnore
//    private boolean deleted;
//
//    @Column(name = "IS_SYSTEM", columnDefinition = "tinyint(1) not null default 0")
//    @JsonIgnore
//    private boolean system;
//
//    @Column(name = "OWNER_ID")
//    @JsonIgnore
//    private Long owner;
//
//    public Integer getId() {
//        return this.id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Date getCreatedAt() {
//        return this.createdAt;
//    }
//
//    public void setCreatedAt(Date createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public Date getUpdatedAt() {
//        return this.updatedAt;
//    }
//
//    public void setUpdatedAt(Date updatedAt) {
//        this.updatedAt = updatedAt;
//    }
//
//    public boolean isEnabled() {
//        return this.enabled;
//    }
//
//    public void setEnabled(boolean enabled) {
//        this.enabled = enabled;
//    }
//
//    public boolean isDeleted() {
//        return this.deleted;
//    }
//
//    public void setDeleted(boolean deleted) {
//        this.deleted = deleted;
//    }
//
//    public boolean isSystem() {
//        return this.system;
//    }
//
//    public void setSystem(boolean system) {
//        this.system = system;
//    }
//
//    public Long getOwner() {
//        return this.owner;
//    }
//
//    public void setOwner(Long owner) {
//        this.owner = owner;
//    }
//
//    public AbstractModel() {
//        super();
//    }
//
//    public AbstractModel(Integer id, Date createdAt, Date updatedAt, boolean enabled, boolean deleted, boolean system, Long owner) {
//        super();
//        this.id = id;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//        this.enabled = enabled;
//        this.deleted = deleted;
//        this.system = system;
//        this.owner = owner;
//    }
//
//    @Override
//    public IModel cloneModel() {
//        try {
//            IModel clone = (IModel) super.clone();
//            return clone;
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//}
