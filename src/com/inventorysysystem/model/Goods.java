package com.inventorysysystem.model;

public class Goods {
     private int goodsQuantity;
     private String goodsName;
     private double goodsMrp;
     private double goodsPrice;
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getGoodsMrp() {
		return goodsMrp;
	}
	public void setGoodsMrp(double goodsMrp) {
		this.goodsMrp = goodsMrp;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
}
