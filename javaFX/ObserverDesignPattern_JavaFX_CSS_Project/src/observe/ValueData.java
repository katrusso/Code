/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observe;

/**
 *
 * @author hq
 */
import java.util.ArrayList;

public class ValueData implements Subject {
	private ArrayList<Observer>observers;
	private String value;
	

	public ValueData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(value);
		}
	}

	public void dataChanged() {
		notifyObservers();
	}

	public void setData(String value) {
		this.value = value;
		
		dataChanged();
	}

	public String getValue() {
		return value;
	}
}
