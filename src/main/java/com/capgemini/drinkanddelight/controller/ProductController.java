package com.capgemini.drinkanddelight.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.drinkanddelight.entity.ProductPlaceOrder;
import com.capgemini.drinkanddelight.entity.ProductSpecs;
import com.capgemini.drinkanddelight.entity.ProductStock;
import com.capgemini.drinkanddelight.exception.ProductOrderException;
import com.capgemini.drinkanddelight.service.ProductPlaceAnOrderService;
import com.capgemini.drinkanddelight.service.ProductStockService;

@RestController
@RequestMapping("/sprint2")
public class ProductController {
	
	@Autowired
	private ProductStockService productStockService;

	@Autowired
	private ProductPlaceAnOrderService PlaceAnOrderService;
	
	
	@PostMapping("/addProduct")
	public ResponseEntity<String> addProductSpec(@RequestBody ProductSpecs productSpecs)
	{
		PlaceAnOrderService.addProductSpecs(productSpecs);
		return new ResponseEntity<String>("Product Added Successfully to Product Specs Table",HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/GetOrderedDetails")
	public ResponseEntity<List<ProductPlaceOrder>> getlist() 
	{
		List<ProductPlaceOrder> list = PlaceAnOrderService.getProductOrderList();
		return new ResponseEntity<List<ProductPlaceOrder>>(list,HttpStatus.OK);
	}
	
	
	
	
	@GetMapping("/GetProductDetails")
	public ResponseEntity<List<ProductSpecs>> getProductlist() 
	{
		List<ProductSpecs> productList = PlaceAnOrderService.getAllProduct();
		return new ResponseEntity<List<ProductSpecs>>(productList,HttpStatus.OK);
	}
	
	
	
	
	@PostMapping("/placeProductOrder")
	public ResponseEntity<String> addProductOrder(@RequestBody ProductPlaceOrder productOrder, @RequestBody ProductStock productStock)
	{
		
		
//		String orderId = productOrder.getOrderId();
//		ProductStock productStock = productStock.setOrderId(orderId);
//		
//		String name = productOrder.getName();
//		ProductStock productStock = productStock.setName(name);
		
		
		PlaceAnOrderService.productPlaceOrder(productOrder);
		productStockService.addProductStock(productStock);
		return new ResponseEntity<String>("Placed ProductOrder Successfully",HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/cancelProductOrder/{id}")
	public ResponseEntity<Boolean> deleteProductOrder(@PathVariable ("id") String orderId) throws ProductOrderException
	{
		if(PlaceAnOrderService.orderIdExists(orderId))
		{
			Boolean status = PlaceAnOrderService.productCancelOrder(orderId);
			return new ResponseEntity<Boolean>(status, HttpStatus.OK);
		}
		else
		{
			throw new ProductOrderException("Placed Order Id Does Not Exist");
		}
		
	}
}