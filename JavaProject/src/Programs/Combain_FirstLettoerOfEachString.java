package src.Programs;

public class Combain_FirstLettoerOfEachString {

	public static void main(String[] args) {
		String text="Automation Test Engineer";

		String[] split = text.split(" ");

		int maxLength=0;

		for (String word : split) {
			if(word.length()>maxLength)
				maxLength=word.length();
		}
		System.out.println(maxLength);

		for(int i=0;i<maxLength;i++) {
			for (String result : split) {
				if(i<result.length())
					System.out.print(result.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
