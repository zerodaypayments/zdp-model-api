package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AddressResponse implements Serializable {

	private String address;

	public AddressResponse(String address) {
		super();
		this.address = address;
	}

	public AddressResponse() {
		super();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddressResponse [address=" + address + "]";
	}

}
