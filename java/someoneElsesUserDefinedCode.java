

	/*    Course POS/406 Computer Programming 1
	    Programmer:Osman Diallo
	    Date Submitted:January 15,2008
	    Date due: January 15,2008
	    Assignment: Week #3 Chapter 4, Programming Assignmenmt #3
	    Purpose: This application will calculates total tuition and fees for it respective students
	*/

	        import java.swing.*;
	        import java.text.DecimalFormat;


	 public class someoneElsesUserDefinedCode 
	 {
	    public static void main(String[] args)
	        {
	        // declare class variables
	            int hours;
	            double fees, rate, tuition;

	        // call methods
	            displayWelcome();
	            hours = getHours();
	            rate = getRate();
	            tuition = calcTuition(hours);
	            fees = CalcFees(tuition);
	            diplayTotal(tuition+fees);

	        }

	    public static void displayWelcome()
	        {
	            System.out.println("\tWelcome to the Tuition and Fees Calculator");
	        }

	    public static int getHours()
	        {
	            //declare variables
	            String strHours;
	            int hours = 0;

	            //prompts user for input
	            System.out.println("Enter the number of hours accrued in a class.");

	            hours = dataIn.readLine();

	            try
	                {
	                    hours = Integer.parseInt(strHours);

	                }
	            catch(NumberFormatException e)
	            JOptionPane.showMessageDialog(null,"Your entry was not in the proper format.",
	           "Error"JOptionPane.INFORMATION_MESSAGE);
	                {
	                    System.out.println("Please input whole numbers only");

	                }
	            return hours;
	        }
	    //the getRate() method ask the user to input the rate per credit hours.
	    public static double getRate()
	        {
	            int hours =15;
	            if (hours>15)
	                System.out.println("calculate the rate per credit hours");
	            else
	            if (hours<15)
	            System.out.println("credit hours is inaccurate");
	            else
	            System.out.println("zero");
	        }
	        return rate;
	    //the calcTuition() allowed the system to accept only two values.
	    public static double calcTuition()
	        {
	            int hours
	            double rate =0.0;
	            double rate * hours
	        }
	        return tuition
	    //the calcFees() accept double values.
	    public static calcFees(double tuition)
	        {
	            double tuition * 0.8;
	            double fees
	        }
	        return fees
	
}
