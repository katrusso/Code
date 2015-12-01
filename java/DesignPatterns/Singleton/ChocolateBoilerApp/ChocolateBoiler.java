/*
	The job of the boiler is to take in the chocolate and milk, bring them to a boil, then pass them 
	onto the next phase of making chocolate bars.
*/

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static ChocolateBoiler uniqueInstance; //volatile:: multi-threading

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() { 
		if( uniqueInstance == null) {
			synchronized (ChocolateBoiler.class) {	//thread safe
				if( uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
	}

	public void fill() {	
		if( isEmpty() ) {  //to fill the boiler, it must be empty
			System.out.println("Filling the boiler with milk and chocolate mixture."); 
			empty = false;	//once full, set the empty and boiled flags
			boiled = false;
		}
	}

	public void boil() {
		if( !isEmpty() && !isBoiled() ){
			System.out.println("Bringing contents to a boil.");
			boiled = true;
		}
	}

	public void drain() {
		if( !isEmpty() && isBoiled() ){
			System.out.println("Draining the boiled milk and chocolate mixture.");
			empty = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}

