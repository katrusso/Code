import java.util.*;
import java.text.*;
public class ThreeDates {
   public static void main(String[] args) {
      GregorianCalendar gc1 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
      GregorianCalendar gc2 = gc1;
      GregorianCalendar gc3 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
      //Three dates all equal to January 1, 2000
      gc1.add(Calendar.YEAR, 1);
      //gc1 and gc2 are changed
      DateFormat df = DateFormat.getDateInstance();
      Date d1 = gc1.getTime();
      Date d2 = gc2.getTime();
      Date d3 = gc3.getTime();
      String s1 = df.format(d1);
      String s2 = df.format(d2);
      String s3 = df.format(d3);
      System.out.println("gc1 is " + s1);
      System.out.println("gc2 is " + s2);
      System.out.println("gc3 is " + s3);
   }
}
/*

The GregorianCalendar class offers methods for manipulating dates. One useful method is add(). With the add() method, you can add such time units as years, months, and days to a date. To use the add() method, you must supply the field being increased, and the integer amount by which it will increase. Some useful constants for the fields are DATE, MONTH, YEAR, and WEEK_OF_YEAR. The add() method is used in the program below to calculate a date 80 days in the future. Phileas Fogg, the central character in Jules Verne's Around the World in 80 Days, could have used such a program to calculate a date 80 days from his departure on October 2, 1872:


import java.util.*;
import java.text.*;
public class World {
public static void main(String[] args) {
   GregorianCalendar worldTour = new GregorianCalendar(1872, Calendar.OCTOBER, 2);
   worldTour.add(GregorianCalendar.DATE, 80);
   Date d = worldTour.getTime();
   DateFormat df = DateFormat.getDateInstance();
   String s = df.format(d);
   System.out.println("80 day trip will end " + s);
}
}



While the example is a bit fanciful, adding days to a date is a common operation: video rentals can be due in 3 days, a library may lend books for 21 days, stores frequently require purchased items to be exchanged within 30 days. The following program shows a calculation using years:


import java.util.*;
import java.text.*;
public class Mortgage {
public static void main(String[] args) {
   GregorianCalendar mortgage = new GregorianCalendar(1997, Calendar.MAY, 18);
   mortgage.add(Calendar.YEAR, 15);
   Date d = mortgage.getTime();
   DateFormat df = DateFormat.getDateInstance();
   String s = df.format(d);
   System.out.println("15 year mortgage amortized on " + s);    }
}



One important side effect of the add() method is that it changes the original date. Sometimes it is important to have both the original date and the modified date. Unfortunately, you cannot simply create a new GregorianCalendar object set equal to the original. The reason is that the two variables have a reference to one date. If the date is changed, both variables now refer to the changed date. Instead, a new object should be created. The following example will demonstrate this:


import java.util.*;
import java.text.*;
public class ThreeDates {
public static void main(String[] args) {
   GregorianCalendar gc1 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
   GregorianCalendar gc2 = gc1;
   GregorianCalendar gc3 = new GregorianCalendar(2000, Calendar.JANUARY, 1);
   //Three dates all equal to January 1, 2000
   gc1.add(Calendar.YEAR, 1);
   //gc1 and gc2 are changed
   DateFormat df = DateFormat.getDateInstance();
   Date d1 = gc1.getTime();
   Date d2 = gc2.getTime();
   Date d3 = gc3.getTime();
   String s1 = df.format(d1);
   String s2 = df.format(d2);
   String s3 = df.format(d3);
   System.out.println("gc1 is " + s1);
   System.out.println("gc2 is " + s2);
   System.out.println("gc3 is " + s3);
}
}



After the program is run, gc1 and gc2 are changed to the year 2001 
(because both objects are pointing to the same underlying date representation, which has been changed). 
The object gc3 is pointing to a separate underlying date representation, which has not been changed. 
*/