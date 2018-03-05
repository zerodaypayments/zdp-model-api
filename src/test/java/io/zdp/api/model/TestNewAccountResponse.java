package io.zdp.api.model;

import java.math.BigInteger;

import org.bitcoinj.core.Base58;

import io.zdp.api.model.v1.GetNewAccountResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestNewAccountResponse extends BaseModelTest {

	public void test() throws Exception {

		BigInteger priv = CryptoUtils.generateECPrivateKey();
		byte[] pub = CryptoUtils.getPublicKeyFromPrivate(priv, true);

		String privHex = Base58.encode(priv.toByteArray());
		String pubHex = Base58.encode(pub);

		System.out.println(objectMapper.writeValueAsString(new GetNewAccountResponse(privHex, pubHex)));

	}

}
