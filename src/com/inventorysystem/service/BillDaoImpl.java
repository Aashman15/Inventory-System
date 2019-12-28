package com.inventorysystem.service;

import java.sql.Date;
import java.sql.SQLException;

import com.inventorysystem.database.Db;
import com.inventorysysystem.model.Bill;
import com.mysql.jdbc.PreparedStatement;

public class BillDaoImpl implements BillDao{

	@Override
	public boolean addBill(Bill bill) {
        String sql = "insert into bills (BillNumber,CustomerName,Amount,Date) values (?,?,?,?)";
		try {
			PreparedStatement pstm = (PreparedStatement) Db.getDb().prepareStatement(sql);
			pstm.setInt(1, bill.getBillNumber());
			pstm.setString(2, bill.getCustomerName());
			pstm.setDouble(3, bill.getTotalAmount());
			pstm.setDate(4, (Date) bill.getDate());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
        return false;
	}

}
