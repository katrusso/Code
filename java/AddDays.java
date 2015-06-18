import java.util.*;
import java.text.*;
public class AddDays {
   public static void main(String[] args) {
      GregorianCalendar worldTour = new GregorianCalendar(1872, Calendar.OCTOBER, 2);
      worldTour.add(GregorianCalendar.DATE, 80); //instead of DATE; MONTH, YEAR, WEEK_OF_YEAR
      Date d = worldTour.getTime();
      DateFormat df = DateFormat.getDateInstance();
      String s = df.format(d);
      System.out.println("80 day trip will end " + s);
   }
}
