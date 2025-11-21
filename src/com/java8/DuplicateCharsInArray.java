package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java8 Programming".replaceAll("\\s+", "").toLowerCase();
		Set<String> uniqueChars = new HashSet<>();
		Set<String> duplicateChars = Arrays.stream(input.split("")).filter(ch -> !uniqueChars.add(ch))
				.collect(Collectors.toSet());
		System.out.println(duplicateChars);

	}

}
