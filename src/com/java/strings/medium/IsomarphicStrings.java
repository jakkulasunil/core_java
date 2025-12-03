package com.java.strings.medium;

public class IsomarphicStrings {

	public static boolean isomarphic(String s1, String s2) {

		int n = s1.length();

		for (int i = 0; i < n; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);

			for (int j = 0; j < n; j++) {

				if (s1.charAt(j) == c1 && s2.charAt(j) != c2) {
					return false;
				}

				if (s2.charAt(j) == c2 && s1.charAt(j) != c1) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="aab";
		String s2="xxy";

	}

}
