public class FatLuigi extends Character {
	public FatLuigi(){
	flyBehavior = new CantFly(); 
	runBehavior = new RunSlow();
	danceBehavior = new Robot();
	weaponBehavior = new Shame();
	}

	public void display() {
		//show fat luigi
		System.out.println("Luigi Time!");
	}
}