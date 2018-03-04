package io.zdp.api.model;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class AccountRequest implements Serializable {

	private String publicKey;

	private byte[] signedAddress;

	public AccountRequest() {
		super();
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public byte[] getSignedAddress() {
		return signedAddress;
	}

	public void setSignedAddress(byte[] signedAddress) {
		this.signedAddress = signedAddress;
	}

	@Override
	public String toString() {
		return "AccountRequest [publicKey=" + publicKey + ", signedAddress=" + Arrays.toString(signedAddress) + "]";
	}

}
