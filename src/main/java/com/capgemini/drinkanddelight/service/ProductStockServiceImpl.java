package com.capgemini.drinkanddelight.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.drinkanddelight.dao.ProductStockDao;
import com.capgemini.drinkanddelight.entity.ProductStock;


@Transactional
@Service
public class ProductStockServiceImpl implements ProductStockService{

	@Autowired
	private ProductStockDao productStockDao;
	
	@Override
	public void addProductStock(ProductStock productStock) {
		// TODO Auto-generated method stub
		boolean orderStatus = productStockDao.addProductStock(productStock);
		if(orderStatus == false)
		{
			System.out.println("Product Stock Added Failed!!!");
		}
		else
		{
			System.out.println("Product Stock Added Successfully");
		}
	}

}
