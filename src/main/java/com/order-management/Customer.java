package com.order_management;

public class Customer {

  private Long id;

	protected Customer() {}

	public Customer(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
}
