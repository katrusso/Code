public abstract class Character {  //STRATEGY PATTERN
	FlyBehavior flyBehavior; //each character has a instance var that holds a ref to a specific behavior at runtime
	RunBehavior runBehavior;
	DanceBehavior danceBehavior;
	WeaponBehavior weaponBehavior;

	public Character() {

	}

	public abstract void display(); // must be implemented in concrete classes

	public void performFly() {	
		flyBehavior.fly();  //Char class delegates behaviors to interface subclasses
	}

	public void performRun() {
		runBehavior.run();
	}

	public void performDance() {
		danceBehavior.dance();
	}

	public void useWeapon() {
		weaponBehavior.fight();
	}

	public void setFlyBehavior(FlyBehavior fb) {	//used to set behavior dynamically at runtime
		flyBehavior = fb;
	}

	public void setWeaponBehavior(WeaponBehavior wb) {  //used to set behavior dynamically at runtime
		weaponBehavior = wb;
	}

	public void jump() {	//implement here, all characters do this the same way
		System.out.println("All characters jump");
	}

	public void crouch() { //implement here, all characters do this the same way
		System.out.println("All characters crouch");
	}

}