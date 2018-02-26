package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Keys implements Serializable {

	private byte[] privateKey;

	private byte[] publicKey;

	public byte[] getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(byte[] privateKey) {
		this.privateKey = privateKey;
	}

	public byte[] getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(byte[] publicKey) {
		this.publicKey = publicKey;
	}

}
