package com.zoho.struts.model;

public class User {

	private String id;
	private String email;
	private String mobileNumber;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String id, String email, String mobileNumber) {
		this.id = id;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" ID: ")
			.append(this.getId())
			.append(" ")
			.append(" Email: ")
			.append(this.getEmail())
			.append(" ")
			.append(" Number: ")
			.append(this.getMobileNumber())
			.append("\n");
		return sb.toString();
	}

}
