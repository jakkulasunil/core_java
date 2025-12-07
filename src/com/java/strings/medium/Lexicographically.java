package com.java.strings.medium;

public class Lexicographically {

	static String nextString(String s) {

		int i = s.length() - 1;

		while (i >= 0 && s.charAt(i) == 'z') {
			i--;
		}

		if (i == -1) {
			return s + 'a';
		}

		char[] arr = s.toCharArray();
		arr[i]++;

		return new String(arr, 0, i + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "geeks";
		System.out.println(nextString(s));

	}

}
