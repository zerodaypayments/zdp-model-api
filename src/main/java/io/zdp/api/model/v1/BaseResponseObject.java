package io.zdp.api.model.v1;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public abstract class BaseResponseObject implements Serializable {

	@JsonProperty("response-type")
	public abstract String getType();

	protected ResponseData metadata = new ResponseData();

	public ResponseData getMetadata() {
		return metadata;
	}

}
