package net.lenhard.app.musician;

/**
 * MusicianFactory
 */
public class MusicianFactory {
	public Musician getMusician(String name, Instrument instrument) {
		Musician musician = null;

		switch (instrument) {
			case PIANO:
				musician = new Pianist(name);
				break;

			case TRUMPET:
				musician = new Trumpeter(name);
				break;
				
			case VIOLIN:
				musician = new Violinist(name);
				break;
		
			default:
				System.err.println("This type of musician does not exist!");
				break;
		}

		return musician;
	}
}
