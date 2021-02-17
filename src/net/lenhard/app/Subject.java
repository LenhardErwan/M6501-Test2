package net.lenhard.app;

import java.util.ArrayList;

public class Subject {
	private ArrayList<ObserverInterface> observers;

	public Subject() {
		super();

		this.observers = new ArrayList<>();
	}

	public boolean addObserver(ObserverInterface observer) {
		return this.observers.add(observer);
	}

	public boolean removeObserver(ObserverInterface observer) {
		return this.observers.remove(observer);
	}

	public void notifyObservers(Partition partition) {
		for (ObserverInterface observerInterface : observers) {
			observerInterface.event(partition);
		}
	}
}
