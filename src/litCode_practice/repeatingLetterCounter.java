package litCode_practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class repeatingLetterCounter {
//Get the input
	static String acceptString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text : ");
		String inputString = sc.nextLine();

		sc.close();
		return inputString;
	}
//Count the repeating alphabet

	static void countRepeatingAlphabet(String inputString) {

		Set<Character> processed = new HashSet<>();
		for (int i = 0; i < inputString.length(); i++) {

			char c = inputString.charAt(i);
			// Skip if character already processed
			if (processed.contains(c)) {
				continue;
			}
			int counter = 0;

			for (int j = 0; j < inputString.length(); j++) {
				char s = inputString.charAt(j);

				if (c == s) {
					counter++;
				}

			}
			System.out.printf("Alphabet %c is repeating %d times\n", c, counter);
			processed.add(c);
		}
	}

	public static void main(String[] args) {
		String inputString = acceptString();
		countRepeatingAlphabet(inputString);
	}
}
