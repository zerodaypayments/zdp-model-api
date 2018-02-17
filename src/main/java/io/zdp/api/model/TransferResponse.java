package io.zdp.api.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("serial")
public class TransferResponse implements Serializable {

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

	private String uuid = StringUtils.EMPTY;

	private Date date = new Date();

	public static TransferResponse error(String msg) {
		TransferResponse resp = new TransferResponse();
		resp.setError(msg);
		resp.setSubmitted(false);
		return resp;
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
		return "TransferResponse [error=" + error + ", submitted=" + submitted + ", uuid=" + uuid + ", date=" + date + "]";
	}

}