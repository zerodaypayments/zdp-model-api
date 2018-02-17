package io.zdp.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@SuppressWarnings("serial")
public class BalanceResponse implements Serializable {

	private Date date = new Date();

	private String balance;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getBalance() {
		return balance;
	}

	public BigDecimal getBalanceAsBigDecimal() {
		return new BigDecimal(balance);
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance.toPlainString();
	}

	@Override
	public String toString() {
		return "BalanceResponse [date=" + date + ", balance=" + balance + "]";
	}

}
