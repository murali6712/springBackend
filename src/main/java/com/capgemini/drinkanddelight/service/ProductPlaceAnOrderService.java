package com.capgemini.drinkanddelight.service;

import java.util.List;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;


public interface ProductPlaceAnOrderService {
	
	public void addProductSpecs(ProductSpecs productSpecs);

	
	public List<ProductSpecs> getAllProduct();
	
	
	public List<ProductPlaceOrder> getProductOrderList();
	
	
	public void productPlaceOrder(ProductPlaceOrder productOrder);
	
	
	public Boolean productCancelOrder(String id);

	
	public boolean orderIdExists(String orderId);
	
}
