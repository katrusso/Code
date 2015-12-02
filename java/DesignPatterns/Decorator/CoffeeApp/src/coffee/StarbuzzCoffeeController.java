package coffee;
import coffee.Beverage.Size;
public class StarbuzzCoffeeController {
	
	public static void main(String[] args) {
		Beverage beverage = new HouseBlend();
		System.out.println( beverage.getSize() + " " + beverage.getDescription() + " $" + String.format("%.2f", beverage.cost() ));
		beverage.setSize(Size.GRANDE);
		System.out.println( beverage.getSize() + " " + beverage.getDescription() + " $" + String.format("%.2f", beverage.cost() ));
		System.out.println("-----------------------");

		Beverage beverage2 = new HouseBlend();
		beverage2.setSize(Size.GRANDE);
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		beverage2 = new Soy(beverage2); //if I don't follow this with another setSize() it prints "TALL" as the size on the next line, however, it calculates the correct price.
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		System.out.println("-----------------------");

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.GRANDE);
		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));
		beverage3 = new Soy(beverage3);
		beverage3.setSize(Size.GRANDE); //it seems you have to re-set the size after every decorator for the print statement to work correctly.
		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));
		System.out.println("-----------------------");

		Beverage beverage4 = new Decaf();
		beverage4 = new SteamedMilk(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		beverage4.setSize(Size.VENTI);
		System.out.println( beverage4.getSize() + " " + beverage4.getDescription() + " $" + String.format("%.2f", beverage4.cost() ));

	}
}

/*
OUTPUT::

TALL House Blend Coffee $0.89
GRANDE House Blend Coffee $0.89
-----------------------
GRANDE House Blend Coffee $0.89
TALL House Blend Coffee, Soy $1.04
-----------------------
GRANDE House Blend Coffee $0.89
GRANDE House Blend Coffee, Soy $1.04
-----------------------
VENTI Decaf Coffee, Steamed Milk, Mocha, Whipped Cream $1.45
*/