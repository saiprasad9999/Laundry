package com.easywash.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itemId;
	private String itemName;
	private int qty;
	@ManyToOne
	private Customer customer;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Items(int itemId, String itemName, int qty, Customer customer) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.qty = qty;
		this.customer = customer;
	}
	
	
	
	public Items(String itemName, int qty) {
		super();
		this.itemName = itemName;
		this.qty = qty;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Items [itemId=" + itemId + ", itemName=" + itemName + ", qty=" + qty + ", customer=" + customer + "]";
	}
	
	
	
	
	

}
