package io.zdp.api.model;

import java.math.BigInteger;
import java.util.List;

import io.zdp.api.model.v1.GetNewAccountResponse;
import io.zdp.crypto.Curves;
import io.zdp.crypto.Keys;
import io.zdp.crypto.mnemonics.Mnemonics;
import io.zdp.crypto.mnemonics.Mnemonics.Language;

public class TestNewAccountResponse extends BaseModelTest {

	public void test() throws Exception {

		BigInteger priv = Keys.generateRandomPrivateKey(Curves.DEFAULT_CURVE);

		System.out.println(priv);

		String privHex = Keys.toZDPPrivateKey(priv);
		String pubHex = Keys.toZDPPublicKey(priv, Curves.DEFAULT_CURVE);

		GetNewAccountResponse resp = new GetNewAccountResponse(privHex, pubHex);
		resp.setCurve(Curves.DEFAULT_CURVE);

		List<String> words = Mnemonics.generateWords(Language.ENGLISH, privHex);
		resp.setMnemonics(words);

		assertEquals(24, words.size());

		System.out.println(objectMapper.writeValueAsString(resp));

		BigInteger fromWords = Mnemonics.generatePrivateKeyFromWords(Language.ENGLISH, words);

		System.out.println(fromWords);

		assertEquals(priv, fromWords);

	}

}
