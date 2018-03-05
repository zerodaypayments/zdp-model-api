package io.zdp.api.model.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * Get account balance by public key
 */
@SuppressWarnings("serial")
public class GetBalanceResponse extends BaseResponseObject {

	private String amount = StringUtils.EMPTY;

	public GetBalanceResponse() {
		super();
	}

	public GetBalanceResponse(String v) {
		this();
		this.amount = v;
	}

	@Override
	public String getType() {
		return "get-balance";
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "GetBalanceResponse [amount=" + amount + "]";
	}

}