/*
	The ComicBooks app prices collectible comic books according to their base value and their condition. 
	Each condition has a specific effect on the comic's value:

	mint: books are worth 3x their base price
	near mint: 2x
	very fine: 1.5x
	fine: worth their base price
	good: worth half their base price
	poor: worth 1/4 of their base price

	In the hashtable, the condition (mint, good, poor) are the keys, and the values are floating point numbers (e.g. 3.0, 1.5, 0.25)
*/
import java.util.*;

public class ComicBooksUsingGenerics {

	public ComicBooksUsingGenerics(){

	}

	public static void main(String[] args) {
		Hashtable<String, Float> quality = new Hashtable<String, Float>(); //< > are called generics -- they force the data structure to allow only certain data types
									//eliminates unchecked/unsafe operations errors at compile
		float price1 = 3.00F;
		quality.put("mint", price1);

		float price2 = 2.00F;
		quality.put("near mint", price2);

		float price3 = 1.50F;	
		quality.put("very fine", price3);

		float price4 = 1.00F;
		quality.put("fine", price4);

		float price5 = 0.50F;
		quality.put("good", price5);

		float price6 = 0.25F;
		quality.put("poor", price6);

		//set up a collection
		Comic[] comix = new Comic[3];

		comix[0] = new Comic("Amazing Spider Man", "1A", "very fine", 9240.00F);
		comix[0].setPrice( quality.get(comix[0].condition) ); //using generics in the Hashtable definition, we're able to remove "Float" casts 
																//remember, get(), by default, returns type Object
		comix[1] = new Comic("Incredible Hulk", "181", "near mint", 1325.00F);
        comix[1].setPrice( quality.get(comix[1].condition) );

		comix[2] = new Comic("Cerebrus", "1A", "good", 45.00F);
		comix[2].setPrice( quality.get(comix[2].condition) );

		for (int i = 0; i < comix.length; i++) {
			System.out.println("Title: " + comix[i].title);
			System.out.println("Issue: " + comix[i].issueNumber);
			System.out.println("Condition: " + comix[i].condition);
			System.out.println("Price: $" + comix[i].price + "\n");
		}
	}
}

class Comic {
	String title;
	String issueNumber;
	String condition;
	float basePrice;
	float price;

	Comic(String inTitle, String inIssueNumber, String inCondition, float inBasePrice) {
		title = inTitle; 
		issueNumber = inIssueNumber;
		condition = inCondition;
		basePrice = inBasePrice;
	}

	void setPrice(float factor) {
		price = basePrice * factor;
	}
}