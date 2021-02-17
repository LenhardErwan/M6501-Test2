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

	
	/** 
	 * @return Server
	 */
	public static Server getInstance() {
		if (instance == null) {
			instance = new Server();
		}

		return Server.instance;
	}

	
	/** 
	 * @param musician
	 */
	public void addMusician(Musician musician) {
		this.addObserver(musician);
		this.musicians.add(musician);
	}

	
	/** 
	 * @param musician
	 */
	public void removeMusician(Musician musician) {
		this.removeObserver(musician);
		this.musicians.remove(musician);
	}

	
	/** 
	 * @param partition
	 */
	public void addPartition(Partition partition) {
		this.partitions.add(partition);
		this.notifyObservers(partition);
	}

	
	/** 
	 * @param partition
	 */
	public void removePartition(Partition partition) {
		this.partitions.remove(partition);
	}

	
	/** 
	 * @return int
	 */
	public int getNbMusicians() {
		return this.musicians.size();
	}

	
	/** 
	 * @return int
	 */
	public int getNbPartitions() {
		return this.musicians.size();
	}
}
