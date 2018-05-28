package io.zdp.api.model;

import java.math.BigDecimal;

import io.zdp.api.model.v1.GetBalanceResponse;

public class TestGetBalanceResponse extends BaseModelTest {

	public void test ( ) throws Exception {

		System.out.println( objectMapper.writeValueAsString( new GetBalanceResponse( BigDecimal.TEN.toPlainString(), 123 ) ) );

	}

}
