package javaPractice;

import java.util.Scanner;

class test {
	public void trianglePattern(int num) {
		for(int i=1; i<=num;i++) {
			for (int j = 1; j <i; j++) {
				System.out.print(" ");
			}
			
			for (int s = num; s>=i ; s--) {
				System.out.print("*");
			}
			for (int s = num; s>i ; s--) {
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
	}
		
	
}

public class practiceTest {

	public static void main(String[] args) {
		System.out.println("Please enter the number = ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		test t = new test();
		t.trianglePattern(num);
	}

}
