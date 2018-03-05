package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetAddressRequest implements Serializable {

	private String publicKey;

	private byte[] signature;

	public GetAddressRequest() {
		super();
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Override
	public String toString() {
		return "GetAddressRequest [publicKey=" + publicKey + "]";
	}

}
