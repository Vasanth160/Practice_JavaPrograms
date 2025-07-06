package Programs;

public class FinonacciSeries {

	public static void main(String[] args) {
//		int num1=0,num2=1,num3;
//		int count=10;
//		System.out.print(num1+" "+num2+" ");
//		for(int i=2;i<=count;i++) {
//			num3=num1+num2;
//			num1=num2;
//			num2=num3;
//			System.out.print(num3+" ");
//		}
		
		 int n = 10; // Example: get the first 10 Fibonacci numbers
	        System.out.println("Fibonacci series up to " + n + " terms:");
	        
	        // Call the recursive function to print Fibonacci numbers
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

	    // Recursive function to calculate nth Fibonacci number
	    public static int fibonacci(int n) {
	        // Base case: the first two Fibonacci numbers are 0 and 1
	        if (n == 0) {
	            return 0;
	        } else if (n == 1) {
	            return 1;
	        }
	        
	        // Recursive case: Fibonacci of n is the sum of Fibonacci of (n-1) and (n-2)
	        return fibonacci(n - 1) + fibonacci(n - 2);
		    //3 -> 2 1 
	        //2-> 1 0 
	        //1 - > 1 
	        //
 
	}

}
