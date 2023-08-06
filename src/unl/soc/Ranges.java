package unl.soc;

/**
 * Displays the range and size of datatypes in Java.
 */
public class Ranges {

	public static void main(String[] args) {

		/* byte */
		System.out.println("Data type: byte ");
		System.out.println("Min value is: " + Byte.MIN_VALUE);
		System.out.println("Max value is: " + Byte.MAX_VALUE);
		System.out.println("Size of byte: " + (Byte.SIZE / 8));
		System.out.println();

		/* short */
		System.out.println("Data type: short ");
		System.out.println("Min value is: " + Short.MIN_VALUE);
		System.out.println("Max value is: " + Short.MAX_VALUE);
		System.out.println("Size of short: " + (Short.SIZE / 8));
		System.out.println();

		/* int */
		System.out.println("Data type: int ");
		System.out.println("Min value is: " + Integer.MIN_VALUE);
		System.out.println("Max value is: " + Integer.MAX_VALUE);
		System.out.println("Size of int: " + (Integer.SIZE / 8));
		System.out.println();

		/* long */
		System.out.println("Data type: long ");
		System.out.println("Min value is: " + Long.MIN_VALUE / 8);
		System.out.println("Max value is: " + Long.MAX_VALUE / 8);
		System.out.println("Size of long: " + (Long.SIZE / 8));
		System.out.println();

		/* float */
		System.out.println("Data type: float ");
		System.out.println("Min value is: " + Float.MIN_VALUE);
		System.out.println("Max value is: " + Float.MAX_VALUE);
		System.out.println("Size of float: " + (Float.SIZE / 8));
		System.out.println();

		/* double */
		System.out.println("Data type: double ");
		System.out.println("Min value is: " + Double.MIN_VALUE);
		System.out.println("Max value is: " + Double.MAX_VALUE);
		System.out.println("Size of double: " + (Double.SIZE / 8));
		System.out.println();

		/* char */
		System.out.println("Data type: char ");
		System.out.println("Min value is: " + (int) Character.MIN_VALUE);
		System.out.println("Max value is: " + (int) Character.MAX_VALUE);
		System.out.println("Size of char: " + (Character.SIZE / 8));
		System.out.println();

	}

}
