public class GarageDoor { //the receiver knows how to perform the work needed to carry out the request.
	
	public GarageDoor() { }

	public void up() {
		System.out.println("Door is up.");
	}

	public void down() {
		System.out.println("Door is down.");

	}

	public void stop() {
		System.out.println("Door was stopped.");

	}

	public void lightOn() {
		System.out.println("Door light is on.");

	}

	public void lightOff() {
		System.out.println("Door light is off.");

	}
}