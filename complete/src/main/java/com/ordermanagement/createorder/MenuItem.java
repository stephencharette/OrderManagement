package com.ordermanagement.createorder;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MenuItem {

	@Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private BigDecimal basePrice;

	protected MenuItem() {}

	public MenuItem(String name, BigDecimal basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}

	@Override
  public String toString() {
    return String.format(
			"MenuItem[id=%d, name='%s', basePrice='%s']",
			id, name, basePrice.toString());
  }

	public Long getId() {
		return id;
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
