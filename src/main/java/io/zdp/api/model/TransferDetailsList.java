package io.zdp.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class TransferDetailsList implements Serializable {

	private List<TransferDetails> details = new ArrayList<>();

	public List<TransferDetails> getDetails() {
		return details;
	}

	public void setDetails(List<TransferDetails> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "TransferDetailsList [details=" + details + "]";
	}

}
