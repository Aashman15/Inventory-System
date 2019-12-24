package com.inventorysysystem.model;

public class Cashier {
    private int cashierId;
    private String cashierFirstName;
    private String cashierLastName;
    private String cashierAdress;
    private String cashierNumber;
    private String cashierEmail;
    private String cashierPassword;
    private String cashierGender;
	public int getCashierId() {
		return cashierId;
	}
	public void setCashierId(int cashierId) {
		this.cashierId = cashierId;
	}
	public String getCashierFirstName() {
		return cashierFirstName;
	}
	public void setCashierFirstName(String cashierFirstName) {
		this.cashierFirstName = cashierFirstName;
	}
	public String getCashierLastName() {
		return cashierLastName;
	}
	public void setCashierLastName(String cashierLastName) {
		this.cashierLastName = cashierLastName;
	}
	public String getCashierAdress() {
		return cashierAdress;
	}
	public void setCashierAdress(String cashierAdress) {
		this.cashierAdress = cashierAdress;
	}
	public String getCashierNumber() {
		return cashierNumber;
	}
	public void setCashierNumber(String cashierNumber) {
		this.cashierNumber = cashierNumber;
	}
	public String getCashierEmail() {
		return cashierEmail;
	}
	public void setCashierEmail(String cashierEmail) {
		this.cashierEmail = cashierEmail;
	}
	public String getCashierPassword() {
		return cashierPassword;
	}
	public void setCashierPassword(String cashierPassword) {
		this.cashierPassword = cashierPassword;
	}
	public String getCashierGender() {
		return cashierGender;
	}
	public void setCashierGender(String cashierGender) {
		this.cashierGender = cashierGender;
	}
	@Override
	public String toString() {
		return "Cashier [cashierId=" + cashierId + ", cashierFirstName=" + cashierFirstName + ", cashierLastName="
				+ cashierLastName + ", cashierAdress=" + cashierAdress + ", cashierNumber=" + cashierNumber
				+ ", cashierEmail=" + cashierEmail + ", cashierPassword=" + cashierPassword + ", cashierGender="
				+ cashierGender + "]";
	}
    
	
}
