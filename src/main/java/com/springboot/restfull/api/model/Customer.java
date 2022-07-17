package com.springboot.restfull.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long CustomerId;
	public String CustomerName;
	
	@OneToMany(targetEntity =Order.class ,cascade =  CascadeType.ALL)
	@JoinColumn(name="customer_fk_id", referencedColumnName = "CustomerId")
	public List<Order> order;

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
