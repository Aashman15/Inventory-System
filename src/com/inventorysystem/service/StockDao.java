package com.inventorysystem.service;

import java.util.List;

import com.inventorysysystem.model.StockModel;

public interface StockDao {
     boolean addStock(StockModel stock);
     List<StockModel> getAllProducts();
     boolean updateStock(StockModel product);
     StockModel getProductDetailsById(int id);
}
