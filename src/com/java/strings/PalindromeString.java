package com.java.strings;

public class PalindromeString {

	public static int palindromeString(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left) != s.charAt(right))
				return 0;
			left++;
			right--;
		}

		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		System.out.println(palindromeString(s));
	}

}
