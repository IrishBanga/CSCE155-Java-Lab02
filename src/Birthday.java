/**
 * Asks the user for their name, and the year, month, and day of their birth.
 * Outputs a greeting and the number of years, weeks, and days of user age.
 */

import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Birthday {
    
    private static final int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
    private static final int MILLIS_IN_WEEK = 1000 * 60 * 60 * 24 * 7;
    
    public static void main( String[] args ){
        
        /* Declare the Scanner for user input */
        Scanner scan = new Scanner( System.in );
        
        String name;        
        String birthYear;   
        String birthMonth;  
        String birthDay;    
        
        int year;
        int month;
        int day;
        
        System.out.println();
        System.out.print( "Please enter your first name (no spaces) then " + 
                "press Enter: " );
        name = scan.nextLine();
        
        System.out.print( "Enter the year in which you were born: " );
        birthYear = scan.nextLine();
        
        System.out.print( "Enter the month in which you were born (1-12): " );
        birthMonth = scan.nextLine();
        
        System.out.print( "Enter the day of the month in which you were " + 
                "born (1-31): " );
        birthDay = scan.nextLine();
        
        /* Convert input into integers */
        year = Integer.parseInt( birthYear );
        month = Integer.parseInt( birthMonth );
        day = Integer.parseInt( birthDay );
        
        month = month - 1;  // Adjust for zero indexed month
        
        long yearsOld, weeksOld, daysOld;   // Computation variables
        
        /* Instantiate user birthdate */
        Calendar birthDate = new GregorianCalendar( year, month, day );
        birthDate.set( Calendar.HOUR_OF_DAY, 0 );
        birthDate.set( Calendar.MINUTE, 0 );
        birthDate.set(Calendar.SECOND, 0);
        long startTime = birthDate.getTimeInMillis();
        
        /* Instantiate today's date */
        Calendar today = new GregorianCalendar();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);
        long endTime = today.getTimeInMillis();
        
        /* Compute elapsed years, weeks, and days, of user birthdate */
        yearsOld = ( today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR) );
        
        weeksOld = ( (endTime - startTime) / MILLIS_IN_WEEK );

        daysOld = ( (endTime - startTime) / MILLIS_IN_DAY  );
        
        /* Display the output */
        System.out.println();
        System.out.println( "Welcome to CSE 155H " + name + "!" );
        System.out.println( "You are " + yearsOld + " years, " + weeksOld + 
                " weeks, and " + daysOld + " days old today." );
        
        
    } 

}
