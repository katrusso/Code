import java.util.*;
import java.text.*;
public class ReviewDates {
   private GregorianCalendar firstDay, oneDay, oneWeek, oneMonth, oneQuarter, oneYear;
   final int dateArraySize = 6;
   ReviewDates(GregorianCalendar gcDate) {
      int year = gcDate.get(GregorianCalendar.YEAR);
      int month = gcDate.get(GregorianCalendar.MONTH);
      int date = gcDate.get(GregorianCalendar.DATE);
      firstDay = new GregorianCalendar(year, month, date);
      oneDay = new GregorianCalendar(year, month, date);
      oneWeek = new GregorianCalendar(year, month, date);
      oneMonth = new GregorianCalendar(year, month, date);
      oneQuarter = new GregorianCalendar(year, month, date);
      oneYear = new GregorianCalendar(year, month, date);
      oneDay.add(GregorianCalendar.DATE, 1);
      oneWeek.add(GregorianCalendar.DATE, 7);
      oneMonth.add(GregorianCalendar.MONTH, 1);
      oneQuarter.add(GregorianCalendar.MONTH, 3);
      oneYear.add(GregorianCalendar.YEAR, 1);
   }
   ReviewDates() {
      this(new GregorianCalendar());
   }
   public void listDates() {
      DateFormat df = DateFormat.getDateInstance(DateFormat.LONG); 
      Date startDate = firstDay.getTime();
      Date date1 = oneDay.getTime();
      Date date2 = oneWeek.getTime();
      Date date3 = oneMonth.getTime();
      Date date4 = oneQuarter.getTime();
      Date date5 = oneYear.getTime();
      String ss =  df.format(startDate);
      String ss1 = df.format(date1);
      String ss2 = df.format(date2);
      String ss3 = df.format(date3);
      String ss4 = df.format(date4);
      String ss5 = df.format(date5);
      System.out.println("Start date is " + ss);
      System.out.println("Following review dates are:");
      System.out.println(ss1);
      System.out.println(ss2);
      System.out.println(ss3);
      System.out.println(ss4);
      System.out.println(ss5);
      System.out.println();
   }
   public GregorianCalendar[] getDates() {
      GregorianCalendar[] memoryDates = new GregorianCalendar[dateArraySize];
      memoryDates[0] = firstDay;
      memoryDates[1] = oneDay;
      memoryDates[2] = oneWeek;
      memoryDates[3] = oneMonth;
      memoryDates[4] = oneQuarter;
      memoryDates[5] = oneYear;
      return memoryDates;
   }
   public GregorianCalendar getFirstDay() {
      return this.firstDay;
   }
   public GregorianCalendar getOneDay() {
      return this.oneDay;
   }
   public GregorianCalendar getOneWeek() {
      return this.oneWeek;
   }
   public GregorianCalendar getOneMonth() {
      return this.oneMonth;
   }
   public GregorianCalendar getOneQuarter() {
      return this.oneQuarter;
   }
   public GregorianCalendar getOneYear() {
      return this.oneYear;
   }
}  
