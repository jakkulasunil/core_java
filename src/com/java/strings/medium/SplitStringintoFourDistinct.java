package com.java.strings.medium;

public class SplitStringintoFourDistinct {

	public static boolean strCheck(String s1, String s2) {
		if (s1 != s2)
			return false;
		return true;
	}
	public static boolean check(String s) {
		if (s.length() >= 10)
			return true;
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					String s1 = "", s2 = "", s3 = "", s4 = "";
					try {
						s1 = s.substring(0, i);
						s2 = s.substring(i, j - i);
						s3 = s.substring(j, k - j);
						s4 = s.substring(k, s.length() - k);
					} catch (StringIndexOutOfBoundsException e) {
					}
					if (strCheck(s1, s2) && strCheck(s1, s3) && strCheck(s1, s4) && strCheck(s2, s3) && strCheck(s2, s4)
							&& strCheck(s3, s4))
						return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "aaabb";
		if (check(str))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
