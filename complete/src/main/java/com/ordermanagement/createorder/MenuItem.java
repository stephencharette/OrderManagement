package com.ordermanagement.createorder;

import java.math.BigDecimal;

public class MenuItem {

	private int id;
	private String name;
	private BigDecimal basePrice;

	public MenuItem(int id, String name, BigDecimal basePrice) {
		this.id = id;
		this.name = name;
		this.basePrice = basePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}
}
