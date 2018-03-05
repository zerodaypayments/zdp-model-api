package io.zdp.api.model.v1;

@SuppressWarnings("serial")
public class PublicKeyResponse extends BaseResponseObject {

	private String publicKey;

	public PublicKeyResponse() {
		super();
	}

	public PublicKeyResponse(String publicKey) {
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
		return "public-key-response";
	}

	@Override
	public String toString() {
		return "PublicKeyResponse [getPublicKey()=" + getPublicKey() + ", getType()=" + getType() + ", getUuid()="
				+ getUuid() + ", getDate()=" + getDate() + ", getIsoDate()=" + getIsoDate() + "]";
	}

}