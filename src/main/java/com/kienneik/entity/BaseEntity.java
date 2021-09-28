package com.kienneik.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
//Auto create common column for sub table
@MappedSuperclass
public abstract class BaseEntity {
	// not null and primary key
	@Id
	// auto-increment so does not need set function
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//Must have column annotation to define a column
	
	@Column
	private Date createdDate;
	
	@Column
	private Date modifiedDate;
	
	@Column
	private String createdBy;
	
	@Column
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
