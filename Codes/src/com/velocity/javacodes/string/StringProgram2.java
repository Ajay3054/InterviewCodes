package com.velocity.javacodes.string;
public class StringProgram2 {

	public static String repeatedWord(String string) {

		string = string.toLowerCase();
		String words[] = string.split(" ");
		int count = 0;

		for (int i = 0; i < words.length; i++) {
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "0";
				}
			}
			if (count > 1 && words[i] != "0") {
				System.out.println("Repeated word is: " + words[i] + " " + "Times : " + count);
			}
		}
		return string;
	}

	public static String reverseOfString(String string) {

		String[] string2 = string.split(" ");
		String revString = " ";

		for (int i = 0; i < string2.length; i++) {
			revString = string2[i] + " " + revString;
		}

		return revString;

	}

	public static void main(String[] args) {
		String str = "Ajay My Name Is Ajay";
		StringProgram2.repeatedWord(str);
		
		String outputString = StringProgram2.reverseOfString(str);
		System.out.println(outputString);
	}

}
