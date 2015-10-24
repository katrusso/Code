import java.awt.Point;

class RefTester {
	public static void main (String[] args) {
		Point pt1, pt2;
		pt1 = new Point (100, 100);
		pt2 = pt1;  //pt2 points to the address of pt1; pt2 is a "reference" to the same object as pt1, instead of creating pt2 as a new object copied from pt1

		pt1.x = 200;
		pt1.y = 200;

		System.out.println("Point 1: " + pt1.x + ", " + pt1.y); //200, 200
		System.out.println("Point 2: " + pt2.x + ", " + pt2.y); //200, 200

		//either variable can be used to refer to the object or to change its variables

		pt2.x = 500;
		pt2.y = 500;

		System.out.println("Point 1: " + pt1.x + ", " + pt1.y); //500, 500
		System.out.println("Point 2: " + pt2.x + ", " + pt2.y); //500, 500

		//if you wanted pt1 and pt2 to refer to separate objects, separate new Point() statements could be used in lines 6-7 (one for each variable)
	}
}