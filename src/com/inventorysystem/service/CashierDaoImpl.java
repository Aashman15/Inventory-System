package com.inventorysystem.service;

import java.sql.Connection;
import java.sql.SQLException;

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

}
