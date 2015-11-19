public class Mario extends Character {
	public Mario(){
	flyBehavior = new CantFly(); 
	runBehavior = new RunFast();
	danceBehavior = new Sprinkler();
	weaponBehavior = new Kindness();
	}

	public void display() {
		//show mario
		System.out.println("Ima Mario.");
	}
}