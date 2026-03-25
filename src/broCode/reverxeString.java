package broCode;

public class reverxeString {

	static String reverseString(String inputString) {
		String outputString= "";
		
		for(int i=0;i<inputString.length();i++) {
			char c = inputString.charAt(i);
			outputString =  c + outputString ;
			
		}
		return outputString;
		
	}
	
	public static void main(String[] args) {
		System.out.println("***Reverse String***");
		String input = "Hello... this is pavan... Please correct me if I am wrong ";
		
		String output = reverseString(input);
		System.out.printf("Reversed string of given string i.e.\n %s is \n%s", input,output);
	}
}
