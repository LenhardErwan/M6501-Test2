package net.lenhard.app;

import net.lenhard.app.musician.Instrument;
import net.lenhard.app.musician.MusicianFactory;

/**
 * App
 */
public class App {
	
	public static void main(String[] args) {
		Server.getInstance().addMusician(MusicianFactory.getMusician("Ravel", Instrument.PIANO));
		Server.getInstance().addMusician(MusicianFactory.getMusician("Paganini", Instrument.VIOLIN));
		Server.getInstance().addMusician(MusicianFactory.getMusician("Sandoval", Instrument.TRUMPET));

		Server.getInstance().addPartition(new Partition("The Four Seasons", Tonality.A));
		Server.getInstance().addPartition(new Partition("Symphony No. 5", Tonality.C));
	}
}