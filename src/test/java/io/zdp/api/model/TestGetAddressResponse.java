package io.zdp.api.model;

import io.zdp.api.model.v1.GetAddressResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestGetAddressResponse extends BaseModelTest {

	public void test() throws Exception {

		String pubHex = "xAXGxrhdz1EU8PQxLuE75tzBtmaHTpQo32NHAqBfhS6v";

		String address = CryptoUtils.generateUniqueAddressByPublicKey58(pubHex);

		System.out.println(objectMapper.writeValueAsString(new GetAddressResponse(address)));

	}

}
