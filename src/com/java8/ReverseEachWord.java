package com.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Java Programming";
		String reverse = Arrays.stream(input.split(" ")).map(i -> new StringBuffer(i).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(reverse);

	}

}
