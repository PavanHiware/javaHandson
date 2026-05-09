package litCode_practice;

import java.util.Scanner;

public class romanToInteger {
//accept the user input in roman no
	static String userInputString() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the no. in ROMAN style : ");
		String userInput = sc.nextLine();

		sc.close();
		return userInput;
	}

//convert the roman value to integer
	static int convertRomanTonum(String romanString) {
		int result = 0;
		int preValue = 0;
		int currentValue = 0;

		for (int i = romanString.length() - 1; i >= 0; i--) {
			char c = romanString.charAt(i);
			switch (c) {
			case 'I':
				currentValue = 1;
				break;
			case 'V':
				currentValue = 5;
				break;
			case 'X':
				currentValue = 10;
				break;
			case 'L':
				currentValue = 50;
				break;
			case 'C':
				currentValue = 100;
				break;
			case 'D':
				currentValue = 500;
				break;
			case 'M':
				currentValue = 1000;
				break;

			}
			if (currentValue < preValue) {
				result -= currentValue;
			} else {
				result += currentValue;

			}
			preValue = currentValue;

		}

		return result;

	}

	public static void main(String[] args) {
		String input = userInputString();
		int num = convertRomanTonum(input);
		System.out.printf("Required number = %d ", num);
	}
}
