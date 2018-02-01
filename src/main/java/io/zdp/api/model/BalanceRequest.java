package io.zdp.api.model;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class BalanceRequest implements Serializable {

	private byte[] publicKey;

	private byte[] signedAddress;

	public BalanceRequest() {
		super();
	}

	public byte[] getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(byte[] publicKey) {
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
		return "BalanceRequest [publicKey=" + Arrays.toString(publicKey) + ", signedAddress=" + Arrays.toString(signedAddress) + "]";
	}

}
