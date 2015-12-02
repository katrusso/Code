public class StarbuzzCoffeeController {
	
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println( beverage.getSize() + " " + beverage.getDescription() + " $" + String.format("%.2f", beverage.cost() ));
		beverage.setSize(Beverage.Size.GRANDE);
		System.out.println( beverage.getSize() + " " + beverage.getDescription() + " $" + String.format("%.2f", beverage.cost() ));
		System.out.println("-----------------------");


		Beverage beverage2 = new DarkRoast();
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		beverage2 = new Mocha(beverage2);
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		beverage2 = new Mocha(beverage2);
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		beverage2 = new Whip(beverage2);
		System.out.println( beverage2.getSize() + " " + beverage2.getDescription() + " $" + String.format("%.2f", beverage2.cost() ));
		System.out.println("-----------------------");


		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Beverage.Size.VENTI);

		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));
		beverage3.setSize(Beverage.Size.VENTI);
		System.out.println("The size of this beverage is: " + beverage3.getSize() );
		beverage3 = new Soy(beverage3);
		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));

		beverage3 = new Mocha(beverage3);
		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));

		beverage3 = new Whip(beverage3);
		System.out.println( beverage3.getSize() + " " + beverage3.getDescription() + " $" + String.format("%.2f", beverage3.cost() ));

		System.out.println("-----------------------");
	}
}