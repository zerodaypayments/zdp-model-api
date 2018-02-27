package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PingResponse implements Serializable {

	private long time;

	public PingResponse() {
		super();
	}

	public PingResponse(long time) {
		super();
		this.time = time;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "PingResponse [time=" + time + "]";
	}

}