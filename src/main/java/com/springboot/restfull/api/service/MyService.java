package com.springboot.restfull.api.service;

import java.util.List;
import java.util.Optional;

import com.springboot.restfull.api.model.Customer;

public interface MyService {
	
	public Customer addCustDetail(Customer cust);
	public List<Customer> showCustomerDetails();
	public Optional<Customer> customerByID(long id);

}
