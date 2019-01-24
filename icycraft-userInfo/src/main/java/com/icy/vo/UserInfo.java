package com.icy.vo;



public class UserInfo {


	private Long Id;
	private String Name;
	private String avatar;
	private String background;
	private String signature;
	private String self_introduce;
	private String birthday;
	private String gender;
	private String address;	
	private Long userId;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getSelf_introduce() {
		return self_introduce;
	}

	public void setSelf_introduce(String self_introduce) {
		this.self_introduce = self_introduce;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	



	
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public UserInfo(Long id, String name, String avatar, String background, String signature, String self_introduce,
			String birthday, String gender, String address, Long userId) {
		super();
		Id = id;
		Name = name;
		this.avatar = avatar;
		this.background = background;
		this.signature = signature;
		this.self_introduce = self_introduce;
		this.birthday = birthday;
		this.gender = gender;
		this.address = address;
		this.userId = userId;
	}

	
	
	

}
