class SubPrinter extends Printer {
	int z = 3;


	public static void main(String[] args){
		SubPrinter obj = new SubPrinter();
		obj.printMe();

	}
}

/*
	Since this SubPrinter class does not have a method named 'printMe()', it looks to the super class (Printer) to see if it's defined there
	
	Notice, the version defined in the super class doesn't print out the value of z. 

	To fix this we can override the printMe() method here in the subclass, and add a statement to display the z instance variable:


	class SubPrinter extends Printer {
	int z = 3;

	void printMe(){
		System.out.printf("x is %d, y is %d, and z is %d\n", x, y, z);
		System.out.println("I am an instance of the class " + this.getClass().getName() );
	}

	public static void main(String[] args){
		SubPrinter obj = new SubPrinter();
		obj.printMe();

	}
}
*/
