package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class ListTransactionsRequest extends CountTransactionsRequest {

	private int page;

	private int pageSize;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "ListTransactionsRequest [page=" + page + ", pageSize=" + pageSize + ", getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getMemo()=" + getMemo() + ", getPublicKey()=" + getPublicKey() + "]";
	}

}
