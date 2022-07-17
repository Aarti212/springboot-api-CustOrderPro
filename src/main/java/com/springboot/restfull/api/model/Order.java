package com.springboot.restfull.api.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="OrderTable")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long OrderId;
	public String Address;
	public String OrderDate;
	
	@OneToMany(targetEntity =Product.class ,cascade =  CascadeType.ALL)
	@JoinColumn(name="order_fk_id", referencedColumnName = "OrderId")
	public List<Product> product;

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
}
