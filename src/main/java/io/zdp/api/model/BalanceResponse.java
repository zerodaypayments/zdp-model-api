package io.zdp.api.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class BalanceResponse implements Serializable {

	private String address;

	private Date date = new Date();

	private double balance;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
