package com.springboot.restfull.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long ProductId;
	public long Price;
	public String ProductName;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
