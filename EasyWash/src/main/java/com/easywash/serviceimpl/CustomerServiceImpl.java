package com.easywash.serviceimpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easywash.entity.Customer;
import com.easywash.repository.CustomerRepo;
import com.easywash.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public Customer createCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

}
