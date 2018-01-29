package io.zdp.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;

@SuppressWarnings("serial")
public class AddressDetailsResponse implements Serializable {

	private String secret;

	private byte[] privateKey;

	private String address;

	private BigDecimal balance;

	public AddressDetailsResponse() {
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
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

	@Override
	public String toString() {
		return "AddressDetailsResponse [secret=" + secret + ", privateKey=" + Arrays.toString(privateKey) + ", address=" + address + ", balance=" + balance + "]";
	}

}