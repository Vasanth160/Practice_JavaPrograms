package Programs;

import java.util.Scanner;

public class PrimeNumber_orNot {

	public static void main(String[] args) {
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the Num");
		int num=sc.nextInt();
//		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime");
		}
		else
			System.out.println("Number is not prime");
		
//		
//		for(int i=2;i<17;i++) {
//			for(int j=2;j<17;j++) {
//				if(i%j==0)
//					count++;
//			}
//			
//		}
//		if(count==2) {
//			System.out.println("prime");
//		}
//		else
//			System.out.println("Number is not prime");

	}

}
