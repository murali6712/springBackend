package com.capgemini.drinkanddelight.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;

@Transactional
@Repository
public class ProductPlaceAnOrderDaoImpl implements ProductPlaceAnOrderDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@Override
	public boolean addProductSpecs(ProductSpecs productSpecs) {
		// TODO Auto-generated method stub
		entityManager.persist(productSpecs);
		return true;
	}
	
	

	@Override
	public List<ProductSpecs> getAllProduct() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT product_specs FROM ProductSpecs product_specs";
		TypedQuery<ProductSpecs> query = entityManager.createQuery(Qstr, ProductSpecs.class);
		return query.getResultList();
	}
	
	
	
	@Override
	public List<ProductPlaceOrder> getProductOrderList() {
		// TODO Auto-generated method stub
		String Qstr = "SELECT product_place_order FROM ProductPlaceOrder product_place_order";
		TypedQuery<ProductPlaceOrder> query = entityManager.createQuery(Qstr, ProductPlaceOrder.class);
		return query.getResultList();
	}


	
	@Override
	public boolean placeAnOrder(ProductPlaceOrder productOrder) {
		// TODO Auto-generated method stub
		entityManager.persist(productOrder);
		return true;
	}


	
	@Override
	public Boolean cancelAnOrder(String orderId) {
		// TODO Auto-generated method stub
		entityManager.remove(entityManager.find(ProductPlaceOrder.class, orderId));
		return true;
	}


	
	@Override
	public boolean orderIdExists(String orderId) {
		// TODO Auto-generated method stub
		if(entityManager.find(ProductPlaceOrder.class, orderId) != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
