public class CeilingFan {
	String location = "";

	public static final int HIGH = 3; //CeilingFan holds local state representing the speed of the ceiling fan
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	int speed;


	public CeilingFan (String loc) {
		this.location = loc;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;
		System.out.println("Fan on HIGH.");
	}

	public void medium() {
		speed = MEDIUM;
		System.out.println("Fan on MEDIUM.");
	}	

	public void low() {
		speed = LOW;
		System.out.println("Fan on LOW.");
	}

	public void off() {
		speed = OFF;
		System.out.println("Fan is OFF.");
	}

	public int getSpeed() {
		return speed;
	}

}