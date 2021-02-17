package net.lenhard.app.musician;

import java.util.ArrayList;

import net.lenhard.app.ObserverInterface;
import net.lenhard.app.Partition;

public abstract class Musician implements ObserverInterface {
	protected String name;
	protected Instrument instrument;
	protected ArrayList<Partition> partitions;

	/**
	 * Instance a Pianist
	 * @param name name of the musician
	 * @param instrument instrument of the musician
	 */
	protected Musician(String name, Instrument instrument) {
		this.name = name;
		this.instrument = instrument;
		this.partitions = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	public ArrayList<Partition> getPartitions() {
		return partitions;
	}

	public void setPartitions(ArrayList<Partition> partitions) {
		this.partitions = partitions;
	}

	@Override
	public void event(Partition partition) {
		System.out.println("(Musician) " + this.name + " received a new partition! > " + partition.getName());
		this.partitions.add(partition);
	}
}