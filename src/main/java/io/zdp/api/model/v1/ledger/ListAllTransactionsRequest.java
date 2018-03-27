package io.zdp.api.model.v1.ledger;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ListAllTransactionsRequest implements Serializable {

	private int page;

	private int pageSize;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize > 100 ? 100 : pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "ListAllTransactionsRequest [page=" + page + ", pageSize=" + pageSize + "]";
	}

}
