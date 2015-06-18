import java.util.*;
import java.text.*;
public class AnotherDatePrgm {
   public static void main(String[] args) {
      GregorianCalendar firstFlight = new GregorianCalendar(1903, Calendar.DECEMBER, 17);    
      Date d = firstFlight.getTime();
      DateFormat df = DateFormat.getDateInstance();
      String s = df.format(d);
      System.out.println("First flight was " + s);
   }
}
