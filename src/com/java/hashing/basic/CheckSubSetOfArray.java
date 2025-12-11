package com.java.hashing.basic;

public class CheckSubSetOfArray {

	public static boolean subsetOfArray(int[] a, int[] b) {

		int m = a.length;
		int n = b.length;

		for (int i = 0; i < n; i++) {
			boolean found = false;

			for (int j = 0; j < m; j++) {
				if (a[i] == b[j]) {
					found = true;
					a[j] = -1;
					break;
				}
			}
			if (!found) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[] a = { 11, 1, 13, 21, 3, 7 };
		int[] b = { 11, 3, 7, 1 };

		if (subsetOfArray(a, b)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		} // TODO Auto-generated method stub

	}

}
