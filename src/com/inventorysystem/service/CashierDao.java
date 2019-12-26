package com.inventorysystem.service;

import java.util.List;

import com.inventorysysystem.model.Cashier;

public interface CashierDao {
	boolean addCashier(Cashier cashier);

	List<Cashier> viewAllCashiers();

	Cashier getCashierDetailsById(int id);

	boolean cashierExist(String email, String password);

	boolean updateCashierById(Cashier c);

	boolean deleteCashier(int id);
}
