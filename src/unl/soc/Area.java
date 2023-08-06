package unl.soc;

import java.util.Scanner;

/**
 * Computes the area of a triangle.
 */
public class Area {

	public static void main(String[] args) {

		/* Declare scanner object to obtain input */
		Scanner scan = new Scanner(System.in);

		/* Variables to hold the input and computed value */
		String inputBase, inputHeight;
		double area, base, height;

		/* Prompt for input */
		System.out.println();
		System.out.print("Please enter the base: ");
		inputBase = scan.nextLine();

		System.out.print("Please enter the height: ");
		inputHeight = scan.nextLine();

		base = Double.parseDouble(inputBase);
		height = Double.parseDouble(inputHeight);

		/* Compute the area using the formula */
		area = (1 / 2 * base * height);

		System.out.println("The area of the triangle is: " + area);

		System.out.println();

	}

}
