package io.zdp.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SuppressWarnings("serial")
public class TransactionHeadersResponse extends AccountRequest {

	public static class Transaction implements Serializable {
		private String uuid;
		private Date date;
		private String amount;

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

		@Override
		public String toString() {
			return "Transaction [uuid=" + uuid + ", date=" + date + ", amount=" + amount + "]";
		}

	}

	private List<Transaction> transactions = new ArrayList<>();

	public List<Transaction> getTransactions() {
		return transactions;
	}

	@Override
	public String toString() {
		return "TransactionsResponse [transactions=" + transactions + "]";
	}

}