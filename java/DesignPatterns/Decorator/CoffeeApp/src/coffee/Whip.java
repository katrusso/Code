package coffee;

import coffee.Beverage.Size;

public class Whip extends CondimentDecorator {
	Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whipped Cream";
	}
	
	public Size getSize() {
		return this.beverage.getSize();
	}

	public double cost() {
		double cost = beverage.cost();
		if( beverage.getSize() == Size.TALL) {
			cost += .10;
		} else if( beverage.getSize() == Size.GRANDE) {
			cost += .15;
		}else if( beverage.getSize() == Size.VENTI) {
			cost += .20;
		} 
		return cost;	
	}
}