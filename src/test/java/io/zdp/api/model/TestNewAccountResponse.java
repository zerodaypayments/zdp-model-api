package io.zdp.api.model;

import java.math.BigInteger;
import java.util.List;

import io.zdp.api.model.v1.GetNewAccountResponse;
import io.zdp.crypto.Curves;
import io.zdp.crypto.key.ZDPKeyPair;
import io.zdp.crypto.mnemonics.Mnemonics;
import io.zdp.crypto.mnemonics.Mnemonics.Language;

public class TestNewAccountResponse extends BaseModelTest {

	public void test() throws Exception {
		
		ZDPKeyPair kp = ZDPKeyPair.createRandom(Curves.DEFAULT_CURVE);

		GetNewAccountResponse resp = new GetNewAccountResponse();
		resp.setCurve(Curves.DEFAULT_CURVE);
		resp.setAccountUuid(kp.getZDPAccount().getUuid());
		resp.setPrivateKey(kp.getPrivateKeyAsBase58());
		resp.setPublicKey(kp.getPublicKeyAsBase58());

		List<String> words = Mnemonics.generateWords(Language.ENGLISH, kp.getPrivateKeyAsBase58());
		resp.setMnemonics(words);

		assertEquals(24, words.size());

		System.out.println(objectMapper.writeValueAsString(resp));

		BigInteger fromWords = Mnemonics.generatePrivateKeyFromWords(Language.ENGLISH, words);

		System.out.println(fromWords);

		assertEquals(kp.getPrivateKeyAsBigInteger(), fromWords);

	}

}
