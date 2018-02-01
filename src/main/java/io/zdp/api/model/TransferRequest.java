package io.zdp.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

@SuppressWarnings("serial")
public class TransferRequest implements Serializable {

	private byte[] publicKey;

	private byte[] signedFromAddress;

	private byte[] toAddressEncrypted;

	private BigDecimal amount;

	private String senderReference;

	private String recipientReference;

	private Date date;

	private byte[] signature;

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public byte[] getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(byte[] publicKey) {
		this.publicKey = publicKey;
	}

	public byte[] getSignedFromAddress() {
		return signedFromAddress;
	}

	public void setSignedFromAddress(byte[] signedFromAddress) {
		this.signedFromAddress = signedFromAddress;
	}

	public byte[] getToAddressEncrypted() {
		return toAddressEncrypted;
	}

	public void setToAddressEncrypted(byte[] toAddressEncrypted) {
		this.toAddressEncrypted = toAddressEncrypted;
	}

	@Override
	public String toString() {
		return "TransferRequest [publicKey=" + Arrays.toString(publicKey) + ", signedFromAddress=" + Arrays.toString(signedFromAddress) + ", toAddressEncrypted=" + Arrays.toString(toAddressEncrypted) + ", amount=" + amount + ", senderReference=" + senderReference + ", recipientReference=" + recipientReference + ", date=" + date + "]";
	}

}
