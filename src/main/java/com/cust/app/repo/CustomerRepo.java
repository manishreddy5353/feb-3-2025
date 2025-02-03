package com.cust.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cust.app.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	static void saveCustomerNewRecord(Customer custData) {
		// TODO Auto-generated method stub
		
	}


}
