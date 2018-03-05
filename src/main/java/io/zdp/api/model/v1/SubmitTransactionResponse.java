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

	private String error = StringUtils.EMPTY;

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

	public String getUuid() {
		return uuid.toUpperCase();
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TransferResponse [error=" + error + ", submitted=" + submitted + ", txUuid=" + txUuid + "]";
	}

	@Override
	public String getType() {
		return "submit-transaction";
	}

}