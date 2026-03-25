package broCode;
import java.util.Scanner;

public class practicetest {
	
	//given array
	static int[] receiveArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. for length of ARRAY : ");
		int arrayLength =  sc.nextInt();
		int[] receivedArray = new int[arrayLength];
		for(int i =0;i<arrayLength;i++) {
			System.out.print("Enter "+ (i+1) +" no: ");
			int noReceived = sc.nextInt();
			receivedArray[i] = noReceived;
		}
		sc.close();
		return receivedArray;
	}
	static void validateArray(int[] array, int target) {
//		for(int no  : array) {
//			System.out.println(no);
//		}
		for(int i=0;i<array.length;i++) {
			int needed =  array[i] + array[i+1];
			if(needed == 9) {
				System.out.println("Required indices = "+i +" "+ (i+1));
			}
			else {
				System.out.println("No target addition present");
			}
			
		}
		
	}
	//return indices of sum of array
	public static void main(String[] args) {
//		System.out.println(receiveArray());
		int[] userArray = receiveArray();
		validateArray(userArray,9);
		
		
	}
}
