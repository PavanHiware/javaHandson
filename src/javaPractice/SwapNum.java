package javaPractice;

import java.util.Scanner;

public class SwapNum {
	public static void Swapnum(int n, int m) {
		System.out.println("First no = " + m);
		System.out.println("Second no = " + n);
		int t = m;
		m = n;
		n = t;
		System.out.println("Swap no = " + m);
		System.out.println("Swap no = " + n);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no = ");
		int m = sc.nextInt();

		System.out.println("Enter Second no = ");
		int n = sc.nextInt();

		Swapnum(m, n);
	}
}
