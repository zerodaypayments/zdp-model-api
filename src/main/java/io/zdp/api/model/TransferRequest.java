package io.zdp.api.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class TransferRequest implements Serializable {

	private byte[] publicKey;

	private String fromAddress;

	private String toAddress;

	private String amount;

	private String memo;

	private Date date;

	// fromAddress + amount + toAddress signed by "from" account holder 
	private byte[] signature;

	public byte[] getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(byte[] publicKey) {
		this.publicKey = publicKey;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "TransferRequest [fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", amount=" + amount + ", memo=" + memo + ", date=" + date + "]";
	}

}
