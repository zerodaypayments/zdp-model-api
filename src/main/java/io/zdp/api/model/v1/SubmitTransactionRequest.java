package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SubmitTransactionRequest implements Serializable {

	private String from;

	private String to;

	private String amount;

	private String memo;

	private String requestUuid;

	private byte[] signature;

	private String publicKey;

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

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
		return "SubmitTransactionRequest [from=" + from + ", to=" + to + ", amount=" + amount + ", memo=" + memo + ", requestUuid=" + requestUuid + "]";
	}

}
