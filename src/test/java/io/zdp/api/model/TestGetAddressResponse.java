package io.zdp.api.model;

import io.zdp.api.model.v1.GetAddressResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestGetAddressResponse extends BaseModelTest {

	public void test() throws Exception {

		String pubHex = "03a5d3c374db57ff1102e24fb0b053881eab001613a147fb4f44035bf85254587f";

		String address = CryptoUtils.generateAccountUniqueAddress(pubHex);

		System.out.println(objectMapper.writeValueAsString(new GetAddressResponse(address)));

	}

}
