package com.easywash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Billing {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billNo;
	private double weight;
	private int price;
	
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Billing(int billNo, double weight, int price) {
		super();
		this.billNo = billNo;
		this.weight = weight;
		this.price = price;
		
	}
	
	public Billing(double weight, int price) {
		super();
		this.weight = weight;
		this.price = price;
	}
	public Billing() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Billing [billNo=" + billNo + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
	
}
