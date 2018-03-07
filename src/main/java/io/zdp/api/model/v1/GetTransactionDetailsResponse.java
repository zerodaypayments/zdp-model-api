package io.zdp.api.model.v1;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public class GetTransactionDetailsResponse extends BaseResponseObject {

	private String txUuid;

	private Date date;

	private String amount;

	private String from;

	private String to;

	private String memo;

	private String fee;

	@JsonProperty("tx-uuid")
	public String getTxUuid() {
		return txUuid;
	}

	public void setTxUuid(String txUuid) {
		this.txUuid = txUuid;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
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

	@Override
	public String toString() {
		return "GetTransactionDetailsResponse [txUuid=" + txUuid + ", date=" + date + ", amount=" + amount + ", from=" + from + ", to=" + to + ", memo=" + memo + ", fee=" + fee + "]";
	}

	@Override
	public String getType() {
		return "get-transaction-details";
	}

}