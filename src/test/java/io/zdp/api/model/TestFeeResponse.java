package io.zdp.api.model;

import java.math.BigDecimal;

import io.zdp.api.model.v1.GetFeeResponse;

public class TestFeeResponse extends BaseModelTest {
	
	public void test() throws Exception {
		
		System.out.println(objectMapper.writeValueAsString(new GetFeeResponse()));
		System.out.println(objectMapper.writeValueAsString(new GetFeeResponse(BigDecimal.ONE.toPlainString())));
		
	}

}
