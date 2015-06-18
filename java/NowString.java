import java.util.*;
import java.text.*;
public class NowString {
   public static void main(String[] args) {
      Date now = new Date();
      DateFormat df =  DateFormat.getDateInstance();
      DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
      DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
      DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
      DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL); 
      String s =  df.format(now);
      String s1 = df1.format(now);
      String s2 = df2.format(now);
      String s3 = df3.format(now);
      String s4 = df4.format(now);
      System.out.println("(Default) Today is " + s);
      System.out.println("(SHORT)   Today is " + s1);
      System.out.println("(MEDIUM)  Today is " + s2);
      System.out.println("(LONG)    Today is " + s3);
      System.out.println("(FULL)    Today is " + s4);
   }
}
