package com.velocity.javacodes.number;
public class Broadrigde1 {

	public static int getOccuranceOf(int x, int y) {

		int count = 0;

		while (x > 0) {
			int rem = x % 10;
			if (rem == y) {
				count++;
			}
			x = x / 10;
		}
		return count;
	}

	public static String reverseOfSentance(String string) {
		String rev = "";
		String s[] = string.split("\\s");

		for (int i = 0; i < s.length; i++) {
			rev = s[i] + " " + rev;
		}
		System.out.println(rev);
		return rev;

	}

	public static void repeateOfWord(String string) {

		int count = 0;
		String string2 = string.toLowerCase();
		String words[] = string2.split("\\s");

		System.out.println("Duplicates Words in given String : ");

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;

					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0") {
				System.out.println( "  Repeted word is : " +words[i] +" " +" It is repeated for "+count+ " Times");
			}

		}
		

	}

	public static void main(String[] args) {

		String str = "Have a Nice Day Have";

		System.out.println("Original String : " + str+ "\n");

		System.out.println("reverseOfSentance: ");
		Broadrigde1.reverseOfSentance(str);

		System.out.println( "\n"+"repeateOfWord");
		Broadrigde1.repeateOfWord(str);

		int x = 12121;
		int y = 1;

		int number = Broadrigde1.getOccuranceOf(x, y);
		System.out.println("\n"+"Occurance OF Given Number is : " + number);

	}

}
