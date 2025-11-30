package com.java.strings;

public class CheckForBinary {

	static boolean isBinary(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0' && s.charAt(i) != '1') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "0101010101010";
		System.out.println(CheckForBinary.isBinary(s));
	}

}
