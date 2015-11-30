//Overriding Constructors

/*
	Constructors cannot be overridden. Because they always have the same name as the current class, new constructor methods are created instead
	of being inherited.

	However, when you are defining constructor methods for your own class, you might want to change how your object is initialized, not 
	only by initializing new vars added by your class, but also by changing the contents of vars that are already in there.

	To do this, explicitly call the constructor methods of the superclass and subsequently change whatever vars need to be changed.

	To call a regular method in a superclass, you use super.methodName(arguments).
	Because constructor methods don't have a method name to call, the following form is used:

	super(arg1, arg2, ...);

	NOTE: Java requires the first statement in your constructor definition calls super(). If you don't call it explicitly, java does it for you -- 
	calling super() with no args before the first statement in the constructor. 

	You don't have to call the constructor in your superclass that has the same signature as the constructor in your class; you have to call the 
	constructor only for the values you need initialized.

	e.g. 
*/

import java.awt.Point;

class NamedPoint extends Point {
	String name;

	NamedPoint(int x, int y, String name) {
		super(x,y);
		this.name = name;
	}

	public static void main(String[] args){
		NamedPoint np = new NamedPoint(5, 5, "SmallPoint");
		System.out.println("x is " + np.x);
		System.out.println("y is " + np.y);
		System.out.println("name is " + np.name);
	}
}

/* 
	The constructor method defined here for NamedPoint calls Point's constructor method to initialize the instance vars of Point (x and y).
	Although you can just as easily initialize yourself, you might not know what other things Point is doing to initialize itself. 

	It's always a good idea to pass constructor methods up the hierarchy to make sure that everything is setup correctly.
*/

