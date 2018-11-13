package com.lc.pojo;

public class RegisterInfo {
	private String name;
	private String pwd;
	private String photo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public RegisterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterInfo(String name, String pwd, String photo) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.photo = photo;
	}
	
}
