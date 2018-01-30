package io.zdp.api.model;

import java.io.Serializable;
import java.math.BigDecimal;

@SuppressWarnings("serial")
public class BigDecimalValue implements Serializable {

	private BigDecimal value = BigDecimal.ZERO;

	public BigDecimal getValue() {
		return value;
	}

	public BigDecimalValue(BigDecimal value) {
		super();
		this.value = value;
	}

	public BigDecimalValue() {
		super();
	}

	public void setValue(float value) {
		this.value = BigDecimal.valueOf(value);
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
