package io.zdp.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

@SuppressWarnings("serial")
public class TransferRequest implements Serializable {

	private String fromAddress;

	private String toAddress;

	private BigDecimal amount;

	private String senderReference;

	private String recipientReference;

	private Date date;

	// Signed SHA-512 of "from + to" combination
	private byte[] signature;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSenderReference() {
		return senderReference;
	}

	public void setSenderReference(String senderReference) {
		this.senderReference = senderReference;
	}

	public String getRecipientReference() {
		return recipientReference;
	}

	public void setRecipientReference(String recipientReference) {
		this.recipientReference = recipientReference;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "TransferRequest [fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", amount=" + amount + ", senderReference=" + senderReference + ", recipientReference=" + recipientReference + ", date=" + date + ", signature=" + Arrays.toString(signature) + "]";
	}

}
