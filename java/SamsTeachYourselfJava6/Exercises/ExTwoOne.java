/* 
	Create a program that calculates how much a $14,000 investment would be worth if it 
	increased in value by 40% during the first year, lost $1,500 in value the second 
	year, and increased 12% in the third year. 
*/

class ExTwoOne {  
	public static void main(String[] args) {
		float year1 = 14000 + (14000 * .40f);
		float year2 = -1500;
		float year3 = (year1 + year2) + ((year1 + year2) * .12f);

		System.out.printf("The investment is worth: $%.2f\n", year3);
	}
}

/*
//BOOK ANSWER:
class Investor {
    public static void main(String[] arguments) {
     	float total = 14000;
        System.out.println("Original investment: $" + total);
        // Inceases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        // Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);
        // Increases by 12 percent the third year
        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }
}
*/