public class SummaryDisplay implements Observer, DisplayElement {
	private String pills;
	private String equipment;
	private String diet;
	private Subject bsHealthAndFitnessData;

	public SummaryDisplay( Subject bsHealthAndFitnessData) {
		this.bsHealthAndFitnessData = bsHealthAndFitnessData;
		bsHealthAndFitnessData.registerObserver(this);
	}

	public void update(String pills, String equipment, String diet) {
		this.pills = pills;
		this.equipment = equipment;
		this.diet = diet;
		display();
	}

	public void display() {
		System.out.println("========================");
		System.out.println("SUMMARY DISPLAY ");
		System.out.println("Today's most popular: ");
		System.out.println("pills: " + pills);
		System.out.println("equipment: " + equipment);
		System.out.println("diet: " + diet);
	}
}