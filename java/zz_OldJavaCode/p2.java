import java.util.Scanner;

public class p2
{
	static Scanner kb=new Scanner (System.in);

	public static void main (String[] args)
	{

		int diameter, height;
		double radius, circumference, areaOfcircle, cylVolume, pi=3.1415926;
		String name;

		System.out.print("Enter your name: ");
		name=kb.nextLine();

		System.out.println("Hello " + name + ". You have two more answers to provide.");

		System.out.printf("%nEnter the integer diameter of a cylinder: ");
		diameter=kb.nextInt();

		System.out.print("Enter the height of a cylinder: ");
		height=kb.nextInt();

		radius=(diameter/2.0);
		System.out.println("\nThe radius is " + radius + ".");
		System.out.println("The diameter is " + diameter + ".");

		System.out.println("The height is " + height + ".");

		System.out.println("The circumference is " + (pi*diameter) + ".");

		areaOfcircle=(pi)*(Math.pow(radius, 2));
		System.out.println("The area of the base is " + areaOfcircle + ".");

		cylVolume=(pi)*(Math.pow(radius, 2))*(height);
		System.out.println("The volume of the cylinder is " + cylVolume + ".");


	}

}

