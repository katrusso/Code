class VolcanoRobotApp {
	public static void main(String[] args) {   //static: indicates a method is a class method shared by all the VolcanoRobotApp's objects
		VolcanoRobot dante = new VolcanoRobot(); //creates a new VolcanoRobot object using the class as a template

		dante.status = "exploring"; //instance vars
		dante.speed = 2;
		dante.temperature = 610;

		dante.showAttributes();
		System.out.println("Increasing speed to 3.");
		dante.speed = 3;

		dante.showAttributes();
		System.out.println("Changing temperature to 670.");
		dante.temperature = 670;

		dante.showAttributes();
		System.out.println("Checking the temperature.");
		dante.checkTemperature();

		dante.showAttributes();
	}
}