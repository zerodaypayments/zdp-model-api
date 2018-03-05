package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class CountTransactionsResponse extends BaseResponseObject {

	private long count;

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
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