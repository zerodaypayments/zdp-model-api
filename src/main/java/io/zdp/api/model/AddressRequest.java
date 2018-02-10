package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AddressRequest implements Serializable {

	private byte[] publicKey;

	public byte[] getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(byte[] publicKey) {
		this.publicKey = publicKey;
	}

}
