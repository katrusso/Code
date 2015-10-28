class Printer {
	int x = 0;
	int y = 1;

	void printMe() {
		System.out.printf("x is %d, y is %d\n", x, y);
		System.out.println("I am an instance of the class " + this.getClass().getName() );
	}
}