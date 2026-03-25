package PatternProgram;

import java.util.Scanner;

public class StarPttern {
	public static void RightAnglePattern(int num) {
		int a, b;
		// outer loop to handle number of rows
		for (a = 0; a < num; a++) {
			// inner loop to handle number of columns
			for (b = 0; b <= a; b++) {
				// printing stars
				System.out.print("* ");
			}
			// end-line
			System.out.println();
		}
	}

	public static void leftAngledTriangle(int num) {
		int a, b;
		// outer loop to handle number of rows
		for (a = 0; a < num; a++) {
			// inner loop to handle number of columns
			for (b = num; b >= a; b--) {
				// printing stars
				System.out.print("* ");
			}
			// end-line
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no = ");
		int num = sc.nextInt();

		RightAnglePattern(num);
		System.out.println("----------");
		leftAngledTriangle(num);
	}
}
