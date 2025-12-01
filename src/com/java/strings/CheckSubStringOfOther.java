package com.java.strings;

public class CheckSubStringOfOther {

	static int findSubString(String txt, String pat) {

		int m = txt.length();
		int n = pat.length();

		for (int i = 0; i <= n - m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (txt.charAt(i + j) != pat.charAt(j)) {
					break;
				}
			}
			if (j == m) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "geeksforgeeks";
		String pat = "eks";
		System.out.println(findSubString(txt, pat));
	}

}
