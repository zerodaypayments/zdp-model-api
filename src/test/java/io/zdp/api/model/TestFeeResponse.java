package io.zdp.api.model;

import java.math.BigDecimal;

import io.zdp.api.model.v1.FeeResponse;

public class TestFeeResponse extends BaseModelTest {
	
	public void test() throws Exception {
		
		System.out.println(objectMapper.writeValueAsString(new FeeResponse()));
		System.out.println(objectMapper.writeValueAsString(new FeeResponse(BigDecimal.ONE.toPlainString())));
		
	}

}
