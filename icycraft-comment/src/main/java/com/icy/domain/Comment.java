package com.icy.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Comment {
	@Id
	@GeneratedValue
	private Long id;

	private String content;
	@Column(name = "create_time")

	private Date createTime;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "blog_id")
	private Long blogId;

	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public Comment(Long id, String content, Date createTime, Long userId, Long blogId) {
		super();
		this.id = id;
		this.content = content;
		this.createTime = createTime;
		this.userId = userId;
		this.blogId = blogId;
	}
	
	

}
