package com.capgemini.drinkanddelight.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.drinkanddelight.dao.ProductPlaceAnOrderDao;
import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;


@Transactional
@Service
public class ProductPlaceAnOrderServiceImpl implements ProductPlaceAnOrderService{

	@Autowired
	private ProductPlaceAnOrderDao placeAnOrderDao;
	
	
	
	@Override
	public void addProductSpecs(ProductSpecs productSpecs) {
		// TODO Auto-generated method stub
		
		boolean orderStatus = placeAnOrderDao.addProductSpecs(productSpecs);
		if(orderStatus == false)
		{
			System.out.println("Product Added Failed!!!");
		}
		else
		{
			System.out.println("Product Added Successfully");
		}
		
	}
	

	
	@Override
	public List<ProductSpecs> getAllProduct() {
		// TODO Auto-generated method stub
		List<ProductSpecs> list = placeAnOrderDao.getAllProduct();
		return list;
	}
	
	
	
	@Override
	public List<ProductPlaceOrder> getProductOrderList() {
		// TODO Auto-generated method stub
		List<ProductPlaceOrder> list = placeAnOrderDao.getProductOrderList();
		return list;
	}


	
	@Override
	public void productPlaceOrder(ProductPlaceOrder productOrder) {
		// TODO Auto-generated method stub
		boolean orderStatus = placeAnOrderDao.placeAnOrder(productOrder);
		if(orderStatus == false)
		{
			System.out.println("Product Order Failed!!!");
		}
		else
		{
			System.out.println("Product Order Placed Successfully");
		}
	}


	@Override
	public Boolean productCancelOrder(String orderId) {
		// TODO Auto-generated method stub
		return placeAnOrderDao.cancelAnOrder(orderId);
		
	}


	
	@Override
	public boolean orderIdExists(String orderId) {
		// TODO Auto-generated method stub
		return placeAnOrderDao.orderIdExists(orderId);
	}

}
