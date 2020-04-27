package com.capgemini.drinkanddelight.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductStock {
	
	@Id
	private String orderId;
	private String name;
	private long pricePerUnit;
	private long quantityValue;
	private long quantityUnit;
	private long price;
	private String warehouseid;
	private Date deliveryDate;
	private Date manufacturingDate;
	private Date expiryDate;
	private String qualityCheck;
	private Date exitDate;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPricePerUnit() {
		return pricePerUnit;
	}
	public void setPricePerUnit(long pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}
	public long getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(long quantityValue) {
		this.quantityValue = quantityValue;
	}
	public long getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(long quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(String warehouseid) {
		this.warehouseid = warehouseid;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getQualityCheck() {
		return qualityCheck;
	}
	public void setQualityCheck(String qualityCheck) {
		this.qualityCheck = qualityCheck;
	}
	public Date getExitDate() {
		return exitDate;
	}
	public void setExitDate(Date exitDate) {
		this.exitDate = exitDate;
	}
	public ProductStock(String orderId, String name, long price_per_unit, long quantityValue, long quantityUnit,
			long price, String warehouseid, Date deliveryDate, Date manufacturingDate, Date expiryDate,
			String qualityCheck, Date exitDate) {
		super();
		this.orderId = orderId;
		this.name = name;
		this.pricePerUnit = price_per_unit;
		this.quantityValue = quantityValue;
		this.quantityUnit = quantityUnit;
		this.price = price;
		this.warehouseid = warehouseid;
		this.deliveryDate = deliveryDate;
		this.manufacturingDate = manufacturingDate;
		this.expiryDate = expiryDate;
		this.qualityCheck = qualityCheck;
		this.exitDate = exitDate;
	}
	public ProductStock() {
		super();
	}
	@Override
	public String toString() {
		return "ProductStock [orderId=" + orderId + ", name=" + name + ", price_per_unit=" + pricePerUnit
				+ ", quantityValue=" + quantityValue + ", quantityUnit=" + quantityUnit + ", price=" + price
				+ ", warehouseid=" + warehouseid + ", deliveryDate=" + deliveryDate + ", manufacturingDate="
				+ manufacturingDate + ", expiryDate=" + expiryDate + ", qualityCheck=" + qualityCheck + ", exitDate="
				+ exitDate + "]";
	}
	
	
	
	
}
