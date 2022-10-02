package com.easywash.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import antlr.collections.List;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String name;
    private String mobNo;
    private Date date;
    private Date delDate;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Items> items;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Billing bill;
    
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDelDate() {
		return delDate;
	}
	public void setDelDate(Date delDate) {
		Calendar c=Calendar.getInstance();
		c.setTime(this.date);
		c.add(Calendar.DATE,2);
		Date newDate=c.getTime();
		this.delDate=newDate;
	}
	public Set<Items> getItems() {
		return items;
	}
	public void setItems(Set<Items> items) {
		this.items = items;
	}
	public Billing getBill() {
		return bill;
	}
	public void setBill(Billing bill) {
		this.bill = bill;
	}
	public Customer(int customer_id, String name, String mobNo, Date date, Date delDate, Set<Items> items,
			Billing bill) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.mobNo = mobNo;
		this.date = date;
		this.delDate = delDate;
		
		this.items = items;
		this.bill = bill;
	}

	public Customer(String name, String mobNo, Set<Items> items) {
		super();
		this.name = name;
		this.mobNo = mobNo;
		
		
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", mobNo=" + mobNo + ", date=" + date
				+ ", delDate=" + delDate + ", items=" + items + ", bill=" + bill + "]";
	}
    
	
    
	

}
