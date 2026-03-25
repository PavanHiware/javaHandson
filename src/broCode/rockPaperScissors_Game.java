package broCode;

import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors_Game {

	// create a array
	static String userChoice;
	static int randNo;
	static String permission ="yes";
	static Boolean result = false;
	static String[] options = { "Rock", "Paper", "Scissor" };

	// create a method to choose by system
	static String userChoice(int num) {
		userChoice = options[num - 1];
		System.out.println(userChoice);
		return userChoice;
	}
	// create a method to select user choice

	static String systemChoice() {
		Random ran = new Random();
		int num = ran.nextInt(0, 3);
		String systemChoice = options[num];
		System.out.println(systemChoice);
		return systemChoice;
	}

	static void coreLogic(int userInput) {
		String userOption = userChoice(userInput);
		String systemOption = systemChoice();
		if (userOption == "Paper" && systemOption == "Rock" || userOption == "Rock" && systemOption == "Scissor"
				|| userOption == "Scissor" && systemOption == "Paper") {
			result = true;
		} else {
			System.out.println("You lose");
		}

		if (result) {
			System.out.println("You win the game");
		} else {
			System.out.println("You loss the game");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print(" Would you like to play game again (yes / no) :");
			permission = sc.nextLine() ;
			if(permission.equalsIgnoreCase("Yes")) {
				System.out.print("Please enter your choice of option : \n Options are :\n 1) Rock \n 2) Paper \n 3) Scissor \n Enter here :");
				int choice = sc.nextInt();
				coreLogic(choice);
			}
			
		} while(permission.equalsIgnoreCase("yes"));
		
		System.out.println("You have quite the game");
		sc.close();
	
	
}
}
