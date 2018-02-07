package io.zdp.api.model;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class Key implements Serializable {

	private byte[] key;

	public Key() {
		super();
	}

	public Key(byte[] key) {
		super();
		this.key = key;
	}

	public byte[] getKey() {
		return key;
	}

	public void setKey(byte[] key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "Key [key=" + Arrays.toString(key) + "]";
	}

}
