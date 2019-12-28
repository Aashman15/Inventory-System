package com.inventorysystem.service;

import java.util.List;

import com.inventorysysystem.model.Bill;

public interface BillDao {
      boolean addBill(Bill bill);
      List<Bill> getAllBills();
      List<Bill> searchBill(String input);
}
