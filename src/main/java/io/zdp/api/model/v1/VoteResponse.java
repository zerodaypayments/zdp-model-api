package io.zdp.api.model.v1;

import java.nio.charset.StandardCharsets;

import org.bouncycastle.util.encoders.Hex;

/**
 * Prepare transfer response
 */
@SuppressWarnings("serial")
public class VoteResponse extends BaseResponseObject {

	public static enum Status {
		APPROVED, //
		APPROVED_NO_ACCOUNT_ON_FILE, //
		REJECTED_ACCOUNT_IN_PROGRESS //
	}

	private String balance;

	private long height;

	private byte[] transferChainHash;

	private Status status;

	private byte[] signedRequestUuid;

	private byte[] requestUuid;

	public byte[] toHashData() {
		return (balance + " " + height + " " + Hex.toHexString(requestUuid) + " " + Hex.toHexString(transferChainHash) + " " + status).getBytes(StandardCharsets.UTF_8);
	}

	public byte[] getSignedRequestUuid() {
		return signedRequestUuid;
	}

	public byte[] getRequestUuid() {
		return requestUuid;
	}

	public void setRequestUuid(byte[] requestUuid) {
		this.requestUuid = requestUuid;
	}

	public void setSignedRequestUuid(byte[] signedRequestUuid) {
		this.signedRequestUuid = signedRequestUuid;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public byte[] getTransferChainHash() {
		return transferChainHash;
	}

	public void setTransferChainHash(byte[] transferChainHash) {
		this.transferChainHash = transferChainHash;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String getType() {
		return "vote-response";
	}

}
