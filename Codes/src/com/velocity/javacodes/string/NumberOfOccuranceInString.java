package com.velocity.javacodes.string;

import java.util.ArrayList;
import java.util.List;

public class NumberOfOccuranceInString {

	public static void countChrarcters(String name) {

		char[] newName = name.toCharArray();
		int count = 0;

		List<Character> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();

		for (int i = 0; i < newName.length; i++) {
			char temp = newName[i];

			if (!(list1.contains(temp))) {
				list1.add(temp);
				count = 1;

				for (int j = i + 1; j < newName.length; j++) {

					if (newName[i] == newName[j]) {
						count++;
					}
				}

				list2.add(count);
			}
		}

		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Character : " + list1.get(i) + "  Count : " + list2.get(i));
		}
	}

	public static void main(String args[]) {

		String name = "My Name Is Ajay";
		NumberOfOccuranceInString.countChrarcters(name);

	}

}
