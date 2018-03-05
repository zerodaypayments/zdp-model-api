package io.zdp.api.model;

import java.math.BigDecimal;

import io.zdp.api.model.v1.PingResponse;

public class TestPingResponse extends BaseModelTest {
	
	public void test() throws Exception {
		
		System.out.println(objectMapper.writeValueAsString(new PingResponse()));
		
	}

}
