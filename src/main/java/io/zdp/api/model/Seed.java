package io.zdp.api.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("serial")
public class Seed implements Serializable {

	private String seed;

	private List<String> mnemonics = new ArrayList<>();

	public List<String> getMnemonics() {
		return mnemonics;
	}

	public Seed() {
		super();
	}

	public Seed(String seed) {
		super();
		this.seed = seed;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return "SeedResponse [seed=" + seed + "]";
	}

}
