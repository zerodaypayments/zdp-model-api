package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetBalanceRequest implements Serializable {

	private String accountUuid;

	public String getAccountUuid() {
		return accountUuid;
	}

	public void setAccountUuid(String accountUuid) {
		this.accountUuid = accountUuid;
	}

	@Override
	public String toString() {
		return "GetBalanceRequest [accountUuid=" + accountUuid + "]";
	}

}
