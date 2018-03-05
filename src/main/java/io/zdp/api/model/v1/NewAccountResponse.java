package io.zdp.api.model.v1;

import org.apache.commons.lang3.StringUtils;

/**
 * Get new account key pair
 */
@SuppressWarnings("serial")
public class NewAccountResponse extends BaseResponseObject {

	private String privateKey = StringUtils.EMPTY;

	private String publicKey = StringUtils.EMPTY;

	public NewAccountResponse() {
		super();
	}

	public NewAccountResponse(String privateKey, String publicKey) {
		super();
		this.privateKey = privateKey;
		this.publicKey = publicKey;
	}

	public String getPrivateKey() {
		return privateKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Override
	public String getType() {
		return "new-account";
	}

	@Override
	public String toString() {
		return "NewAccountResponse [getPrivateKey()=" + getPrivateKey() + ", getPublicKey()=" + getPublicKey()
				+ ", getType()=" + getType() + ", getUuid()=" + getUuid() + ", getDate()=" + getDate()
				+ ", getIsoDate()=" + getIsoDate() + "]";
	}

}
