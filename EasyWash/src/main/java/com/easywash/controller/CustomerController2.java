package com.easywash.controller;

import java.security.Principal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.easywash.entity.Billing;
import com.easywash.entity.Customer;
import com.easywash.entity.CustomerDTO;
import com.easywash.entity.ItemDTO;
import com.easywash.entity.Items;
import com.easywash.repository.CustomerRepo;
import com.easywash.service.BillingService;
import com.easywash.service.CustomerService;
import com.easywash.service.ItemService;

@Controller
@RequestMapping("/get")
public class CustomerController2 {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private BillingService billService;
	@Autowired
	private CustomerRepo customerRepo;
	
	private Customer cust;
	
	
//	@GetMapping("/home")
//	public String home(Model model) {
//		model.addAttribute("customer", new CustomerDTO());
//		
//		return "Home";
//	}
//	
//	@PostMapping("/create")
//	public RedirectView createCustomer(@Validated @ModelAttribute("customer") CustomerDTO customer, Model model, HttpSession session) {
//		
//		model.addAttribute("customer", customer);
//		Customer c=new Customer();
//		c.setDate(new Date());
//		c.setDelDate(null);
//		c.setName(customer.getName());
//		c.setMobNo(customer.getMobNo());
//		Set<Items>set=new HashSet<>();
//		
//		customerService.createCustomer(c);
//	
//		this.cust=c;
//		return new RedirectView("/Items");
//
//	}
//	
//	@GetMapping("/Items")
//	private String createItems(Model model) {
//		model.addAttribute("items",new ItemDTO());
//		return "Items";
//	}
//	
//	@PostMapping("/ItemCreate")
//	private String postItem(@ModelAttribute("item") ItemDTO item, Model model,HttpSession session) {
//		model.addAttribute("item", item);
//		Items i=new Items();
//		i.setItemName(item.getItemName());
//		i.setQty(item.getQty());
//		i.setCustomer(cust);
//		itemService.saveItems(i);
//		
//		return "Items";
//	}
//	
//
//	
//	@GetMapping("/bill")
//	public String bill(Model model) {
//		model.addAttribute("bill", new Billing());
//		return "Bill";
//	}
//	
//	@PostMapping("/createBill")
//	public String createBill(@ModelAttribute("bill") Billing bill, Model model,HttpSession session) {
//		model.addAttribute("bill", bill);
//		Billing b=new Billing();
//		b.setWeight(bill.getWeight());
//		int price=(int) (b.getWeight()*50);
//		b.setPrice(price);
//		b.setCustomer(cust);
//		this.billService.saveBill(b);
//		this.cust.setBill(b);
//		this.customerService.createCustomer(cust);
//		//System.out.println(cust);
//		return "Bill";
//		
//	}
//	
//	@GetMapping("/getBill")
//	public String getBill(Model model) {
//		model.addAttribute("customer", new Customer());
		//System.out.println(c);
//		System.out.println(c.getName());
//		System.out.println(c.getList());
//		System.out.println(c.getBill());
//		return "PrintBill";
//	}
	
//	@GetMapping("/printBill/{customer_id}")
//	public void printBill(@ModelAttribute("customer") Customer customer, Model model,HttpSession session,@PathVariable ("customer_id") int id) {
////		Customer c=this.customerRepo.getById(customer.getCustomer_id());
//		Customer c=this.customerRepo.findById(id).get();
//		System.out.println(c);
//	}
		@GetMapping("/getCustomer/{id}")
	public void getCustomer(@PathVariable ("id") int id) {
		Customer c1=this.customerService.getCustomer(id);
		System.out.println(c1);
	}
	
}
