package com.ordermanagement.createorder;

import java.util.*;
import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

	@Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Date date = new Date();
	private Temperature temperature;
	private Long sizeId;
	private Long menuItemId;

	protected Order() {}

	public Order(Temperature temperature, Long menuItemId, Long sizeId) {
		this.temperature = temperature;
		this.menuItemId = menuItemId;
		this.sizeId = sizeId;
	}

	public static BigDecimal calculateTotal(MenuItem menuItem, Size size) {
		return menuItem.getBasePrice().add(size.getAdditionalCost());
	}

	public Long getId() {
		return id;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

	public Long getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public Long getSizeId() {
		return sizeId;
	}

	public void setSizeId(Long sizeId) {
		this.sizeId = sizeId;
	}

	public Date getDate() {
		return date;
	}
}
