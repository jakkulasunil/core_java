package com.java.strings.medium;

public class FirstRepeatingChar {

	public static String firstRepeat(String str) {
		int n = str.length();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return Character.toString(str.charAt(i));
				}
			}
		}
		return "$";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeksforgeeks";
	    // Print the result of the function
	    System.out.println(firstRepeat(s));
	}

}
