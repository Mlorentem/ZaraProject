package com.example.zara;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prices")
public class Prices {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String curr;
	private float price;
	private int brandId, priceList, productId, priority;
	private Timestamp startDate, endDate;
	
	public Prices(Long id, String curr, float price, int brandId, int priceList, int productId, int priority,
			Timestamp startDate, Timestamp endDate) {
		super();
		this.id = id;
		this.curr = curr;
		this.price = price;
		this.brandId = brandId;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Prices() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public int getPriceList() {
		return priceList;
	}
	public void setPriceList(int priceList) {
		this.priceList = priceList;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	public Timestamp getEndDate() {
		return endDate;
	}
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Prices [id=" + id + ", curr=" + curr + ", price=" + price + ", brandId=" + brandId + ", priceList="
				+ priceList + ", productId=" + productId + ", priority=" + priority + ", startDate=" + startDate
				+ ", endDate=" + endDate + "]";
	}
	
}
