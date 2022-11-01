package com.velocity.javacodes.string;

public class StringProgram3 {

	public static void reverseOfWords(String string) {

		String rev = "";

		String s[] = string.split(" ");

		for (int i = 0; i < s.length; i++) {
			rev = s[i] + " " + rev;
		}
		System.out.println(rev);

	}

	public static void repeatedOfWords(String string) {

		string = string.toLowerCase();
		String[] s = string.split(" ");
		int count = 0;

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i].equals(s[j])) {
					count = 1;
					System.out.println("Word : "+s[j]+"  Count :"+count);
				}
			}
		}
	}

	public static void reverseOfString(String string) {

		string = string.toLowerCase();
		char[] ch = string.toCharArray();
		String result = " ";

		for (int i = ch.length - 1; i >= 0; i--) {
			result = result + ch[i];
		}
		System.out.println(result);
	}

	public static void pallidromeString(String originalString) {
		originalString = originalString.toLowerCase();
		String result = "";

		int ch = originalString.length();

		for (int i = ch - 1; i >= 0; i--) {
			result = result + originalString.charAt(i);
		}

		if (originalString.equals(result)) {
			System.out.println("Given Stirng is Pallidrome ");
		} else {
			System.out.println("Given Stirng is Not Pallidrome ");
		}
	}

	public static void pallidromeNumber(int originalNumber) {
		int reminder, temp;
		int sum = 0;

		temp = originalNumber;

		while (originalNumber > 0) {
			reminder = originalNumber % 10;
			sum = (sum * 10) + reminder;
			originalNumber = originalNumber / 10;
		}

		if (temp == sum) {
			System.out.println("Given Number is Pallidrome ");
		} else {
			System.out.println("Given Number is Not Pallidrome ");
		}

	}


	public static void main(String[] args) {
		String str = "Hi Ajay My Name is Ajay";
		StringProgram3.reverseOfWords(str);
		StringProgram3.repeatedOfWords(str);
		StringProgram3.reverseOfString(str);
		StringProgram3.pallidromeString("madam");
		StringProgram3.pallidromeNumber(454);

		//Demo obj =new Demo();
		
	}
}
