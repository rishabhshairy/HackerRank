import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Object.*;
import java.util.Calendar;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       	int day=in.nextInt();
       	int month=in.nextInt();
       	int year=in.nextInt();
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month-1);
        cal.set(Calendar.DAY_OF_MONTH,day);
        int dayofweek=cal.get(Calendar.DAY_OF_WEEK);
        String dayName = "";
        switch (weekDay) {
            case Calendar.MONDAY: dayName = "MONDAY"; break;
            case Calendar.TUESDAY: dayName = "TUESDAY"; break;
            case Calendar.WEDNESDAY: dayName = "WEDNESDAY"; break;
            case Calendar.THURSDAY: dayName = "THURSDAY"; break;
            case Calendar.FRIDAY: dayName = "FRIDAY"; break;
            case Calendar.SATURDAY: dayName = "SATURDAY"; break;
            case Calendar.SUNDAY: dayName = "SUNDAY"; break;
        }
        System.out.println(dayName);
    }
}
