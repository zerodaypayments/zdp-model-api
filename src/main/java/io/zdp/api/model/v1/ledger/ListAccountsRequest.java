package io.zdp.api.model.v1.ledger;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ListAccountsRequest implements Serializable {

	public static enum SortBy {
		BALANCE, DATE
	}

	public static enum SortDirection {
		ASC, ESC
	}

	private SortBy sortBy;

	private SortDirection sortDirection;

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

	public SortBy getSortBy() {
		return sortBy;
	}

	public void setSortBy(SortBy sortBy) {
		this.sortBy = sortBy;
	}

	@Override
	public String toString() {
		return "ListWalletsRequest [sortBy=" + sortBy + ", sortDirection=" + sortDirection + ", page=" + page
				+ ", pageSize=" + pageSize + "]";
	}

}
