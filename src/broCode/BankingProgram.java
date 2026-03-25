package broCode;

import java.util.Scanner;

public class BankingProgram {

	static void displayLangauge() {

		System.out.println("************");
		System.out.print("Please select langauge..\n");
		System.out.print("1.English 2.Marathi\n3.Hindi 4.Non of the above\n");
		System.out.println("************");
		System.out.print("pLESE ENTER OPTION : ");

	}

	static void selectLangauge(int option) {

		if (option < 5 && option > 0) {
			if (option == 1) {
				System.out.println("You have selected English");
			} else if (option == 2) {
				System.out.println("You have selected Marathi");
			} else if (option == 3) {
				System.out.println("You have selected Hindi");
			}
		} else if (option == 4) {
			System.out.println("No langauge is selected");

		} else {
			System.out.println("Please enter valid option");
		}
	}

	static void displayBankingOption() {
		System.out.print("########");
		System.out.println("Please select any banking option...");
		System.out.print("1.Banking  2.Password change \n3.withdrawl 4.Show balance\n");
		System.out.print("########");
		System.out.print("Please enter option from above : ");
	}

	static void selectBankingOption(int option) {

		if (option < 5 && option > 0) {
			if (option == 1) {
				System.out.println("You have selected banking option");
			} else if (option == 2) {
				System.out.println("You have selected password change option");
			} else if (option == 3) {
				System.out.println("You have selected withdrawl option");
			} else if (option == 4) {
				System.out.println("Tou have selected show balance option");

			} else {
			
			System.out.println("Please enter valid option");
		}}
	}

	public static void main(String[] args) {
		displayLangauge();
		Scanner sc = new Scanner(System.in);
		int optionRequired_langauge = sc.nextInt();
		selectLangauge(optionRequired_langauge);
		displayBankingOption();
		int optionRequired_banking = sc.nextInt();
		selectBankingOption(optionRequired_banking);
		sc.close();
	}
}
