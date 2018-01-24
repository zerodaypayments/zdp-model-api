package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AddressDetailsRequest implements Serializable {

	private String secret;

	public AddressDetailsRequest() {
		super();
	}

	public AddressDetailsRequest(String secret) {
		super();
		this.secret = secret;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

}