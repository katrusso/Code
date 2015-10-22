public class CharacterSimulation {
	public static void main(String[] args) {
		Character mario = new Mario();
		mario.display();
		mario.performFly();
		mario. performRun();
		mario.performDance();
		mario.useWeapon();

		Character fatLuigi = new FatLuigi();
		fatLuigi.display();
		fatLuigi.performFly();
		fatLuigi. performRun();
		fatLuigi.performDance();
		fatLuigi.useWeapon();

		Character levitar = new Levitar();
		levitar.display();
		levitar.performFly();
		levitar. performRun();
		levitar.performDance();
		levitar.useWeapon();

		Character mariosTwin = new Mario();
		mariosTwin.display();
		mariosTwin.performFly();
		mariosTwin.setFlyBehavior(new SupermanFly());
		mariosTwin.performFly();
	}
}