/**
 * Asks the user for their name, and the year, month, and day of their birth.
 * Outputs a greeting and the number of years, weeks, and days of user age.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BirthdayCLI {
    
    private static final int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
    private static final int MILLIS_IN_WEEK = 1000 * 60 * 60 * 24 * 7;
    
    public static void main( String[] args ){
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                
        String name;        
        String birthYear;   
        String birthMonth;  
        String birthDay;    
        
        int year;
        int month;
        int day;
        
        /* Preliminary input check */
        if( args.length != 4 ){
            System.err.println( "ERROR: invalid number of command line " + 
                    "inputs." );
            System.err.println( "Usage: birthday FIRSTNAME YEAR MONTH DAY" );
            System.exit( 1 );
            
        }
        
        /* Obtain command line arguments from args array */
        name = args[0];
        birthYear = args[1];
        birthMonth = args[2];
        birthDay = args[3];
        
        /* Convert input into integers */
        year = Integer.parseInt( birthYear );
        month = Integer.parseInt( birthMonth );
        day = Integer.parseInt( birthDay );
        
        month = month - 1;  // Adjust for zero indexed month
        
        long yearsOld, weeksOld, daysOld;   

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
        
        /* Store the current date and user birthdate for output */
        Date currentDay = today.getTime();
        Date dateOfBirth = birthDate.getTime();
        
        /* Display the output */
        System.out.println();
        System.out.println( "Today is: " + dateFormat.format(currentDay) );
        System.out.println( "Your birthday was: " + dateFormat.format(dateOfBirth) );
        System.out.println( "Hello " + name + "!" );
        System.out.println( "You are " + yearsOld + " years, " + weeksOld + 
                " weeks, and " + daysOld + " days old today." );
        
        
    } 
    
}
