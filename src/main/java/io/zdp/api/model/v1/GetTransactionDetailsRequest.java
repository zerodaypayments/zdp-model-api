package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class GetTransactionDetailsRequest implements Serializable {

	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Override
	public String toString() {
		return "GetTransferDetailsRequest [uuid=" + uuid + "]";
	}

}
