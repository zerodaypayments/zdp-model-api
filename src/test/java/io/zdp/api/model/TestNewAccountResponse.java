package io.zdp.api.model;

import java.math.BigInteger;
import java.security.KeyPair;

import org.bouncycastle.util.encoders.Hex;

import io.zdp.api.model.v1.GetNewAccountResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestNewAccountResponse extends BaseModelTest {

	public void test() throws Exception {

		BigInteger priv = CryptoUtils.generateECPrivateKey();
		byte[] pub = CryptoUtils.getPublicKeyFromPrivate( priv, true );

		String privHex = Hex.toHexString( priv.toByteArray() );
		String pubHex = Hex.toHexString( pub );

		System.out.println( objectMapper.writeValueAsString( new GetNewAccountResponse( privHex, pubHex ) ) );

	}

}
