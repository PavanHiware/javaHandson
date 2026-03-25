package broCode;
import java.util.Scanner;


public class broCodePractice {

	public static void main(String[] args) {
		//describe variables 
		String str ;
		StringBuilder newStr = new StringBuilder();
		//get user input
		Scanner sc =  new Scanner(System.in);
		System.err.print("Enter the string in the format (a1b2j6) : ");
		str = sc.nextLine();
		
		//validate the loop
		for(int i = 0; i<str.length();i+=2) {
			char chr =  str.charAt(i);
			int num = str.charAt(i + 1) - '0';
			for(int j =0;j<num;j++) {
				newStr.append(chr);
			}
		}
		System.out.println(newStr);
	}
	

}
