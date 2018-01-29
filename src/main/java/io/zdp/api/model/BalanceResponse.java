package io.zdp.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("serial")
public class BalanceResponse implements Serializable {

	private String address;

	private Date date = new Date();

	private BigDecimal balance;

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

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BalanceResponse [address=" + address + ", date=" + date + ", balance=" + balance + "]";
	}

}
