package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AddressDetailsResponse implements Serializable {

	private String secret;

	private byte[] privateKey;

	private String address;

	private double balance;

	public AddressDetailsResponse() {
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public byte[] getPrivateKey() {
		return privateKey;
	}

	public void setPrivateKey(byte[] privateKey) {
		this.privateKey = privateKey;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}