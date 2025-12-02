package com.java.strings;

public class UrLifyString {

	static String urlifyString(String s) {
		int n = s.length();

		StringBuilder res = new StringBuilder();

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == ' ') {
				res.append("%20");

			} else {
				res.append(s.charAt(i));
			}
		}
		return res.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "i love programming";
	        System.out.println(urlifyString(s));
	}

}
