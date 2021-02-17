package net.lenhard.app;

import java.util.ArrayList;

public abstract class Subject {
	private ArrayList<ObserverInterface> observers;

	protected Subject() {
		super();

		this.observers = new ArrayList<>();
	}

	
	/** 
	 * @param observer
	 * @return boolean
	 */
	public boolean addObserver(ObserverInterface observer) {
		return this.observers.add(observer);
	}

	
	/** 
	 * @param observer
	 * @return boolean
	 */
	public boolean removeObserver(ObserverInterface observer) {
		return this.observers.remove(observer);
	}

	
	/** 
	 * @param partition
	 */
	public void notifyObservers(Partition partition) {
		for (ObserverInterface observerInterface : observers) {
			observerInterface.event(partition);
		}
	}
}
