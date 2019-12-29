package com.inventorysysystem.model;


public class Bill {
	private int billNumber;
	private String customerName;
	private double totalAmount;
	private String date;
	private String products;

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date2) {
		this.date = date2;
	}

}
