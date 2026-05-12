package broCode;

import java.util.Arrays;

public class arrayList {

	public static int[] sumNum(int[] num, int target) {
		int firstNo = 0;
		int secondNo = 0;
		int[] requiredArray = new int[2];
		
		for(int i =0;i<num.length;i++) {
			firstNo = num[i];
			for (int j = 0; j < num.length; j++) {
				secondNo = num[j];
				
				 if(firstNo + secondNo == target) {
					requiredArray[0] = i;
					requiredArray[1] = j;
				}
			}
			
		
		}
		
		return requiredArray;
	}
	
	public static void main(String[] args) {
		int[] num = {3,2,4,5};
		
		 String requiredNo = Arrays.toString( sumNum(num, 9));
		 System.out.println(requiredNo);
	}
}
