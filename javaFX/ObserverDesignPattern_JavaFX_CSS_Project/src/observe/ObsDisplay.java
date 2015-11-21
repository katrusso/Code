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
