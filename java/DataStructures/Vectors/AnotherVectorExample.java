import java.util.*; //contains data structures 

public class AnotherVectorExample{
	Vector v; 

	public AnotherVectorExample(){
		v = new Vector(25); //at compile, receives 'unchecked' error because I chose not to use generics (< > ) in this example (to restrict the data type my vector would allow)
		System.out.println("The capacity of vector v is: " + v.capacity() );

		System.out.println("The size of vector v is: " + v.size() );
		System.out.println("The size represents the number of elements in my vector. I'm going to add stuff to it");

		v.add("zero");
		v.add("one");
		v.add("two");
		v.add("three");
		v.add("four");
		System.out.println("------------------");
		System.out.println("Here's the stuff in my vector so far: ");
		printVectorContents();
		System.out.println("The size of vector v is: " + v.size() );

		System.out.println("True/1 or False/0, my vector contains 'three'?: " + v.contains("three"));
		System.out.println("What's the index of 'three'?: " + v.indexOf("three"));
		System.out.println ("I'm going to overwrite the value of three with 'bees!': ");
		
		System.out.println("------------------");
		for (Iterator i = v.iterator(); i.hasNext();){ //alternative way to traverse the entire vector
			String s = (String) i.next();
			System.out.println(s);
		}
		System.out.println("------------------");
		v.set(v.indexOf("three"), "bees!");

		printVectorContents();
		System.out.println("\nI'm going to add an item called 'one-point-five' at index 1. Watch how the indices change: ");
		v.add(1, "one-point-five");
		printVectorContents();
		
		System.out.println("I'm actually going to remove the item named 'one'. I hate ones...");
		v.removeElement("one");
		printVectorContents();
		
		System.out.println("I can look at the last element in my vector, it's: " + (String)v.lastElement());
		System.out.println("I can also get a value from my vector using its index, but I have to use the get() method rather than '[].' e.g. index 0: " + (String)v.get(0));
		System.out.println("Hey, what's my vector size now?: " + v.size());
		System.out.println("And what's my capacity?: " + v.capacity());
		System.out.println("I'm going to trim the capacity down so that it equals the size...");
		v.trimToSize();
		System.out.println("My new capacity is: " + v.capacity());
		System.out.println("if i reset the size of my vector to be bigger, it will insert null elements:");
		v.setSize(15);
		printVectorContents();
		
		System.out.println("If I reset my vector size to be smaller than the number of elements I currently have in there, it will truncate them: ");
		v.setSize(3);
		printVectorContents();
		
		System.out.println("my vector size is now: " + v.size() + " and the capacity is set to: " + v.capacity());
		System.out.println("It looks like I have to retrim my capacity when I reduce the size of my vector..");
		v.trimToSize();
		System.out.println("now my capacity is: " + v.capacity());
		System.out.println("I want to erase everything in my vector. I'm going to use the clear() method.");
		v.clear();
		System.out.println("Ok, i cleared it. The size is now: " + v.size() + " and the capacity is: " + v.capacity());
	}

	public void printVectorContents(){
		System.out.println("index \t value");
		int index = 0;
		for (Object s : v) {
			System.out.println(index + "\t" + s);
			index++;
		}
	}

	public static void main(String[] args) {
		AnotherVectorExample ave = new AnotherVectorExample();
	}
}