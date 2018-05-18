package io.zdp.api.model.v1;

import java.nio.charset.StandardCharsets;

@SuppressWarnings("serial")
public class TransferResponse extends BaseResponseObject {

	public static final String ERROR_INVALID_TO_ACCOUNT = "INVALID_TO_ACCOUNT";
	public static final String ERROR_INVALID_FROM_ACCOUNT = "INVALID_FROM_ACCOUNT";
	public static final String ERROR_INVALID_AMOUNT = "INVALID_AMOUNT";
	public static final String ERROR_UNAUTHORIZED = "UNAUTHORIZED";
	public static final String ERROR_INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
	public static final String ERROR_SYSTEM = "SYSTEM_ERROR";
	public static final String ERROR_TX_REPLAY = "TX_SUBMISSION_ERROR_4000";
	public static final String ERROR_TX_SIGNATURE_UNAUTHORIZED = "TX_SUBMISSION_ERROR_5000";
	
	public static final String ERROR_REJECTED = "REJECTED";

	private String error;

	private String uuid;

	public static TransferResponse error(String msg) {
		TransferResponse resp = new TransferResponse();
		resp.setError(msg);
		return resp;
	}

	public byte[] toHashData() {
		return (uuid + error).getBytes(StandardCharsets.UTF_8);
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "SubmitTransactionResponse [error=" + error + ", uuid=" + uuid + ", metadata=" + getResponseMetadata() + "]";
	}

	@Override
	public String getType() {
		return "submit-transaction";
	}

}