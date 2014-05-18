package com.friday.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.friday.model.Shop;

public interface StockOutService {
	List<Object> getProductByShop(int shopId) throws Exception;
	List<Shop> getAllShops() throws Exception;
	int stockOut(Map<Integer, Integer> outStocks, Date date, String bz , String uId, int shopId) throws Exception;
}