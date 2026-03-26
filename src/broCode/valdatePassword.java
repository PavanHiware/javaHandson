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
			if(verificationResult= password.equals(password.toLowerCase()) ) {
				System.out.println("Please enter atleast one upper letter.");
			}else if(verificationResult = password.equals(password.toUpperCase())) {
				System.out.println("Please enter atleast one lowwer letter");
			}
				
			}	
		else {
			verificationResult = false;
			System.out.println("Please enter more that 8 letters.");
		}
		return verificationResult;
	}
	
	public static void main(String[] args) {
		String inputPassword= userInputPassword();
		if(passordValidation(inputPassword)) {
			System.out.println("Password is valid.");
		}else {
			System.out.println("Password is invalid.");
		}
	}
}
