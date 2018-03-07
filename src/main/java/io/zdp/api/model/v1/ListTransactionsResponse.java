package io.zdp.api.model.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class ListTransactionsResponse extends BaseResponseObject {

	public static class Transaction implements Serializable {

		private String uuid;

		private String time;

		private String amount;

		public String getUuid() {
			return uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		@Override
		public String toString() {
			return "Transaction [uuid=" + uuid + ", time=" + time + ", amount=" + amount + "]";
		}

	}

	private List<Transaction> transactions = new ArrayList<>();

	public List<Transaction> getTransactions() {
		return transactions;
	}

	@Override
	public String toString() {
		return "ListTransactionsResponse [getTransactions()=" + getTransactions() + ", getType()=" + getType() + "]";
	}

	@Override
	public String getType() {
		return "list-transactions";
	}

}