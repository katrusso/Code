import java.util.*;
import javax.swing.*;

public class MathFns {
	
	static Scanner myVal=new Scanner(System.in);

	public static void main(String[] args)
	{
	int a;
	double x, y, d;
	
	//Calculate the cube root of a value
	System.out.print("Cube Root-- Enter a Value: ");
	a=myVal.nextInt();
	
	JOptionPane.showMessageDialog(null, "\n The Cube root of " + a + " is: " + Math.cbrt(a), "CUBE ROOT", JOptionPane.WARNING_MESSAGE);
	
	//Calculate the squared value of x, y
	System.out.print("Enter a value for x: ");
	x=myVal.nextDouble();
	
	System.out.print("Enter a value for y: ");
	y=myVal.nextDouble();
	JOptionPane.showMessageDialog(null, "The value of x raised to the y is: " + Math.pow(x,y), "EXPONENT", JOptionPane.PLAIN_MESSAGE);
	
	//Generate a random number
	JOptionPane.showMessageDialog(null, "A random number is: " + Math.random(), "RANDOM NUMBER GENERATOR", JOptionPane.INFORMATION_MESSAGE);
	}
}
