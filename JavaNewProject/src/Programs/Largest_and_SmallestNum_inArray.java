package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Largest_and_SmallestNum_inArray {

	public static void main(String[] args) {
		int arr[]= {20,10,120,30,80,5,1,0,-56,120};
//		int Largestnum=arr[0];
//		
//		int Smallestnum=arr[0];
//		
//		int count;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>Largestnum)
//				Largestnum=arr[i];
//			
//			else if(arr[i]<Smallestnum)
//				Smallestnum=arr[i];
//		}
//		
//		System.out.println("Given number is "+Arrays.toString(arr));
//		System.out.println(Largestnum);&&arr[i]!=FirstLargest
//		System.out.println(Smallestnum);
		
		int FirstLargest=arr[0];
		int secondLargest=-1;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>FirstLargest) {
				secondLargest=FirstLargest;
				FirstLargest=arr[i];
			}
			else if (arr[i]>secondLargest&&arr[i]!=FirstLargest) {
				secondLargest=arr[i];
			}
				
		}
		System.out.println("First largest is "+FirstLargest);
		System.out.println("Secong Largest is "+secondLargest);
		//int arr[]= {10,20,120,30,80,5,1,98,-1,-56,120};
//		
}
}


