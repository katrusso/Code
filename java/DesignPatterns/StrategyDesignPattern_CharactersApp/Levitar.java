public class Levitar extends Character {
	public Levitar(){
	flyBehavior = new SupermanFly(); 
	runBehavior = new RunSlow();
	danceBehavior = new CantDance();
	weaponBehavior = new NoWeapon();
	}

	public void display() {
		//show Levitar
		System.out.println("I'm Levitar, weee!");
	}
}