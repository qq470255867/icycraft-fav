package com.icy.vo;

import java.util.Date;

public class Article {

	private Long id;

	private Integer comment_size;

	private String content;

	private Date create_time;

	private String html_content;

	private Integer read_size;

	private String summary;

	private String tags;

	private String title;

	private String vote_size;

	private Long catId;

	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getComment_size() {
		return comment_size;
	}

	public void setComment_size(Integer comment_size) {
		this.comment_size = comment_size;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getHtml_content() {
		return html_content;
	}

	public void setHtml_content(String html_content) {
		this.html_content = html_content;
	}

	public Integer getRead_size() {
		return read_size;
	}

	public void setRead_size(Integer read_size) {
		this.read_size = read_size;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVote_size() {
		return vote_size;
	}

	public void setVote_size(String vote_size) {
		this.vote_size = vote_size;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Article(Long id, Integer comment_size, String content, Date create_time, String html_content,
			Integer read_size, String summary, String tags, String title, String vote_size, Long catId, Long userId) {
		super();
		this.id = id;
		this.comment_size = comment_size;
		this.content = content;
		this.create_time = create_time;
		this.html_content = html_content;
		this.read_size = read_size;
		this.summary = summary;
		this.tags = tags;
		this.title = title;
		this.vote_size = vote_size;
		this.catId = catId;
		this.userId = userId;
	}

	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

}
