class VolcanoRobot {
	String status; //instance vars
	int speed;
	float temperature;

	void checkTemperature() {   //instance method ("method")
		if(temperature > 660) {
			status = "returning home";
			speed = 5;
		}
	}
	void showAttributes() { //instance method
		System.out.println("Status: " + status);
		System.out.println("Speed: " + speed);
		System.out.printf("Temperature: %.1f\n\n", temperature);
	}
}