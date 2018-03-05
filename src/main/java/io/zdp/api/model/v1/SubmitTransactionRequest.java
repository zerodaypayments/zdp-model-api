package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubmitTransactionRequest implements Serializable {

	private String publicKey;

	private String fromAddress;

	private String toAddress;

	private String amount;

	private String memo;

	private String requestUuid;

	// fromAddress + amount + toAddress signed by "publicKey" account holder
	private byte[] signature;

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
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

	public String getRequestUuid() {
		return requestUuid;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	@Override
	public String toString() {
		return "TransferRequest [publicKey=" + publicKey + ", fromAddress=" + fromAddress + ", toAddress=" + toAddress + ", amount=" + amount + ", memo=" + memo + ", requestUuid=" + requestUuid + "]";
	}

}
