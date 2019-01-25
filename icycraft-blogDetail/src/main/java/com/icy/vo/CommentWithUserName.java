package com.icy.vo;

public class CommentWithUserName {

	private Comment comment;
	private String userName;
	private String avatar;
	
	
	public CommentWithUserName(Comment comment, String userName, String avatar) {
		super();
		this.comment = comment;
		this.userName = userName;
		this.avatar = avatar;
	}
	public Comment getComment() {
		return comment;
	}
	public void setComment(Comment comment) {
		this.comment = comment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public CommentWithUserName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	
	

}
