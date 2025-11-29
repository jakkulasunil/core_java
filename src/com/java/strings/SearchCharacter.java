package com.java.strings;

public class SearchCharacter {

	static int findChar(String s, char ch) {
		int n = s.length();

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		char ch = 'H';
		int res = findChar(s, ch);
		System.out.println("Character is at index : " + res);
	}

}
