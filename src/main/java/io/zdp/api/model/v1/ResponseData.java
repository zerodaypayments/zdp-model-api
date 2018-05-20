package io.zdp.api.model.v1;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.util.encoders.Hex;

import io.zdp.crypto.Hashing;
import io.zdp.crypto.Random;

@SuppressWarnings("serial")
public class ResponseData implements Serializable {

	protected String responseUuid;

	protected long responseDate;

	protected String responseIsoDate;

	private static String nodeUuid;

	private String comment;

	static {
		try {
			nodeUuid = Hex.toHexString(Hashing.ripemd160(InetAddress.getLocalHost().getHostName())).toUpperCase();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	{

		// UUID
		responseUuid = DigestUtils.md5Hex(Long.toHexString(Random.getSecureRandom().nextLong())).toUpperCase();

		// Date (time in ms since 1970)
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);

		responseDate = utc.toEpochSecond();

		// ISO date
		responseIsoDate = DateTimeFormatter.ISO_DATE_TIME.format(utc);

	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNode() {
		return nodeUuid;
	}

	public String getUuid() {
		return responseUuid;
	}

	public long getDate() {
		return responseDate;
	}

	public String getIsoDate() {
		return responseIsoDate;
	}

	@Override
	public String toString() {
		return "ResponseData [getComment()=" + getComment() + ", getNode()=" + getNode() + ", getUuid()=" + getUuid() + ", getDate()=" + getDate() + ", getIsoDate()=" + getIsoDate() + "]";
	}

}
