package io.zdp.api.model.v1;

import java.io.Serializable;

import io.zdp.crypto.mnemonics.Mnemonics.Language;

/**
 * Get new account key pair
 */
@SuppressWarnings("serial")
public class GetNewAccountRequest implements Serializable {

	private Language language = Language.ENGLISH;

	private String curve;

	public String getCurve() {
		return curve;
	}

	public void setCurve(String curve) {
		this.curve = curve;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "GetNewAccountRequest [language=" + language + ", curve=" + curve + "]";
	}

}
