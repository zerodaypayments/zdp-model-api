package io.zdp.api.model;

import java.math.BigDecimal;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;

import io.zdp.api.model.v1.ListTransactionsResponse;
import io.zdp.api.model.v1.ListTransactionsResponse.Transaction;

public class TestGetTransactionsResponse extends BaseModelTest {

	public void test() throws Exception {

		ListTransactionsResponse resp = new ListTransactionsResponse();

		ZonedDateTime utc = ZonedDateTime.now(ZoneOffset.UTC);

		for (int i = 0; i < 4; i++) {
			Transaction tx = new Transaction();
			tx.setAmount(BigDecimal.TEN.toPlainString());
			tx.setDate(new Date());
			tx.setUuid(DigestUtils.sha256Hex(UUID.randomUUID().toString()));

			resp.getTransactions().add(tx);
		}

		System.out.println(objectMapper.writeValueAsString(resp));

	}

}
