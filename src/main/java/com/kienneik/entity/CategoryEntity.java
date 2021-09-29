package com.kienneik.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")

public class CategoryEntity extends BaseEntity {

	@Column
	private String name;
	@Column
	private String code;
	
	public String getName() {
		return name;
	}
	
	@OneToMany(mappedBy = "category")
	private List<NewsEntity> newsList = new ArrayList<>();
	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<NewsEntity> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<NewsEntity> newsList) {
		this.newsList = newsList;
	}
	

}
