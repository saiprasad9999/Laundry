package com.easywash.entity;

import java.util.Set;

public class CustomerDTO {
	private String name;
    private String mobNo;
    private Set<ItemDTO> items;
    private Billing bill;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public Set<ItemDTO> getItems() {
		return items;
	}
	public void setItems(Set<ItemDTO> items) {
		this.items = items;
	}
	public Billing getBill() {
		return bill;
	}
	public void setBill(Billing bill) {
		this.bill = bill;
	}
	public CustomerDTO(String name, String mobNo, Set<ItemDTO> items, Billing bill) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		this.items = items;
		this.bill = bill;
	}
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", mobNo=" + mobNo + ", items=" + items + ", bill=" + bill + "]";
	}
    
    
    
}
