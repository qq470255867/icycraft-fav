package com.icy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Catalog {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	private String name;
	@Column(name="user_id")
	private Long userId;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Catalog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Catalog(Long id, String name, Long userId) {
		super();
		Id = id;
		this.name = name;
		this.userId = userId;
	}
	
	

}
