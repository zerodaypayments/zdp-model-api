package io.zdp.api.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class TransferDetails implements Serializable {

	private String uuid;

	private Date date;

	private double amount;

	private double fee;

	private double totalAmount;

	private String from;

	private String to;

	private String senderRef;

	private String recepientRef;

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
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

	public String getSenderRef() {
		return senderRef;
	}

	public void setSenderRef(String senderRef) {
		this.senderRef = senderRef;
	}

	public String getRecepientRef() {
		return recepientRef;
	}

	public void setRecepientRef(String recepientRef) {
		this.recepientRef = recepientRef;
	}

	@Override
	public String toString() {
		return "TransactionDetailsResponse [uuid=" + uuid + ", date=" + date + ", amount=" + amount + ", fee=" + fee
				+ ", totalAmount=" + totalAmount + ", from=" + from + ", to=" + to + ", senderRef=" + senderRef
				+ ", recepientRef=" + recepientRef + "]";
	}

}
