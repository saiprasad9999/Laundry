package com.easywash.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easywash.entity.Billing;
import com.easywash.repository.BillingRepo;
import com.easywash.service.BillingService;

@Service
public class BillingServiceImpl implements BillingService{
	@Autowired
	private BillingRepo billRepo;

	@Override
	public Billing saveBill(Billing bill) {
		return billRepo.save(bill);
	}

	@Override
	public Billing getBill(int id) {
		// TODO Auto-generated method stub
		return billRepo.findById(id).get();
	}
	

}
