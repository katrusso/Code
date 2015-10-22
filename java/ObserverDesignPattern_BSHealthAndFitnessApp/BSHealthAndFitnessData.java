import java.util.ArrayList;

public class BSHealthAndFitnessData implements Subject {
	private ArrayList<Observer>observers;
	private String pills;
	private String equipment;
	private String diet;

	public BSHealthAndFitnessData() {
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
			observer.update(pills, equipment, diet);
		}
	}

	public void dataChanged() {
		notifyObservers();
	}

	public void setData(String pills, String equipment, String diet) {
		this.pills = pills;
		this.equipment = equipment;
		this.diet = diet;
		dataChanged();
	}

	public String getPills() {
		return pills;
	}

	public String getEquipment() {
		return equipment;
	}

	public String getDiet() {
		return diet;
	}
}