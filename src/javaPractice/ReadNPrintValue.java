package javaPractice;

import java.util.Scanner;

public class ReadNPrintValue {
	public static void main(String[] args) {
		// Declare value
		int num;
		// Input the integer
		System.out.println("Enter the value = ");
		// Create scanner object
		Scanner sc = new Scanner(System.in);
		// Read the next integer from the screen
		num = sc.nextInt();
		// Display the object
		System.out.println("Entered value = " + num);

		sc.close();

	}
}
