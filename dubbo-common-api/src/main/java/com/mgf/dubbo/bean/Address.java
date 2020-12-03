package com.mgf.dubbo.bean;

public class Address implements java.io.Serializable{

	private String userId;
	private String address;

	public Address(String userId, String address) {
		super();
		this.userId = userId;
		this.address = address;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
