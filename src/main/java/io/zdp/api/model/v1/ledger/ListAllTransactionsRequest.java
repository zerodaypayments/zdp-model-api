package io.zdp.api.model.v1.ledger;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ListAllTransactionsRequest implements Serializable {

	private Integer page;

	private Integer pageSize;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize > 100 ? 100 : pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return "ListAllTransactionsRequest [page=" + page + ", pageSize=" + pageSize + "]";
	}

}
