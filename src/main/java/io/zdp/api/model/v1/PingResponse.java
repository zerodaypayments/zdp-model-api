package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class PingResponse extends BaseResponseObject {

	public PingResponse() {
		super();
	}

	@Override
	public String getType() {
		return "ping";
	}

	@Override
	public String toString() {
		return "PingResponse [getUuid()=" + getUuid() + ", getDate()=" + getDate() + ", getIsoDate()=" + getIsoDate()
				+ "]";
	}

}