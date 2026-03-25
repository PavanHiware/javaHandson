package javaPractice;

public class ArrayConcept {

		public static void main(String[] args) {
			String name = "a1b2c3d4e5";
			StringBuilder str = new StringBuilder();
			
			for(int i = 0;i<name.length();i+=2) {
				char s1 = name.charAt(i);
				int count = Character.getNumericValue( name.charAt(i+1));
//				int count = name.charAt(i+1);
				
				for(int j =1;j<=count;j++) {
					str.append(s1);
				}
			}		
			System.out.println(str);
			
		
		}}
