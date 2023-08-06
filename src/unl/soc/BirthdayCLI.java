package unl.soc;

import java.util.Calendar;

/**
 * Computes an age given a birthdate using command line arguments.
 *
 */
public class BirthdayCLI {

	private static final long MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
	private static final long MILLIS_IN_WEEK = 1000 * 60 * 60 * 24 * 7;
	private static final long MILLIS_IN_YEAR = 31557600000l;

	public static void main(String[] args) {

		if (args.length != 4) {
			System.err.println("ERROR: invalid number of command line arguments");
			System.err.println("Usage: java BirthdayCLI FIRSTNAME YEAR MONTH DAY");
			System.exit(1);
		}

		String name = args[0];
		int year = Integer.parseInt(args[1]);
		int month = Integer.parseInt(args[2]);
		int day = Integer.parseInt(args[3]);

		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day);

		long bDateMs = c.getTimeInMillis();
		long todayMs = System.currentTimeMillis();
		long length = todayMs - bDateMs;

		int years = (int) (length / MILLIS_IN_YEAR);
		length -= (years * MILLIS_IN_YEAR);
		int weeks = (int) (length / MILLIS_IN_WEEK);
		length -= (weeks * MILLIS_IN_WEEK);
		int days = (int) (length / MILLIS_IN_DAY);

		System.out.println("Welcome to the University of Nebraska-Lincoln " + name + "!");
		System.out.println("You are " + years + " years, " + weeks + " weeks, and " + days + " days old today.");

	}

}
