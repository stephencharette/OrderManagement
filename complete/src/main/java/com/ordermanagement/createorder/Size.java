package com.ordermanagement.createorder;

import java.math.BigDecimal;

public class Size {

	private int id;
	private DrinkSize drinkSize;
	private BigDecimal additionalCost;

	// private static Size[] availableSizes = {
	// 	new Size(DrinkSize.MEDIUM, new BigDecimal("0.00")),
	// 	new Size(DrinkSize.LARGE, new BigDecimal("1.00"))
	// };

	public Size(int id, DrinkSize drinkSize, BigDecimal additionalCost) {
		this.id = id;
		this.drinkSize = drinkSize;
		this.additionalCost = additionalCost;
	}

	// public static Size getSize(DrinkSize drinkSize) {
	// 	for (Size size : availableSizes) {
	// 		if (size.getDrinkSize() == drinkSize) {
	// 			return size;
	// 		}
	// 	}
	// 	return null;
	// }

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
