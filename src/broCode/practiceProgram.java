package broCode;

import java.util.Scanner;

public class practiceProgram {
	//Method to print max no. from array
	static int printMaxNo(int[] inputArray) {
		int max = Integer.MIN_VALUE;
		for(int num : inputArray) {
			 max = Math.max(max, num);
				
			
			
		}
		return max;
	}
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want in list : ");
		int noPresentInList = sc.nextInt();
		int[] inputArray = new int[noPresentInList] ;
		for(int i =0;i<noPresentInList;i++) {
			System.out.println("Please enter no: ");
			int num = sc.nextInt();
			inputArray[i] = num;
			
		}
		int num = printMaxNo(inputArray);
		System.out.printf("Maximum value of array : %d ",num);
		sc.close();
	}
	
}
