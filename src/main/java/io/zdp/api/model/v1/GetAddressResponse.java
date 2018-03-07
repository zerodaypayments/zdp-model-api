package io.zdp.api.model.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * Current network fee
 */
@SuppressWarnings("serial")
public class GetAddressResponse extends BaseResponseObject {

	private String address = StringUtils.EMPTY;

	public GetAddressResponse() {
		super();
	}

	public GetAddressResponse(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String getType() {
		return "get-address";
	}

	@Override
	public String toString() {
		return "GetAddressResponse [getAddress()=" + getAddress() + ", getType()=" + getType() + "]";
	}

}