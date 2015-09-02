/**
 * Asks the user for their name, and the year, month, and day of their birth.
 * Outputs a greeting and the number of years, weeks, and days of user age.
 */

import java.util.Calendar;
import java.util.Scanner;

public class Birthday {
    
    private static final long MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
    private static final long MILLIS_IN_WEEK = 1000 * 60 * 60 * 24 * 7;
    private static final long MILLIS_IN_YEAR = 31557600000l;
    
    public static void main( String[] args ){
        
        /* Declare the Scanner for user input */
        Scanner scan = new Scanner( System.in );
        
        String name;        
        int year;
        int month;
        int day;
        
        System.out.print( "Please enter your first name (no spaces) then " + 
                "press Enter: " );
        name = scan.nextLine();
        
        System.out.print( "Enter the year in which you were born: " );
        year = scan.nextInt();
        
        System.out.print( "Enter the month in which you were born (1-12): " );
        month = scan.nextInt();
        
        System.out.print( "Enter the day of the month in which you were " + 
                "born (1-31): " );
        day = scan.nextInt();
        
        Calendar c = Calendar.getInstance();
        c.set(year, month-1,day);

        long bDateMs = c.getTimeInMillis();
        long todayMs = System.currentTimeMillis();
        long length = todayMs - bDateMs;
        
        

        int years  = (int) (length / MILLIS_IN_YEAR);
        length -= (years * MILLIS_IN_YEAR);
        int weeks =  (int) (length / MILLIS_IN_WEEK);
        length -= (weeks * MILLIS_IN_WEEK);
        int days = (int) (length / MILLIS_IN_DAY);

        System.out.println( "Welcome to the University of Nebraska-Lincoln " + name + "!" );
        System.out.println( "You are " + years + " years, " + weeks + 
                " weeks, and " + days + " days old today." );
        
        
    } 

}
