package com.cust.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.app.entity.Customer;
import com.cust.app.repo.CustomerRepo;

@Service
public class Customerservice {
	@Autowired
	CustomerRepo custrepo;
	
	
	public void addNewCustomer(Customer custData) {
		// TODO Auto-generated method stub
		custrepo.save(custData);
		
	}

}
