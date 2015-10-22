public class PillDisplay implements Observer, DisplayElement {
	private String currentPillName = "Some Pill";
	private String yesterdaysPillName;
	private BSHealthAndFitnessData bsHealthAndFitnessData;

	public PillDisplay(BSHealthAndFitnessData bsHealthAndFitnessData) {
		this.bsHealthAndFitnessData = bsHealthAndFitnessData;
		bsHealthAndFitnessData.registerObserver(this);
	}

	public void update( String pills, String equipment, String diet) {
		yesterdaysPillName = currentPillName;
		currentPillName = pills;
		display();
	}

	public void display() {
		System.out.println("\n####################");
		System.out.println("PILL INFORMATION: ");
		System.out.println("Yesterday's Suggested Pills were: " + yesterdaysPillName);
		System.out.println("Today's popular pills are: " + currentPillName);
	}
}