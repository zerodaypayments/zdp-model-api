package io.zdp.api.model.v1;

import java.io.Serializable;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

@SuppressWarnings("serial")
public abstract class BaseResponseObject implements Serializable {

	public abstract String getType();

	protected String uuid;

	protected Date date;

	protected String isoDate;
	
	private static final Random rand = new Random(System.currentTimeMillis());

	{
		// UUID
		uuid = new UUID(rand.nextLong(), rand.nextLong()).toString();

		// Date (time in ms since 1970)
		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);

		date = Date.from(utc.toInstant());

		// ISO date
		isoDate = DateTimeFormatter.ISO_DATE_TIME.format(utc);
	}

	public String getUuid() {
		return uuid;
	}

	public Date getDate() {
		return date;
	}

	public String getIsoDate() {
		return isoDate;
	}
	
}
