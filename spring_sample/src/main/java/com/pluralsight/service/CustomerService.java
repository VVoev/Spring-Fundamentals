package com.pluralsight.service;


import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

public class CustomerService implements ICustomerService {
	
	private CustomerRepository customerRepository = new CustomerRepository();
	

	@Override
	public List<Customer>findAll(){
		return customerRepository.findAll();
	}

}
