package com.capgemini.drinkanddelight.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import com.capgemini.drinkanddelight.entity.ProductStock;


@Transactional
@Repository
public class ProductStockDaoImpl implements ProductStockDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public boolean addProductStock(ProductStock productStock) {
		// TODO Auto-generated method stub
		entityManager.persist(productStock);
		return true;
	}

}
