//example of overloading methods

import java.awt.Point;

class Box {
	int x1 = 0;  //when a new instance of the Box class is created, all its instance var are initialized to zero.
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;

	Box buildBox(int x1, int y1, int x2, int y2){ //this takes 4 args and returns a reference to the resulting Box object
		this.x1 = x1;	//bc the args have the same names as the instance vars, the keyword 'this' is used inside the method when referring to the instance vars
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		return this;
	}
/*
	Box buildBox(Point topLeft, Point bottomRight){ //Point objects contain both an x and y value as instance vars
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = bottomRight.x;
		y2 = bottomRight.y;
		return this;
	}
*/
	/*
		When you have several methods that do similar things, using one method to call another is a shortcut technique.
		The buildBox method on lines 19 - 25 can be replaced with this shorter method:
	*/
	Box buildBox(Point topLeft, Point bottomRight){ 
		return buildBox(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
	}

	Box buildBox(Point topLeft, int w, int h){
		x1 = topLeft.x;
		y1 = topLeft.y;
		x2 = (x1 + w);
		y2 = (y1 + h);
		return this;
	}

	void printBox(){
		System.out.print("Box: <" + x1 + ", " + y1);
		System.out.println(", " + x2 + ", " + y2 + ">");
	}

	public static void main(String[] args){
		Box rect = new Box();

		System.out.println("Calling buildBox with coordinates " + "(25, 25) and (50,50):");
		rect.buildBox(25, 25, 50, 50);
		rect.printBox();

		System.out.println("\nCalling buildBox with points " + "(10, 10) and (20,20):");
		rect.buildBox(new Point(10,10), new Point(20, 20));
		rect.printBox();

		System.out.println("\nCalling buildBox with 1 point " + "(10, 10), width 50 and height 50:");
		rect.buildBox(new Point(10,10), 50, 50);
		rect.printBox();
	}
}