package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BalanceRequest implements Serializable {

	private String address;

	private byte[] signature;

	public BalanceRequest() {
		super();
	}

	public BalanceRequest(String address, byte[] signature) {
		super();
		this.address = address;
		this.signature = signature;
	}

	public String getAddress() {
		return address;
	}

	public byte[] getSignature() {
		return signature;
	}

}
