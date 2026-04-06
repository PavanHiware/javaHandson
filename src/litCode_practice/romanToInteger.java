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
		int requiredNum=0;
		for(int i = 0; i<romanString.length();i++) {
			char c = romanString.charAt(i);
			switch (c) {
			case 'I': requiredNum++;
					break;
			case 'V': requiredNum = requiredNum + 5;
			break;
			case 'X': requiredNum = requiredNum + 10;
			break;
			
			}
				
		}
		
		return requiredNum;
		
	}
	public static void main(String[] args) {
		String input = userInputString();
		int num = convertRomanTonum(input);
		System.out.printf("Required number = %d ",num);
	}
}
