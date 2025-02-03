package com.cust.app.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cust.app.entity.Customer;
import com.cust.app.repo.CustomerRepo;

@Service
public class CustomerService {
	@Autowired
	CustomerRepo custrepo;
	public void saveCustomerNewRecord(Customer custData) {
		custrepo.save(custData);
	}
	

}
