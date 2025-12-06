package com.java.strings.medium;

public class BinaryStringWithoutConsecutivesOnes {

	static int countRecur(int i, int n) {
		if (i >= n)
			return 1;
		int take = countRecur(i + 2, n);
		int noTake = countRecur(i + 1, n);
		return take + noTake;
	}

	static int countStrings(int n) {
		return countRecur(0, n);
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(countStrings(n));
	}

}
