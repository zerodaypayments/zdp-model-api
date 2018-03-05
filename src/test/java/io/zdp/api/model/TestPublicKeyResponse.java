package io.zdp.api.model;

import java.security.KeyPair;
import java.security.PrivateKey;

import org.bouncycastle.util.encoders.Hex;

import io.zdp.api.model.v1.PublicKeyResponse;
import io.zdp.common.crypto.CryptoUtils;

public class TestPublicKeyResponse extends BaseModelTest {

	public void test() throws Exception {

		/*
  "privateKey" : "308195020100301406072a8648ce3d020106092b2403030208010108047a307802010104203fa13fcfab7815a02943aec3f93814f62001bac1c4e2f3e5d0d61519690d0746a00b06092b2403030208010108a1440342000430e1e9f693a1611eefebcf2daffeb71941770f15000a586cb934c267f465dd2719903fe26ded2195d2057dae3e43735b1538fd409fe3b254039cecf91fcede19",
  "publicKey" : "305a301406072a8648ce3d020106092b24030302080101080342000430e1e9f693a1611eefebcf2daffeb71941770f15000a586cb934c267f465dd2719903fe26ded2195d2057dae3e43735b1538fd409fe3b254039cecf91fcede19",

		 */

		KeyPair kp = CryptoUtils.generateECKeyPair();
		String pubHex = Hex.toHexString( kp.getPublic().getEncoded());
		String privHex = Hex.toHexString( kp.getPrivate().getEncoded());
		
		PrivateKey priv2 = CryptoUtils.generateECPrivateKey(Hex.toHexString(kp.getPrivate().getEncoded()));
		String priv2Hex = Hex.toHexString(priv2.getEncoded());
		
		assertEquals(privHex, priv2Hex);

		System.out.println(objectMapper.writeValueAsString(new PublicKeyResponse(privHex)));

	}

}
