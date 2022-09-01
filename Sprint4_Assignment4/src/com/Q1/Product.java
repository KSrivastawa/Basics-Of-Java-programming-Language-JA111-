package com.Q1;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public final int getProductId() {
		return productId;
	}

	public final void setProductId(int productId) {
		this.productId = productId;
	}

	public final String getProductName() {
		return productName;
	}

	public final void setProductName(String productName) {
		this.productName = productName;
	}

	public final double getProductPrice() {
		return productPrice;
	}

	public final void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	
	
	

	  
	
}
