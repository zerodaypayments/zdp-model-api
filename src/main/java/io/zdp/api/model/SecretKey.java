package io.zdp.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class SecretKey implements Serializable {

	private String secretKey;

	private List<String> mnemonics = new ArrayList<>();

	public List<String> getMnemonics() {
		return mnemonics;
	}

	public SecretKey() {
		super();
	}

	public SecretKey(String seed) {
		super();
		this.secretKey = seed;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	@Override
	public String toString() {
		return "SecretKey [secretKey=" + secretKey + "]";
	}

}
