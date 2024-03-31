package com.ordermanagement.createorder;

import java.util.*;
import java.math.BigDecimal;

public class Order {

	private int id;
	private Temperature temperature;
	private int menuItemId;
	private int sizeId;

	public static List<Size> availableSizes = new ArrayList<Size>() {
		{
			add(new Size(1, DrinkSize.MEDIUM, new BigDecimal(0)));
			add(new Size(2, DrinkSize.LARGE, new BigDecimal(0.99)));
		}
	};

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

	public int getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(int menuItemId) {
		this.menuItemId = menuItemId;
	}

	public int getSizeId() {
		return sizeId;
	}

	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}
}
