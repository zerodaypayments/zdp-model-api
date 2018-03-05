package io.zdp.api.model.v1;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class ListTransactionsRequest implements Serializable {

	private String publicKey;

	private byte[] signature;

	private String from;

	private String to;

	private String memo;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

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
		return "GetTransactionsRequest [getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getMemo()=" + getMemo() + ", getPublicKey()=" + getPublicKey() + ", getSignature()=" + Arrays.toString(getSignature()) + "]";
	}

}
