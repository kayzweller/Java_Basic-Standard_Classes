package com.program09_DateCalendarClass;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
  public static void main(String[] args) {

    //. DATE
    //  representing date data.
    System.out.println();
    Date date = new Date();
    long millisecond = date.getTime();
    System.out.println(date);
    System.out.println(millisecond);

    //. CALENDAR
    //  use to manipulating date data.
    System.out.println();
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 2005);
    calendar.add(Calendar.YEAR, -10);
    calendar.set(Calendar.MONTH, Calendar.APRIL);
    calendar.set(Calendar.DAY_OF_MONTH, 3);
    calendar.set(Calendar.HOUR_OF_DAY, 16);
    calendar.set(Calendar.MINUTE, 5);
    calendar.set(Calendar.SECOND, 34);
    calendar.set(Calendar.MILLISECOND, 5);

    Date date2 = calendar.getTime();
    long millisecond2 = date2.getTime();
    System.out.println(date2);
    System.out.println(millisecond2);

  }
}
