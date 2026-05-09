package litCode_practice;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class findDifferenceString {

	static String[] userInput() {
		Scanner sc = new Scanner(System.in);
		String[] userInputs = new String[2];
		System.out.print("Please enter string one : ");
		String s1 = sc.nextLine();
		System.out.print("Please enter string two : ");
		String s2 = sc.nextLine();
		userInputs[0] = s1;
		userInputs[1] = s2;
		sc.close();
		return userInputs;

	}

	static char findDifference(String[] userInputs) {
		String s1 = userInputs[0];
		String s2 = userInputs[1];
		char s = 0;
		int max = Math.max(s1.length(), s2.length());
//		List<Character> stringChar = new ArrayList<>();
		if (!(s1.length() == s2.length())) {
			for (int i = 0; i < max; i++) {
				char c = s1.charAt(i);
				for (int j = 0; j < s2.length(); j++) {
					s = s2.charAt(j);

				}
				if (c == s) {
					continue;
				}

			}

		}
		return s;

	}
	
	public static void main(String[] args) {
		String[] input = userInput();
		char c =findDifference(input);
		System.out.println("Difference character : "+c);
	}
}
