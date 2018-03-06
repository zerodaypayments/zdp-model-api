package io.zdp.api.model.v1;

import java.io.Serializable;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

@SuppressWarnings("serial")
public abstract class BaseResponseObject implements Serializable {

	@JsonProperty("response-type")
	public abstract String getType();

	protected String uuid;

	protected Date date;

	protected String isoDate;
	
	private static final Random rand = new Random(System.currentTimeMillis());

	{
		// UUID
		uuid = DigestUtils.md5Hex(Long.toHexString(rand.nextLong())).toUpperCase();

		// Date (time in ms since 1970)
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);

		date = Date.from(utc.toInstant());

		// ISO date
		isoDate = DateTimeFormatter.ISO_DATE_TIME.format(utc);
	}

	@JsonProperty("response-uuid")
	public String getUuid() {
		return uuid;
	}

	@JsonProperty("response-time")
	public Date getDate() {
		return date;
	}

	@JsonProperty("response-iso-date")
	public String getIsoDate() {
		return isoDate;
	}
	
}
