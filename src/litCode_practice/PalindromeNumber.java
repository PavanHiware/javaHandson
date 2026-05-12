package litCode_practice;

public class PalindromeNumber {

	public static boolean isPalindrome(int givenNo) {
		Boolean status = false;
		String num = Integer.toString(givenNo);
		StringBuilder outputNum = new StringBuilder();
		for (int i = num.length()-1; i >=0 ; i--) {
			outputNum.append(num.charAt(i));
		}
//		System.out.println(outputNum);
		if (num.equals(outputNum.toString())) {
			status = true;
		}
		
		return status;
	}
	
	public static boolean checkPalindromNumber(int x) {
//		Boolean status = null ;
		if (x<0) {
			return false;
		}
		int original = x;
		int reversed = 0;
		while (x!=0) {
			
			int digit = x%10;
			reversed = reversed * 10 + digit;
			x = x/10 ;
		}
		
		
		
		return original == reversed;
	}
	
	public static void main(String[] args) {
	  Boolean value =	checkPalindromNumber(234);
	  if (value) {
		System.out.println("Given no is palindrom Number");
	}else {
		System.out.println("Given no is not palindrom Number");
	}
	}

}
