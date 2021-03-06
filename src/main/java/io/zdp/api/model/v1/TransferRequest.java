package io.zdp.api.model.v1;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;

import io.zdp.crypto.Hashing;

@SuppressWarnings("serial")
public class TransferRequest implements Serializable {

	private String from;

	private String to;

	private String amount;

	private String memo;

	private String requestUuid;

	private byte[] signature;

	private String publicKey;

	private long time = System.currentTimeMillis();

	public byte[] getUniqueTransactionUuid() {
		return Hashing.hashTransactionSignature(getFrom() + getAmount() + getTo() + getMemo() + getRequestUuid() + time);
	}

	public String getPublicKey() {
		return publicKey;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAmount() {
		return amount;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getRequestUuid() {

		if (StringUtils.isBlank(requestUuid)) {
			requestUuid = UUID.randomUUID().toString();
		}

		return requestUuid;
	}

	public void setRequestUuid(String requestUuid) {
		this.requestUuid = requestUuid;
	}

	public byte[] getSignature() {
		return signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	public BigDecimal getAmountAsBigDecimal() {
		BigDecimal bd = new BigDecimal(getAmount());
		bd = bd.setScale(8, RoundingMode.CEILING);
		return bd;
	}

	@Override
	public String toString() {
		return "SubmitTransactionRequest [from=" + from + ", to=" + to + ", amount=" + amount + ", memo=" + memo + ", requestUuid=" + requestUuid + "]";
	}

}
