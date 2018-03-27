package io.zdp.api.model.v1.ledger;

import java.io.Serializable;

import io.zdp.api.model.v1.BaseResponseObject;

@SuppressWarnings("serial")
public class ListAccountsResponse extends BaseResponseObject {
	
	public static final class Wallet implements Serializable {
		
	}

	@Override
	public String getType() {
		return "list-wallets";
	}

}