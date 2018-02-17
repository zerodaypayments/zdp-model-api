package io.zdp.api.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class TransferDetails implements Serializable {

	private String uuid;

	private Date date;

	private String amount;

	private String from;

	private String to;

	private String memo;

	private String error;

	private String fee;

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getUuid() {
		return uuid;
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

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "TransferDetails [uuid=" + uuid + ", date=" + date + ", amount=" + amount + ", from=" + from + ", to=" + to + ", memo=" + memo + ", error=" + error + ", fee=" + fee + "]";
	}

}
