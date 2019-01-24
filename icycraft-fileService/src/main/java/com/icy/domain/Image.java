package com.icy.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "image_url")
public class Image {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "img_url")
	private String imgUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Image(Long id, String imgUrl) {
		super();
		this.id = id;
		this.imgUrl = imgUrl;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

}
