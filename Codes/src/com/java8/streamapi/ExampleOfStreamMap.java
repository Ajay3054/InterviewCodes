package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOfStreamMap {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(22, 54, 6, 21, 4, 87, 63, 25, 41, 23, 11);

		List<Integer> newList = number.stream().map(num -> num - 2).collect(Collectors.toList());

		for (Integer num : newList)
			System.out.println(num);
	}

}
