package io.zdp.api.model;

import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;

import org.bouncycastle.util.encoders.Hex;

import io.zdp.api.model.v1.GetPublicKeyResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestPublicKeyResponse extends BaseModelTest {

	public void test() throws Exception {

		/*
		 * "privateKey" :
		 * "7e5564b3f7ab7e48924d4b2549d62244d10b6693641091c021f774016f89c62b",
		 * "publicKey" :
		 * "03a5d3c374db57ff1102e24fb0b053881eab001613a147fb4f44035bf85254587f",
		 * 
		 */

		String privHex = "7e5564b3f7ab7e48924d4b2549d62244d10b6693641091c021f774016f89c62b";

		byte[] pubKey = CryptoUtils.getPublicKeyFromPrivate(new BigInteger(Hex.decode(privHex)), true);

		String v = Hex.toHexString(pubKey);

		System.out.println(objectMapper.writeValueAsString(new GetPublicKeyResponse(v)));

		assertEquals("03a5d3c374db57ff1102e24fb0b053881eab001613a147fb4f44035bf85254587f", v);

	}

}
