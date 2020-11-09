package com.mgf.dubbo.bean;

public class Order implements java.io.Serializable{
	
	private String orderId;
	private String productName;
	private String userId;
	private String address;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Order(String orderId, String productName, String userId) {
		super();
		this.orderId = orderId;
		this.productName = productName;
		this.userId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
