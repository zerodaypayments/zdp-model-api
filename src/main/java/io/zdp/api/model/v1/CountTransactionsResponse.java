package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class CountTransactionsResponse extends BaseResponseObject {

	private long count;

	public CountTransactionsResponse() {
		super();
	}

	public CountTransactionsResponse(long count) {
		super();
		this.count = count;
	}

	public long getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "CountTransfersResponse [count=" + count + "]";
	}

	@Override
	public String getType() {
		return "count-transactions";
	}

}