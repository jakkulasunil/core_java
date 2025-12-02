package com.java.strings;

import java.util.Arrays;
/*Check if two Strings are Anagrams of each other*/
public class CheckAnagrams {

	static boolean anagramsCheck(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();

		Arrays.sort(s1Array);
		Arrays.sort(s2Array);
		return Arrays.equals(s1Array, s2Array);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "geeks";
		String s2 = "kseeg";

		if (anagramsCheck(s1, s2) == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
