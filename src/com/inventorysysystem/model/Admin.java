package com.inventorysysystem.model;

import java.sql.Date;

public class Admin {
	private String adminFirstName;
	private String adminLastName;
	private String adminEmail;
	private String adminUsername;
	private String adminPassword;
	private String adminBirthday;
	private String adminAdress;
	private String phone;
	public String getAdminFirstName() {
		return adminFirstName;
	}
	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}
	public String getAdminLastName() {
		return adminLastName;
	}
	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminBirthday() {
		return adminBirthday;
	}
	public void setAdminBirthday(String date) {
		this.adminBirthday = date;
	}
	public String getAdminAdress() {
		return adminAdress;
	}
	public void setAdminAdress(String adminAdress) {
		this.adminAdress = adminAdress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
