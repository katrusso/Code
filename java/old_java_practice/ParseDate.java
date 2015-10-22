import java.util.*;
import java.text.*;
public class ParseDate {
   public static void main(String[] args) {
      String ds = "November 1, 2000";
      DateFormat df = DateFormat.getDateInstance();
      try {
         Date d = df.parse(ds);
         System.out.println("date= " + d);
      }
      catch(ParseException e) {
         System.out.println("Unable to parse " + ds);
      }
   }
}
