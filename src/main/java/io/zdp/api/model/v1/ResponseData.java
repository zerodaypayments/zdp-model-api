package io.zdp.api.model.v1;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

import org.apache.commons.codec.digest.DigestUtils;
import org.bouncycastle.util.encoders.Hex;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.zdp.common.crypto.CryptoUtils;

@SuppressWarnings("serial")
public class ResponseData implements Serializable {

	protected String responseUuid;

	protected Date responseDate;

	protected String responseIsoDate;
	
	private static final Random rand = new Random(System.currentTimeMillis());
	
	private static String nodeUuid;
	
	static {
		try {
			nodeUuid = Hex.toHexString(CryptoUtils.ripemd160(InetAddress.getLocalHost().getHostName())).toUpperCase();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	{
		// UUID
		responseUuid = DigestUtils.md5Hex(Long.toHexString(rand.nextLong())).toUpperCase();

		// Date (time in ms since 1970)
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);

		responseDate = Date.from(utc.toInstant());

		// ISO date
		responseIsoDate = DateTimeFormatter.ISO_DATE_TIME.format(utc);
	}
	
	@JsonProperty("node")
	public String getNode() {
		return nodeUuid;
	}


	@JsonProperty("uuid")
	public String getUuid() {
		return responseUuid;
	}

	@JsonProperty("time")
	public Date getDate() {
		return responseDate;
	}

	@JsonProperty("iso-date")
	public String getIsoDate() {
		return responseIsoDate;
	}
	
	

}
