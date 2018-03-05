package io.zdp.api.model.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * Current network fee
 */
@SuppressWarnings("serial")
public class FeeResponse extends BaseResponseObject {

	private String fee = StringUtils.EMPTY;

	public FeeResponse() {
		super();
	}

	public FeeResponse(String v) {
		this();
		this.fee = v;
	}

	@Override
	public String getType() {
		return "fee";
	}

	public String getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return "FeeResponse [getUuid()=" + getUuid() + ", getDate()=" + getDate() + ", getIsoDate()=" + getIsoDate()
				+ ", getFee()=" + getFee() + "]";
	}

}