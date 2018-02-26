package io.zdp.api.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class FeeResponse implements Serializable {

	private String fee;

	private Date date = new Date();

	public FeeResponse() {
		super();
	}

	public FeeResponse(String v) {
		super();
		this.fee = v;
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

}