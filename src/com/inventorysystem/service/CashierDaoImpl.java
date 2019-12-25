package com.inventorysystem.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.inventorysystem.app.CashierHome;
import com.inventorysystem.app.CashierUpdateForm;
import com.inventorysystem.app.LogInFormForCashier;
import com.inventorysystem.database.Db;
import com.inventorysysystem.model.Cashier;
import com.mysql.jdbc.PreparedStatement;

public class CashierDaoImpl implements CashierDao {

	Connection con;

	public CashierDaoImpl() {
		try {
			con = Db.getDb();
		} catch (SQLException e) {
			e.getMessage();
		}
	}

	@Override
	public boolean addCashier(Cashier cashier) {
		String sql = "insert into cashiers(Id,FirstName,LastName,Adress,Number,Email,Password,Gender) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, cashier.getCashierId());
			pstm.setString(2, cashier.getCashierFirstName());
			pstm.setString(3, cashier.getCashierLastName());
			pstm.setString(4, cashier.getCashierAdress());
			pstm.setString(5, cashier.getCashierNumber());
			pstm.setString(6, cashier.getCashierEmail());
			pstm.setString(7, cashier.getCashierPassword());
			pstm.setString(8, cashier.getCashierGender());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.getMessage();
		}
		return false;
	}

	@Override
	public List<Cashier> viewAllCashiers() {

		List<Cashier> clist = new ArrayList<Cashier>();
		String sql = "select * from cashiers";
		try {

			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Cashier cashier = new Cashier();
				cashier.setCashierId(rs.getInt("Id"));
				cashier.setCashierFirstName(rs.getString("FirstName"));
				cashier.setCashierLastName(rs.getString("LastName"));
				cashier.setCashierAdress(rs.getString("Adress"));
				cashier.setCashierNumber(rs.getString("Number"));
				cashier.setCashierEmail(rs.getString("Email"));
				cashier.setCashierPassword(rs.getString("Password"));
				cashier.setCashierGender(rs.getString("Gender"));
				clist.add(cashier);
			}
		} catch (SQLException e) {
			e.getMessage();
		}
		return clist;

	}

	@Override
	public Cashier getCashierDetailsById(int id) {
		Cashier c = new Cashier();
		String sql = "select * from cashiers where Id = " + id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				c.setCashierId(rs.getInt("Id"));
				c.setCashierFirstName(rs.getString("FirstName"));
				c.setCashierLastName(rs.getString("LastName"));
				c.setCashierAdress(rs.getString("Adress"));
				c.setCashierNumber(rs.getString("Number"));
				c.setCashierEmail(rs.getString("Email"));
				c.setCashierPassword(rs.getString("Password"));
				c.setCashierGender(rs.getString("Gender"));
			}

		} catch (SQLException e) {
			e.getMessage();
		}

		return c;
	}

	@Override
	public boolean updateCashierById(Cashier c, int id) {
		String sql = "update cashiers set Id=?,FirstName=?,LastName=?,Adress=?,Number=?,Email=?,Password=?,Gender=? where Id =  "
				+ id;
		try {
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, c.getCashierId());
			pstm.setString(2, c.getCashierFirstName());
			pstm.setString(3, c.getCashierLastName());
			pstm.setString(4, c.getCashierAdress());
			pstm.setString(5, c.getCashierNumber());
			pstm.setString(6, c.getCashierEmail());
			pstm.setString(7, c.getCashierPassword());
			pstm.setString(8, c.getCashierGender());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteCashier(int id) {
		String sql = "delete from cashiers where Id = " + id;
		try {
			Statement stm = con.createStatement();
			stm.execute(sql);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean cashierExist(String email, String password) {
		String sql = "select * from cashiers";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				if (rs.getString(6).equalsIgnoreCase(email) && rs.getString(7).equalsIgnoreCase(password)) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
