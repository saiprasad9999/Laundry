package com.easywash.controller;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.easywash.entity.Billing;
import com.easywash.entity.Customer;
import com.easywash.entity.CustomerDTO;
import com.easywash.entity.ItemDTO;
import com.easywash.entity.Items;
import com.easywash.service.BillingService;
import com.easywash.service.CustomerService;
import com.easywash.service.ItemService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ItemService itemService;
	@Autowired
	private BillingService billService;
	
	@RequestMapping(value="/create")
	public String createCustomer(@Validated @ModelAttribute("customer") CustomerDTO customer,@ModelAttribute("items") ItemDTO items[], Model model, HttpSession session) {
		
//		
		model.addAttribute("customer", customer);
		//Customer c=new Customer(customer.getName(), customer.getMobNo(),customer.getItems());
		Customer c=new Customer();
		c.setDate(new Date());
		c.setDelDate(null);
		c.setName(customer.getName());
		c.setMobNo(customer.getMobNo());

		Set<ItemDTO> ite=new HashSet<>();
		for(ItemDTO o:items) {
			ite.add(new ItemDTO(o.getItemName(),o.getQty()));
		}
		customer.setItems(ite);
		
		
		Set<Items>set=new HashSet<>();
		for(ItemDTO i:customer.getItems()) {
			set.add(new Items(customer.getName(), i.getQty()));
		}
		c.setItems(set);
		
		c.setBill(new Billing(customer.getBill().getWeight(), customer.getBill().getPrice()));
//	
//		System.out.println(c.toString());
//		
		customerService.createCustomer(c);
		
		return "Home";

	}
	
	

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("customer", new CustomerDTO());
		model.addAttribute("items",new ItemDTO());
		return "Home";
	}
	
}
