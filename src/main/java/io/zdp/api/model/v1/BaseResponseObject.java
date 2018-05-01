package io.zdp.api.model.v1;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class BaseResponseObject implements Serializable {

	public abstract String getType();

	protected ResponseData responseMetadata = new ResponseData();

	public ResponseData getResponseMetadata() {
		return responseMetadata;
	}

}
