package io.zdp.api.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Seed implements Serializable {

	private String seed;

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
