package br.com.context.model;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U>{

    @CreatedBy
    @Column(name = "created_user")
    protected U createUser;

    @CreatedDate
    @Column(name = "created_date")
    protected Date createdDate;

    @LastModifiedBy
    @Column(name = "modified_user")
    protected U modifiedUser;

    @LastModifiedDate
    @Column(name = "modified_date")
    protected Date modifiedDate;
}
