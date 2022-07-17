package com.springboot.restfull.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.restfull.api.model.Customer;
import com.springboot.restfull.api.repository.CustomerRepository;

@Service
public class MyServiceImpl implements MyService {

	@Autowired
	public CustomerRepository custrepo;

	@Override
	public Customer addCustDetail(Customer cust) {
		return custrepo.save(cust);
	}

	@Override
	public List<Customer> showCustomerDetails() {
		return custrepo.findAll();
	}

	@Override
	public Optional<Customer> customerByID(long id) {
		return custrepo.findById(id);
	}
}
