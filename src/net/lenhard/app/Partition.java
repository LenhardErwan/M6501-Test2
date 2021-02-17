package net.lenhard.app;

/**
 * Partition
 */
public class Partition {
	private String name;
	private Tonality tonality;

	public Partition(String name, Tonality tonality) {
		this.name = name;
		this.tonality = tonality;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Tonality getTonality() {
		return tonality;
	}

	public void setTonality(Tonality tonality) {
		this.tonality = tonality;
	}
}
