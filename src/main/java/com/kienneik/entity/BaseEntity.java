package com.kienneik.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import javax.persistence.*;

//Auto create common column for sub table
@MappedSuperclass
// Auto create date
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	// not null and primary key
	@Id
	// auto-increment so does not need set function
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Must have column annotation to define a column
	
	@Column
	@CreatedDate
	private Date createdDate;
	
	@Column
	@LastModifiedDate
	private Date modifiedDate;
	
	@Column
	@CreatedBy
	private String createdBy;
	
	@Column
	@LastModifiedBy
	private String modifiedBy;

	public Long getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
