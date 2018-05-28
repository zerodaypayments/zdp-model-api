package io.zdp.api.model.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * Get account balance by public key
 */
@SuppressWarnings ( "serial" )
public class GetBalanceResponse extends BaseResponseObject {

	private String amount = StringUtils.EMPTY;

	private long height;

	private byte [ ] chainHash = new byte [ ] {};

	public GetBalanceResponse ( ) {
		super();
	}

	public GetBalanceResponse ( String amount, long height ) {
		super();
		this.amount = amount;
		this.height = height;
	}

	public byte [ ] getChainHash ( ) {
		return chainHash;
	}

	public void setChainHash ( byte [ ] chainHash ) {
		this.chainHash = chainHash;
	}

	public long getHeight ( ) {
		return height;
	}

	public void setHeight ( long height ) {
		this.height = height;
	}

	@Override
	public String getType ( ) {
		return "get-balance";
	}

	public String getAmount ( ) {
		return amount;
	}

	public void setAmount ( String amount ) {
		this.amount = amount;
	}

	@Override
	public String toString ( ) {
		return "GetBalanceResponse [amount=" + amount + ", height=" + height + "]";
	}

}