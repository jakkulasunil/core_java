package com.java.strings.medium;

public class FirstNonRepeatingChar {

	public static char nonRep(String str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			boolean found = false;
			for (int j = 0; j < n; j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found)
				return str.charAt(i);
		}
		return '$';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "racecar";
		System.out.println(nonRep(s));
	}

}
