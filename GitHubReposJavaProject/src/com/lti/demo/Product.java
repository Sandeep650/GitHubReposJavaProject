package com.lti.demo;

public class Product {

	private int prdId;
	private String prdName;
	private double cost;
	public int getPrdId() {
		return prdId;
	}
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Product(int prdId, String prdName, double cost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product [prdId=" + prdId + ", prdName=" + prdName + ", cost=" + cost + "]";
	}
	
	
}
