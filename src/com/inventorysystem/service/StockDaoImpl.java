package com.inventorysystem.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.inventorysystem.app.CashierHomeCreateBillPg;
import com.inventorysystem.app.Stock;
import com.inventorysystem.database.Db;
import com.inventorysysystem.model.StockModel;
import com.mysql.jdbc.PreparedStatement;

public class StockDaoImpl implements StockDao {

	Connection con = null;

	public StockDaoImpl() {
		try {
			con = Db.getDb();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean addStock(StockModel stock) {

		String sql = "insert into stock (ProductId,ProductName,Available,TotalAdded,Mrp)values(?,?,?,?,?)";
		try {
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setInt(1, stock.getProductId());
			pstm.setString(2, stock.getProductName());
			pstm.setInt(3, stock.getProductAvailable());
			pstm.setInt(4, stock.getTotalAdded());
			pstm.setDouble(5, stock.getProductMrp());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<StockModel> getAllProducts() {
		List<StockModel> slist = new ArrayList<StockModel>();
		String sql = "Select * from stock";
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				StockModel s = new StockModel();
				s.setProductId(rs.getInt("ProductId"));
				s.setProductName(rs.getString("ProductName"));
				s.setProductAvailable(rs.getInt("Available"));
				s.setTotalAdded(rs.getInt("TotalAdded"));
				s.setProductMrp(rs.getDouble("Mrp"));
				slist.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return slist;
	}

	@Override
	public boolean updateStock(StockModel product) {
		String sql = "update stock set ProductName=?,Available=?,TotalAdded=?,Mrp=? where ProductId=?";
		try {
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, product.getProductName());
			pstm.setInt(2, product.getProductAvailable());
			pstm.setInt(3, product.getTotalAdded());
			pstm.setDouble(4, product.getProductMrp());
			pstm.setInt(5, product.getProductId());
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public StockModel getProductDetailsById(int id) {
		StockModel s = new StockModel();
		String sql = "select * from stock where ProductId = " + id;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if (rs.next()) {
				s.setProductId(rs.getInt("ProductId"));
				s.setProductName(rs.getString("ProductName"));
				s.setProductAvailable(rs.getInt("Available"));
				s.setTotalAdded(rs.getInt("TotalAdded"));
				s.setProductMrp(rs.getDouble("Mrp"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return s;
	}

	@Override
	public boolean updateAvailableNumber(int productId, int leftQuantity) {
		String sql = "update stock set Available=? where ProductId = " + productId;
		try {
			new Db();
			PreparedStatement pstm = (PreparedStatement) Db.getDb().prepareStatement(sql);
			pstm.setInt(1, leftQuantity);
			pstm.execute();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
