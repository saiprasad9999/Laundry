package com.easywash.entity;

public class ItemDTO {
	
	private String itemName;
	private int qty;
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
	public ItemDTO(String itemName, int qty) {
		super();
		this.itemName = itemName;
		this.qty = qty;
	}
	public ItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ItemDTO [itemName=" + itemName + ", qty=" + qty + "]";
	}
	
	
	
}
