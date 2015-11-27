
package observe;

public class ObsDisplay implements Observer, DisplayElement {
    	private String currentValue; 
        private String previousValue;
	private ValueData valueData;

	public ObsDisplay(ValueData valueData) {
		this.valueData = valueData;
		valueData.registerObserver(this);
	}

	public void update( String value) {
		previousValue = currentValue;
		currentValue = value;
		display();
	}

	public void display() {
		System.out.println("\n####################");
		System.out.println("INFORMATION: ");
		System.out.println("The previous value was: " + previousValue);
		System.out.println("The current value is: " + currentValue);
	}
        
        public String getCurrentValue(){
            return currentValue;
        }
}
