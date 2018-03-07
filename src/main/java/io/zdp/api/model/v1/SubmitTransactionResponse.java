package io.zdp.api.model.v1;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("serial")
public class SubmitTransactionResponse extends BaseResponseObject {

	public static final String ERROR_INVALID_TO_ADDRESS = "INVALID_TO_ADDRESS";
	public static final String ERROR_INVALID_FROM_ADDRESS = "INVALID_FROM_ADDRESS";
	public static final String ERROR_INVALID_ACCOUNT = "INVALID_ACCOUNT";
	public static final String ERROR_INVALID_AMOUNT = "INVALID_AMOUNT";
	public static final String ERROR_UNAUTHORIZED = "UNAUTHORIZED";
	public static final String ERROR_INSUFFICIENT_FUNDS = "INSUFFICIENT_FUNDS";
	public static final String ERROR_SYSTEM = "SYSTEM_ERROR";
	public static final String ERROR_INACTIVE_ADDRESS = "INACTIVE_ADDRESS";

	private String error;

	private boolean submitted = true;

	private String txUuid;

	public static SubmitTransactionResponse error(String msg) {
		SubmitTransactionResponse resp = new SubmitTransactionResponse();
		resp.setError(msg);
		resp.setSubmitted(false);
		return resp;
	}

	public String getTxUuid() {
		return txUuid;
	}

	public void setTxUuid(String txUuid) {
		this.txUuid = txUuid;
	}

	public boolean isSubmitted() {
		return submitted;
	}

	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "SubmitTransactionResponse [getTxUuid()=" + getTxUuid() + ", isSubmitted()=" + isSubmitted() + ", getError()=" + getError() + ", getType()=" + getType() + ", getMetadata()=" + getMetadata() + "]";
	}

	@Override
	public String getType() {
		return "submit-transaction";
	}

}