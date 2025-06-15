

package Programs;



public class ArmstromgNumber {

	public static void main(String[] args) {
		
		
		int num=153;
		int rem=0;
		int cube=0;
		int temp=num;
		while(num!=0) {
			rem=num%10; //3 5 1
			num=num/10; //15 1 0
			cube=cube+(rem*rem*rem); //27 152 153
		}
		
		if(temp==cube) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not an Armstrong");
		
}
}
