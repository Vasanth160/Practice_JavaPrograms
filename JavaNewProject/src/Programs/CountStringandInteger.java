package StringConcept;

import java.awt.List;
import java.util.ArrayList;



public class CountStringandInteger {

	public static void main(String[] args) {
		String letter = "nAJh4837@9gk%#";
		int integercount=0;
		int lettercount=0;
		int specialCharatcer = 0;

		char[] charArray = letter.toCharArray();

		ArrayList<Character> al= new ArrayList<Character>();
		ArrayList<Character> aa= new ArrayList<Character>();

		for (Character charAt : charArray) {


			if(Character.isDigit(charAt)) {
				integercount++;
				al.add(charAt);
			}
			else if(Character.isAlphabetic(charAt)) {
				lettercount++;
				aa.add(charAt);
			}
			else if(!Character.isDigit(charAt)&& !Character.isAlphabetic(charAt)) {
				specialCharatcer++;
				

			}
		}


		System.out.print("Integer count is "+integercount+" they are ");

		for (Character integer : al) {
			System.out.print(integer+" ");
		}
		System.out.println();
		System.out.print("Alphabet count is "+lettercount+" they are ");
		for (Character alphabet : aa) {
			System.out.print(alphabet+" ");
		}
		System.out.println();
		System.out.println("Special character count is "+specialCharatcer);


	}
}
//		
//		String rever="hello";
//		
//		StringBuilder sb=new StringBuilder(rever);
//		StringBuilder reverse = sb.reverse();
//		
//		String replace = reverse.substring(0, 1).toUpperCase()+reverse.substring(1).toLowerCase();
//		System.out.print(replace);
//		












