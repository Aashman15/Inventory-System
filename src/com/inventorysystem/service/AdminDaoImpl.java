package com.inventorysystem.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.inventorysystem.app.AdminHomeCashierPg;
import com.inventorysystem.database.Db;
import com.inventorysysystem.model.Admin;
import com.mysql.jdbc.PreparedStatement;


public class AdminDaoImpl implements AdminDao {
	
	
    Connection con = null;
	public AdminDaoImpl(){
		try {
			con = Db.getDb();
		} catch (SQLException e) {
			e.getMessage();
		}
	}

	@Override
	public boolean signUpAdmin(Admin admin) {
		String sql = "insert into admins (FirstName, LastName, Email, Username, Password, Birthday, Adress, Phone) values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm =  (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, admin.getAdminFirstName());
			pstm.setString(2, admin.getAdminLastName());
			pstm.setString(3, admin.getAdminEmail());
			pstm.setString(4, admin.getAdminUsername());
			pstm.setString(5, admin.getAdminPassword());
			pstm.setDate(6, admin.getAdminBirthday());
			pstm.setString(7, admin.getAdminAdress());
			pstm.setString(8, admin.getPhone());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.getMessage();
		}
		
		return false;
	}

	@Override
	public boolean adminExist(String username, String password) {
        String sql = "select * from admins";
        try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				if(username.equals(rs.getString(5)) && password.equals(rs.getString(6))) {
					AdminHomeCashierPg ahome = new AdminHomeCashierPg();
					ahome.setVisible(true);
				    return true;
				}
			}
			} catch (SQLException e) {
			e.getMessage();
		}
		return false;
	}
	
	public static void main(String[] args) {
		AdminDao adao = new AdminDaoImpl();
		adao.adminExist("", "");
	}

}
