package com.minhhieu.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "createddate")
    @CreatedDate
	private Date createdDate;

	@Column(name = "modifieddate")
	@LastModifiedDate
	private Date modifiedDate;

    @Column(name = "createdby")
    @CreatedBy
    private String createdBy;

	@Column(name = "modifiedby")
	@LastModifiedBy
    private String modifiedBy;

    

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

   
    /**
     * @return Date return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    
    /**
     * @return Date return the modifiedDate
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @return String return the createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    
    /**
     * @return String return the modifiedBy
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

}