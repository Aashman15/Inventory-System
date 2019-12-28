package com.inventorysystem.service;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.inventorysystem.database.Db;
import com.inventorysysystem.model.Bill;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

public class BillDaoImpl implements BillDao{

	@Override
	public boolean addBill(Bill bill) {
        String sql = "insert into bills (BillNumber,CustomerName,Amount,Date) values (?,?,?,?)";
		try {
			PreparedStatement pstm = (PreparedStatement) Db.getDb().prepareStatement(sql);
			pstm.setInt(1, bill.getBillNumber());
			pstm.setString(2, bill.getCustomerName());
			pstm.setDouble(3, bill.getTotalAmount());
			pstm.setString(4, bill.getDate());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return false;
	}

	@Override
	public List<Bill> getAllBills() {
		List<Bill> bList = new ArrayList<Bill>();
		String sql = "select * from bills";
	    try {
			new Db();
			Statement stm = Db.getDb().createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				Bill b = new Bill();
				b.setBillNumber(rs.getInt(1));
				b.setCustomerName(rs.getString(2));
				b.setTotalAmount(rs.getDouble(3));
				b.setDate(rs.getString(4));
			    bList.add(b);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bList;
	}

	@Override
	public List<Bill> searchBill(String input) {
		List<Bill> blist = new ArrayList<Bill>();
		String sql = "select * from bills where BillNumber like '%"+input+"%' OR CustomerName like '%"+input+"%'";
		try {
			new Db();
			Statement stm = Db.getDb().createStatement();
		    ResultSet rs = stm.executeQuery(sql);
		    while(rs.next()) {
		    	Bill b = new Bill();
		    	b.setBillNumber(rs.getInt(1));
		    	b.setCustomerName(rs.getString(2));
		    	b.setTotalAmount(rs.getDouble(3));
		    	b.setDate(rs.getString(4));
		    	blist.add(b);
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return blist;
	}

}
