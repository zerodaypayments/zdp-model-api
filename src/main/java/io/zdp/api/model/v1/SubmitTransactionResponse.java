package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class SubmitTransactionResponse extends BaseResponseObject {

	public static final String ERROR_INVALID_TO_ACCOUNT = "INVALID_TO_ACCOUNT";
	public static final String ERROR_INVALID_FROM_ACCOUNT = "INVALID_FROM_ACCOUNT";
	public static final String ERROR_INVALID_AMOUNT = "INVALID_AMOUNT";
	public static final String ERROR_UNAUTHORIZED = "UNAUTHORIZED";
	public static final String ERROR_INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
	public static final String ERROR_SYSTEM = "SYSTEM_ERROR";

	private String error;

	private String uuid;

	public static SubmitTransactionResponse error(String msg) {
		SubmitTransactionResponse resp = new SubmitTransactionResponse();
		resp.setError(msg);
		return resp;
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