package com.icy.vo;

public class CommentWithUserName {

	private Comment comment;
	private String userName;
	public CommentWithUserName(Comment comment, String userName) {
		super();
		this.comment = comment;
		this.userName = userName;
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
	
	
	

}
