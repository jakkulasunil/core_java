package com.java8;

import java.util.stream.IntStream;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "ZAAZ";

		boolean isItPalindrome = IntStream.range(0, input.length() / 2)
				.noneMatch(i -> input.charAt(i) != input.charAt(input.length() - i - 1));
		if (isItPalindrome) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
	}
}
