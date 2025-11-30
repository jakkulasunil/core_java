package com.java.strings;

public class CountSubStringsStartWithOne {

	static int binarySubString(String s) {
		int n = s.length();
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '1') {
				for (int j = i + 1; j < n; j++) {
					if (s.charAt(j) == '1') {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "00100101";
	     System.out.println(binarySubString(s));
	}

}
