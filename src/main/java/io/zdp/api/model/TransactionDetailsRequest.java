package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TransactionDetailsRequest implements Serializable {

	private String uuid;

	public TransactionDetailsRequest() {
		super();
	}

	public TransactionDetailsRequest(String uuid) {
		super();
		this.uuid = uuid;
	}

	public String getUuid() {
		return uuid;
	}

}
