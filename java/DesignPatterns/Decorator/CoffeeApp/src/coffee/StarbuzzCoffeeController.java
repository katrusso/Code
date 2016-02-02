package coffee;
import coffee.Beverage.Size;
public class StarbuzzCoffeeController {
	
	public static void main(String[] args) {
		
		//YOU MUST SET THE SIZE BEFORE DECORATING AS COST OF CONDIMENTS DEPENDS ON SIZE
		
		Beverage beverage = new HouseBlend();
		System.out.println( beverage.getSize() + " " + beverage.getDescription() + " $" + String.format("%.2f", beverage.cost() ));
		beverage.setSize(Size.GRANDE);
		System.out.println( beverage.getSize() + " " + beverage.getDescription() + " $" + String.format("%.2f", beverage.cost() ));
		System.out.println("-----------------------");

		Beverage beverage2 = new HouseBlend();
		beverage2.setSize(Size.GRANDE);
		beverage2 = new Soy(beverage2); 
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		System.out.println("-----------------------");

		Beverage beverage3 = new Espresso();
		beverage3 = new Whip(beverage3);
		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));
		System.out.println("-----------------------");

		Beverage beverage4 = new Decaf();
		beverage4.setSize(Size.VENTI); //SET THE SIZE BEFORE DECORATING (COST OF CONDIMENTS DEPENDS ON SIZE)
		beverage4 = new SteamedMilk(beverage4);
		beverage4 = new Mocha(beverage4);
		beverage4 = new Whip(beverage4);
		//beverage4.setSize(Size.VENTI); //<--No, No. YOU MUST SET THE SIZE BEFORE DECORATING AS COST OF CONDIMENTS DEPENDS ON SIZE
		System.out.println( beverage4.getSize() + " " + beverage4.getDescription() + " $" + String.format("%.2f", beverage4.cost() ));

	}
}

/*
OUTPUT::

TALL House Blend Coffee $0.89
GRANDE House Blend Coffee $0.89
-----------------------
GRANDE House Blend Coffee, Soy $1.04
-----------------------
TALL Espresso, Whipped Cream $2.09
-----------------------
VENTI Decaf Coffee, Steamed Milk, Mocha, Whipped Cream $1.75
*/