package com.capgemini.drinkanddelight.dao;

import java.util.List;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;

public interface ProductPlaceAnOrderDao {

	public boolean addProductSpecs(ProductSpecs productSpecs);
	
	
	public List<ProductSpecs> getAllProduct();
	
	
	public List<ProductPlaceOrder> getProductOrderList();
	
	
	public boolean placeAnOrder(ProductPlaceOrder productOrder);
	
	
	public Boolean cancelAnOrder(String orderId);
	

	public boolean orderIdExists(String orderId);
	
}
