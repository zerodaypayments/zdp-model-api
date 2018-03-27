package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class CountResponse extends BaseResponseObject {

	private long count;

	public CountResponse() {
		super();
	}

	public CountResponse(long count) {
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