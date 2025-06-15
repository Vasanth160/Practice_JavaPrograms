package Programs;

import java.util.HashSet;
import java.util.Set;

public class Find_the_missingNumber_inArray {

	public static void main(String[] args) {
		
		//Logic behing this program
		// First we need to print the Total of Given array
		//then print the count of Actual length
		//Minus both the Value
		
		        int number = 12346789; // The given string
		       // char[] charArray = number.toCharArray()
		        String valueOf = String.valueOf(number);
		        int TotalofgivenArray = 0;
		        int Actualcount = 0;
//		        
//		        // Sum the digits of the number
		        for (int i = 0; i < valueOf.length(); i++) 
		        {
		        	TotalofgivenArray+=valueOf.charAt(i)-'0';
		           // TotalofgivenArray += charArray[i] - '0'; // Convert char to int
		        	
		        }
		        
		        // Calculate the sum of numbers from 1 to the length of the array (6 in this case)
		        for (int i = 1; i <= 9; i++) {
		            Actualcount += i;  // Sum of 1 to 6
		        }
		        
		        System.out.println("Total of given array: " + TotalofgivenArray); // Sum of digits in the string
		        System.out.println("Actual count: " + Actualcount); // Sum of numbers from 1 to length of string
		        
		        // Find the missing number (if applicable)
		        int missingNum = Actualcount - TotalofgivenArray;
		        System.out.println("Missing number is: " + missingNum);
		        
		        
		        //another Method
		        for (int i = 1; i < 9; i++) {
					if(!valueOf.contains(String.valueOf(i)))
						System.out.println("Misng number "+ i);
				}
		    }
		}