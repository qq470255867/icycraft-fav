package com.icy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="catalog")
public class Catalog {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	@Column(name="user_id")
	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Catalog(Long id, String name, Long userId) {
		super();
		this.id = id;
		this.name = name;
		this.userId = userId;
	}

	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
