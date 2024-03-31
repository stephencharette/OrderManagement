package com.ordermanagement.createorder;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Size {

	@Id
  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private DrinkSize drinkSize;
	private BigDecimal additionalCost;

	protected Size() {}

	public Size(DrinkSize drinkSize, BigDecimal additionalCost) {
		this.drinkSize = drinkSize;
		this.additionalCost = additionalCost;
	}

	public DrinkSize getDrinkSize() {
		return drinkSize;
	}

	public void setDrinkSize(DrinkSize drinkSize) {
		this.drinkSize = drinkSize;
	}

	public BigDecimal getAdditionalCost() {
		return additionalCost;
	}

	public void setAdditionalCost(BigDecimal additionalCost) {
		this.additionalCost = additionalCost;
	}

	public Long getId() {
		return id;
	}
}
