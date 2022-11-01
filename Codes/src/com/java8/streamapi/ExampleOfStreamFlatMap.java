package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleOfStreamFlatMap {

	public static void main(String[] args) {

		List<Integer> number = Arrays.asList(22, 54, 6, 21, 4, 87, 63, 25, 41, 23, 11);

		List<Integer> newList = number.stream().flatMap(num -> Stream.of(num + 5, num + 7))
				.collect(Collectors.toList());

		for (Integer output : newList)
			System.out.println(output);

	}

}
