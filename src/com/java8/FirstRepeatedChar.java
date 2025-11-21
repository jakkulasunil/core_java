package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Java8 Programming".replaceAll("\\s+", "").toLowerCase();

		Map<String, Long> charCountMap = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String firstRepeated = charCountMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.map(entry -> entry.getKey()).findFirst().get();
		
		System.out.println(firstRepeated);
	}

}
