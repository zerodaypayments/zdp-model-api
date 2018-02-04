package io.zdp.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class BalancesResponse implements Serializable {

	private List<BalanceResponse> balances = new ArrayList<>();

	public List<BalanceResponse> getBalances() {
		return balances;
	}

	public void setBalances(List<BalanceResponse> balances) {
		this.balances = balances;
	}

}
