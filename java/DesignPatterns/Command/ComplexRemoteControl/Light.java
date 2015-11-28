public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void lightOn(){
		System.out.println("Light is on.");
	}

	public void lightOff() {
		System.out.println("Light is off.");
	}
}