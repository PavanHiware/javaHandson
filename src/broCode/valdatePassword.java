package broCode;
import java.util.Scanner;

public class valdatePassword {

	static String userInputPassword() {

		String password ;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter password: ");
		password = sc.nextLine();
		sc.close();
		return password;
	}
	
	static boolean passordValidation(String password) {
		boolean verificationResult = true;
		if(password.length()>8) {
			for(int i=0; i<password.length();i++) {
				char c = password.charAt(i);
				if(Character.isUpperCase(c)) {
					break;
				}
				
			}
			verificationResult = false;
		}
		
		return verificationResult;
	}
}
