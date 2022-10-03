package com.easywash.entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String name;
    private String mobNo;
    private Date date;
    private Date delDate;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy ="customer" )
    private List<Items> list=new ArrayList<>();
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
	
	public Billing getBill() {
		return bill;
	}
	public void setBill(Billing bill) {
		this.bill = bill;
	}
	
	public Customer(int customer_id, String name, String mobNo, Date date, Date delDate, List<Items> list,
			Billing bill) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.mobNo = mobNo;
		this.date = date;
		this.delDate = delDate;
		this.list = list;
		this.bill = bill;
	}
	public List<Items> getList() {
		return list;
	}
	public void setList(List<Items> list) {
		this.list = list;
	}
	public Customer(String name, String mobNo, List<Items> list) {
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
				+ ", delDate=" + delDate + ", list=" + list + ", bill=" + bill + "]";
	}
	
    
	
    
	

}
