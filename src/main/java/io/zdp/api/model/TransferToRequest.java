package io.zdp.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class TransferToRequest implements Serializable {

	private List<String> addresses = new ArrayList<>();

	public TransferToRequest() {
		super();
	}

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "TransferToRequest [address=" + addresses + "]";
	}

}
