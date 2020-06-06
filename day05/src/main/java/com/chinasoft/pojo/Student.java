package com.chinasoft.pojo;

public class Student {

	private int id;
	private String user;
	private String pswd;
	private String phone;
	private String address;
	private String email;
	private String c_id;
	private Gender gender;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Student(int id, String user, String pswd, String phone, String address, String email, String c_id) {
		super();
		this.id = id;
		this.user = user;
		this.pswd = pswd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.c_id = c_id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id, String user, String pswd, String phone, String address, String email, String c_id,
			Gender gender) {
		super();
		this.id = id;
		this.user = user;
		this.pswd = pswd;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.c_id = c_id;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", user=" + user + ", pswd=" + pswd + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", c_id=" + c_id + ", gender=" + gender + "]";
	}

	
	
}
