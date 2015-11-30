/*
	This class uses a set to keep track of which days in the year are holidays. 

	A set is employed bc HolidaySked must be able to take any day of the year and answer the same yes/no question:
		Are you a holiday?

	The app takes a single command-line argument: a # between 1-365 that represents one of the days of the year. 
	The app displays whether that day is a holiday according to the schedule in the HolidaySked class (holiday[]).

	e.g.
			javac HolidaySked.java 
			java HolidaySked 185
			java HolidaySked 4
*/

import java.util.*;

public class HolidaySked {
	BitSet sked; //all bits are initially set to "0" (false)

	public HolidaySked(){
		sked = new BitSet(365); //holds 365 bits (indices)
		int holiday[] = {1, 15, 50, 148, 185, 246, 281, 316, 326, 359}; //holds the number of each work holiday in the year 2007 beginning with 1, new years day, and ending with xmas.
		for (int i = 0; i < holiday.length; i++) { //loop iterates through the holiday array and sets each holiday's day-bit in the Bit Set data structure "sked" to "1" (true) 
			addHoliday(holiday[i]);
		}
	}

	public void addHoliday(int dayToAdd) {
		sked.set(dayToAdd); //when you "set" a bit, you turn it to 1 (true, on); use "clear(int)" to set it back to 0/false/off
	}

	public boolean isHoliday(int dayToCheck) {
		boolean result = sked.get(dayToCheck); //BitSetObject.get(index) gets the value of individual bits in the BitSetObject
		return result;
	}

	public static void main(String[] args) {
		HolidaySked cal = new HolidaySked();  //create an instance of Holiday Sked (a Holiday Sked object)
		if(args.length > 0) {
			try {
				int whichDay = Integer.parseInt(args[0]);
				if (cal.isHoliday(whichDay)) {  //check to see if the inputted arg day is a holiday
					System.out.println("Day number: " + whichDay + " is a holiday.");
				} else {
					System.out.println("Day number: " + whichDay + " is not a holiday.");
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Error: " + nfe.getMessage());
			}
		}
	}
}