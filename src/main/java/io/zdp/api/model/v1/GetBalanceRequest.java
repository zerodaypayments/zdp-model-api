package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetBalanceRequest implements Serializable {

	private String publicKey;

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Override
	public String toString() {
		return "GetBalanceRequest [publicKey=" + publicKey + "]";
	}

}
