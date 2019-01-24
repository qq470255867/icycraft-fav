package com.icy.vo;

public class User {

	private Long id;

	private String avatar;

	private String email;

	private String userName;

	private String name;

	private String passWord;

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User(Long id, String avatar, String email, String userName, String name, String passWord) {
		super();
		this.id = id;
		this.avatar = avatar;
		this.email = email;
		this.userName = userName;
		this.name = name;
		this.passWord = passWord;
	}
	

}
