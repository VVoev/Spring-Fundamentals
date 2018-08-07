package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.model.Customer;

public class CustomerRepository implements ICustomerRepository {
	
	
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstname("Bob");
		customer.setLastname("Borisov");
		customers.add(customer);
		
		return customers;
	}
}
