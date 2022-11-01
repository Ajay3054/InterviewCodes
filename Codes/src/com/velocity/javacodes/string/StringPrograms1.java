package com.velocity.javacodes.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StringPrograms1 {

	public static String reverseOfStringWord(String string) {
		String rev = "";
		String[] str = string.split(" ");

		for (int i = 0; i < str.length; i++) {
			rev = str[i] + " " + rev;
		}
		System.out.println(rev);
		return rev;
	}

	public static void findRepeatedWords2(String input) {
	
		input = input.toLowerCase();
		/*
		 * Split the given Input String into words using built-in split() method below
		 */
		String[] words = input.split(" ");
		int length = words.length;
		// Using for loop
		for (int i = 0; i < length; i++) {
			// Set count to 1 for every iteration
			int count = 1;
			for (int j = i + 1; j < length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					/*
					 * Setting words[j]="0" to avoid visited words
					 */
					words[j] = "0";
				}
			}
			if (words[i] != "0" && count > 1)
				System.out.print(" " + words[i] + " : " + count + "\n");

		}
	}
	
	public static void m(String string) {
		
		string=string.toLowerCase();
		
		String []word=string.split(" ");
		int count;
		
		for(int i=0; i<word.length; i++) {
			count=1;
			for(int j=i+1; j<word.length; j++) {
				if(word[i].equals(word[j])) {
					count ++;
					word[j]="0";
				}
				
			}
			if(word[i]!="0" && count>1) {
				System.out.println(" Word is : " + word[i] + "  Count : "+ count);
			}
		}
	}
	

	public static void findRepeatedWordsUsingCollection(String string) {

		string = string.toLowerCase();

		String words[] = string.split(" ");

		List<String> listOfWords = Arrays.asList(words);

		HashSet<String> uniqueWords = new HashSet<>(listOfWords);

		for (String output : uniqueWords) {

			if (Collections.frequency(listOfWords, output) > 1) {

				System.out.println(" Repeated Words Are : " + output);
			}
		}
	}

	public static void main(java.lang.String[] args) {

		String str = "Have a Nice Day  Have u any plans for Day";
		// StringPrograms1.reverseOfStringWord(str);
	//	StringPrograms1.findRepeatedWords2(str);
		// StringPrograms1.findRepeatedWordsUsingCollection(str);
		StringPrograms1.m(str);
	}

}
