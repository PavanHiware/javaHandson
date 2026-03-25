package broCode;

import java.util.Scanner;

public class quizProgram {
	static Scanner sc = new Scanner(System.in);
	static int correctAns = 0;

//welcome message to quiz
	static void welcomeToQuiz() {
		System.out.println("****************************");
		System.out.print("Welcom To Quiz\n");
		System.out.println("****************************");
	}

//Different methods for different topic
	static void questionOnMaths() {
		System.out.print("1.What is 25% of 200?\n" + " 1.25 \n 2.50 \n 3.75 \n 4.100\n");
		System.out.print("Enter your answer : ");
		int ans1 = sc.nextInt();
		sc.nextLine();
		if (ans1 == 2) {
			correctAns++;
		}
		System.out.print("2.45% of 80 is equal to?\n" + " 1.36 \n 2.40 \n 3.28 \n 4.32\n");
		System.out.print("Enter your answer : ");
		int ans2 = sc.nextInt();
		sc.nextLine();
		if (ans2 == 1) {
			correctAns++;
		}
		System.out.print("3.60% of 150 equals?\n" + " 1.60 \n 2.90 \n 3.100 \n 4.120\n");
		System.out.print("Enter your answer : ");
		int ans3 = sc.nextInt();
		sc.nextLine();
		if (ans3 == 2) {
			correctAns++;
		} else {
			System.out.println("Wrong answer");
		}
		System.out.print("4. What is 12% of 250?\n" + " 1.20 \n 2.25 \n 3.30 \n 4.35\n");
		System.out.print("Enter your answer : ");
		int ans4 = sc.nextInt();
		sc.nextLine();
		if (ans4 == 3) {
			correctAns++;
		}
		System.out.print("5.80% of 50 is?\n" + " 1.30 \n 2.35 \n 3.40 \n 4.45\n");
		System.out.print("Enter your answer : ");
		int ans5 = sc.nextInt();
		sc.nextLine();
		if (ans5 == 3) {
			correctAns++;
		}
	}

//End result
	static void endResult() {
		System.out.println("**************************");
		System.out.printf("Your received score : %d / 5 \n", correctAns);
		double scoredPercentage = correctAns * 20;
		if(scoredPercentage > 80) {
			
			System.out.printf("Congratulations !!!! You have passed the exam. You have scored %.2f  \n", scoredPercentage);
		}else {
			System.out.printf("Sorry !!!! You have not passed the exam. You have scored %.2f  \n Please Try again.... \n", scoredPercentage);
			
		}
		System.out.println("**************************");

	}

	public static void main(String[] args) {
		welcomeToQuiz();
		questionOnMaths();
		endResult();
	}
}
