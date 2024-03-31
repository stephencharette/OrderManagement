package com.ordermanagement.createorder;

import java.util.*;
import java.math.BigDecimal;

public class Order {

	private int id;
	private Temperature temperature;
	private Long menuItemId;
	private Long sizeId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
