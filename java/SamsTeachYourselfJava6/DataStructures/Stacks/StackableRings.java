import java.util.*;

public class StackableRings{
	Stack<String> rings;

	public StackableRings() {
		rings = new Stack<String>();

		rings.push("extra large");
		rings.push("large");
		rings.push("medium");
		rings.push("small");
		rings.push ("extra small");

		System.out.println("---------------------");
		System.out.println("All the values stored in the stack, (starting with rings[0], which is on the bottom of the stack):");
		for (String r : rings){
			System.out.println(r);
		}

		System.out.println("---------------------");
		System.out.println("Peeking at the top item on the Stack without actually popping it off: ");
		System.out.println( (String)rings.peek() );
		System.out.println("---------------------");		
		System.out.print("True/1 or False/0, stack is empty?: " + rings.empty() + "\n");
		System.out.println("---------------------");
		System.out.println("how far is 'medium' from the top of the stack?: " + rings.search("medium") );
		System.out.println("Is this search case sensitive (-1 for yes): " + rings.search("Medium") );
		System.out.println("---------------------");
		System.out.println("Remember, Stacks are a subclass of Vector, therefore, items stored in the stack can not be accessed via 'stackName[index]'");
		System.out.println("Printing the stack from top to bottom \n");
		System.out.println ("index \t distance from top \t value");
		int index = rings.size() - 1;
		int distanceFromTop = 0;

		while ( !rings.empty() ) {
			System.out.println(index + "\t\t" + distanceFromTop + "\t\t" + rings.pop());
			index--;
			distanceFromTop++;
		}
		System.out.println("---------------------");
		System.out.println("True/1 or False/0, stack is empty?: " + rings.empty() + "\n");

	}

	public static void main(String[] args){
		StackableRings sr = new StackableRings();
	}
}