package io.zdp.api.model.v1;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class CountTransactionsRequest implements Serializable {

	private String publicKey;

	private byte[] signature;

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "CountTransactionsRequest [publicKey=" + publicKey + ", signature=" + Arrays.toString(signature) + "]";
	}

}
