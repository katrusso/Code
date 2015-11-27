
package observe;
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
        if ( i >= 0 ) 
            observers.remove(i);
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
