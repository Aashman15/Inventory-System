package com.inventorysysystem.model;
public class StockModel {
     private int productId;
     private String productName;
     private int productAvailable;
     private int totalAdded;
     private double productMrp;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductAvailable() {
		return productAvailable;
	}
	public void setProductAvailable(int productAvailable) {
		this.productAvailable = productAvailable;
	}
	public int getTotalAdded() {
		return totalAdded;
	}
	public void setTotalAdded(int totalAdded) {
		this.totalAdded = totalAdded;
	}
	public double getProductMrp() {
		return productMrp;
	}
	public void setProductMrp(double productMrp) {
		this.productMrp = productMrp;
	}
}
