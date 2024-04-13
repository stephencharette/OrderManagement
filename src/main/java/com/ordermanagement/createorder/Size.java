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
	private String name;
	private BigDecimal additionalCost;

	protected Size() {}

	public Size(String name, BigDecimal additionalCost) {
		this.name = name;
		this.additionalCost = additionalCost;
	}

	@Override
  public String toString() {
    return String.format(
			"Size[id=%d, name='%s', additionalCost='%s']",
			id, name, additionalCost.toString());
  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
