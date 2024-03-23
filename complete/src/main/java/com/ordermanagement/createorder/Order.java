package com.ordermanagement.createorder;

public class Order {

	private long id;
	private Temperature temperature;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}
}
