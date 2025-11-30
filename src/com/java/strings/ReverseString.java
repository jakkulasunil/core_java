package com.java.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		StringBuilder res = new StringBuilder();
		for (int i = s.length() - 1; i >= 0; i--) {
			res.append(s.charAt(i));
		}
		System.out.println(res);
	}
}
