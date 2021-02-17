package net.lenhard.app;

import java.util.ArrayList;

import net.lenhard.app.musician.Musician;

public class Server extends Subject {
	private static Server instance = null;
	private ArrayList <Musician> musicians;
	private ArrayList <Partition> partitions;

	private Server() {
		super();
		this.musicians = new ArrayList<>();
		this.partitions = new ArrayList<>();
	}

	public static Server getInstance() {
		if (instance == null) {
			instance = new Server();
		}

		return Server.instance;
	}

	public void addMusician(Musician musician) {
		this.addObserver(musician);
		this.musicians.add(musician);
	}

	public void removeMusician(Musician musician) {
		this.removeObserver(musician);
		this.musicians.remove(musician);
	}

	public void addPartition(Partition partition) {
		this.partitions.add(partition);
		this.notifyObservers(partition);
	}

	public void removePartition(Partition partition) {
		this.partitions.remove(partition);
	}

	public int getNbMusicians() {
		return this.musicians.size();
	}

	public int getNbPartitions() {
		return this.musicians.size();
	}
}
