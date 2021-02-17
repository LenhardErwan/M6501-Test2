package net.lenhard.app;

import net.lenhard.app.musician.Instrument;
import net.lenhard.app.musician.Musician;
import net.lenhard.app.musician.MusicianFactory;

/**
 * App
 */
public class App {
	public static void main(String[] args) {
		MusicianFactory mf = new MusicianFactory();

		Server.getInstance().addMusician(mf.getMusician("Ravel", Instrument.PIANO));
		Server.getInstance().addMusician(mf.getMusician("Paganini", Instrument.VIOLIN));
		Server.getInstance().addMusician(mf.getMusician("Sandoval", Instrument.TRUMPET));

		Server.getInstance().addPartition(new Partition("The Four Seasons", Tonality.A));
		Server.getInstance().addPartition(new Partition("Symphony No. 5", Tonality.C));
	}
}