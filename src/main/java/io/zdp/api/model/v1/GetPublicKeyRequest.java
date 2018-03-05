package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetPublicKeyRequest implements Serializable {

	private String privateKey;

	public String getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	@Override
	public String toString() {
		return "GetPublicKeyRequest [privateKey=" + privateKey + "]";
	}

}
