package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FloatValue implements Serializable {

	private float value;

	public float getValue() {
		return value;
	}

	public FloatValue(float value) {
		super();
		this.value = value;
	}

	public FloatValue() {
		super();
	}

	public void setValue(float value) {
		this.value = value;
	}

}
