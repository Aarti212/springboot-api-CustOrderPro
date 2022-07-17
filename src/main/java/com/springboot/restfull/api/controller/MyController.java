package com.springboot.restfull.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restfull.api.model.Customer;
import com.springboot.restfull.api.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	public MyService myservice;

	@PostMapping("cust/add")
	public Customer addDetails(@RequestBody Customer cust) {
		System.out.println("output"+cust.CustomerName);
		return myservice.addCustDetail(cust);
	}
	@GetMapping("details")
	public List<Customer> showDetails() {
		return myservice.showCustomerDetails();
	}
	@GetMapping("customer/{id}")
	public Optional<Customer> showCustomerByID(@PathVariable(name="id") long id) {
		return myservice.customerByID(id);
		
	}
}
