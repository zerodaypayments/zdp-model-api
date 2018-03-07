package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class GetPublicKeyResponse extends BaseResponseObject {

	private String publicKey;

	public GetPublicKeyResponse() {
		super();
	}

	public GetPublicKeyResponse(String publicKey) {
		super();
		this.publicKey = publicKey;
	}

	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Override
	public String getType() {
		return "get-public-key";
	}

	@Override
	public String toString() {
		return "GetPublicKeyResponse [getPublicKey()=" + getPublicKey() + ", getType()=" + getType() + "]";
	}

}