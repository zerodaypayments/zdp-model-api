package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class DoubleValue implements Serializable {

	private double value;

	public double getValue() {
		return value;
	}

	public DoubleValue(double value) {
		super();
		this.value = value;
	}

	public DoubleValue() {
		super();
	}

	public void setValue(double value) {
		this.value = value;
	}

}
