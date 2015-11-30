public class Cases {
	public static void main(String[] args) {
		float x = 9;
		float y = 5;
		int z = (int) (x/y); //equiv to (int) 1.8 == 1
		switch(z) {
			case 1:
				x = x + 2;  //Notice, no break statements;
			case 2:
				x = x + 3;
			default:
				x = x + 1;
		}
		System.out.println("Value of x: " + x); //outputs 15.0
	}
}