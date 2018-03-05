package io.zdp.api.model;

import java.security.KeyPair;

import org.bouncycastle.util.encoders.Hex;

import io.zdp.api.model.v1.NewAccountResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestNewAccountResponse extends BaseModelTest {
	
	public void test() throws Exception {
		
		KeyPair kp = CryptoUtils.generateECKeyPair();
		String pubHex = Hex.toHexString( kp.getPublic().getEncoded());
		String privHex = Hex.toHexString( kp.getPrivate().getEncoded());
		
		System.out.println(objectMapper.writeValueAsString(new NewAccountResponse(privHex, pubHex)));
		
	}

}
