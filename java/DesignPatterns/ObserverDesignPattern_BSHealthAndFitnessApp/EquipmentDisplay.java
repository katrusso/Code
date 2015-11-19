public class EquipmentDisplay implements Observer, DisplayElement {
	private float weightLimitInPounds = 100;
	private float someValue;
	private BSHealthAndFitnessData bsHealthAndFitnessData;

	public EquipmentDisplay(BSHealthAndFitnessData bsHealthAndFitnessData) {
		this.bsHealthAndFitnessData = bsHealthAndFitnessData;
		bsHealthAndFitnessData.registerObserver(this);
	}

	public void update( String pills, String equipment, String diet) {
		if (weightLimitInPounds > 5) {
			someValue = 88.6f;
		}

		display();
	}

	public void display() {
		System.out.println("\n*********************");
		System.out.println("EQUIPMENT INFORMATION: ");
		System.out.println("I could probably add a variable or external file describing the equipment, but I'd rather take a nap.");
		System.out.println("I've arbitrarily hard coded the equipment's weight limit in pounds to be: " + weightLimitInPounds + " even though I know hard-coding is bad. I'm rebelling today!");
	}
}