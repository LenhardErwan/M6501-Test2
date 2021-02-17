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

	
	/** 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	
	/** 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	/** 
	 * @return Tonality
	 */
	public Tonality getTonality() {
		return tonality;
	}

	
	/** 
	 * @param tonality
	 */
	public void setTonality(Tonality tonality) {
		this.tonality = tonality;
	}
}
